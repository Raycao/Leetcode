package DistributeCandies_575;

import java.util.HashSet;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int[] candies = {1,2,2,3};
		
		System.out.printf("�i�H�o��̤j���κ������}�G�ƶq: %d", fun.distributeCandies(candies));
	}
	
	public int distributeCandies(int[] candies) {
        int hs_length;
        int ans = 0;
		
        //�Q��HashSet���S�ʡA�����|�d�U�����ƪ�����
		HashSet<Integer> hs = new HashSet<Integer>();
	
		for(int i=0; i<candies.length; i++){
			hs.add(candies[i]); //�N�����[�i�ӡA�����|�d�U�����ƪ�����
		}
		
		//�p�G�d�U�Ӫ������j��쥻�}�C�����@�b�A��ܫܦh�Ʀr��������
		//���ѩ��D�حn�����}�G�A�ҥH�f�f�̦h�]�O�u�ব��}�C�@�b�������}�G�ƶq
		if(hs.size()>candies.length/2)
			ans = candies.length/2;
		//�Ϥ��p�G�p��A��ܦ��ܦh���ƪ��A�����^��HashSet�j�p�N�i�H�F
		else
			ans = hs.size();
			
		return ans;
    }
}
