package NimGame_292;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int n = 4;
		
		if(!fun.canWinNim(n))
		System.out.printf("Can't always win !");
	}
	
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
