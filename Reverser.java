import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverser extends Numbers {
	
      //TODO add some code
      //
      
   	// TODO
   	// return the ArrayList that has the elements 
   	// that Numbers has in int[] nums,
   	// but in the reversed order
   	public ArrayList<Integer> reverse(){
         // your code goes here
   		int[] array = this.getNums();
   		
   		ArrayList<Integer> reversed = new ArrayList<Integer>();
   		for(int i = 0; i < array.length; ++i)
   		{
   			reversed.add(i);
   		}
   		
   		//Collections.addAll(reversed, array);
   		
   		// ArrayList<Integer> reversed = new ArrayList<>();
   		
   		Collections.sort(reversed, Collections.reverseOrder());
   		
         return reversed;
	   }
	   
	   // TODO 
	   // find the second biggest value
	   // keep in mind that the biggest value could be include more 
	   // than once
	   public int findSecondBiggest() {
	    int secondLargest = 0;
	    boolean isSecondLargest = false;
	    int[] array = this.getNums();
	    Arrays.sort(array);
	    for(int i = array.length - 2; i <= 0; --i)
	    {
	    	if(array[i] == array[i - 1])
	    	{
	    		isSecondLargest = false;
	    	}
	    	else
	    	{
	    		isSecondLargest = true;
	    		secondLargest = array[i];
	    	}
	    	
	    }
	     
	      return secondLargest;
	      
		   
		   // your code goes here
	   	   
	   }	 
}
