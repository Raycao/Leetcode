package AddDigits_258;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		System.out.print(fun.addDigits(39));
	}
	
	public int addDigits(int num) {
        int sum;
        if(num>10)
            sum = addDigits(((int)num/10 )+(num%10));
        else
            sum = (num/10)+(num%10);
    
        return sum;
    }
}
