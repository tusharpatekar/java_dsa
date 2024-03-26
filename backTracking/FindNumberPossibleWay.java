package backTracking;




// find the number way of arranging the queen in row
public class FindNumberPossibleWay {

    public static boolean isSafe(char[][] board, int row, int col){
        // vertically checking is any Q is there or not
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonal left up move

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // diagonal right up move

        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }


    public static void nQueens(char[][] board, int row){
        if(row == board.length){
            printArray(board);
            count++;
            return;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'X';
            }
        }
    }

    public static void printArray(char[][] board){
        System.out.println("-------------Chess----------");
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args){
        int n;
        n = 5;
        char[] [] board = new char[n][n];

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);


        // total count
        System.out.println("The total arrangement possible is : " + count);

    }



}
