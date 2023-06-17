import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        ArrayList<Integer> list =new ArrayList<>();
        int[] arr = score;
        int answer = 0;
        int max = 0;
        
        
        Arrays.sort(arr);
        
        for(int a : arr){
            if(a <= k){
                list.add(a);
            }
        }
        for(int q = 0; q < arr.length / m ; q++){
            int min = list.get(list.size() - m);
            answer += min * m;
            int pp = list.size()-1;
            for(int u = 0 ; u < m ; u++){
                list.remove(pp);
                pp--;
            }
        }
        
        return answer;
    }
}