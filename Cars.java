import java.util.*;
public class Tarun{
    public static void main(String[] args){
        Scanner V=new Scanner(System.in);
        int n1,n2,x;
        n1=V.nextInt();
        n2=V.nextInt();
        x=V.nextInt();
        if(n1>=n2){
            System.out.println(-1);
        }
        else{
            int c=1;
            int a=n1;
            int b=n2;
            while((x+a)>=b){
                c+=1;
                a+=n1;
                b+=n2;
            }
            System.out.println(c);
        }
    }
}