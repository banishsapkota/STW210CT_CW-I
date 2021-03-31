package Question2;

/*
 * 
    b)Given two stack a and b, if allowed to pop from each stack, all popped values are added together, return maximum pop one 
    can make without sum exceeding some given integer k. [3 Marks]
    Given k=11
    Output: 4
    
 * 
 * */
import java.util.*;
public class processingClass {
	
	    static Stack<Integer> stackA = new Stack<Integer>();
	    static Stack<Integer> stackB = new Stack<Integer>();
	    
	    public static int popSum() {
	        
	        int counter = 0;
	        int size;
	        int k = 11;
	        int lengthOfStackA = stackA.size();
	        int lengthOfStackB = stackB.size();
	        
	        if(lengthOfStackA>lengthOfStackB) {
	            size = lengthOfStackB;
	        }
	        else {
	            size = lengthOfStackA;
	        }
	        
	        for(int i = 0; i<size; i++) {
	            
	            
	            int popValueOfStackA = stackA.pop();
	            int popValueOfStackB = stackB.pop();
	            
	            int sumOfPop = popValueOfStackA + popValueOfStackB;
	            
	            
	            if(sumOfPop <= k) {
	                counter = counter +2;
	            }
	            
	        }
	        
	        
	        
	        return counter;
	    }
	    
	    
	    public static void main(String[] args) {
	        
	        // pushing given value to both stack
	        stackA.push(9);
	        stackA.push(7);
	        stackA.push(6);
	        stackA.push(3);
	        stackA.push(4);
	        
	        stackB.push(5);
	        stackB.push(9);
	        stackB.push(2);
	        stackB.push(1);
	        
	        int result = popSum();
	        System.out.println(result);
	        
	    }
	

}
