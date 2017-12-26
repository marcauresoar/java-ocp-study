package chapter1.enums;

public class EnumExamples {
    public static void main(String... args){
        Season1.SUMMER.printExpectedVisitors(); // high
        System.out.println(Season2.SPRING.getSeasonName()); // Spring
    }
}
