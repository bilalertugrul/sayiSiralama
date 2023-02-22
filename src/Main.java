import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
         */
        int a, b, c, number1=0, number2=0, number3=0;
        Scanner input = new Scanner(System.in);
        System.out.print("a Sayısını Giriniz: ");
        a = input.nextInt();
        System.out.print("b Sayısını Giriniz: ");
        b = input.nextInt();
        System.out.print("c Sayısını Giriniz: ");
        c = input.nextInt();

       if(a>b && a>c){
           if(b>c){
               number1 = a;
               number2 = b;
               number3 = c;
           }else{
               number1 = a;
               number2 = b;
               number3 = c;
           }
       } else if (b>a && b>c){
           if(a>c){
               number1 = b;
               number2 = a;
               number3 = c;
           }else{
               number1 = b;
               number2 = c;
               number3 = a;
           }
       } else if (c>a && c>b) {
           if(a>b){
               number1 = c;
               number2 = a;
               number3 = b;
           }else{
               number1 = c;
               number2 = b;
               number3 = a;
           }
       }

        System.out.println("Siralama : " + number1 + "-" + number2 + "-" + number3);
    }}
