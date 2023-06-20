class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int rest = 0;
        do{
            answer += (n / a)*b;
            n = n - (a*(n/a)) + ((n/a)*b);
        }while(n >= a);
        
        
        
        return answer;
    }
}