import java.util.*;
public class area{
    public static void main(String tarun[])
    {
        int a,b,c;
        double S,A;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        S=(double)(a+b+c)/2;
        A=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.printf("%.2f",A);
    }
}