import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //ternary syntax varialbe =condition ? true :false;
        boolean rain=sc.hasNext();
        String result= rain? "take an umberlla": "no need umbrella";
        System.out.println(result);
    }
}
