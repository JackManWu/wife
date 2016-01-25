package com.jackman.design.pattern.抽象工厂模式;

/**
 * Created by wujinlei on 2016/1/25.
 */
public interface AbstractFactory {
    public Cpu createCpu();

    public Mainboard createMainboard();
}
