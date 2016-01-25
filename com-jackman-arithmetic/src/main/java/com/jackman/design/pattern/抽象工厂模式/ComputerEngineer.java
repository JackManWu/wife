package com.jackman.design.pattern.抽象工厂模式;

/**
 * Created by wujinlei on 2016/1/25.
 */
public class ComputerEngineer {
    private Cpu cpu = null;
    private Mainboard mainboard = null;

    public void makeComputer(AbstractFactory af) {
        prepareHandlewares(af);
    }

    public void prepareHandlewares(AbstractFactory af) {
        this.cpu = af.createCpu();
        this.mainboard = af.createMainboard();

        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
