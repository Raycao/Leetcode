package AddDigits_258;

//source: https://leetcode.com/problems/add-digits/#/description

//找規律的題目，不太需要解釋，可以實際試試看
public class ans {
	public int addDigits(int num) {
        int sum;
        if(num>10)
            sum = addDigits(((int)num/10 )+(num%10));
        else
            sum = (num/10)+(num%10);
    
        return sum;
    }
}
