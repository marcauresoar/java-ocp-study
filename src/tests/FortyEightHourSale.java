package tests;

import java.util.*;
import java.util.stream.Collectors;

public class FortyEightHourSale {
    public static void main(String[] args){
        Set<Benefit> benefitSet = new HashSet<>();
        benefitSet.add(new Benefit("1First", 40));
        benefitSet.add(new Benefit("2Second", 30));
        benefitSet.add(new Benefit("3Third", 10));
        benefitSet.add(new Benefit("4Forth", 20));
        benefitSet.add(new Benefit("5Fifth", 20));

        Benefit raffled = raffleBenefit(benefitSet);
        System.out.println("Raffled: " + raffled.getId());

        testRaffleFunction(benefitSet);
    }

    public static Benefit raffleBenefit(Set<Benefit> benefitSet) {
        List<Benefit> benefitsToBeRaffled = new ArrayList<>();
        benefitSet.stream().forEach(x -> benefitsToBeRaffled.addAll(Collections.nCopies(x.getWeight(), x)));
        Collections.shuffle(benefitsToBeRaffled);
        return benefitsToBeRaffled.get(0);
    }

    public static void testRaffleFunction(Set<Benefit> benefitSet) {
        List<Benefit> raffled = new ArrayList<>();
        for(int i = 0; i < 1000000; i++) {
            raffled.add(raffleBenefit(benefitSet));
        }
        Map<String, Long> map = raffled.stream().collect(Collectors.groupingBy(Benefit::getId, Collectors.counting()));
        System.out.println(new TreeMap(map));
    }
}
