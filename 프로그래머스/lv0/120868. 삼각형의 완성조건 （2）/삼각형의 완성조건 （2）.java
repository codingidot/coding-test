import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int len1 = sides[0];
        int len2 = sides[1];
        int[] arr = new int[3];
        
        for(int i = 1 ; i < (len1+len2) ; i++ ){
            arr[0] = len1;
            arr[1] = len2;
            arr[2] = i;
            Arrays.sort(arr);
            
            if((arr[0] + arr[1]) > arr[2]){
                answer++;
            }
        }
        
        return answer;
    }
}