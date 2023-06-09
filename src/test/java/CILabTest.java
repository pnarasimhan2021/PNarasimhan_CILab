import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
       myString.setString("hello world");
       assertEquals(false, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("Hello World");
        assertEquals(true, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest3() {
        fail("Not yet implemented");
    }
    @Test
    public void detectCapitalUseTest4() {
        fail("Not yet implemented");
    }

}
