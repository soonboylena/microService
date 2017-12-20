package com.yushi.sunb.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Project Name:    microService
 * User:            sunb
 * Date:            2017-12-19
 * Time:            19:53
 */

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("string")
    public String test(String string) {
        return "response: " + string;
    }
}
