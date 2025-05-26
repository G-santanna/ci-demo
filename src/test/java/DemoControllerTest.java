import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoControllerTest {

    DemoController controller = new DemoController();

     @Test
     void testHello() {
         String response = controller.hello();
         assertEquals("Hello, World!", response);
     }

    @Test
    void testHelloWithDifferentMessage() {
        assertDoesNotThrow(
            () -> {
                String response = controller.hello();
                assertEquals("Hello, World!", response);
            }
        );
    }
}