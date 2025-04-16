package org.example;
/**--Count the vowels in a string

1. string can be anything like "i am a boy" or "Keerthana" or "this is the java programming .m/hd"

approach would be
1. vowels are {a,e,i,o,u} - in char array
2. i need to traverse through the string through each char by char and loop for all the vowels
3. first for loop would be each char of the string and second for loop would be vowels array
4. first i will take the charAt(0) of the string and compare it to the each char of Vowels array
	**/
public class javaExample {
	
	static int count = 0;

	public static void main(String[] args) {
		String strInput = "i am joly - u";
		int vowCount = vowelsCount(strInput);
		System.out.println(vowCount+"---Count");

	}
	
	
	public static int vowelsCount(String strString) {
		
		char[] chVow = {'a','e','i','o','u'};
		
		 for(int i = 0; i<strString.length();i++){
		 
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
