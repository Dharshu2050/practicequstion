import java.util.Scanner;

public class subjectmark {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int e=sc.nextInt();
    int avg=a+b+c+d+e/5;
    System.out.println(avg);

    if(avg>35){
        System.out.println("you good to go");
    }
    else{
        System.out.println("addtional class is required");
    }
    }
}
