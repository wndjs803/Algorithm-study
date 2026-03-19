import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        
        int[] empty = {-1};
        if (length == 1) return empty;
        
        int[] subArr = new int[length - 1];
        int minValue = Arrays.stream(arr).min().getAsInt();
        
        int index = 0;
        for(int num : arr) {
            if (num != minValue) {
                subArr[index] = num;
                index++;
            }
        }
        
        return subArr;
        
    }
}