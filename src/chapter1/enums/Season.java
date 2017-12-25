package chapter1.enums;

public enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private String expectedVisitors;
    Season(String expectedVisitors){ // private constructor redundant
        this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}
