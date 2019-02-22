package com.fanling.neptune.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeController extends BaseController {

    @GetMapping
    public String index() {
        return "welcome";
    }
}
