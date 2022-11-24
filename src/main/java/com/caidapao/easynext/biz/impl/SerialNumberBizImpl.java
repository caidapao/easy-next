package com.caidapao.easynext.biz.impl;

import com.caidapao.easynext.biz.SerialNumberBiz;
import com.caidapao.easynext.biz.SerialNumberPartBiz;
import com.caidapao.easynext.constant.Constants;
import com.caidapao.easynext.entity.SerialNumber;
import com.caidapao.easynext.entity.SerialNumberPart;
import com.caidapao.easynext.repository.cache.LocalCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 流水号服务实现类
 *
 * @author caixuan
 * @date 2022/11/18 23:26
 **/
@Slf4j
@Service
public class SerialNumberBizImpl implements SerialNumberBiz {

    @Autowired
    private SerialNumberPartBiz serialNumberPartBiz;

    @Override
    public String getSerialNumberByCode(String code) {
        //校验流水号
        this.validateCode(code);
        //通过流水号编码从缓存中拿到所有流水号成分,按照排序从左到右拼接而成.
        List<SerialNumberPart> parts = LocalCache.getSerialNumberParts(code);
        parts = parts.stream().sorted(Comparator.comparing(SerialNumberPart::getSort)).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (SerialNumberPart part : parts) {
            sb.append(serialNumberPartBiz.getPartResult(part));
        }
        return sb.toString();
    }

    private void validateCode(String code) {
        if (!StringUtils.hasText(code)) {
            throw new RuntimeException("流水号编码不能为空");
        }
        SerialNumber serialNumber = LocalCache.getSerialNumber(code);
        if (serialNumber == null) {
            throw new RuntimeException("流水号编码" + code + "不存在");
        }
        if (!Constants.Y.equals(serialNumber.getEnabled())) {
            throw new RuntimeException("流水号编码" + code + "未启用");
        }
    }
}
