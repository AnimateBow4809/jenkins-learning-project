import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void printTest() {
        Main.print();
        assertEquals("hi", outputStreamCaptor.toString()
                .trim());
    }


    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }


    @Test
    void add() {
        int ans=Main.add(1,2);
        assertEquals(ans,3);
    }

    @Test
    void mul() {
        int ans=Main.mul(1,2);
        assertEquals(ans,2);
    }

    @Test
    void mul2() {
        assertEquals(6,Main.mul2(2,4));
    }

    @Test
    void div() {
        assertEquals(1,Main.div(2,2));
    }
}