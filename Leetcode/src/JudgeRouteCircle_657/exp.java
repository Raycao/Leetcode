package JudgeRouteCircle_657;

import java.util.Scanner;

public class exp {
	public static void main(String[] args) {
		
		System.out.println("清輸入一串由U,D,L,R所組成的字串，各自代表上下左右");
		System.out.printf("程式將判斷此字串是吼可以回歸原點:");
		Scanner scan = new Scanner(System.in);
		
		exp judge = new exp();
		System.out.print(judge.judgeCircle(scan.next()));
				
		
	}
	
	public boolean judgeCircle(String moves) {
        char[] test = moves.toCharArray();
		int ans = 0;
		
		for(char i:test) {
			if(i == 'U') {
				ans++;
			}else if(i == 'D') {
				ans--;
			}else if(i == 'L') {
				ans = ans+10;
			}else if(i == 'R') {
				ans = ans-10;
			}
		}
        
        if(ans == 0){
            return true;
        }else{
            return false;
        }
    }
}
