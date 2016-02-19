package com.jackman.design.pattern.抽象工厂模式;

/**
 * Created by JackMan on 2016/1/25.
 */
public class IntelCpu implements Cpu{
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数："+pins);
    }
}
