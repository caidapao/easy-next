package com.caidapao.easynext.rest;

import com.caidapao.easynext.annotation.ImportCheck;
import com.caidapao.easynext.biz.EasyNextBiz;
import com.caidapao.easynext.dto.AnythingImportDTO;
import com.caidapao.easynext.dto.EasyNextReqDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 流水号服务控制器
 *
 * @author caixuanr
 * @date 2022/11/18 23:23
 **/
@RestController
@RequestMapping("/easy/next")
public class EasyNextRest {

    @Autowired
    private EasyNextBiz easyNextBiz;


    @PostMapping
    public Object nextSerialNumber(@RequestBody EasyNextReqDTO easyNextReqDto, @ImportCheck List<AnythingImportDTO> importDTOList) {

        return easyNextBiz.getNextSerialNumber(easyNextReqDto);
    }

    @PostMapping("/batch/import")
    public Object batchImport(@ImportCheck AnythingImportDTO importDTOList) {
        this.importAnything(importDTOList);
        return null;
    }

    private void importAnything(AnythingImportDTO importDTOList) {
        System.out.println(importDTOList);
    }

}
