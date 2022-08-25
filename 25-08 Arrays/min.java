public class min {
    public static void main(String[] args) {
        int ar[]={2,3,-1,4,7,11,9};
        int min=0;
        for(int x=1;x<ar.length;x++)
        if(ar[x]<min)
        min=x;
        
        System.out.println(min);
    }
}
