package SeleniumTraining2021.SeleniumTraining2021;

public class StringManiupulation {

	public static void main(String[] args) {
		
		String str="Hi imran this is my java code and i am so happy";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('s'));
		//System.out.println(str.indexOf('s', 7));
		System.out.println("----------------");
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		
		System.out.println(str.lastIndexOf('s'));
		
		String dob="20-09-1990";
		String dobconvert=dob.replace("-", "/");
		System.out.println(dobconvert);
		
		String test="  hello  world   ";
		System.out.println(test.replace(" ", ""));
		
		String longMsg="your agreement reference number is 78879988989";
		String testing=longMsg.substring(longMsg.indexOf("is")+3);
		System.out.println(testing);
		
		String mssg="order number";
		String testt=mssg.substring(6);
		System.out.println(testt);
		
		String lang="java-python-ruby-c++";
		String langArr[] =lang.split("-");
		System.out.println(langArr[0]);
		System.out.println(langArr.length);
		
		for(String e:langArr) {
			System.out.println(e);
		}
		
		
		
		String t1="imrankhan";
		String t2="testing";
	
		
		
	}

}
