import java.util.*;

import javax.sound.sampled.SourceDataLine;
class pattern{
    public static void main(String[] args) {
        int x=5,i=1;
        while(i<=x){
            int j=1;
            while(j++<=i){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}