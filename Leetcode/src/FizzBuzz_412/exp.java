package FizzBuzz_412;

import java.util.*;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		List<String> ans = fun.fizzBuzz(15);
		
		for(String i : ans)
			System.out.println(i);		
	}	
	
	public List<String> fizzBuzz(int n) {
        ArrayList ls = new ArrayList();
		
		for(int i=1; i<=n ; i++){
			if((i%3 == 0)&&(i%5 == 0)){
				ls.add("FizzBuzz");
			}else if(i%3 == 0){
			    ls.add("Fizz");
			}else if(i%5 == 0){
			    ls.add("Buzz");
			}else{
				ls.add(String.valueOf(i));
			}
		}
        
        return ls;
    }
}
