package com.chat2thesis.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rabbit
 */
@RequestMapping("a")
@RestController
public class testController {

    @GetMapping("b")
    public String method(){
        return "成功";
    }

}
