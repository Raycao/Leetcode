package ReverseInteger;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int x = 56728 , y = -8963; //舉兩個例子，一正一負來試試看
		System.out.println(fun.reverse(x));
		System.out.println(fun.reverse(y));
	}
	
	public int reverse(int x) {
        int RevNum; //放反轉後的整數
        String IntToString = String.valueOf(x); //將整數轉成字串，為的是待會轉成char[]
        char[] ca = IntToString.toCharArray(); //將string轉成char[]
        StringBuilder builder = new StringBuilder(); //做一個StringBuilder物件出來存放字元，使用append會比用"+"的方式來的有效率
        
        //將字元從末端append給StringBuilder
        if(x>0){ //如果原本就正整數，就不需要處理負號
            for(int i = ca.length-1 ; i>=0 ; i--){
				builder.append(ca[i]);					
			}
        }else{ //負號的處理
            for(int i = ca.length-1 ; i>0 ; i--){
				builder.append(ca[i]);					
			}
				builder.insert( 0 , "-" ); //所有的字元append完後，再將負號insert到最前面，0表示矩陣初始位置
        }
        
        //使用例外捕捉方式
        try{ 
			RevNum = Integer.parseInt(builder.toString()); //將剛剛的StringBuilder轉成int物件，如果超過int範圍會產生錯誤例外物件
		}catch(NumberFormatException ex){ //捕捉到錯誤例外物件時的處理
			RevNum = 0; //將回傳值直接指定為0
		}
        
        return RevNum; //回傳答案
    }
}
