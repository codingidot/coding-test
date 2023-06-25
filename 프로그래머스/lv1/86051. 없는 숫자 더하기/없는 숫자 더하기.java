import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++){
            list.add(i);
        }
        
        for(int n : numbers){
            int idx = list.indexOf(n);
            list.remove(idx);
        }
        
        for(int i = 0; i < list.size() ; i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}