package com.caidapao.easynext.dto;

import com.caidapao.easynext.annotation.ImportCheck;
import com.caidapao.easynext.annotation.ImportConstant;
import com.caidapao.easynext.annotation.OrgCheck;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author caixuan
 * @date 2023/3/4 10:47
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class AnythingImportDTO extends BaseImportDTO implements Serializable {


    @OrgCheck
    private String abbrName;

    private String vendorId;

    private String price;

    private String taxPrice;

    private String requireQty;

    private String onloadQty;

    private String requireDate;

    private String require;

    private String itemId;


    public static void main(String[] args) {
        Object s = String.class;
        System.out.println(s);

        AnythingImportDTO dto = new AnythingImportDTO();
        String orgId = dto.getOrgId();
    }

}
