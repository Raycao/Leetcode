package ArrayPartitionI_561;

import java.util.Arrays;

public class exp {
	public static void main(String[] args){
		int ans;
		int[] nums = {1,4,3,2};
		
		exp fun = new exp();
		ans = fun.arrayPairSum(nums);
	
		System.out.println(ans);
	}
	
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); //���i��ƧǡA����k���ɾ��ƧǡA�ҥH�Ʀr�Ѥp�ܤj
        int sum = 0;
        
        //�Ĥɾ��Ƨǫ᪺�}�C�A�ڭ̥u�n���_��index�������ۮa�N�i�H�o��̤j
        //�]���n��min�̤j�A�ڭ̵��藍�i�����̤j�������A�ҥH�ڭ̱N�̤j�P�ĤG�j��@�_
        //�ܤ֥i�H�o��ĤG�j�ȡA�]���Ƨǫ���@�աA�C�@�ճ��i�H����ĤG�j�A�i�H����min�ۥ[�̤j��
        for(int i=0; i<nums.length/2; i++){
            sum += nums[i*2];
        }
        
        return sum;
    }
}
