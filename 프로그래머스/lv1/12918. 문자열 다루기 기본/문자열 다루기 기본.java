class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        if( len == 4 || len == 6){
            
        }else{
            return false;
        }
        
        for(int i = 0 ; i < len ; i++){
            int x = (int)s.charAt(i);
            if(x>=97 && x<=122) { // 대문자라면
				return false;
			} else if(x>=65 && x<=90) { // 소문자라면
				return false;
			}
        }
        
        return answer;
    }
}