package com.jackman.design.pattern.抽象工厂模式;

/**
 * Created by wujinlei on 2016/1/25.
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new AmdCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(938);
    }
}
