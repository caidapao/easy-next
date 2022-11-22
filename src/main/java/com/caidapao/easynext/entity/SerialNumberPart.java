package com.caidapao.easynext.entity;

import lombok.Data;

/**
 * 流水号成分
 *
 * @author caixuan
 * @date 2022/11/20 00:21
 **/
@Data
public class SerialNumberPart {

    private String serialNumberId;

    /**
     * 成分类型
     * 1.日期格式
     * 2.随机数
     * 3.传参
     * 4.流水号
     * 5.自定义
     */
    private String partType;

    /**
     * 成分值,对应成分类型
     * 1.必填日期格式化表达式
     * 2.不填
     * 3.不填
     * 4.不填
     * 5.必填
     */
    private String partValue;

    /**
     * 成分长度,任何类型均为必填
     */
    private Long length;

    /**
     * 步长,成分类型为流水号时必填
     */
    private Long step;


    /**
     * 重置周期,必填
     * 时/日/周/月
     */
    private String resetType;


    /**
     * 排序必填
     */
    private Integer sort;

}