package com.caidapao.easynext.biz;


import com.caidapao.easynext.dto.EasyNextReqDTO;
import com.caidapao.easynext.entity.SerialNumberPart;

import java.util.List;

/**
 * 流水号服务
 *
 * @author caixuan
 * @date 2022/11/18 23:26
 **/
public interface SerialNumberPartBiz {

    List<SerialNumberPart> getAllPartsByCode(String serialNumberCode);

    /**
     * 流水号成分字符串
     *
     * @param part
     * @return
     */
    String getPartResult(SerialNumberPart part, EasyNextReqDTO easyNextReqDto);
}
