package JudgeRouteCircle_657;

import java.util.Scanner;

public class exp {
	public static void main(String[] args) {
		
		System.out.println("�M��J�@���U,D,L,R�Ҳզ����r��A�U�ۥN��W�U���k");
		System.out.printf("�{���N�P�_���r��O�q�i�H�^�k���I:");
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
