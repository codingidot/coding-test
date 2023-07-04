import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i = 0; i < board.length ; i++){
            for(int j = 0; j < board[i].length ; j++){
                if(board[i][j] == 1){
                    board = updateMap(i , j , board);
                }
            }
        }
        
        for(int i = 0; i < board.length ; i++){
            for(int j = 0; j < board[i].length ; j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }
        
        System.out.println(Arrays.deepToString(board));
        
        return answer;
    }
    //============================================================
    public int[][] updateMap(int x , int y, int[][] map){
        for( int k = x-1; k < x+2 ; k++){
            for(int b = y-1; b < y+2 ; b++){
                if(isValidIndex(k , b, map)){
                    if((k != x || b != y) && map[k][b] != 1){
                        map[k][b] = 7;
                    }
                }

            }
        }    

        return map;
    }

    public boolean isValidIndex(int x , int y, int[][] map) {
        try {
            int i = map[x][y];
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }
    
}

