import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        HashMap<String,Integer> map1 = new HashMap<String,Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        String[] aa = s.split("");
        System.out.println(Arrays.toString(aa));
        
        int idx = 0;
        for(String bb : aa){
            if(map1.get(bb) == null ){
                map1.put(bb , idx); 
                list.add(-1);
            }else{
                list.add(idx - map1.get(bb));
                map1.put(bb , idx);
            }
            idx++;
        }

        int[] answer = new int[list.size()];
        
        for(int i = 0 ; i < list.size() ; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}