import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //check mark is pass or fail
        int mark=sc.nextInt();
        if(mark>35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
