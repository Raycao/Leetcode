package DetectCapital_520;


//From leetcode discussion
//利用正規表示法: https://openhome.cc/Gossip/JavaGossip-V1/RegularExpression.htm
//
public class ans2 {
	public boolean detectCapitalUse(String word) {
	    return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
	}
}
