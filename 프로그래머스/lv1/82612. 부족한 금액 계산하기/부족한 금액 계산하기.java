class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long don = 0;
        for(int i = 1; i < count+1 ; i++ ){
            don += (long)i*price;
        }
        
        if(don > money){
            answer = don - money;
        }else{
            answer = 0;
        }
        
        
        return answer;
    }
}