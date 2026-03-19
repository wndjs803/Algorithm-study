class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String s = "*";
        String answer = s.repeat(length - 4);
        return answer + phone_number.substring(length - 4);
    }
}