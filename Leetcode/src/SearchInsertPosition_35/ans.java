package SearchInsertPosition_35;

//source: https://leetcode.com/problems/search-insert-position/#/description

public class ans {
    public int searchInsert(int[] nums, int target) {
        int ans = -1;
        
        //利用for迴圈走訪，重點在於各判斷式
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){ 
            	//如果發現剛好找到目標值，直接回傳index並跳出，因為不需要在往下找
                ans = i;
                
                //如果沒有break，搞不好下一個元素值>目標值，這樣會導致在下一個判斷式會改寫答案
                break;           
            }else if(nums[i] > target){ 
            	//因為是照順序排列數值，所以前面一直沒找到目標值
            	//如果找到第一個大於目標值的數值，則回傳其index並跳出迴圈
                ans = i;
                
                //由於前面都沒找到相符合的答案，所以第一個大於的當然要break
                //不然再往後也都是大於目標值的數值
                break; 
            }else{
            	//如果找到的是小於目標值，則將其index+1回傳但不跳出
            	//因為可能下一個數值也是小於目標值，因此後面的數值判斷依然要繼續
                ans = i+1;
            }
        }
        return ans;
    }
}