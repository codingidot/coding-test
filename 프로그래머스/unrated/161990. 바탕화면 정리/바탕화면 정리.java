class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int x = -1;
        int y = -1;
        int x2 = -1;
        int y2 = -1;
        int idx = 0;
        
        for(int i = 0; i < wallpaper.length; i++){
            if(wallpaper[i].indexOf("#") == -1){// 파일 없음
                System.out.println(i + "번째 줄에 파일 없음");    
            }else{// 파일 있음
                System.out.println(i + "번째 줄에 파일 있음~~"); 
                // x 관련 ============================================
                if(x == -1){
                    x = i;
                }
                x2 = i;
                //===================================================
                
                //y찾기
                for(int r = 0; r < wallpaper[i].length() ; r++){
                    if(wallpaper[i].charAt(r) == '#'){
                        if(y == -1){

                            y = r;  

                        }else if(r < y){

                            y = r;

                        }
                        break;
                    }
                }
                //y2 찾기
                for(int k = wallpaper[i].length() -1; k >= 0; k--){
                    if(wallpaper[i].charAt(k) == '#'){
                        if(y2 == -1){

                            y2 = k;  

                        }else if(k > y2){

                            y2 = k;

                        }
                        break;
                    }
                }
            }

        }
        if(x == -1){
            x = 0;
        }
        if(y == -1){
            y = 0;
        }
        if(x2 == -1){
            x2 = 0;
        }else{
            x2 = x2 + 1;
        }
        if(y2 == -1){
            y2 = 0;
        }else{
            y2 = y2 + 1;
        }
        
        answer[0] = x;
        answer[1] = y;
        answer[2] = x2;
        answer[3] = y2;
        
        return answer;
    }
}