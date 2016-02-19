package com.jackman.design.pattern.抽象工厂模式;

/**
 * Created by JackMan on 2016/1/25.
 */
public class AmdMainboard implements Mainboard {
    private int cpuholes = 0;

    public AmdMainboard(int cpuholes) {
        this.cpuholes = cpuholes;
    }

    @Override
    public void installCPU() {
        System.out.println("AMD主板的CPU插槽孔数是："+cpuholes);
    }
}
