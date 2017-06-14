package KeyboardRow_500;

//來自Leetcode上其他人所提供的解法
//source: https://leetcode.com/problems/keyboard-row/#/solutions

import java.util.*;

//利用HashMap的方式來解
public class ans_HashMap {
	public class Solution {
	    public String[] findWords(String[] words) {
	        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
	        
	        //做出一個收納字元與整數的map
	        Map<Character, Integer> map = new HashMap<>();
	        
	        //利用for迴圈，將字元與其對應的整數依依放進map
	        for(int i = 0; i<strs.length; i++){
	            for(char c: strs[i].toCharArray()){
	                map.put(c, i);//put <char, rowIndex> pair into the map
	            }
	        }
	        
	        //建立List用來收納判斷完成後，要提交的String
	        List<String> res = new LinkedList<>();
	        for(String w: words){
	            if(w.equals("")) continue;
	            
	            //利用map去找到，要查找的每一個string的第一個字元
	            //將其轉成大寫，找到在map中所棟硬的整數，並放進index中
	            int index = map.get(w.toUpperCase().charAt(0));
	            
	            //將index當成判斷依據，並利用for迴圈依依查找每個要探尋的String
	            //將string轉成char，利用map找char，如果回傳的值==index，代表符合同一列鍵盤字母
	            //完全正確的答案，其字串內所有字元應都來自於同一列鍵盤字母
	            //因此逤不符合，則將index改為-1，並立即跳出，放棄此字串的探訪，往下一字串繼續查找
	            for(char c: w.toUpperCase().toCharArray()){
	                if(map.get(c)!=index){
	                    index = -1; //don't need a boolean flag. 
	                    break;
	                }
	            }
	            //如果皆符合，就加進list中
	            if(index!=-1) res.add(w);//if index != -1, this is a valid string
	        }
	        //將list轉成String[]型態，並回傳
	        return res.toArray(new String[0]);
	    }
	}
}
