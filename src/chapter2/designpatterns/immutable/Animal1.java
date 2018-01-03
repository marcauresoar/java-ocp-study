package chapter2.designpatterns.immutable;

import java.util.*;

public final class Animal1 {
    private final List<String> favoriteFoods;
    public Animal1(List<String> favoriteFoods) {
        if(favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }
    public List<String> getFavoriteFoods() { // MAKES CLASS MUTABLE!
        return favoriteFoods;
    }
}
