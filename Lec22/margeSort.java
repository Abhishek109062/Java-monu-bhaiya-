package Lec22;

public class margeSort {
    public static void main(String[] args) {
        int arr[]= {4,3,7,8,9,10,1};
        int ans[] = Sort(arr, 0, 6);
        for(int x : ans)
        System.out.print(x + " ");
    }

    public static int[] Sort(int []arr, int si, int ei){
        if(si == ei){
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;
        }

        int mid = (si + ei)/2;
        int[] fs = Sort(arr, si,mid);
        int[] ss = Sort(arr, mid+1, ei);
        return MergeTwoArray(fs,ss);
    }

    public static int[] MergeTwoArray(int[] arr1, int[] arr2){
        int in1 = 0;
        int in2 = 0;
        int index = 0;
        int ans[] = new int[arr1.length + arr2.length];
        while(in1 < arr1.length && in2 < arr2.length){
            if(arr1[in1] < arr2[in2]){
                ans[index++] = arr1[in1++];
            }
            else{
                ans[index++] = arr2[in2++];    
            }
        }

        while(in1 < arr1.length){
            ans[index++] = arr1[in1++];
        }
        
        
        while(in2 < arr2.length){
            ans[index++] = arr2[in2++];
        }
        return ans;
    }
}
