import java.util.*;
public class Tarun{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int R1,R2,R3;
        int  T=sc.nextInt();
        for(int i=0;i<T;i++){
            R1=sc.nextInt();
            R2=sc.nextInt();
            R3=sc.nextInt();
            if (R1>(R2+R3) || R2>(R1+R3) || R3>(R1+R2))
            System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
    }
}