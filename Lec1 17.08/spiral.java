import java.util.ArrayList;
import java.util.List;

public interface spiral {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        
        int rowBegin=0;
        int rowEnd=matrix.length-1;
        int colBegin=0;
        int colEnd=matrix[0].length-1;
        
        while(rowBegin<=rowEnd && colBegin<=colEnd){
            for(int x=colBegin;x<=colEnd;x++)
                System.out.print(matrix[rowBegin][x]+" ");
            rowBegin++;
            for(int x=rowBegin;x<=rowEnd;x++)
                System.out.print(matrix[x][colEnd]+" ");
            colEnd--;
            
            if(rowBegin<=rowEnd){
                for(int x=colEnd;x>=colBegin;x--)
                    System.out.print(matrix[rowEnd][x]+" ");
                rowEnd--;
            }
            
            if(colBegin<=colEnd){
                for(int x=rowEnd;x>=rowBegin;x--)
                    System.out.print(matrix[x][colBegin]+" ");
                colBegin++;
            }
        }
    }
}
