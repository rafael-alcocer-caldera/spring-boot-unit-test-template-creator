package rafael.alcocer.caldera.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnyTest { 

    @Mock
    private int id;

    @Mock
    private java.lang.String name;

    @Mock
    private java.lang.String description;

    @InjectMocks
    private Any any;

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getId() {
    }

    @Test
    public void setDescription() {
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void setId() {
    }

}