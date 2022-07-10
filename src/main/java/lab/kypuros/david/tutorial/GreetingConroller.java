package lab.kypuros.david.tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/* I justed added a @RestController and all the code above and below auto-compated*/
@RestController
public class GreetingConroller {
    @RequestMapping("/")
    public String getGreeting() {
        return "David Kypuros was here!!!!";
    }
}
