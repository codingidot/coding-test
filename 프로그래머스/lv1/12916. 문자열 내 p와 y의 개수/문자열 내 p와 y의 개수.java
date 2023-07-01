class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        String word = s;
        int a = 0;
        int b = 0;
        word = word.toLowerCase();
        
        System.out.println(word);
        for( int i = 0; i < word.length() ; i++){
            if( word.charAt(i) == 'p'){
                a++;
            }
            
            if( word.charAt(i) == 'y'){
                b++;
            }
        }
        
        if( a == b){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}