package com.jackman.design.pattern.工厂方法模式;

/**
 * Created by JackMan on 2016/1/25.
 */
public class ExportStandardHtmlFile implements ExportFile{
    @Override
    public boolean export(String data) {
        System.out.println("导出标准HTML文件");
        return true;
    }
}
