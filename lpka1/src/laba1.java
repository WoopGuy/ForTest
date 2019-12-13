import java.util.Scanner;

public class laba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Что вы хотите сделать? 1-for, 2-while, 3-do while, 4- гармонический ряд, 5 - факториал");

        int variant = sc.nextInt();
        double sum = 0;
        double i;
        if (variant==1 || variant==2|| variant==3){
            System.out.println("введите символ или символы");
            String d1 = sc.next();
            switch(variant){
                case 1:
                    variant = 1;
                    for (i=0; i <= d1.length();i++) {
                        sum = sum + i;
                    }
                    break;
                case 2:
                    variant=2;
                    i=0;
                    while (i<=d1.length()){
                        sum=sum+i;
                        i++;
                    }
                    break;
                case 3:
                    variant=3;
                    i=0;
                    do {
                        sum = sum + i;
                        i++;
                    } while (i<= d1.length());
                    break;
                    }
                    System.out.print(sum);
            }
        double f=1.0;
        if(variant==4) {
            for(i=1; i<10; i++){
                f=1/i;
                System.out.println(f);
            }
        }
        if (variant==5){
            System.out.println("Введите символ или символы");
            int d2=sc.nextInt();
            for(i=1; i<=d2; i++){
                f=f*i;
            }
            System.out.println(f);
        }
    }
}
