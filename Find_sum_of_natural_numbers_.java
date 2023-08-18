import java.util.*;
public class tarun{
    public static void main(String[] args){
        Scanner V=new Scanner(System.in);
        int n=V.nextInt();
        int s=0;
        for(int i=0;i<=n;i++){
            s=(n*(n+1))/2;
        }
        System.out.print(s);
    }
}