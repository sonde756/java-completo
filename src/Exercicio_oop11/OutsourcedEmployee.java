package Exercicio_oop11;

import java.util.List;

public class OutsourcedEmployee extends Employee {

    private Double addtionalChange;

    public OutsourcedEmployee() {
        super();
    }


    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addtionalChange) {
        super(name, hours, valuePerHour);
        this.addtionalChange = addtionalChange;
    }

    public Double getAddtionalChange() {
        return addtionalChange;
    }

    public void setAddtionalChange(Double addtionalChange) {
        this.addtionalChange = addtionalChange;
    }

    @Override
    public Double payment() {
        return super.payment() + addtionalChange * 1.1;
    }
}
