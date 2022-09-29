package Lec17;

public class subsequence {
    public static void main(String[] args) {
        subseq("abc","", 3, 0);
        System.out.println(countsubseq("abc", ""));
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

    public static int countsubseq(String ques, String ans){
        if(ques.length() == 0)
        return 1;

        char ch = ques.charAt(0);
        int ans1 = countsubseq(ques.substring(1), ans);
        int ans2 = countsubseq(ques.substring(1), ans + ch);
        return ans1 + ans2;

        
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