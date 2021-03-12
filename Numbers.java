import java.util.*;

public class Numbers {
   
   private int[] nums;
   
   public void setNums(int[] nums) {
      this.nums = nums;
      
   }
   
   public int[] getNums() {
      return nums;
   }
   
   public int findMax(){
	   Arrays.sort(this.nums);
	   int largest = nums[nums.length - 1];
	   return largest;   
	            
   }
   
   // Fill array nums with pseudo-random integers (0-999) with a seed value
   public void fillRandomly(int seed, int size){
      Random rand = new Random(seed);
      nums = new int[size];
      for(int i = 0; i < nums.length; ++i){
         nums[i] = rand.nextInt(1000);
         
      }
   }   
}
