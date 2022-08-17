import java.util.*;
class fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int x=1;x<=n;x++){
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
}