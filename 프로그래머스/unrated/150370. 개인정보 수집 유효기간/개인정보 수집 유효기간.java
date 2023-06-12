import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        HashMap<String,String> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String aa : terms){
            String[] how = aa.split(" ");
            
            map.put(how[0], how[1]);
        }
        
        int idx = 0;
        
        for(String bb : privacies){
    
            String[] paper = bb.split(" ");
            String[] now = today.split("\\.");
            //System.out.println(today);
            //System.out.println(Arrays.toString(now));
            //System.out.println(now[1]);
            //System.out.println(now[2]);
            
            int yearN = Integer.parseInt(now[0]);
            int monthN = Integer.parseInt(now[1]);
            int dayN = Integer.parseInt(now[2]);
            
            String[] date = paper[0].split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            int plus = Integer.parseInt(map.get(paper[1])); 
            boolean over = false;
            
            idx++;
            
            System.out.println("몇번째 인지 >>> " + idx);
            System.out.println("개인정보 수집 일자 >>> " + paper[0]);
            System.out.println("유효기간 >>> " + plus);
            month += plus;
            
            while(month > 12){
                month -= 12;
                year += 1;
            }
            
            if(day == 1){
                month -= 1;
                day = 28;
            }else{
                day -= 1;
            }
            
            if(yearN > year){
                over = true;
            }else if(yearN == year && monthN > month){
                over = true;
            }else if(yearN == year && monthN == month && dayN > day){
                over = true;
            }
            
            System.out.println("수집 일자에서 유효기간 더한 날짜  >>> " + year + "." + month + "." + day );
            System.out.println("현재일자  >>> " + today );
            if(over){
               System.out.println("기한 지남"); 
               list.add(idx); 
            }else{
               System.out.println("기한 안지남"); 
            }
           
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}