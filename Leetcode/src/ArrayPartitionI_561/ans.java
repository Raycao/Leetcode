package ArrayPartitionI_561;

//source: https://leetcode.com/problems/array-partition-i/#/description
import java.util.Arrays;

public class ans {
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
