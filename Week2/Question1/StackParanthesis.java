package Question1;


public class StackParanthesis {
	public static void main(String [] args) {
		
		String data="{()}{}";
		StackParanthesis obj=new StackParanthesis(); 
		obj.isBalanced(data); 
		 System.out.println(obj.isBalanced(data));

	}
	boolean isBalanced(String data) {
		//giving strian value to check, to check with the string data value in main function
		String openParenthesis="{({";
		//giving the closing value , whether it meets or not with the string data
		String closeParenthesis="})}";
		int size=data.length();
		//calling the stackclass and giving it an object
		stack obj=new stack(size);
		for(int i=0; i<size; i++) {
			char bracket=data.charAt(i);
			//i represnts the number till the forloop is true
			if(openParenthesis.indexOf(bracket)!=-1) {
				//if the index of the bracket is not underflow, or equal to top 
				//than it pushes the brakete
				obj.push(bracket);
			}
			else {
				int index=closeParenthesis.indexOf(bracket);
				char opening=openParenthesis.charAt(index);
				if(obj.pop()!=opening) {
					return false;
				}
				
			}
		}
		if(obj.peak()==-1) {
			return true;
		}
		else {
			return false;
		}
	}
//	public static void main(String[] args) {
//		String data = "{()}[}";
//		StackParanthesis a=new StackParanthesis();
//		System.out.print(a.isBalanced(data));
//	}
//
//	boolean isBalanced(String data) {
//
//		String openparanthesis="[{(";
//		String closedparanthesis="]})";
//		int size= data.length();
//
//		stack stk=new stack(size);
//
//		for(int i=0; i<size;i++) { 
//			char paranthesis = data.charAt(i);
//			if(openparanthesis.indexOf(paranthesis)!=-1) 
//			{
//				stk.push(paranthesis);
//				System.out.println(data);
//			}
//			else
//			{
//				int index=closedparanthesis.indexOf(paranthesis);
//				char opening=openparanthesis.charAt(index);
//				if(stk.pop()!=opening) {
//					return false;
//				}
//			}
//		}
// 
//		if(stk.peak()==-1) {
//			return true;
//		}
//		else{return false;}
//
//
//	}

}
