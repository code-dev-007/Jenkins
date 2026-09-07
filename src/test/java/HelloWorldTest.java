import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void testAdd() {
        HelloWorld obj = new HelloWorld();

        assertEquals(5, obj.add(2, 3));
    }
}
