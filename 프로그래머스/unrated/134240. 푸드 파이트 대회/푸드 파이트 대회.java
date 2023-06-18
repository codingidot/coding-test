class Solution {
    public String solution(int[] food) {
        String answer = "";
        int idx = 0;
        for(int f : food){
           
            int count = f / 2;
            for(int i = 0; i < count ; i++){
                answer += String.valueOf(idx);
            }
            
            idx++;
        }
        
        answer += "0";
        String plus = "";
        for(int i = answer.length()-2; i >= 0 ; i--){
            plus += answer.charAt(i);
        }
        
        answer += plus;
        return answer;
    }
}