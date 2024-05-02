public class compare {
    public static void main(String[] args) {
        String a="apple";
        String b="apple";
        //different of normal string and obj string nrm str store value in different  space but obj str n==x its return false bcz its stroe values in same memory space
        String n=new String("apple");
        String x=new String("apple");
        System.out.println(n.equals(x));
    }
}
