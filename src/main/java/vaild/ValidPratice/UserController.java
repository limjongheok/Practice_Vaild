package vaild.ValidPratice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
@Validated

public class UserController {

    @PostMapping(value = "/user")
    public String insertUser(@Valid  @RequestBody UserDto userDto){

        log.info("@ param : {}", userDto);
        return "success";
    }
}