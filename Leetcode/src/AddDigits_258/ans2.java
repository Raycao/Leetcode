package AddDigits_258;

//https://leetcode.com/problems/add-digits/#/solutions
//���ʹ���
//�P9�������W��
public class ans2 {
	public int addDigits(int num) {
        return num==0?0:(num%9==0?9:(num%9));
    }
}
