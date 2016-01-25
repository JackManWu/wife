package com.jackman.design.pattern.抽象工厂模式;

/**
 * Created by wujinlei on 2016/1/25.
 */
public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
