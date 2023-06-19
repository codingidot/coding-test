
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for( String b : babbling){
            boolean go = true;
            String before = "";
            for(int i = 0 ; i < b.length() ; ){
                if(b.length() - 1 - i < 1 ){
                    go = false; 
                    break;
                }
                
                if(b.length() - 1 - i >= 1 && b.charAt(i) == 'y' && b.charAt(i+1) == 'e'){
                    if(before == "ye"){
                        go = false;
                        break;
                    }
                    before = "ye";
                    i += 2;
                }else if(b.length() - 1 - i >= 1 && b.charAt(i) == 'm' && b.charAt(i+1) == 'a'){
                    if(before == "ma"){
                        go = false;
                        break;
                    }
                    before = "ma";
                    i += 2;
                }else if(b.length() - 1 - i >= 2 && b.charAt(i) == 'a' && b.charAt(i+1) == 'y' && b.charAt(i+2) == 'a'){
                    if(before == "aya"){
                        go = false;
                        break;
                    }
                    before = "aya";
                    i += 3;
                }else if(b.length() - 1 - i >= 2 && b.charAt(i) == 'w' && b.charAt(i+1) == 'o' && b.charAt(i+2) == 'o'){
                    if(before == "woo"){
                        go = false;
                        break;
                    }
                    before = "woo";
                    i += 3;
                }else{
                    go = false;
                    break;
                }
            }
            
            if(go){
                answer += 1;
            }
            
        }
        
        return answer;
    }
}