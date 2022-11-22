package com.caidapao.easynext.entity;

import lombok.Data;

/**
 * @author caixuan
 * @date 2022/11/20 00:21
 **/
@Data
public class SerialNumberRule {

    private String serialNumberId;

    private String serialNumberCode;

    private String ruleType;

    private String ruleValue;

    private String resetType;

    private Long length;

    private Integer sort;

}