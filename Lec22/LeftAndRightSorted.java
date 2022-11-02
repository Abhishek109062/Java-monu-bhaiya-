package Lec22;

public class LeftAndRightSorted {
    public static void main(String[] args) {
        int ar[] = {9,3,7,1,2,5,4};
        sorted(ar, 0, 6);
        for(int x : ar)
        System.out.print(x+" ");
    }

    public static void sorted(int[] arr, int si, int ei){
        int item = arr[ei];
        int pi = si;
        // boolean flag = arr[si] < arr[ei];
        for(int x = si; x < ei; x++){
            if(arr[x] < item){
                swap(arr, x, pi);
                pi++;
            }
        }
        swap(arr, pi, ei);
    }

    public static void swap(int[] ar, int i, int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
