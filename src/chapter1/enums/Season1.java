package chapter1.enums;

public enum Season1 {
    WINTER("Low") {
        public void printExpectedVisitors(){
            System.out.println("Winter Low");
        }
    }, SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private String expectedVisitors;
    Season1(String expectedVisitors){ // private constructor redundant
        this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}
