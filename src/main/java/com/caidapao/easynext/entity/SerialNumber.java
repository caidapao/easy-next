package com.caidapao.easynext.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 流水号
 * @author caixuan
 * @date 2022/11/19 07:46
 **/
@Data
@Table(name = "en_serial_number")
public class SerialNumber {

    @Id
    private String id;

    private String code;

    private String name;

    private String enabled;

    private Date crtTime;

    private Date updTime;

}
