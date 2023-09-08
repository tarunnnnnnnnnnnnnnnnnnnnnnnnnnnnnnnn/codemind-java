import java.util.*;
public class Tarun{
    public static void main(String[] args){
        Scanner V=new Scanner(System.in);
        int t=V.nextInt();
        for(int i=0;i<t;i++){
            int x=V.nextInt();
            int y=V.nextInt();
            int Moves=getMinMoves(x,y);
            System.out.println(Moves);
        }
    }
    private static int getMinMoves(int x,int y){
        if(x%y==0){
            return x/y;
        }
        else{
            int a=(int)x/y;
            int b=a+x%y;
            return b;
        }
    }
}