package AddDigits_258;

//source: https://leetcode.com/problems/add-digits/#/description

//��W�ߪ��D�ءA���ӻݭn�����A�i�H��ڸոլ�
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
