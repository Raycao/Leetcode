package NumberComplement_476;

//source: https://leetcode.com/problems/number-complement/#/description

public class ans {
	public int findComplement(int num) {
        int ans;
		String b =  Integer.toBinaryString(num); //�N��J�ন�G�i��
		char[] ca = b.toCharArray(); //�A�নchar[]���A
		
		//�Q��for�j�騫�X�A0��1�A1��0
		for(int i = 0;i < ca.length ;i++){ 
			if(ca[i] == '1'){
				ca[i] = '0';
			}else{
				ca[i] = '1';
			}
				
		}
		
		
		//�̫���^int���A�A�Ѽ�2�N��q2�i����^
		ans = Integer.parseInt(String.valueOf(ca),2);
		return ans;
    }
}
