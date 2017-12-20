package com.yushi.sunb.controller;

import com.yushi.sunb.client.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunb on 2017/6/17.
 */
@RestController
public class ConsumerController1 {

    @Autowired
    ComputeClient computeClient;

    @GetMapping("/add")
    public Integer add() {
        return computeClient.add(12, 222);
    }
}
