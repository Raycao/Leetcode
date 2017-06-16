package ReverseString_344;

//source: https://leetcode.com/problems/reverse-string/#/description

public class ans {
	public String reverseString(String s) {
		//這邊要做反轉字串，因為StingBuilder有反轉字串方法，所以此用
        StringBuilder sb = new StringBuilder(s);
        //使用reverse來反轉
        sb.reverse();
        //將內容從StringBuilder物件轉為String物件
        s = sb.toString();
        return s;
    }
}
