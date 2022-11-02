package Lec22;

public class QuickSort {
    public static void main(String[] args) {
        
    }

    public static void sort(int[] arr, int si, int ei){
        if(si > ei)
        return;

        int pi = partition(arr, si, ei);
        sort(arr, si, pi -1);
        sort(arr, pi+1, ei);
    }

    public static int partition(int[] arr, int si, int ei){
        
    }
}
