package ReverseWordsInAStringIII;

public class example {
	public static void main(String[] args){
		
		String s = "Hello World"; //範例字串
		
		String[] Sarray = s.split(" "); //將輸入字串以空白分隔，並放進陣列
        StringBuilder ans = new StringBuilder(); //利用StringBuilder來製作字串，效能較好，此字串用來放答案
        
        for(int i = 0; i < Sarray.length ; i++){ //依依將字串矩陣內容取出，依序處理
            StringBuilder SBs = new StringBuilder(Sarray[i]); //將字串矩陣一個個轉成StringBuilder物件
            SBs = SBs.reverse(); //轉成SringBuilder物件可以使用reverse方法，直接反轉字串內容
            
            if(i+1 == Sarray.length){ //確定是否為最後一個內容，因為最後的內容後面不會加空格
                ans.append(SBs); 
            }
            else{
                ans.append(SBs).append(" "); //是最後的內容，所以後面還會再append空格
            }
        }
        
        System.out.println(ans.toString()); //將StringBuilder轉成String物件並印出
	}
}
