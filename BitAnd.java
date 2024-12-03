import java.util.*;
public class BitAnd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((a&1)==0);
        System.out.println((a&1)==1);
        System.out.println(a&b);
    }
}