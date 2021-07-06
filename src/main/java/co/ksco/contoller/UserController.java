package co.ksco.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/api/v1/user/{currentId}")
    public String loggedInUser(@PathVariable String currentId){
        LOGGER.info("{}", currentId);
        return String.valueOf(true);
    }
}
