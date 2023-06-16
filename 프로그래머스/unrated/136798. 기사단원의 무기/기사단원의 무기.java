class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        
        for(int i = 1 ; i <= number ; i++){
            int cnt = 0;
            for(int j = 1; j <= i; j++){ 
                if(j > (i/j)){
                    break;
                }
                if(i % j == 0){
                    if(j*j == i){
                        cnt++;
                    }else{
                        cnt+=2;
                    }
                }
            }
            if(cnt > limit){
                cnt = power;
            }
            arr[i-1] = cnt;
        }
        
        for(int c: arr){
            answer += c;
        }
        
        return answer;
    }
}

