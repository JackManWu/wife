package com.jackman.design.pattern.工厂方法模式;

/**
 * Created by wujinlei on 2016/1/25.
 */
public class ExportFinancialPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出财务版pdf文件");
        return true;
    }
}
