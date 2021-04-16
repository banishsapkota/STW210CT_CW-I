package Question1;

import java.util.HashSet;
import java.util.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.ByteBuffer;

public class Binary_to_Integer {
	
	 public static void main(String[] args) {
		 Binary_to_Integer pa=new Binary_to_Integer();
	 
	 int[] arr= {1, 0, 1};
	 int num = 0;
	 
	 List<List<Integer>> permutations = pa.permuter(arr);
	 
	System.out.println("The permutations of the binary numbers are: ");
	 
	 

	 for(List<Integer> p:permutations)
	 {


	    int j=0;
	    for(int i=p.size();i>0;i--){
	        num+=p.get(j)*Math.pow(2*p.get(j),i-1);
	        j++;
	    }
	    System.out.println(p);
	    System.out.println(num);

	  num=0;
	    
	 }
	 }
	 public List<List<Integer>> permuter(int[] arr) {
	 List<List<Integer>> list = new ArrayList<>();
	 Arrays.sort(arr);
	 PermuTate(list, new ArrayList<>(), arr,new boolean[arr.length]);
	 return list;
	 }
	 
	 private void PermuTate(List<List<Integer>> list, List<Integer> result, int [] arr, boolean [] used){
	 
	 // Base case
	 if(result.size() == arr.length){
	         list.add(new ArrayList<>(result));
	     } else{
	         for(int i = 0; i < arr.length; i++){
	             if(used[i] || i > 0 && arr[i] == arr[i-1] && !used[i - 1]) 
	             {   
	                 // ready to use, if elements are ready
	              continue;
	             }
	             // choosing the elements
	             used[i] = true; 
	             result.add(arr[i]);
	             
	             
	             PermuTate(list, result, arr, used);
	             
	             // Unchoosing the element
	             used[i] = false; 
	             result.remove(result.size() - 1);
	         }
	     }
	 }

	
//
//	
//	@SuppressWarnings("unchecked")
//	static LinkedList<Integer> mylist = new LinkedList();
//
//    public static void printArray(int[] a) {
//        
//        System.out.println("");
//        for(int i=0; i<a.length; i++)
//            System.out.print(a[i]);
//            //System.out.println("-->");
//    }
//    
//    public static void swap(int[] a, int i, int j) {
//        int temp=a[i];
//        a[i]=a[j];
//        a[j]=temp;
//        
//    }
//    
//    public static void printPermutation(int[] a, int ca) {
//        if (ca == a.length-1) {
//           toBinary(a);
//            return;
//        }
//         
//        HashSet<Integer>hash = new HashSet<Integer>();
//        for (int i=ca; i<a.length; i++) {
//            if(hash.contains(a[i])==true)
//                continue;
//            hash.add(a[i]);
//            
//            swap(a, i , ca);
//            printPermutation(a, ca+1);
//            swap(a, i, ca);
//        }
//    }
//    
//    public static void toBinary(int binary[]) {	    	
//        
//        int decimal = 0;
//       
//        int length = binary.length;
//        for (int i=length-1;i>=0;i--){
//
//            decimal = (int) (decimal + binary[i]* Math.pow(2,length-1-i));
//        }
//        mylist.add(decimal);
//
//    }
//    public static void main(String[] args) {
//        int[] a= {1,0,1};
//        printPermutation(a, 0);
//        System.out.println(mylist);
//    
////        toBinary();
//}
}
