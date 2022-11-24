package com.caidapao.easynext.biz;


import com.caidapao.easynext.entity.SerialNumberPart;

import java.util.List;

/**
 * 流水号服务
 * @author caixuan
 * @date 2022/11/18 23:26
 **/
public interface SerialNumberPartBiz {

    List<SerialNumberPart> getAllPartsByCode(String serialNumberCode);

    String getPartResult(SerialNumberPart part);
}
