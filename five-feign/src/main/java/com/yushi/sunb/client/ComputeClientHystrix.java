package com.yushi.sunb.client;

import org.springframework.stereotype.Component;

/**
 * Created by sunb on 2017/6/18.
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
