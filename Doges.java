package Doog;

public class Doges {
    public static void main(String[] args) {

        Dog ourdog = new Dog();
        ourdog.eat();
        ourdog.sleep();
        String say = ourdog.say("Поиграй со мной\n");
        System.out.println(say);
    }
}
