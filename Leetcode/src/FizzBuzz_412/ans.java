package FizzBuzz_412;

//Source: https://leetcode.com/problems/fizz-buzz/#/description

import java.util.*;

public class ans {
	public List<String> fizzBuzz(int n) {
		
		//�]���D�حn�D�^��List<String>����A�M�hArrayList�]�O������List�A�ҥH�o��ϥ�ArrayList
        ArrayList ls = new ArrayList(); 
		
        //�Q��for�j�騫�X
		for(int i=1; i<=n ; i++){
			//�]���P�O3��5�������ƽd����p�A�ҥH���P�_
			if((i%3 == 0)&&(i%5 == 0)){
				ls.add("FizzBuzz");
			}else if(i%3 == 0){
			    ls.add("Fizz");
			}else if(i%5 == 0){
			    ls.add("Buzz");
			}else{
				//�N���e��int��String�å[��List��
				ls.add(String.valueOf(i));
			}
		}
        
        return ls;
    }
}
