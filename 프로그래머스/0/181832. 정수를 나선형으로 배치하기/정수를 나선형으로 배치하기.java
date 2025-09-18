class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        // 우 하 좌 상
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0;
        int y = 0;
        int index = 0;
        int num = 1;
        answer[0][0] = 1;
        
        while(num < n * n) {
            int nx = x + dx[index];
            int ny = y + dy[index];
            
            if (nx >= n || ny >= n || nx < 0 || ny < 0 || answer[ny][nx] != 0) {
                index = (index + 1) % 4;
                continue;
            }
            
            num = num + 1;
            x = nx;
            y = ny;
            
            answer[y][x] = num;
        }
        
        return answer;
    }
}