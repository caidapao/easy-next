package com.caidapao.easynext.constant;

/**
 * @author caixuan
 * @date 2022/11/24 23:32
 **/
public enum SerialNumberPartTypeEnum {

    /**
     * 日期格式
     * 最长举例:
     * 2022-11-24 23:35:41
     * 20221124233541
     */
    DATE("日期", "DATE", 1),
    /**
     * 随机数,纯数字符串
     */
    RANDOM("随机数", "RANDOM", 2),
    /**
     * 通过接口传参
     */
    PARAM("传参", "PARAM", 3),
    /**
     * 流水号
     */
    SERIAL("流水号", "SERIAL", 4),
    /**
     * 自定义字符串
     */
    DIY("自定义字符串", "DIY", 5);

    private final String desc;
    private final String code;
    private final Integer index;

    SerialNumberPartTypeEnum(String desc, String code, Integer index) {
        this.desc = desc;
        this.code = code;
        this.index = index;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getCode() {
        return this.code;
    }

    public Integer getIndex() {
        return this.index;
    }
}