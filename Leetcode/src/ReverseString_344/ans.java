package ReverseString_344;

//source: https://leetcode.com/problems/reverse-string/#/description

public class ans {
	public String reverseString(String s) {
		//�o��n������r��A�]��StingBuilder������r���k�A�ҥH����
        StringBuilder sb = new StringBuilder(s);
        //�ϥ�reverse�Ӥ���
        sb.reverse();
        //�N���e�qStringBuilder�����ରString����
        s = sb.toString();
        return s;
    }
}
