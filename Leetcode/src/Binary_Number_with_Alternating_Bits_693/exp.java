package Binary_Number_with_Alternating_Bits_693;

import java.util.*;

public class exp {
	public static void main(String[] args) {
		exp fun = new exp();
		System.out.print("�п�J����ơA�ǥH�P�_�O�_�줸10���: ");
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		System.out.printf("��G�i����ܪk��: %s %n" , Integer.toBinaryString(test));
		System.out.printf("���G��:" +  fun.hasAlternatingBits(test));
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
