package com.jackman.design.pattern.工厂方法模式;

/**
 * Created by JackMan on 2016/1/25.
 */
public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if ("standard".equals(type)) {
            return new ExportStandardHtmlFile();
        } else if ("financial".equals(type)) {
            return new ExportFinancialHtmlFile();
        } else {
            throw new RuntimeException("没找到对象");
        }
    }
}
