package com.caidapao.easynext.biz.impl;

import com.caidapao.easynext.biz.SerialNumberPartBiz;
import com.caidapao.easynext.constant.SerialNumberPartTypeEnum;
import com.caidapao.easynext.dto.EasyNextReqDTO;
import com.caidapao.easynext.entity.SerialNumberPart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 流水号成分实现类
 *
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
    public String getPartResult(SerialNumberPart part, EasyNextReqDTO easyNextReqDto) {
        switch (SerialNumberPartTypeEnum.valueOf(part.getPartType())) {
            case DATE:
                return this.parseDateTypePart(part);
            case RANDOM:
                return this.parseRandomTypePart(part);
            case PARAM:
                if (CollectionUtils.isEmpty(easyNextReqDto.getParams())) {
                    throw new IllegalArgumentException("参数类型流水号,参数不能为空");
                }
                return this.parseParamTypePart(part, easyNextReqDto.getParams());
            case SERIAL:
                return this.parseSerialTypePart(part, easyNextReqDto.getStep());
            case DIY:
                return this.parseDoItYourselfTypePart(part);
            default:
                return "null";
        }
    }

    public static void main(String[] args) {
        SerialNumberPartTypeEnum enum1 = SerialNumberPartTypeEnum.valueOf("XIXI");
        System.out.println();
    }

    private String parseDateTypePart(SerialNumberPart part) {
        return null;
    }

    private String parseRandomTypePart(SerialNumberPart part) {
        return null;
    }

    private String parseParamTypePart(SerialNumberPart part, List<String> params) {

        return null;
    }

    private String parseSerialTypePart(SerialNumberPart part, Long step) {
        return null;
    }

    private String parseDoItYourselfTypePart(SerialNumberPart part) {
        return null;
    }
}
