package Infix_Prifix;

import java.util.*;
public class Processing {
     public int stacky(String[] tokens) {
        
             // Initialise the stack and the variable 
            Stack<String> stack = new Stack<String>(); 
            int x, y; 
            String result = ""; 
            int get = 0; 
            String choice; 
            int value = 0; 
            String p = ""; 
      
            // Iterate to each character 
            for (int i = 0; i < tokens.length; i++) { 
                if (!tokens[i].equals("+") && !tokens[i].equals("-")
                    && !tokens[i].equals("*") && !tokens[i].equals("/")) { 
                    stack.push(tokens[i]); 
                    continue; 
                } 
                else { 
                    choice = tokens[i]; 
                } 
      
                // Switch-Case 
                switch (choice) { 
                
                case "+": 
      
                    x = Integer.parseInt(stack.pop()); 
                    y = Integer.parseInt(stack.pop()); 
                    value = x + y; 
                    result = p + value; 
                    stack.push(result); 
                    break; 
      
                case "-": 
                    x = Integer.parseInt(stack.pop()); 
                    y = Integer.parseInt(stack.pop()); 
                    value = x - y; 
                    result = p + value; 
                    stack.push(result); 
                    break; 
      
                case "*": 
                    x = Integer.parseInt(stack.pop()); 
                    y = Integer.parseInt(stack.pop()); 
                    value = x * y; 
                    result = p + value; 
                    stack.push(result); 
                    break; 
      
                case "/":  
      
                    x = Integer.parseInt(stack.pop()); 
                    y = Integer.parseInt(stack.pop()); 
                    value = y / x; 
                    result = p + value; 
                    stack.push(result); 
                    break; 
      
                default: 
                    continue; 
                } 
            } 
      
            // Method to convert the String to integer 
            return Integer.parseInt(stack.pop()); 
        } 

 

}
