package chapter8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamSample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Tiger", 5, 'T'));
        animals.add(new Animal("Penguin", 8, 'P'));

        File file = new File("animal.data");
        createAnimalsFile(animals, file);
        System.out.println(getAnimals(file));
    }

    public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while(true) {
                Object object = in.readObject();
                if (object instanceof Animal) {
                    animals.add((Animal) object);
                }
            }
        } catch (EOFException e) {
            // file end reached
        }
        return animals;
    }

    public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(
                                        new BufferedOutputStream(
                                             new FileOutputStream(dataFile)))) {
            for(Animal animal: animals) {
                out.writeObject(animal);
            }
        }
    }
}
