package rafael.alcocer.caldera.service;

import org.testng.annotations.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnyServiceTest { 

    @InjectMocks
    private AnyService anyService;

    @Test
    public void showAnything() {
    }

}