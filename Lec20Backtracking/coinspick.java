package Lec20Backtracking;

public class coinspick {
    public static void main(String[] args) {
        int ar[] = {2,3,5,7};
        pick(ar,10,"");
    }   

    //Without BackTracking
    public static void pick(int[] ar, int total,String print){
        if(total == 0){
            System.out.println(print);
            return;
        }

        for(int x = 0; x < ar.length; x++){
            if(total - ar[x] >= 0)
            pick(ar,total - ar[x],print+ar[x]);
        }
    }


    //Without Permutation in it(only Combiantion)
    // public static void pick(int[] ar, int total, int sum,String print, int i){
    //     if(sum == total){
    //         System.out.println(print);
    //         return;
    //     }

    //     for(int x = i; x < ar.length; x++){
    //         sum  += ar[x];
    //         if(sum <= total)
    //         pick(ar,total,sum,print+ar[x],x);
    //         sum -= ar[x];
    //     }
    // }

    //With BackTracking
    // public static void pick(int[] ar, int total,String print){
    //     if(total == 0){
    //         System.out.println(print);
    //         return;
    //     }

    //     for(int x = 0; x < ar.length; x++){
    //         total -= ar[x];
    //         if(total >= 0)
    //         pick(ar,total,print+ar[x]);
    //         total += ar[x];
    //     }
    // }
}
