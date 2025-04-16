package org.example;

public class javaExample {
	
	static int count = 0;

	public static void main(String[] args) {
		String strInput = "i am joly - u";
		int vowCount = vowelsCount(strInput);
		System.out.println(vowCount+"---Count");

	}
	
	
	public static int vowelsCount(String strString) {
		
		char[] chVow = {'a','e','i','o','u'};
		System.out.println(strString.length());
		System.out.println(chVow.length);
		 for(int i = 0; i<strString.length();i++){
		 System.out.println(strString.charAt(i));
			for(int j = 0; j<chVow.length;j++){
				
				if(strString.charAt(i)==chVow[j]){
					count = count+1;
					break;
				}
			}
		 
		 }
		return count;
		
	}

}
