package MaxConsecutiveOnes_485;

import java.util.Arrays;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int[] nums = {1,0,1,1,0,1};

		System.out.println(fun.findMaxConsecutiveOnes(nums));
	}
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        boolean sign = true;
        
        //�Q��for�j�騫�X
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1 && sign){ 
            	//�p�Gsign�Otrue�A����٦b�s��X�{1�����p�Atemp�[1
                temp++;
            }else{
            	//�_�h�Ntemp����
                temp = 0;
            }
            
            //��temp���Ȥj��max�A��ܦ���j���s��ƥإX�{
            if(temp>max)
                max = temp;
        }
        
        return max;
    }
}
