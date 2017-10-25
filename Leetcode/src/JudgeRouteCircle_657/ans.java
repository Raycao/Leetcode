package JudgeRouteCircle_657;

//https://leetcode.com/problems/judge-route-circle/description/

//��W�U���k�U�۩�W�������Ʀr���[��A����0�N�O�^����I
public class ans {
	public boolean judgeCircle(String moves) {
        char[] test = moves.toCharArray();
		int ans = 0;
		
		for(char i:test) {
			if(i == 'U') {
				ans++;
			}else if(i == 'D') {
				ans--;
			}else if(i == 'L') {
				ans = ans+10;
			}else if(i == 'R') {
				ans = ans-10;
			}
		}
        
        if(ans == 0){
            return true;
        }else{
            return false;
        }
    }
}
