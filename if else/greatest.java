import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
     //check the number is great
        if(a>b){
            System.out.println("the greatest number is:"+a);
        }
        else if(b>c){
            System.out.println("the greatest number is:"+b);
        }
        else{
            System.out.println("the greatest number is:"+c);
        }

        
    }
}
