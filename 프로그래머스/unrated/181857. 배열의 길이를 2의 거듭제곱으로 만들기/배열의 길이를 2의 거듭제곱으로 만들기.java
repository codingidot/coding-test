import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        int len = arr.length;
        int goodLen = 0;
        int target = 2;
        
        while(true){
            if(target >= len){
                goodLen = target;
                break;
            }else{
                target *= 2;   
            }
        }

        if(len == 0 || len == 1){
            goodLen = 1;
        }
        int[] answer = new int [goodLen];
        
        if(len == 0){
             answer[0]= 0;
        }else{
            for(int i =0; i< arr.length; i++){
                answer[i] = arr[i];
            }   
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}