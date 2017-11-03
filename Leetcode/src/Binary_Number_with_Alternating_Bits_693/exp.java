package Binary_Number_with_Alternating_Bits_693;

import java.util.*;

public class exp {
	public static void main(String[] args) {
		exp fun = new exp();
		System.out.print("請輸入正整數，藉以判斷是否位元10交錯: ");
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		System.out.printf("其二進為表示法為: %s %n" , Integer.toBinaryString(test));
		System.out.printf("結果為:" +  fun.hasAlternatingBits(test));
	}
	
	public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);     
        char[] cha = s.toCharArray();
        char temp = cha[0];
        boolean ans = true;
        
        for(int i=1; i<cha.length ;i++){
            if(cha[i] != temp){
                temp = cha[i];
            }else{
                ans = false;
                break;
            }
        }
        
        return ans;
        
    }
}
