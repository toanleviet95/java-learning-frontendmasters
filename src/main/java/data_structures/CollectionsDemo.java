package data_structures;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
         setDemo();
         listDemo();
         queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(fruits);

        fruits.remove("lemon");

        System.out.println("contains lemon? " + fruits.contains("lemon"));

        System.out.println("size: " + fruits.size());

        Set moreFruit = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruit);
    }

    public static void listDemo() {
        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grape");
        fruits.add("lemon");

        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        fruits.forEach(f -> {
            f = "fruit: " + f;
            System.out.println(f);
        });

        // Method reference way Class::method
        fruits.forEach(System.out::println);

        fruits.remove("lemon");
        fruits.remove(3);

        System.out.println("index 2: " + fruits.get(2));
        System.out.println("index of grape: " + fruits.indexOf("grape"));
        System.out.println("last index of lemon: " + fruits.lastIndexOf("lemon"));

        List moreFruit = List.of("cherry", "plum");
        System.out.println(moreFruit);
    }

    public static void queueDemo() {
        Queue<String> fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        var removed = fruits.remove();

        System.out.println("removed: " + removed);
        System.out.println("head of queue: " + fruits.peek());

        System.out.println(fruits);
    }

    private static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.putIfAbsent("lemon", 17);
        fruitCalories.remove("lemon");

        for(Map.Entry calorieInfo : fruitCalories.entrySet()) {
            System.out.println((calorieInfo.getKey() + ": " + calorieInfo.getValue()));
        }

        fruitCalories.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });

        System.out.println(fruitCalories);
        System.out.println("bana calories: " + fruitCalories.get("banana"));
        System.out.println("contains orange? " + fruitCalories.containsKey("orange"));

        Map immutableFruitCalories = Map.of("apple", 95, "lemon", 25);

        System.out.println(immutableFruitCalories);
    }
}
