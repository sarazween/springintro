package oslomet.webprog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class heiController {
    @GetMapping("/")
    public String hei(String navn){
        return "hei verden "+ navn+"!";
    }
}
