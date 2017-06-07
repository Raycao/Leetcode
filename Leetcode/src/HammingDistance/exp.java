package HammingDistance;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int x = 1 , y = 4;
		int ans = fun.hammingDistance(x, y);
		System.out.println(ans);
	}
	
	public int hammingDistance(int x, int y) {
        String a =  Integer.toBinaryString(x^y);
		char[] ca = a.toCharArray();
		int sum = 0;
		
		for(int i = 0;i < ca.length ;i++){
			if(ca[i] == '1'){
				sum++;
			}
		}
		
		return sum;
    }
}
