package KeyboardRow_500;

//�Ӧ�Leetcode�W��L�H�Ҵ��Ѫ��Ѫk
//source: https://leetcode.com/problems/keyboard-row/#/solutions

import java.util.*;

//�Q��HashMap���覡�Ӹ�
public class ans_HashMap {
	public class Solution {
	    public String[] findWords(String[] words) {
	        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
	        
	        //���X�@�Ӧ��Ǧr���P��ƪ�map
	        Map<Character, Integer> map = new HashMap<>();
	        
	        //�Q��for�j��A�N�r���P���������ƨ̨̩�imap
	        for(int i = 0; i<strs.length; i++){
	            for(char c: strs[i].toCharArray()){
	                map.put(c, i);//put <char, rowIndex> pair into the map
	            }
	        }
	        
	        //�إ�List�ΨӦ��ǧP�_������A�n���檺String
	        List<String> res = new LinkedList<>();
	        for(String w: words){
	            if(w.equals("")) continue;
	            
	            //�Q��map�h���A�n�d�䪺�C�@��string���Ĥ@�Ӧr��
	            //�N���ন�j�g�A���bmap���Ҵɵw����ơA�é�iindex��
	            int index = map.get(w.toUpperCase().charAt(0));
	            
	            //�Nindex���P�_�̾ڡA�çQ��for�j��̨̬d��C�ӭn���M��String
	            //�Nstring�নchar�A�Q��map��char�A�p�G�^�Ǫ���==index�A�N��ŦX�P�@�C��L�r��
	            //�������T�����סA��r�ꤺ�Ҧ��r�������Ӧ۩�P�@�C��L�r��
	            //�]���⤣�ŦX�A�h�Nindex�אּ-1�A�åߧY���X�A��󦹦r�ꪺ���X�A���U�@�r���~��d��
	            for(char c: w.toUpperCase().toCharArray()){
	                if(map.get(c)!=index){
	                    index = -1; //don't need a boolean flag. 
	                    break;
	                }
	            }
	            //�p�G�ҲŦX�A�N�[�ilist��
	            if(index!=-1) res.add(w);//if index != -1, this is a valid string
	        }
	        //�Nlist�নString[]���A�A�æ^��
	        return res.toArray(new String[0]);
	    }
	}
}
