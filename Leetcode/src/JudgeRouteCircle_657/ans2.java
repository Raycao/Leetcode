package JudgeRouteCircle_657;
//https://leetcode.com/problems/judge-route-circle/discuss/
//�Ӧۺ��ͪ����סA�����ܼƥN��xy�b�A��ӳ�����0�~�O�u���^����I
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
