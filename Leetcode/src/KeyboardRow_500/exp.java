package KeyboardRow_500;
import java.util.ArrayList;

public class exp {
	public static void main(String args[]){
		exp fun = new exp();
		String[] words = {"HAHA","Soso","James","Tier"};
		
		String[] ans = fun.findWords(words);
		for(int i=0; i<ans.length; i++){
			System.out.printf("Mathes String: %s %n", ans[i]);
		}
		
	}
	
public String[] findWords(String[] words) {
		
		//�Q�Υ��h��ܪk�A�����Ĥ�����r�곣�����X��
		//�ھڬF�h��ܪk�w�q�A[]�������r���A��ܲŦX���r���A�Y���[[]�h�ܦ��n�ŦX���r��
		//�᭱���W+�A��ܦr���i�H���ƥX�{�h��
        String a = "[qwertyuiop]+";
        String b = "[asdfghjkl]+";
        String c = "[zxcvbnm]+";
        
        //�Q��ArrayList�Ӧs��P�_�᪺���e
        ArrayList<String> temp = new ArrayList();
		
		for(int i=0; i<words.length; i++){
			//��������p�g�A�]���j�p�g�P�_���t�O
			String tempString = words[i].toLowerCase();
			
			//match��k�Y�ŦX�h�|�^��true�A�Q�ΤT�ӧP�_�s��or�޿���A�]���u�n���@�ӲŦX�K�|�^��true
			if(tempString.matches(a)||tempString.matches(b)||tempString.matches(c)){
				temp.add(words[i]); //�^��true�K�[�iArrayList����
			}				
		}
		
		//�NArrayList�নSting[]���A
		String[] ans = temp.toArray(new String[temp.size()]);

		
		return ans;
    }
}
