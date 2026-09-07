import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void testGreet() {
        HelloWorld hello = new HelloWorld();

        assertEquals("Hello World", hello.greet());
    }
}
