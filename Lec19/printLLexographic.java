package Lec19;

public class printLLexographic {
    public static void main(String[] args) {
        printLexo(0, 13);
    }

    public static void printLexo(int curr, int n){
        if(curr > n)
        return;
        System.out.println(curr);
        int i = 0;
        if (curr == 0){
            i = 1;
        }
        
        for(; i <= 9; i++){
            printLexo(curr*10+i, n);
        }
    }
}
