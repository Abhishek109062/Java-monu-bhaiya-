package Lec20Backtracking;

public class Queen_Premutation {
    public static void main(String [] args){
        int n  = 4;
    int tq = 2;
    boolean[] board = new boolean[n];
    printAnswer(board, tq,0,"",0);
    }

    public static void printAnswer(boolean[] board, int tq, int qpsf, String answer,int idx){
        if(qpsf == tq){
            System.out.println(answer);
            return;
        }
        
        for(int i = idx; i < board.length; i++){
            if(board[i] == false){
                board[i] = true;
                printAnswer(board,tq,qpsf+1,answer+"b" + i +"q"+qpsf,i+1);
                board[i] = false;
            }
        }
    }
}
