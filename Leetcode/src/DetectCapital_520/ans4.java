package DetectCapital_520;

//From leetcode discussion
//����²���g�k
public class ans4 {
	public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || //�p�G�������O�j�g�A��equal�Ӥ���O�_�@�� 
               word.equals(word.toLowerCase()) || //�p�G�������O�p�g�A��equal�Ӥ���O�_�@��
               Character.isUpperCase(word.charAt(0)) &&  //�Ĥ@�Ӧr�O�j�g�A�B�᭱���O�p�g
               word.substring(1).equals(word.substring(1).toLowerCase());
    }
}
