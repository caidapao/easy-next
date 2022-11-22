package com.caidapao.easynext.biz;


import java.util.List;

/**
 * @author cdp
 */
public interface EasyNextBiz {

    /**
     * 获取下一个流水号
     * @param code 流水号编码
     * @return 下一个流水号
     */
    String getNextSerialNumber(String code);

    /**
     * 批量获取流水号
     * @param code 流水号编码
     * @param step 步长
     * @return 批量流水号
     */
    List<String> getNextBatchSerialNumber(String code, Long step);
}
