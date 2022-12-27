package com.vishwaraj.OldFiles.Java.src.main.java.problems._0079WordSearch;

/**
 * WordSearch
 */
public class WordSearch {

    public static void main(String[] args){
        char[][] board = {
            {'A','B','C','E'},
 {'S','F','C','S'},
 {'A','D','E','E'}
        };
        String word = "ABCCED";
        WordSearch s = new WordSearch();
        System.out.println(s.exist(board, word));
    }
    char[][] board;
    int Row;
    int Col;
    String word;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.Row = board.length;
        this.Col = board[0].length;
        this.word = word;
        
        for(int i =0; i< Row; i++){
            for(int j = 0; j< Col; j++){
                if(backtracking(i, j, 0)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean backtracking(int row, int col, int index){
        if(index == word.length()) return true;
        
        if(row< 0 || row >= Row|| col< 0|| col>= Col|| word.charAt(index)!= board[row][col]) return false;
        System.out.print(board[row][col]);
        
        char temp = board[row][col];
        board[row][col] = ' ';
        boolean found = backtracking(row+1, col,index++)||
                        backtracking(row-1, col, index++)||
                        backtracking(row, col+1, index++)||
                        backtracking(row, col-1, index++);
        
        board[row][col] = temp;
        return found;
    }
}