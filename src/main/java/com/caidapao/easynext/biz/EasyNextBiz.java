package com.caidapao.easynext.biz;


import java.util.List;

/**
 * 流水号服务接口
 * @author caixuan
 * @date 2022/11/18 23:26
 **/
public interface EasyNextBiz {

    /**
     * 获取下一个流水号
     * @param code 流水号编码
     * @return 下一个流水号
     */
    String getNextSerialNumber(String code);

    /**
     * 获取下一批流水号
     * @param code 流水号编码
     * @param step 步长
     * @return 批量流水号
     */
    List<String> getNextBatchSerialNumber(String code, Long step);
}
