import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        char[] charArr = A.toCharArray();
        char[] charArr2 = B.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < charArr2.length ; i++){
            if(charArr[0] == charArr2[i]){
                list.add(i);
            }
        }
        boolean good = true;
        
        for(int i = 0; i < list.size() ; i++){
            for(int j = 0; j < charArr2.length ; j++){
                int ww = list.get(i) + j;
                if( ww >= charArr2.length ){
                    ww -= charArr2.length;
                }
                
                if(charArr[j] == charArr2[ww]){
                    good = true;
                    
                }else{
                    good = false;
                    break;
                }
                
            }
            if(good){
                return list.get(i);
            }else{
                good = true;    
            }
            
        }
        
        
        return answer;
    }
}