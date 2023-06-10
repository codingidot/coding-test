import java.util.ArrayList;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx = 0;
        int idx2 = 0;
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        
        for(String card1 : cards1){
            arr1.add(card1);
        }
        
        for(String card2 : cards2){
            arr2.add(card2);
        }
        
        for(String word : goal){
            System.out.println("word >> "+ word);
            System.out.println("arr1 >> "+ arr1);
            System.out.println("arr2 >> "+ arr2);
            idx = arr1.indexOf(word);
            idx2 = arr2.indexOf(word);
            
            if(idx == 0){//card1에 단어있음;
                arr1.remove(0);
            }else if(idx2 == 0){//card2에 단어있음;
                arr2.remove(0);
            }else{
                System.out.println("둘다없음~~~~");
                answer = "No";
                break;
            }
        }
        
        if(!answer.equals("No")){
            answer = "Yes";
        }
        
        return answer;
    }
}