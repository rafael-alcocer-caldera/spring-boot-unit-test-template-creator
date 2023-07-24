/**
 * Copyright [2023] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class UnitTestTemplateCreatorUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(UnitTestTemplateCreatorUtils.class);

    public static final String DOT = "\\.";
    public static final String SOURCE_TEST_PATH = "src/test/java/";
    public static final String SUFFIX = "Test.java";

    private UnitTestTemplateCreatorUtils() {
        throw new UnsupportedOperationException();
    }

    public static String createClassUsingStringBuilder(String className, TestingFramework testingFramework)
            throws IOException, ClassNotFoundException {
        Class<?> clazz = Class.forName(className);

        char c[] = clazz.getSimpleName().toCharArray();
        c[0] = Character.toLowerCase(c[0]);
        String injectMocks = new String(c);

        Field[] fieldArray = clazz.getDeclaredFields();
        Method[] methodArray = clazz.getDeclaredMethods();

        String classPath = clazz.getPackageName().replaceAll(DOT, File.separator);
        LOGGER.info("#####  classPath: {}", classPath);

        // Create file with java extension and Test ending
        File sourceFile = new File(SOURCE_TEST_PATH + classPath + File.separator + clazz.getSimpleName() + SUFFIX);
        boolean isDirectoryCreated = sourceFile.getParentFile().mkdirs();
        boolean isFileCreated = sourceFile.createNewFile();

        LOGGER.info("#####  sourceFile: {}", sourceFile);
        LOGGER.info("##### isDirectoryCreated? {}", isDirectoryCreated);
        LOGGER.info("##### isFileCreated? {}", isFileCreated);

        // Get the source file name
        String testClassName = sourceFile.getName().split(DOT)[0];

        // Get the package name
        StringBuilder builder = new StringBuilder();
        builder.append("package ");
        builder.append(clazz.getPackageName());
        builder.append(";");
        builder.append("\n");
        builder.append("\n");

        // Get the testing framework import
        switch (testingFramework) {
        default:
            builder.append(testingFramework.getImportTestClass());
        }

        // Get the imports and class name
        builder.append("\n");
        builder.append("import org.junit.jupiter.api.extension.ExtendWith;");
        builder.append("\n");
        builder.append("import org.mockito.InjectMocks;");
        builder.append("\n");

        if (fieldArray.length > 0) {
            builder.append("import org.mockito.Mock;");
            builder.append("\n");
        }

        builder.append("import org.mockito.junit.jupiter.MockitoExtension;");
        builder.append("\n");
        builder.append("\n");
        builder.append("@ExtendWith(MockitoExtension.class)");
        builder.append("\n");
        builder.append("public class ");
        builder.append(testClassName);
        builder.append(" { ");
        builder.append("\n");
        builder.append("\n");

        // Add @Mock instance variables
        Arrays.stream(fieldArray).filter(Objects::nonNull).filter(field -> !field.toString().contains("static"))
                .map(field -> field.toString().split(" ")).forEach(split -> {
                    if (split[1].equals("final")) {
                        split[1] = split[2];
                        split[2] = split[3];
                    }

                    builder.append("    @Mock");
                    builder.append("\n");
                    builder.append("    ");
                    builder.append(split[0]);
                    builder.append(" ");
                    builder.append(split[1]);
                    builder.append(" ");
                    builder.append(split[2].split("\\.")[split[2].split("\\.").length - 1]);
                    builder.append(";");
                    builder.append("\n");
                    builder.append("\n");
                });

        // Add @InjectMocks
        builder.append("    @InjectMocks");
        builder.append("\n");
        builder.append("    private ");
        builder.append(clazz.getSimpleName());
        builder.append(" ");
        builder.append(injectMocks);
        builder.append(";");
        builder.append("\n");
        builder.append("\n");

        // Add methods to test
        Arrays.stream(methodArray).filter(Objects::nonNull).filter(method -> !method.getName().equals("canEqual"))
                .filter(method -> !method.getName().equals("equals"))
                .filter(method -> !method.getName().equals("hashCode"))
                .filter(method -> !method.getName().equals("toString")).forEach(method -> {
                    builder.append("    @Test");
                    builder.append("\n");
                    builder.append("    public void ");
                    builder.append(method.getName());
                    builder.append("()");
                    builder.append(" {");
                    builder.append("\n");
                    builder.append("        // TODO Add some useful test code here");
                    builder.append("\n");
                    builder.append("    }");
                    builder.append("\n");
                    builder.append("\n");
                });

        builder.append("}");
        builder.append("\n");

        String sourceCode = builder.toString();
        LOGGER.info("##### Source Code Generated: \n{}", sourceCode);

        // Write the source code into the source file
        FileWriter writer = new FileWriter(sourceFile);
        writer.write(sourceCode);
        writer.close();

        return sourceCode;
    }

    public static String createClassUsingTextBlock(String className, TestingFramework testingFramework)
            throws IOException, ClassNotFoundException {
        Class<?> clazz = Class.forName(className);

        char c[] = clazz.getSimpleName().toCharArray();
        c[0] = Character.toLowerCase(c[0]);
        String injectMocks = new String(c);

        Field[] fieldArray = clazz.getDeclaredFields();
        Method[] methodArray = clazz.getDeclaredMethods();

        String classPath = clazz.getPackageName().replaceAll(DOT, File.separator);
        LOGGER.info("#####  classPath: {}", classPath);

        // Create file with java extension and Test ending
        File sourceFile = new File(SOURCE_TEST_PATH + classPath + File.separator + clazz.getSimpleName() + SUFFIX);
        boolean isDirectoryCreated = sourceFile.getParentFile().mkdirs();
        boolean isFileCreated = sourceFile.createNewFile();

        LOGGER.info("#####  sourceFile: {}", sourceFile);
        LOGGER.info("##### isDirectoryCreated? {}", isDirectoryCreated);
        LOGGER.info("##### isFileCreated? {}", isFileCreated);

        // Get the source file name
        String testClassName = sourceFile.getName().split(DOT)[0];
        String mockImport = fieldArray.length > 0 ? "import org.mockito.Mock;" : "";

        String instanceVariableCode = """
                    @Mock
                    %s %s %s;

                """;

        // Add @Mock instance variables
        StringBuilder builderInstanceVariables = new StringBuilder();
        Arrays.stream(fieldArray).filter(Objects::nonNull).filter(field -> !field.toString().contains("static"))
                .map(field -> field.toString().split(" ")).forEach(split -> {
                    if (split[1].equals("final")) {
                        split[1] = split[2];
                        split[2] = split[3];
                    }

                    builderInstanceVariables.append(instanceVariableCode.formatted(split[0], split[1],
                            split[2].split("\\.")[split[2].split("\\.").length - 1]));
                });

        String methodCode = """
                    @Test
                    public void %s() {
                        // TODO Add some useful test code here
                    }

                """;

        // Add methods to test
        StringBuilder builderMethods = new StringBuilder();
        Arrays.stream(methodArray).filter(Objects::nonNull).filter(method -> !method.getName().equals("canEqual"))
                .filter(method -> !method.getName().equals("equals"))
                .filter(method -> !method.getName().equals("hashCode"))
                .filter(method -> !method.getName().equals("toString")).forEach(method -> {
                    builderMethods.append(methodCode.formatted(method.getName()));
                });

        String sourceCode = """
                package %s;

                %s
                import org.junit.jupiter.api.extension.ExtendWith;
                import org.mockito.InjectMocks;
                %s
                import org.mockito.junit.jupiter.MockitoExtension;

                @ExtendWith(MockitoExtension.class)
                public class %s {

                %s\
                    @InjectMocks
                    private %s %s;

                %s\
                }
                         """.formatted(clazz.getPackageName(), testingFramework.getImportTestClass(), mockImport,
                testClassName, builderInstanceVariables.toString(), clazz.getSimpleName(), injectMocks,
                builderMethods.toString());

        LOGGER.info("##### Source Code Generated: \n{}", sourceCode);

        // Write the source code into the source file
        FileWriter writer = new FileWriter(sourceFile);
        writer.write(sourceCode);
        writer.close();

        return sourceCode;
    }
}
