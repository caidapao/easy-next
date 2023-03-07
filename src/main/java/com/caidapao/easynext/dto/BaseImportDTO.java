package com.caidapao.easynext.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author caixuan
 * @date 2023/3/4 10:47
 **/
@Data
public class BaseImportDTO implements Serializable {


    private String orgId;

    private String orgCode;

    private String vendorId;

    private String vendorCode;

    private String itemId;

}
