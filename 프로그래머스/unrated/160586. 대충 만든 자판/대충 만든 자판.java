class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int idx = 0;
        
        for(String target : targets){
            int cnt = 0;
            int min = 0;
            
            for(int k = 0; k < target.length() ; k++){
                for(int i = 0; i < keymap.length; i++){
                    int compare = keymap[i].indexOf(target.charAt(k))+1;
                    if(compare == 0){
                        compare = 999;
                    }
                    if(i > 0){
                        min = Math.min(compare , min);
                    }else{
                        min = compare;
                    }
                    
                } 
                if(min == 999){
                    cnt = -1;
                    break;
                }else{
                    cnt += min;
                }
            }
            answer[idx] = cnt;
            idx++;
        }
        
        return answer;
    }
}