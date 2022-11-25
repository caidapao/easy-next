package com.caidapao.easynext.biz;


import com.caidapao.easynext.dto.EasyNextReqDTO;

import java.util.List;

/**
 * 流水号服务
 * @author caixuan
 * @date 2022/11/18 23:26
 **/
public interface SerialNumberBiz {

    /**
     * 通过流水号编码获取流水号
     * @param easyNextReqDto 请求参数
     * @return
     */
    String getSerialNumberByCode(EasyNextReqDTO easyNextReqDto);
}
