package DetectCapital_520;

//source: https://leetcode.com/problems/detect-capital/#/description

public class ans {
	public boolean detectCapitalUse(String word) {
        boolean ans;
		char[] ca = word.toCharArray();//�নchar[]���A�A�]��character����k�i�H�P�_�j�p�g
		int first = 0;
		int body = 0;
		
		//�ϥΤ�k�P�_�j�p�g
		if(Character.isUpperCase(ca[0])){
			first++; 
		}
		
		//�P�_���F�Ĥ@�Ӧr���j�p�g
		for(int i=1; i<ca.length; i++){
			if(Character.isUpperCase(ca[i]))
				body++;
		}
		
		//�N�U���p�@�@�C�X
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
