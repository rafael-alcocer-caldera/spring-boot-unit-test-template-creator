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
    public void myName() {
        // TODO Add some useful test code here
    }

    @Test
    public void getName() {
        // TODO Add some useful test code here
    }

    @Test
    public void setName() {
        // TODO Add some useful test code here
    }

    @Test
    public void results() {
        // TODO Add some useful test code here
    }

    @Test
    public void createAddress() {
        // TODO Add some useful test code here
    }

    @Test
    public void getAge() {
        // TODO Add some useful test code here
    }

    @Test
    public void setAge() {
        // TODO Add some useful test code here
    }

}
