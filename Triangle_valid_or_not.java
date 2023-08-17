import java.util.*;
public class tarun{
    public static void main(String ars[]){
        Scanner V=new Scanner(System.in);
        int a,b,c;
        a=V.nextInt();
        b=V.nextInt();
        c=V.nextInt();
        if(a+b>c && a+c>b && b+c>a)
        {
            System.out.println("Valid triangle");
        }
        else {
            System.out.println("Invalid triangle");
        }
        
    }
}