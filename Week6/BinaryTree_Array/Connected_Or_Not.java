package BinaryTree_Array;

public class Connected_Or_Not {
	    
    static Boolean checkBalance(int tree[],int head[]) {
         
    	boolean result=true;
        int index;
        
        for(int i=0;i<head.length;i++) {
            index=findIndex(head[i],tree);
            if(tree[2*index+1]!=0 && tree[2*index+2]!=0) {
                result&=true;
            }
            else {
                result&=false;
            }    
        }
        System.out.println(result);
    
        
        return result;
    }
    
    static int findIndex(int val, int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==val) {
                return i;
            }
        }
        return -1;
    }
    
    
    @SuppressWarnings("static-access")
	public static void main(String[] args) {
        int tree[]= {1,4,5,0,2,3,9,0,0,0,0,0,0,2,7};
        int head[]= {5,9};
        
        Connected_Or_Not bt= new Connected_Or_Not();
        bt.checkBalance(tree,head);
        
	   }
}
