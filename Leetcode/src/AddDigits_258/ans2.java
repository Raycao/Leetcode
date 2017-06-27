package AddDigits_258;

//https://leetcode.com/problems/add-digits/#/solutions
//網友提供
//與9有關的規律
public class ans2 {
	public int addDigits(int num) {
        return num==0?0:(num%9==0?9:(num%9));
    }
}
