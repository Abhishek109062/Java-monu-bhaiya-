package Lec16;

public class atopowerB {
    public static void main(String[] args) {
        System.out.println(pow(4,3));
    }

    public static int pow(int a,int b){
        if(b == 0) 
        return 1;

        return pow(a,b-1)*a;
    }

}
