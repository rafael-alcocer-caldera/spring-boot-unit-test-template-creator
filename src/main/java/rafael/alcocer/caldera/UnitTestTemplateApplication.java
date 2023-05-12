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
package rafael.alcocer.caldera;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import rafael.alcocer.caldera.utils.TestingFramework;
import rafael.alcocer.caldera.utils.UnitTestTemplateCreatorUtils;

@SpringBootApplication
public class UnitTestTemplateApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UnitTestTemplateApplication.class, args).close();
    }

    @Override
    public void run(String... args) throws Exception {
        UnitTestTemplateCreatorUtils.createClass("rafael.alcocer.caldera.controller.AnyController",
                TestingFramework.JUPITER);
        UnitTestTemplateCreatorUtils.createClass("rafael.alcocer.caldera.data.AnyData", TestingFramework.JUPITER);
        UnitTestTemplateCreatorUtils.createClass("rafael.alcocer.caldera.model.Any", TestingFramework.JUPITER);
        UnitTestTemplateCreatorUtils.createClass("rafael.alcocer.caldera.model.Person", TestingFramework.TESTNG);
        UnitTestTemplateCreatorUtils.createClass("rafael.alcocer.caldera.service.AnyService", TestingFramework.TESTNG);
        UnitTestTemplateCreatorUtils.createClass("rafael.alcocer.caldera.service.AnyServiceImpl",
                TestingFramework.TESTNG);
    }
}
