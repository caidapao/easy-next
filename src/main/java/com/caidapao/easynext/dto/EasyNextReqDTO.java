package com.caidapao.easynext.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author caixuan
 * @date 2022/11/26 00:16
 **/
@Data
public class EasyNextReqDTO implements Serializable {
    /**
     * 流水号编码
     */
    private String code;

    /**
     * 步长
     */
    private Long step;

    /**
     * 流水号参数
     */
    private List<String> params;
}
