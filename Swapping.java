import  java.util.*;
public class Swapping{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int g=sc.nextInt();
        int c=b;
        b=g;
        g=c;
        String res=String.format("After swapping\nboy=%d\ngirl=%d\n",b,g);
        System.out.println(res);

    }
}