import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int[] after = new int[arr.length];
        int answer = 0;
        while (true) {
            int ok = 0;
            //조건
            for (int i = 0; i < arr.length; i++) {
                
                //50이상이면서 짝수
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    after[i] = arr[i] / 2;
                    
                //50미만이면서 홀수
                } else if (arr[i] % 2 == 1 && arr[i] < 50) {
                    after[i] = (arr[i] * 2) + 1;
                    
                //둘다 아닌경우
                } else {
                    after[i] = arr[i];
                    ok += 1;
                }
            }
            answer++;
            
            
            if(Arrays.equals(after, arr) && ok == arr.length){
                break;
            }else{
                arr = after;
            };
     
        }

        return answer-1;
    }
}