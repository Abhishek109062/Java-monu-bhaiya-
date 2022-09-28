package lec17;

public class subsequence {
    public static void main(String[] args) {
        subseq("abc","", 3, 0);
    }   

    public static void subseq(String s, String temp,int len, int i){
        if(len == i)
        {
            System.out.println(temp);
            return;
        }   
        subseq(s,temp,len,i+1);
        subseq(s,temp+s.charAt(i), len, i+1);
    }
}

//Second Method
// public static void subseq(String ques , String ans){
//     if(ques.length() == 1)
//     {
//         System.out.println(ans);
//     }

//     char ch = ques.charAt(0);
//     subseq(ques.substring(1), ans);
//     subseq(ques.substring(1), ans + ch);
// } 