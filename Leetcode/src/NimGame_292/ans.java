package NimGame_292;

//source:https://leetcode.com/problems/nim-game/#/description

public class ans {
	public boolean canWinNim(int n) {
        boolean ans = true;
        
        //�z�L���աA�i�H�o�{�������ơA�ڭ̨S��k��Ĺ
        if(n% 4 == 0){
            ans = false;
        }else{
            ans = true;
        }
        return ans;
    } 
}
