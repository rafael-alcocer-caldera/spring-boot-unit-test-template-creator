package rafael.alcocer.caldera.service;

import org.testng.annotations.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnyServiceImplTest {

    @Mock
    private rafael.alcocer.caldera.data.AnyData anyData;

    @InjectMocks
    private AnyServiceImpl anyServiceImpl;

    @Test
    public void showAnything() {
        // TODO Add some useful test code here
    }

}
