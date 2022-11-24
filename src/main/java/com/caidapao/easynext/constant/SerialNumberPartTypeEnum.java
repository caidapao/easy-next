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
    DATE("日期", "DATE"),
    /**
     * 随机数,纯数字符串
     */
    RANDOM("随机数", "RANDOM"),
    /**
     * 通过接口传参
     */
    PARAM("传参", "PARAM"),
    /**
     * 流水号
     */
    SERIAL("流水号", "SERIAL"),
    /**
     * 自定义字符串
     */
    DIY("自定义字符串", "DIY");

    private String name;
    private String code;

    SerialNumberPartTypeEnum(String name, String code) {
        this.name = name;
        this.code = code;
    }
}