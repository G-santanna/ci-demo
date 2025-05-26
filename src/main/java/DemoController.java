import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // Add your endpoints here
    // For example:
     @GetMapping("/hello")
     public String hello() {
         return "Hello, World!";
     }
}
