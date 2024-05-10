import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        //divisibke by both 3 nd 5
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int b=num/3;
        int c=num/5;

        if(num%3==0 && num%5==0 ){
            System.out.println("divisible by 3 nd 5");
        }
        else{
            System.out.println("not divisible by 3 nd 5");
        }
    }
}
