package SeleniumTraining2021.SeleniumTraining2021;

public class ReverseString {

	public static void main(String[] args) {
		

//	System.out.println(reverseText("imrankhan"));
//	
//	System.out.println(reverseText("selenium"));
	
	String s="testing";
	StringBuilder sb=new StringBuilder(s);
	System.out.println(sb.reverse());
}
	
public static String reverseText(String value) {
		
		//String text=value;
		int len=value.length();
		
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
		
			rev=rev+value.charAt(i);
			
}
		return rev;
	}
}

