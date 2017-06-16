package FizzBuzz_412;

//Source: https://leetcode.com/problems/fizz-buzz/#/description

import java.util.*;

public class ans {
	public List<String> fizzBuzz(int n) {
		
		//因為題目要求回傳List<String>物件，然則ArrayList也是集成自List，所以這邊使用ArrayList
        ArrayList ls = new ArrayList(); 
		
        //利用for迴圈走訪
		for(int i=1; i<=n ; i++){
			//因為同是3跟5的公倍數範圍較小，所以先判斷
			if((i%3 == 0)&&(i%5 == 0)){
				ls.add("FizzBuzz");
			}else if(i%3 == 0){
			    ls.add("Fizz");
			}else if(i%5 == 0){
			    ls.add("Buzz");
			}else{
				//將內容由int轉String並加到List內
				ls.add(String.valueOf(i));
			}
		}
        
        return ls;
    }
}
