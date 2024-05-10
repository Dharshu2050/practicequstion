import java.util.*;
public class scroe {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int score=sc.nextInt();//67
       if(score<50){
        System.out.println("you need to improve");
       }
       else if(score>=50 && score<=70){
        System.out.println("good job");
       }
       else{
        System.out.println("excellent");
       }
    }
}
