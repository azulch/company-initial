
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
class MessageController {

    @Value("${message:Hello default}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return "\n" + this.message + "\n\n";
    }
}
