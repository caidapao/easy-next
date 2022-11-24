package com.caidapao.easynext.biz;


/**
 * 流水号服务
 * @author caixuan
 * @date 2022/11/18 23:26
 **/
public interface SerialNumberBiz {

    /**
     * 通过流水号编码获取流水号
     * @param code 流水号编码
     * @return
     */
    String getSerialNumberByCode(String code);
}
