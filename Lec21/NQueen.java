public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        
    }
    

    public static void N_Queen(boolean[][] board, int tq, int row){
        if(tq == 0){
            Display(board);
            return;
        }
        for(int col = 0; col < board.length; col++){
            if(issafe(board, row, col) == true){
                board[row][col] = true;
                N_Queen(board,tq - 1, row + 1);
                board[row][col] = false;
            }
        }
    }

    public static void Display(int[][] board){

    }

    public static boolean issafe(boolean[][] board, int row, int col){
        int r = row;
        while(r >= 0){
            if(board[r][col] == true)
            return false;
            r--;
        }
        r = row;
        int c = col;
        while(r >= 0 && c >= 0){
            if(board[])
        } 
        return false;
    }
}
