package Lec18;

public class prermuteRepeat {
    public static void main(String[] args) {
        permute(0, 4, new char[] { 'a', 'b', 'c', 'a' });
    }

    public static void permute(int curr, int end, char ch[]) {
        if (curr == end) {
            System.out.println(ch);
            return;
        }

        for (int x = curr; x < end; x++) {

            swap(curr, x, ch);
            permute(curr + 1, end, ch);
            swap(curr, x, ch);
        }
    }

    // public static void permute(String ques, String ans){
    // if(ques.length() == 0){
    // System.out.println(ans);
    // return;
    // }

    // for(int x = 0; x < ques.length(); x++){
    // char ch = ques.charAt(x);
    // boolean f = false;
    // for(int y = x+1; y < ques.length(); y++){
    // if(ques.charAt(y) == ch){
    // f = true;
    // break;
    // }
    // }

    // if(f == false){
    // String s1 = ques.substring(0, x);
    // String s2 = ques.substring(x+1);
    // permute(s1 + s2, ans + ch);
    // }
    // }
    public static void swap(int i, int j, char[] ch) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
