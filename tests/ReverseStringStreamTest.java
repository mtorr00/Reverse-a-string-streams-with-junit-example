import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringStreamTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before the Test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After the Test");
    }

    @Test
    public void reverseString() {
        ReverseStringStream tester = new ReverseStringStream();
        assertEquals("Hello becomes olleH","olleH",tester.reverseString("Hello"));
    }
}