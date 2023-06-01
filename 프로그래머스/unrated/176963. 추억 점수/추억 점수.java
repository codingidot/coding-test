import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        System.out.println(photo.length);
        int[] answer = new int[photo.length];
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        
        for(int i = 0 ; i < name.length ; i++){
            h.put(name[i] , yearning[i]);
            System.out.println(h.get(name[i]));
            
        }
        
        for(int i = 0 ; i < photo.length ; i++){
            String[] inArr = photo[i];
            for(int j = 0 ; j < inArr.length ; j++){
                System.out.println(answer[i]);
                if(h.get(inArr[j]) != null){
                    answer[i] += h.get(inArr[j]);       
                }else{
                    System.out.println("null임");
                }
                  
            }
        }
        
        return answer;
        
    }
}