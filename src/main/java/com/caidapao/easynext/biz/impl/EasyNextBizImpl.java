package com.caidapao.easynext.biz.impl;

import com.caidapao.easynext.biz.EasyNextBiz;
import com.caidapao.easynext.biz.SerialNumberBiz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * EasyNext实现类
 * @author caixuan
 * @date 2022/11/18 23:26
 **/
@Slf4j
@Service
public class EasyNextBizImpl implements EasyNextBiz {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private SerialNumberBiz serialNumberBiz;



    @Override
    public String getNextSerialNumber(String code) {
        if (!StringUtils.hasText(code)) {
            //TODO:caidapao 细化异常
            throw new RuntimeException("流水号编码不能为空");
        }
        return serialNumberBiz.getSerialNumberByCode(code);
    }

    @Override
    public List<String> getNextBatchSerialNumber(String code, Long size) {
        String nextBatchNumber = String.valueOf(redisTemplate.opsForValue().increment(code, size));
        return null;
    }

}
