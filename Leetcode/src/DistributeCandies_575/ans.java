package DistributeCandies_575;

//source: https://leetcode.com/problems/distribute-candies/#/description

import java.util.*;

public class ans {
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
