package chapter1.nestedclasses.anonymousinnerclass;

public class AnonInner1 {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    public int admission(int basePrice){
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
