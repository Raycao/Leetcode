package TwoSum;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int[] nums = {2,3,4};
		fun.twoSum(nums, 6);
	}
	
	public void twoSum(int[] nums, int target) {
        int[] a = {0,0};
        
        //�Q�Ψ��for�j��A�Q�βզX���覡����ȦX�֨ӨD�X����
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if((nums[i]+nums[j]) == target){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        
        System.out.printf("%d , %d",a[0],a[1]); //�N����Ӥ����զ����ת����ަ�m�L�X��
    }
}
