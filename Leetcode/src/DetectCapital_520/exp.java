package DetectCapital_520;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		String[] test = {"USA","gogo","What","WrOng"};
		
		for(int i=0; i<test.length; i++){
			if(fun.detectCapitalUse(test[i]))
				System.out.printf("%s use capitals in a right way %n", test[i]);
			else
				System.out.printf("%s doesn't use capitals in a right way %n", test[i]);
		}
		
		
	}
	
	public boolean detectCapitalUse(String word) {
        boolean ans;
		char[] ca = word.toCharArray();//轉成char[]型態，因為character有方法可以判斷大小寫
		int first = 0;
		int body = 0;
		
		//使用方法判斷大小寫
		if(Character.isUpperCase(ca[0])){
			first++; 
		}
		
		//判斷除了第一個字的大小寫
		for(int i=1; i<ca.length; i++){
			if(Character.isUpperCase(ca[i]))
				body++;
		}
		
		//將各狀況一一列出
		if(first==1 && body==0)
			ans = true;
		else if(first==1 && body==ca.length-1)
		    ans = true;
		else if(first==0 && body==0)
		    ans = true;
		else 
			ans = false;
	
		return ans;
    }
}
