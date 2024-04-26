import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double score=sc.nextInt();
        sc.nextLine();
        String department=sc.nextLine();
        double d=score/10;
        System.out.println(d);
    }
}
