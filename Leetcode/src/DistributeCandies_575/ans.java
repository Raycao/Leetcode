package DistributeCandies_575;

//source: https://leetcode.com/problems/distribute-candies/#/description

import java.util.*;

public class ans {
	public int distributeCandies(int[] candies) {
        int hs_length;
        int ans = 0;
		
        //利用HashSet的特性，期內會留下不重複的元素
		HashSet<Integer> hs = new HashSet<Integer>();
	
		for(int i=0; i<candies.length; i++){
			hs.add(candies[i]); //將元素加進來，期內會留下不重複的元素
		}
		
		//如果留下來的元素大於原本陣列給的一半，表示很多數字都不重複
		//但由於題目要均分糖果，所以妹妹最多也是只能收到陣列一半種類的糖果數量
		if(hs.size()>candies.length/2)
			ans = candies.length/2;
		//反之如果小於，表示有很多重複的，直接回傳HashSet大小就可以了
		else
			ans = hs.size();
			
		return ans;
    }
}
