class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];
        int mom = denom1 * denom2;
        int son = numer1*denom2 + numer2*denom1;
        int limit = 0;
        if(mom > son){
            limit = son+1;
        }else{
            limit =mom+1;
        }
        
        for(int i = limit ; i > 0; i--){
            if(son % i == 0 && mom % i == 0){
                son = son / i;
                mom = mom / i;
            }
        }
        
        answer[0] = son;
        answer[1] = mom;
        
        
        return answer;
    }
}