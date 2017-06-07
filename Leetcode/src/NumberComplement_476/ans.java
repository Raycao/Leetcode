package NumberComplement_476;

//source: https://leetcode.com/problems/number-complement/#/description

public class ans {
	public int findComplement(int num) {
        int ans;
		String b =  Integer.toBinaryString(num); //將輸入轉成二進位
		char[] ca = b.toCharArray(); //再轉成char[]型態
		
		//利用for迴圈走訪，0變1，1變0
		for(int i = 0;i < ca.length ;i++){ 
			if(ca[i] == '1'){
				ca[i] = '0';
			}else{
				ca[i] = '1';
			}
				
		}
		
		
		//最後轉回int型態，參數2代表從2進位轉回
		ans = Integer.parseInt(String.valueOf(ca),2);
		return ans;
    }
}
