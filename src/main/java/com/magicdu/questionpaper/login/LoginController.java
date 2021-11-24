package com.magicdu.questionpaper.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {

    @GetMapping("login")
    public String login(){
        return "success";
    }

    @GetMapping("permit")
    public String permit(){
        return "permit";
    }

}
