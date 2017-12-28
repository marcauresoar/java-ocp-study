package chapter1.enums;

public class EnumExamples {
    public static void main(String... args){
        Season1.SUMMER.printExpectedVisitors(); // high
        Season1.WINTER.printExpectedVisitors(); // Winter Low
        System.out.println(Season2.SPRING.getSeasonName()); // Spring
    }
}
