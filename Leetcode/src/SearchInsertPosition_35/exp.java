package SearchInsertPosition_35;

public class exp {
	public static void main(String args[]){
		
		int[] nums = {1,5,7,8};
		int target = 0;
		int target2 = 6;
		int target3 = 9;
		int target4 = 5;
		
		exp fun = new exp();
		
		System.out.printf("Array nums = [1,5,7,8] %n");
		System.out.printf("Find %d index in array nums: %d %n",target,fun.searchInsert(nums,target));
		System.out.printf("Find %d index in array nums: %d %n",target2,fun.searchInsert(nums,target2));
		System.out.printf("Find %d index in array nums: %d %n",target3,fun.searchInsert(nums,target3));
		System.out.printf("Find %d index in array nums: %d %n",target4,fun.searchInsert(nums,target4));
		
	}
	
	public int searchInsert(int[] nums, int target) {
        int ans = -1;
        
        //�Q��for�j�騫�X�A���I�b��U�P�_��
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){ 
            	//�p�G�o�{��n���ؼЭȡA�����^��index�ø��X�A�]�����ݭn�b���U��
                ans = i;
                
                //�p�G�S��break�A�d���n�U�@�Ӥ�����>�ؼЭȡA�o�˷|�ɭP�b�U�@�ӧP�_���|��g����
                break;           
            }else if(nums[i] > target){ 
            	//�]���O�Ӷ��ǱƦC�ƭȡA�ҥH�e���@���S���ؼЭ�
            	//�p�G���Ĥ@�Ӥj��ؼЭȪ��ƭȡA�h�^�Ǩ�index�ø��X�j��
                ans = i;
                
                //�ѩ�e�����S���۲ŦX�����סA�ҥH�Ĥ@�Ӥj�󪺷�M�nbreak
                //���M�A����]���O�j��ؼЭȪ��ƭ�
                break; 
            }else{
            	//�p�G��쪺�O�p��ؼЭȡA�h�N��index+1�^�Ǧ������X
            	//�]���i��U�@�ӼƭȤ]�O�p��ؼЭȡA�]���᭱���ƭȧP�_�̵M�n�~��
                ans = i+1;
            }
        }
        return ans;
    }
}
