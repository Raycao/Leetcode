package ReshapeTheMatrix_566;

import java.util.ArrayList;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int[][] test = {{2,5},{11,3}};
		int r = 1 , c = 4;
		int ans[][]; 
		
		ans = fun.matrixReshape(test, r, c);
		
		for(int i =0; i<ans.length ; i++){
			for(int j=0 ; j<ans[i].length ; j++){
				System.out.printf("%d ",ans[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int count = 0; //�ΨӺ�nums�������ƶq
        int count2 = 0; //�º�ΨӱNarraylist����������i���פ�
		int[][] ans = new int[r][c]; //�N�D�ط|�����}�C��new�X�ӡA�ϥ�����n��񵪮ת��a���X�h
		ArrayList<Integer> myList = new ArrayList<Integer>(); 
		//�]�����T�wnums�}�C���j�p�A�p�G�n�����ӼȮɪ��}�C��nums���������A�٭n����for�j��]���j��
		//�~����knew�@�ӵ��j�����s�}�C�ө񤸯��A�]���o����ArrayList�A�s���Xnums���ɭԡA�N�i�H���K�⤸���ȩ�i�h
		
		//�������Xnums�}�C�A�]�����i�ण�O�x�}�}�C�A�ҥH�~��γo�ؤ覡���X
		//���M���ӥi�H�����C�򰪪��ƶq�ۭ��A�ӧ�ƶq
		for(int i=0 ; i<nums.length ; i++){
			for(int j=0 ; j<nums[i].length ; j++){
				count++; //�C���@�ӴNcount+1
				myList.add(nums[i][j]); //���K�⤸����imyList���A��arraylist�N�O��K�A�A�i�H�������ŧi�}�C�j�p
			}
		}
		
		//�̷��D�ص����C���ۭ��A�ݬݬO�_�˱o�U�A�p�G�ˤ��U�A�N�^�ǭ쥻���}�Cnums
		if(r*c > count){
			return nums;
		}else{ //�p�G�˱o�U�A�N�⤸���qmyList�̨̨��X�A�é�ians�}�C��
			for(int i=0 ; i<ans.length ; i++){
				for(int j=0 ; j<ans[i].length ; j++){
					ans[i][j] = myList.get(count2);
					count2++; //count2�º�ΨӤ@�@���XmyList���U����
				}
			}
		    return ans; //�^��ans�}�C
		}
    }
	
}
