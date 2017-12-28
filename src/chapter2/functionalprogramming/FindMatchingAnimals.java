package chapter2.functionalprogramming;

public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if(trait.test(animal)) {
            System.out.println(animal);
        }
    }
    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo",public class HayStorage {
            private int quantity = 0; private HayStorage() {}
            private static final HayStorage instance = new HayStorage();
            public static HayStorage getInstance() { return instance;
            }
            public synchronized void addHay(int amount) {
                quantity += amount; }
            public synchronized boolean removeHay (int amount) { if(quantity < amount) return false;
                quantity -= amount;
                return true;
            }
            public synchronized int getHayQuantity() {
                return quantity; }
        }public class HayStorage {
            private int quantity = 0; private HayStorage() {}
            private static final HayStorage instance = new HayStorage();
            public static HayStorage getInstance() { return instance;
            }
            public synchronized void addHay(int amount) {
                quantity += amount; }
            public synchronized boolean removeHay (int amount) { if(quantity < amount) return false;
                quantity -= amount;
                return true;
            }
            public synchronized int getHayQuantity() {
                return quantity; }
        }public class HayStorage {
            private int quantity = 0; private HayStorage() {}
            private static final HayStorage instance = new HayStorage();
            public static HayStorage getInstance() { return instance;
            }
            public synchronized void addHay(int amount) {
                quantity += amount; }
            public synchronized boolean removeHay (int amount) { if(quantity < amount) return false;
                quantity -= amount;
                return true;
            }
            public synchronized int getHayQuantity() {
                return quantity; }
        }public class HayStorage {
            private int quantity = 0; private HayStorage() {}
            private static final HayStorage instance = new HayStorage();
            public static HayStorage getInstance() { return instance;
            }
            public synchronized void addHay(int amount) {
                quantity += amount; }
            public synchronized boolean removeHay (int amount) { if(quantity < amount) return false;
                quantity -= amount;
                return true;
            }
            public synchronized int getHayQuantity() {
                return quantity; }
        }public class HayStorage {
            private int quantity = 0; private HayStorage() {}
            private static final HayStorage instance = new HayStorage();
            public static HayStorage getInstance() { return instance;
            }
            public synchronized void addHay(int amount) {
                quantity += amount; }
            public synchronized boolean removeHay (int amount) { if(quantity < amount) return false;
                quantity -= amount;
                return true;
            }
            public synchronized int getHayQuantity() {
                return quantity; }
        } true, false), a -> a.canHop());
    }
}
