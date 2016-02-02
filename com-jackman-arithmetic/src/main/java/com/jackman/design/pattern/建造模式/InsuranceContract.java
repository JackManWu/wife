package com.jackman.design.pattern.建造模式;

/**
 * Created by JackMan on 2016/2/2.
 */
public class InsuranceContract {
    private String contractId;

    private String personName;

    private String companyName;

    private long beginDate;

    private long endDate;

    private String otherData;

    private InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherData = builder.otherData;
    }

    public void someOperation() {
        System.out.println("当前正在操作的保险合同编号为【" + this.contractId + "】");
        System.out.println("当前签订人为："+this.personName);
    }

    public static class ConcreteBuilder {
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        public ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }

        public InsuranceContract build() {
            if (contractId == null || contractId.trim().length() == 0) {
                throw new IllegalArgumentException("合同编号不能为空");
            }
            boolean signPerson = (personName != null && personName.trim().length() > 0);
            boolean signCompany = (companyName != null && companyName.trim().length() > 0);
            if (signPerson && signCompany) {
                throw new IllegalArgumentException("一份保险不能同时与个人和公司签订");
            }
            if (signPerson == false && signCompany == false) {
                throw new IllegalArgumentException("一份合同不能没有签订对象");
            }
            if (beginDate <= 0) {
                throw new IllegalArgumentException("一份合同必须有开始生效日期");
            }
            if (endDate <= 0) {
                throw new IllegalArgumentException("一份合同必须有失效日期");
            }
            if (endDate < beginDate) {
                throw new IllegalArgumentException("一份保险合同的失效日期必须大于生效日期");
            }
            return new InsuranceContract(this);
        }
    }
}
