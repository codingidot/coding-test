class Solution {
    public boolean solution(int x) {
        
        String ss = String.valueOf(x);
        int k = 0;
        for(int i = 0 ; i < ss.length() ; i++){
            System.out.println(Integer.parseInt(String.valueOf(ss.charAt(i))));
            k += Integer.parseInt(String.valueOf(ss.charAt(i)));
        }
        
        if(x % k == 0){
            return true;
        }else{
            return false;
        }
        
    }
}