class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.length() < is_prefix.length()) {
            return 0;
        }
        
        String sub = my_string.substring(0, is_prefix.length());
        
        for(int i = 0; i < sub.length(); i++) {
            if(sub.charAt(i) != is_prefix.charAt(i)) {
                return 0;
            }
        }
        
        return 1;
    }
}