import java.util.*;
 class temp {
    public static void main(String args[]) {
		// Scanner sc = new Scanner(System.in);
		String digits = "11212";
		String[] phn = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
			comb(digits, 0, digits.length(), "", phn);
    }

	public static void comb(String digits, int ind, int len, String temp, String[] phn){
		if(ind == len){
			System.out.println(temp);
			return;
		}

		int curr = (int)(digits.charAt(ind) - '0');
		for(int x = 0; x < phn[curr].length(); x++)
			comb(digits, ind+1, len , temp + phn[curr].charAt(x), phn);
	}
	
}