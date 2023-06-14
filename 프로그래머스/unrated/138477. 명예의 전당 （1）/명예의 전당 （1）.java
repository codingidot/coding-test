import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] honor = new int[k];
        int idx = 0;
        
        for(int s : score){
            Arrays.sort(honor);
            if(honor[0] < s){
                honor[0] = s;
            }
            
            Arrays.sort(honor);
            if(idx >= k){
                answer[idx] = honor[0];    
            }else{
                answer[idx] = honor[honor.length - 1 - idx]; 
            }
            
            idx++;
            
        }
        
        
        return answer;
    }
}