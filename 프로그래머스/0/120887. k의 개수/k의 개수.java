class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char charK = (char)(k + '0');
        
        for (int n = i; n <= j; n++) {
            String strNum = Integer.toString(n);
            
            for (char c : strNum.toCharArray()) {
                if (c == charK) answer++;
            }
        }
        
        return answer;
    }
}