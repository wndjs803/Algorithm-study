class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for (int i = 1; i < numLog.length; i++) {
            int before = numLog[i - 1];
            int current = numLog[i];
            
            if ((before + 1) == current) {
                answer += "w";
            }
            else if ((before - 1) == current) {
                answer += "s";
            }
            else if ((before + 10) == current) {
                answer += "d";
            }
            else if ((before - 10) == current) {
                answer += "a";
            }
        }
        
        return answer;
    }
}