package profix;

import java.util.Stack;

public class profixana {
	public static int oncelik(char k) {
		 if(k=='+'||k=='-')
			 return 1;
		 if(k=='*'||k=='/')
			 return 2;
		 if(k=='^')
			 return 3;
		 else
			 return -1;
		
	}
		
		
	

	public static void main(String[] args) {
		
		
		
		Stack<Character> yigin=new Stack<>();
		String pox="5*15-12/8+3/2";
		String c="";
		 System.out.println(pox);
		
			
		 for(int i=0;i<pox.length();i++) {
			 char s=pox.charAt(i);
			
			  if(s=='+' || s=='-' ||s=='*'||s=='/')
			  {
				while(!yigin.empty()&&  oncelik(yigin.peek())>=oncelik(s)) {
					
					
						
						
					c=c+yigin.pop();
				}	
					
					System.out.println("??"+yigin.push(s));
				
				  }
				  
			  else {
				 c+=s;
			  }
			 
		 }
			while(!yigin.empty())
			{
				
				c=c+yigin.pop();
			}
		 System.out.println(c);
		 
		 
	}
	
	}

