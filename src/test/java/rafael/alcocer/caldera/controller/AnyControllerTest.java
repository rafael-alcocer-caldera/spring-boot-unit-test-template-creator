package rafael.alcocer.caldera.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnyControllerTest { 

    @Mock
    private rafael.alcocer.caldera.service.AnyService anyService;

    @InjectMocks
    private AnyController anyController;

    @Test
    public void showAnything() {
    }

}