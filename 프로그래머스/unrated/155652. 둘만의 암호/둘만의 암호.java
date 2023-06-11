import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        ArrayList<String> alphabet = new ArrayList<>();
        for(int i = 97; i < 123 ; i++){
            char a = (char)i;
            String b = String.valueOf(a);
            System.out.println(b);
            alphabet.add(b);
        }
        char[] arr1 = skip.toCharArray();
        
        for(char p : arr1){
            
           String t = String.valueOf(p); 
           String tt = String.valueOf(t);
           int find = alphabet.indexOf(tt);
           alphabet.remove(find);
        }
        
        
        char[] arr2 = s.toCharArray();
        System.out.println(Arrays.toString(arr2));
        
        for(char k : arr2){
            String pp = String.valueOf(k);
            int idx = alphabet.indexOf(pp)+index;
            while(idx > alphabet.size()-1){
                idx = idx - alphabet.size();  
            }
            String add = alphabet.get(idx);
            answer += add;
        }
        return answer;
    }
}