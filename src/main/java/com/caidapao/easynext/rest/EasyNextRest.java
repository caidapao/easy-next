package com.caidapao.easynext.rest;

import com.caidapao.easynext.biz.EasyNextBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 流水号服务控制器
 *
 * @author caixuan
 * @date 2022/11/18 23:23
 **/
@RestController
@RequestMapping("/easy/next")
public class EasyNextRest {

    @Autowired
    private EasyNextBiz easyNextBiz;

    @GetMapping("/{code}")
    public Object nextSerialNumber(@PathVariable String code) {
        return easyNextBiz.getNextSerialNumber(code);
    }

    @GetMapping("/batch/{code}/{step}")
    public Object batchNextSerialNumber(@PathVariable String code, @PathVariable Long step) {
        return easyNextBiz.getNextBatchSerialNumber(code, step);
    }
}
