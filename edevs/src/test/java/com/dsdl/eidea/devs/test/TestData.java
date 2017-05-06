package com.dsdl.eidea.devs.test;

import com.dsdl.eidea.devs.model.GenModelDto;

import java.io.File;

/**
 * Created by 刘大磊 on 2017/1/11 17:26.
 */
public class TestData
{
    public static GenModelDto getGenModel()
    {
        GenModelDto genModelDto=new GenModelDto();
        genModelDto.setBasePackage("com.dsdl.eidea");
        genModelDto.setGenerateService(true);
        genModelDto.setGenerateWeb(true);
        genModelDto.setModelName("Window");
        genModelDto.setModule("core");
        genModelDto.setPagingByDb(false);
        genModelDto.setTableName("core_window");
        genModelDto.setTrl(false);
        return genModelDto;
    }
}
