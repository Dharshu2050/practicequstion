import java.util.Scanner;

public class trafficlight {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String colors=sc.nextLine();
    //[red grren yellow]
    if(colors.equals("red")){
        System.out.println("stop");
    }
   else if(colors.equals("yellow")){
        System.out.println("get ready");
    }
    else{
        System.out.println("go");
    }
    }
}
