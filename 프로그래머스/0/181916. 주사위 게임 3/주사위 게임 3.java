class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = new int[7];
        dice[a] += 1;
        dice[b] += 1;
        dice[c] += 1;
        dice[d] += 1;
        
        int max_num = 0;
        int index = 0;
        
        for(int i = 1; i < 7; i++) {
            if(max_num <= dice[i]) {
                max_num = dice[i];
                index = i;
            }
        }
        
        if(max_num == 4) {
            return 1111 * index;
        }
        
        if(max_num == 3) {
            int p = index;
            int q = 0;
            
            for(int i = 1; i < 7; i++) {
                if(dice[i] == 1) {
                    q = i;
                    break;
                }
            }
            
            return (int)Math.pow((10 * p + q), 2);
        }
        
        if (max_num == 2) {
            int count = 0;
            
            for(int i = 1; i < 7; i++) {
                if(dice[i] == 2) {
                    count += 1;
                }
            }
            
            int p = 0;
            int q = 0;
            
            if(count == 2) {
                for(int i = 1; i < 7; i++) {
                    if(dice[i] == 2) {
                        if(p == 0) {
                            p = i;
                        }
                        else q = i;
                    }
                }
                
                return (p + q) * (int)Math.abs(p - q);
            }
            
            int r = 0;
            for(int i = 1; i < 7; i++) {
                if(dice[i] == 1) {
                    if(q == 0) {
                        q = i;
                    }
                    else r = i;
                }
            }
            
            return q * r;
            
        }
        
        for(int i = 1; i < 7; i++) {
            if(dice[i] == 1) {
                return i;
            }
        }
        
        return 0;
    }
}