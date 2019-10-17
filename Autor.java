package autor;

import java.lang.*;

public class Autor {
    private String name;
    private String email;
    private char gender;

    public Autor(){
        name = "Vasiliy";
        email = "Vasya@gmail.com";
        gender = 'm';
    }
    public Autor(String n){
        name = n;
        email = "Vasya@gmail.com";
        gender = 's';
    }
    public Autor(String n, String e){
        name = n;
        email = e;
        gender = 'u';
    }
    public Autor(String n, String e, char g){
        name = n;
        email = e;
        gender = g;
    }
    public void setName(String name){ this.name = name;}
    public void setEmail(String email){this.email = email;}
    public void setGender(char gender){this.gender = gender;}
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }

    @Override
    public String toString(){
        return "Author @ ("+this.name+","+this.email+").";
    }
}
