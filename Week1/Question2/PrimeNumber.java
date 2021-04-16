package Question2;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumber {

	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,3,5,11,17,23));
		int begin = list.get(0);
		int indx = list.size()-1;
		int last = list.get(indx);
		
		ArrayList<Integer> prime_numbers = new ArrayList<>();
		
			
		
	    while (begin <= last) {
	        boolean flag = false;
	
	        for(int i = 2; i <= begin/2; ++i) {
	            // condition for nonprime number
	            if(begin % i == 0) {
	                flag = true;
	                break;
	            }
	        }
	
	        if (!flag && begin != 0 && begin != 1)
//	            System.out.print(begin + " ");
	        prime_numbers.add(begin);
	 
	        ++begin;
	    }
	    
	    for(int i =0 ; i<list.size(); i++) {
	    	// checking in list if its value of i index matches the value of j index of prime number
	    	// if matched then removing the prime number so that only prime number not present in list
	    	// will remain in prime number arraylist 
	    	
	    	for(int j = 0; j<prime_numbers.size(); j++) {
	    		
	    		if(list.get(i) == prime_numbers.get(j)) {
	    			
	    			prime_numbers.remove(j);
	    		
	    		}
	    	}
	    }
	    
	    System.out.println(prime_numbers);
	    
	    
	}
}