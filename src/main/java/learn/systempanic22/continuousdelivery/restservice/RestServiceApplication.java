package learn.systempanic22.continuousdelivery.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alexandre AMEVOR
 */
@SpringBootApplication
@RestController
public class RestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }

    @GetMapping("/message")
    public String message(){
        return "Learning DevOps Hard Way";
    }
}
