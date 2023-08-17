import java.util.*;
public class tarun{
    public static void main(String args[]){
        Scanner A= new Scanner(System.in);
        int P1,P2,P3,P4;
        P1=A.nextInt();
        P2=A.nextInt();
        P3=A.nextInt();
        P4=A.nextInt();
        if(P1>=10 && P2>=10 && P3>=10 && P4>=10){
            System.out.println("YES");
        }
        else
        System.out.println("NO");
    }
}