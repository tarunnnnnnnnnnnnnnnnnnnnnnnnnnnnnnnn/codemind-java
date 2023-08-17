import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner V=new Scanner(System.in);
        int n;
        n=V.nextInt();
        if(n%2!=0 ||(n>=6 && n<=20)){
            System.out.println("weird");
        }
        else{
            System.out.println("not weird");
        }
        
    }
}