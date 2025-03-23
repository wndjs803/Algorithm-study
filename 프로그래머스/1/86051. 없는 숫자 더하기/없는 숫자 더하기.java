import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int solution(int[] numbers) {
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    List<Integer> range = new ArrayList<>();
    for (int num : numbers) {
      range.add(num);
    }

    int answer = 0;
    for(int n : arr) {
      if (!range.contains(n)) {
        answer += n;
      }
    }
    return answer;
  }
}