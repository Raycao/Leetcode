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
        
        //�z�L���աA�i�H�o�{�������ơA�ڭ̨S��k��Ĺ
        if(n% 4 == 0){
            ans = false;
        }else{
            ans = true;
        }
        return ans;
    } 
}
