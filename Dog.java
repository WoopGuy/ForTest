package Doog;

public class Dog {
    public int weight;
    public String name;
    public String color;

    public static void eat() {
        System.out.println("Ем...");
    }

    public void sleep() {
        System.out.println("Сплю хрррр...");
    }

    public String say(String words) {
        String phrase = words + "...Гав...\n";
        return phrase;
    }
}