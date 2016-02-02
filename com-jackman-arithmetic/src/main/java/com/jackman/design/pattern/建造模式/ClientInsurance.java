package com.jackman.design.pattern.建造模式;

/**
 * Created by JackMan on 2016/2/2.
 */
public class ClientInsurance {
    public static void main(String[] args) {
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);
        InsuranceContract contract = builder.setPersonName("小明").setOtherData("测试").build();
        contract.someOperation();
    }
}
