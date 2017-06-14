package KeyboardRow_500;
import java.util.ArrayList;

public class exp {
	public static void main(String args[]){
		exp fun = new exp();
		String[] words = {"HAHA","Soso","James","Tier"};
		
		String[] ans = fun.findWords(words);
		for(int i=0; i<ans.length; i++){
			System.out.printf("Mathes String: %s %n", ans[i]);
		}
		
	}
	
public String[] findWords(String[] words) {
		
		//利用正則表示法，先把藥比較的字串都先做出來
		//根據政則表示法定義，[]內接的字元，表示符合的字元，若未加[]則變成要符合此字串
		//後面接上+，表示字元可以重複出現多次
        String a = "[qwertyuiop]+";
        String b = "[asdfghjkl]+";
        String c = "[zxcvbnm]+";
        
        //利用ArrayList來存放判斷後的內容
        ArrayList<String> temp = new ArrayList();
		
		for(int i=0; i<words.length; i++){
			//先全部轉小寫，因為大小寫判斷有差別
			String tempString = words[i].toLowerCase();
			
			//match方法若符合則會回傳true，利用三個判斷連接or邏輯單位，因此只要有一個符合便會回傳true
			if(tempString.matches(a)||tempString.matches(b)||tempString.matches(c)){
				temp.add(words[i]); //回傳true便加進ArrayList之中
			}				
		}
		
		//將ArrayList轉成Sting[]型態
		String[] ans = temp.toArray(new String[temp.size()]);

		
		return ans;
    }
}
