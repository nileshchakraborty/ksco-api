package co.ksco.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    private static Logger LOGGER = LoggerFactory.getLogger(RegistrationController.class);

    @PostMapping ("/api/v1/registration/")
    public String registration(@RequestBody String body){
        LOGGER.info("{}", body);
        return String.valueOf(true);
    }
}
