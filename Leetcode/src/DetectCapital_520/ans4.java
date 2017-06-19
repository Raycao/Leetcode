package DetectCapital_520;

//From leetcode discussion
//較精簡的寫法
public class ans4 {
	public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || //如果全部都是大寫，用equal來比較是否一樣 
               word.equals(word.toLowerCase()) || //如果全部都是小寫，用equal來比較是否一樣
               Character.isUpperCase(word.charAt(0)) &&  //第一個字是大寫，且後面都是小寫
               word.substring(1).equals(word.substring(1).toLowerCase());
    }
}
