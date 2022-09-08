public class reverse {
    public static void main(String[] args) {
        int ar[]={2,3,-1,4,7,11,9};
        int i=0,j=ar.length-1;
        while(i<j){
            int temp=ar[i]^ar[j];
            ar[i]=temp^ar[i];
            ar[j]=temp^ar[j];
            i++;
            j--;
        }
        for(int x:ar)
        System.out.println(x);
    }   
}
