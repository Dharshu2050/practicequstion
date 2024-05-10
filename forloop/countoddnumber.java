package forloop;

public class countoddnumber {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=10;i++){
            if(i%2==1){
              //System.out.println(i);
            }
            else{
              
              count=count+1;
              //System.err.println(count);
               
            }
        }
        System.out.println(count);
    }
}
