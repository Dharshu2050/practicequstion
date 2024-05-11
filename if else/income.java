import java.util.Scanner;

public class income {
    public static void main(String[] args) {
        // greater than 7000 scholarship is available
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        if(income>7000){
            System.out.println("Scholarship is available");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
