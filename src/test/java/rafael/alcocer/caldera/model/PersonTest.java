package rafael.alcocer.caldera.model;

import org.testng.annotations.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonTest { 

    @Mock
    private java.lang.String name;

    @Mock
    private int age;

    @InjectMocks
    private Person person;

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void results() {
    }

    @Test
    public void createAddress() {
    }

    @Test
    public void myName() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }

}