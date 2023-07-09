import java.util.*;
class Solution {
    public int[] solution(long n) {
        String wow = String.valueOf(n);
        char[] oh = wow.toCharArray();
        int[] answer = new int [wow.length()];
        int idx = 0;
        System.out.println(Arrays.toString(answer));
        for(int i = oh.length -1 ; i >=0 ; i--){
            answer[idx] = Integer.parseInt(String.valueOf(oh[i]));
            System.out.println(oh[i]);
            idx++;
        }
        System.out.println(Arrays.toString(answer));
        
        
        return answer;
    }
}