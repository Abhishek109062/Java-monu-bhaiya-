package Lec18;

import java.util.Scanner;

public class permuteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch[] = s.toCharArray();
        permute(0, s.length(), ch);
    }

    public static void permute(int curr, int end, char ch[]){
        if(curr == end){
            System.out.println(ch);
            return;
        }

        for(int x = curr; x < end; x++){
            swap(curr, x, ch);    
            permute(curr+1, end, ch);
            swap(curr,x,ch);
        }
    }
    public static void permute(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        
    }
    public static void swap(int i, int j, char[] ch){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    
}
