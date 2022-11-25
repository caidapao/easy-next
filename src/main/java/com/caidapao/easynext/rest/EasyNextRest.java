package com.caidapao.easynext.rest;

import com.caidapao.easynext.biz.EasyNextBiz;
import com.caidapao.easynext.dto.EasyNextReqDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping
    public Object nextSerialNumber(@RequestBody EasyNextReqDTO easyNextReqDto) {
        return easyNextBiz.getNextSerialNumber(easyNextReqDto);
    }

}
