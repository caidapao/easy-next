package com.caidapao.easynext.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author caixuan
 * @date 2022/11/19 07:46
 **/
@Data
public class SerialNumber {

    private String id;

    private String code;

    private String name;

    private String appId;

    private String enabled;

    private Date crtTime;

    private Date updTime;

}
