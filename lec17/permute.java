package lec17;

public class permute {
    public static void main(String[] args) {
        permutes(3,"");
    }

    public static void permutes(int n, String temp){
        if(n == 0){
            System.out.println(temp);
            return;
        }
        if(temp.length() == 0 || temp.charAt(temp.length()-1) != 'H')
            permutes(n-1, temp+"H");
        
        permutes(n-1, temp+"T");
    }
}
