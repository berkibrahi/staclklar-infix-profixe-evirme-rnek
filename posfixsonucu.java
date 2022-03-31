package profix;

import java.util.Stack;

public class posfixsonucu {
	public static int postfixhesapla(String ifade) {
		Stack<String> stack= new Stack<String>();
		String[] dizi=ifade.split(" ");
		int s1=0,s2=0,s3=0;
		int sonuc;
	for(int i=0;i<dizi.length;i++) {
		//System.out.println(" ** "+dizi[i]);
		String s=dizi[i];
		s.trim();
		//System.out.print(s);
		
		 if(s.equals("+")) {
			s2=Integer.parseInt(stack.pop());
			s1=Integer.parseInt(stack.pop());
			s3=s1+s2;
			stack.push(String.valueOf(s3));
			
		}
		else if(s.equals("-")) {
			s2=Integer.parseInt(stack.pop());
			s1=Integer.parseInt(stack.pop());
			s3=s1-s2;
			stack.push(String.valueOf(s3));
		}
		else if(s.equals("/")) {
			s2=Integer.parseInt(stack.pop());
			s1=Integer.parseInt(stack.pop());
			s3=s1/s2;
			stack.push(String.valueOf(s3));
		}
		else if(s.equals("*")) {
			s2=Integer.parseInt(stack.pop());
			s1=Integer.parseInt(stack.pop());
			s3=s1*s2;
			stack.push(String.valueOf(s3));
			
		}
		else {
			stack.push(s);
		}
	}
	
		 sonuc=Integer.parseInt(stack.pop());
		System.out.println(sonuc);
		
		
		if(!stack.empty())  {
			System.out.println("hatali islemdir");
			return 0;
		}
		
		return sonuc;
	}
	public static void main(String[] args) {
	String ornek="20 6 * 7 * 2 - 7 / 5 5 * + 144 /";
postfixhesapla(ornek);
	}

}
