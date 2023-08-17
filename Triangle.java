import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner V=new Scanner(System.in);
        int a,b,c;
        a=V.nextInt();
        b=V.nextInt();
        c=V.nextInt();
        if(a==b && b==c && c==a){
            System.out.println("Equilateral triangle");
        }
        else if(a==b || a==c || b==c){
             System.out.println("Isosceles triangle");
        }
        else{
             System.out.println("Scalene triangle");
        }
    }
}