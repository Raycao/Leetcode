package ReverseWordsInAStringIII;

public class example {
	public static void main(String[] args){
		
		String s = "Hello World"; //�d�Ҧr��
		
		String[] Sarray = s.split(" "); //�N��J�r��H�ťդ��j�A�é�i�}�C
        StringBuilder ans = new StringBuilder(); //�Q��StringBuilder�ӻs�@�r��A�į���n�A���r��Ψө񵪮�
        
        for(int i = 0; i < Sarray.length ; i++){ //�̨̱N�r��x�}���e���X�A�̧ǳB�z
            StringBuilder SBs = new StringBuilder(Sarray[i]); //�N�r��x�}�@�ӭ��নStringBuilder����
            SBs = SBs.reverse(); //�নSringBuilder����i�H�ϥ�reverse��k�A��������r�ꤺ�e
            
            if(i+1 == Sarray.length){ //�T�w�O�_���̫�@�Ӥ��e�A�]���̫᪺���e�᭱���|�[�Ů�
                ans.append(SBs); 
            }
            else{
                ans.append(SBs).append(" "); //�O�̫᪺���e�A�ҥH�᭱�ٷ|�Aappend�Ů�
            }
        }
        
        System.out.println(ans.toString()); //�NStringBuilder�নString����æL�X
	}
}
