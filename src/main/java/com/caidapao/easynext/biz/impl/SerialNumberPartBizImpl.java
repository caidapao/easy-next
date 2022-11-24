package com.caidapao.easynext.biz.impl;

import com.caidapao.easynext.biz.SerialNumberPartBiz;
import com.caidapao.easynext.entity.SerialNumberPart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 流水号成分实现类
 * @author caixuan
 * @date 2022/11/18 23:26
 **/
@Slf4j
@Service
public class SerialNumberPartBizImpl implements SerialNumberPartBiz {

    @Override
    public List<SerialNumberPart> getAllPartsByCode(String serialNumberCode) {
        return null;
    }

    @Override
    public String getPartResult(SerialNumberPart part) {
        return null;
    }
}
