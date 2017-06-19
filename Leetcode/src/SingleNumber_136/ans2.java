package SingleNumber_136;

//Better solution souce from Leetcode Discussion 

public class ans2 {
	public int singleNumber(int A[], int n){
            int result=A[0];
	            for(int i=1;i<n;i++)
	            {
	            	//XOR: A ^ A = 0 and A ^ B ^ A = B.
	                result= result^A[i];  /* Get the xor of all elements */
	            }
            return result;
        }
}
