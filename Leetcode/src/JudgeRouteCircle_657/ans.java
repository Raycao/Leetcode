package JudgeRouteCircle_657;

//https://leetcode.com/problems/judge-route-circle/description/

//基上下左右各自放上相應的數字做加減，等於0就是回到原點
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
