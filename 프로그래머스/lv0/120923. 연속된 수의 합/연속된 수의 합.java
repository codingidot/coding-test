import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(num == 1){
            int[] wow  = {total};
            return wow;
        }
        
        if(num % 2 == 0){
            int a = total / num;
            int b = (total / num) + 1;
            
            list.add(a);
            list.add(b);
            
            for(int i = 0; i < (num -2)/2 ; i++){
                a--;
                b++;
                list.add(a);
                list.add(b);
            }
            
        }else{
            int a = total / num;
            int b = a - 1;
            int c = a + 1;
            
            list.add(a);
            
            for(int i = 0; i < (num -1)/2 ; i++){

                list.add(b);
                list.add(c);
                
                b--;
                c++;
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size() ; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}