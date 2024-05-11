package ternary;
import java.util.Scanner;

public class greaterusingternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       
        String result=a>b? "greatest number is"+a : "grestest number is: "+b;
        System.out.println(result);
    }
}
