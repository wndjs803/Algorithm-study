class Solution {
    boolean solution(String s) {
        String lowerCase = s.toLowerCase();
        int pNum = 0;
        int yNum = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(lowerCase.charAt(i) == 'p'){
                pNum += 1;
            }
            else if (lowerCase.charAt(i) == 'y'){
                yNum += 1;
            }
        }
        
        if (pNum == yNum) return true;
        else return false;
    }
}