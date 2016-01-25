package com.jackman.design.pattern.工厂方法模式;

/**
 * Created by wujinlei on 2016/1/25.
 */
public class ExportStandardPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出标准pdf文件");
        return true;
    }
}
