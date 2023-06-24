import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int lmax = 0;
        int hmin = 0;
		int idx = 0;
        int idx2 = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for( int i = 0; i < sizes.length ; i++){
            for( int j = 0; j < sizes[i].length ; j++){
                if( lmax < sizes[i][j]){
                    lmax = sizes[i][j];
                    idx = i;
                    idx2 = j;
                }
            }
        }
        
        for( int i = 0; i < sizes.length ; i++){
            if(i != idx){
                if(sizes[i][0] > sizes[i][1]){
                    hmin = Math.max(hmin, sizes[i][1]);
                }else{
                    hmin = Math.max(hmin, sizes[i][0]);
                }
            }
        }
        
        if(idx2 == 0){
            hmin = Math.max(hmin, sizes[idx][1]);   
        }else{
            hmin = Math.max(hmin, sizes[idx][0]);   
        }
        
        answer = lmax * hmin;
        return answer;
    }
}