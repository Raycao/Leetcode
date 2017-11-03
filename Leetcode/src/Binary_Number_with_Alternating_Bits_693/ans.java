package Binary_Number_with_Alternating_Bits_693;

//https://leetcode.com/problems/binary-number-with-alternating-bits/description/

public class ans {
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
