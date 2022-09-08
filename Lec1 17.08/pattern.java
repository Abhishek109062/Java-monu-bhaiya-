import java.util.*;

class pattern{
    public static void main(String[] args) {
        int n=5;
        for(int x=1;x<=n;x++){
            for(int y=1;y<=n-x-1;y++)
            System.out.print(" ");

            for(int y=2*x;y>=1;y--){
                if(y%2==0)
                System.out.print("*");
                else
                System.out.print(" ");
            }
        System.out.println();
    
        }
        }
    }
