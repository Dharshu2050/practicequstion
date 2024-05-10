package forloop;

import java.util.Scanner;

public class naturalnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
           System.out.println(i);
        }
    }
}
