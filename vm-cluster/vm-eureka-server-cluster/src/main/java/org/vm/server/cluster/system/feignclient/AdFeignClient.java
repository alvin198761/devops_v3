package org.vm.server.cluster.system.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/8/29.
 */
@FeignClient("vm-eureka-server-ad")
public interface AdFeignClient {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    String test();
}
