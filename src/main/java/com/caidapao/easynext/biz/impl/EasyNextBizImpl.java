package com.caidapao.easynext.biz.impl;

import com.caidapao.easynext.biz.EasyNextBiz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 流水号服务实现类
 * @author caixuan
 * @date 2022/11/18 23:26
 **/
@Slf4j
@Service
public class EasyNextBizImpl implements EasyNextBiz {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;



    @Override
    public String getNextSerialNumber(String code) {
        //通过流水号拿到所有流水号规则,按照排序从左到右拼接而成.

//        String getSerialNumberByRule();
        return null;
//        return String.valueOf(redisTemplate.opsForValue().increment(code));
    }

    @Override
    public List<String> getNextBatchSerialNumber(String code, Long size) {
        String nextBatchNumber = String.valueOf(redisTemplate.opsForValue().increment(code, size));
        return null;
    }

    private String getSerialNumberPrefix(String code){
        return null;
    }
}
