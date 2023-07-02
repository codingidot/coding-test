class Solution {
    public String[] solution(String my_str, int n) {
        int many = 0; 
        boolean ok = true;
        
        if(my_str.length() % n == 0){
            many = my_str.length() / n;
            ok = false;
        }else{
            many = my_str.length() / n + 1;
            ok = true;
        }
        
        String[] answer = new String[many];
        
        for(int i = 0; i < many ; i++){
            if(ok && i == many - 1){
                answer[i] = my_str.substring(i*n);      
            }else{
                answer[i] = my_str.substring(i*n , (i*n) + n);   
            }
        }
        
        return answer;
    }
}