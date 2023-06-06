class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        int cnt = 0;
        long compare1 = Long.parseLong(p); 
        
        for( int i =0; i<t.length()-len+1; i++){
            
            long compare2 = Long.parseLong(t.substring(i, i+len)); 
            System.out.println(compare2);
            if(compare1 >= compare2 ){
                System.out.println("작거나 같음");
                System.out.println(cnt);
                cnt+=1;
            }
        }
        return cnt;
    }
}