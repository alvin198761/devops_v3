package org.vm.server.cluster.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vm.server.cluster.system.feignclient.AdFeignClient;

/**
 * Created by Administrator on 2017/8/29.
 */
@RestController
@RequestMapping("/api/test")
public class TestAdController {

    @Autowired
    private AdFeignClient adFeignClient;

    @GetMapping
    public String test() {
        return this.adFeignClient.test();
    }
}
