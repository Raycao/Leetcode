package SingleNumber_136;

import java.util.Arrays;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int[] nums = {1,1,2,2,3,3,4};
		
		System.out.printf("The single number is %d", fun.singleNumber(nums));
	}
	
	public int singleNumber(int[] nums) {
        //����sort��k�N�}�C���s�ƦC�A�ѩ�u�|���@�ӼƭȤ����ƥX�{�⦸
		//�z�L�ƧǡA�i�H���Ƥ@�_�A�u�n���d��N�i�H�����X��@��
		Arrays.sort(nums);
        int single=-1;
        
        //�p�G�}�C�u���@�ӭȡA�Q���N�O����
       if(nums.length == 1)
            single = nums[0];
       
        //�Q��for�j�騫�X�A�q�ĤG�ӭȶ}�l�A�C���[2
        for(int i=1; i<nums.length; i += 2){
        	//�p�G�e�@�ӭȡA��{�b���P�A����ܥX�{��@�ȡA�Ʀb�e�����ȴN�O����
        	//�p�Gi�q0�}�l�A�֩w�n�g��i��i+1�i�����A�o�˴N���i��W�L�}�C����
            if(nums[i] != nums[i-1]){
                single = nums[i-1];
                break; //���Y���X�j��A�]���X�{�����ƪ����ΡA�᭱�֩w�N������
            }else if(i+2 >= nums.length){
            	//�ΨӳB�z���̭Ȧb�̫᭱�����p�A�]�����̭Ȧb�̫᭱i+1�N�O���I
            	//�ҥHi+2�W�L�`���סA��ܳ�@�ȬO�̫�@��
                single = nums[i+1];
                break;
            }
        }
        return single;
    }
}
