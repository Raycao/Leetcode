package JudgeRouteCircle_657;
//https://leetcode.com/problems/judge-route-circle/discuss/
//來自網友的答案，放兩個變數代表xy軸，兩個都等於0才是真正回到原點
public class ans2 {
	public class Solution {
	    public boolean judgeCircle(String moves) {
	        int x = 0;
	        int y = 0;
	        for (char ch : moves.toCharArray()) {
	            if (ch == 'U') y++;
	            else if (ch == 'D') y--;
	            else if (ch == 'R') x++;
	            else if (ch == 'L') x--;
	        }
	        return x == 0 && y == 0;
	    }
	}
}
