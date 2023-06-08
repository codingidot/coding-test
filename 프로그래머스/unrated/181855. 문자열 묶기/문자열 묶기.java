import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int count = 1;
        int max = 0;
        List<Integer>list = new ArrayList();
        List<Integer>list2 = new ArrayList();
        for(String str : strArr){
            int data = str.length();
            list.add(data);
        }
        
        Collections.sort(list);
        
        for(int a=0;a<list.size();a++){
            if(a==0){
                count = 1;
            }else if(a == list.size()-1){
                if(list.get(a) == list.get(a-1)){
                    count++;
                    list2.add(count);
                }else{
                    list2.add(1);
                }
                
            }else{
                if(list.get(a) == list.get(a-1)){
                    count++;
                }else{
                    list2.add(count);
                    count = 1;
                }
            }
                
            
        }
        
        for(int i=0;i<list2.size();i++){
            if(i == 0){
                max = list2.get(i);
            }else{
                max = Math.max(max, list2.get(i));    
            }
            
        }

        return max;
    }
}