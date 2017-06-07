package HammingDistance;

//source: https://leetcode.com/problems/hamming-distance/#/description

public class ans {
	public int hammingDistance(int x, int y) {
        String a =  Integer.toBinaryString(x^y); ///利用XOR的原理，來找出不一樣的位元，根據xor原理，不一樣位元會產生1，並轉成字串
		char[] ca = a.toCharArray(); //把字串轉成char[]型式
		int sum = 0; //儲存不一樣位元數量，在這邊就是蒐集1的數量
		
		for(int i = 0;i < ca.length ;i++){ //走訪陣列，看看有多少1
			if(ca[i] == '1'){ //因為是char型態，所以如果寫==1，會不算進為1的判斷內
				sum++; //有1就++
			}
		}
		
		return sum;
    }
}
