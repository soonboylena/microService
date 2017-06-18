package com.yushi.sunb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunb on 2017/6/18.
 */
@RestController
public class ComputeController {

    private static Logger log = LoggerFactory.getLogger(ComputeController.class);

    @GetMapping("/multiply")
    public Integer multiply(Integer a, Integer b) {

        log.info("/multiply");
        return a * b;
    }

}
