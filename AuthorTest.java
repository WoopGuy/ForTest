package autor;
import java.lang.*;
public class AuthorTest {
    public static void main(String[] args) {
        Autor a1 = new Autor("Vasiliy", "Vasya@gmail.com", '6');
        System.out.println("Autor is " +a1.getName()+", email:"+a1.getEmail()+", gender:"+a1.getGender());
        Autor a2 = new Autor("Katya", "katya@gmail.com", '8');
        System.out.println("Autor is " +a2.getName()+", email:"+a2.getEmail()+", gender:"+a2.getGender());
        Autor a3 = new Autor("Petr", "petr228@yandex.ru", '9');
        System.out.println("Autor is " +a3.getName()+", email:"+a3.getEmail()+", gender:"+a3.getGender());
    }
}
