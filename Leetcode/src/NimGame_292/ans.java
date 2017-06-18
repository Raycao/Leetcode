package NimGame_292;

//source:https://leetcode.com/problems/nim-game/#/description

public class ans {
	public boolean canWinNim(int n) {
        boolean ans = true;
        
        //透過嘗試，可以發現似的倍數，我們沒辦法必贏
        if(n% 4 == 0){
            ans = false;
        }else{
            ans = true;
        }
        return ans;
    } 
}
