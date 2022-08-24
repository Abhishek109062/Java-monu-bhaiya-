import java.util.*;
public class binary {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		char ch[]=sc.next().toCharArray();
		for(int x=ch.length-1;x>=0;x--){
			if((char)('9'- ch[x]+48)<ch[x])
				ch[x]=(char)('9'- ch[x]+48);
		}
		
	System.out.println(1&2);
    }
}
