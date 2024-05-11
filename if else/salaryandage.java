import java.util.Scanner;

public class salaryandage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary:");
        int salary=sc.nextInt();
        System.err.println("enter your age:");
        int age=sc.nextInt();
       

        if(salary>=20000 ||age<25){
            System.out.println("eligible for loan");
            System.out.println("how much loan you need:");
            int loan =sc.nextInt();
            if(loan<50000){
                System.out.println("loan available");
            }
            else{
                System.out.println("not available");
            }
        }
        else{
            System.err.println("not eligible");
        }

    }
}
