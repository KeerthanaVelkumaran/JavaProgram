package programPractice;
/**--Count the vowels in a string

1. string can be anything like "i am a boy" or "Keerthana" or "this is the java programming .m/hd"

approach would be-----------------------------------------------------------------------------
1. vowels are {a,e,i,o,u} - in char array
2. i need to traverse through the string through each char by char and loop for all the vowels
3. first for loop would be each char of the string and second for loop would be vowels array
4. first i will take the charAt(0) of the string and compare it to the each char of Vowels array
------------------------------------------------------------------------------------------------
	**/
	/**Take aways ----------
	 * 1.Static method / variable declaration make the code static and values will not change dynamically
	 * 2.when i declared the count variable in class level, it is not initializing the value everytime when i called the method VowelsCount so the Unit test got failed ,
	 * mitigation is --i declared the int count =0 inside the method so everytime when we call the mehtod it will initialize the values
	 * 3. if the input is null then and there give the return statement so that u can return zero there itself instead of giving all the code inside if(string!=null)
	 * 4. given an alternative approach of switch case for checking the each character to each vowels. You know vowels are constant and that will not get change everytime
	 * so you can give that in Switchcase and easily increase the count for optimization u can use Switch inside for loop instead of For loop inside For loop
	 * 5. Creating the Objects for the class inside the same class when we cannot call the non static method inside the static method helps u to call the non static method
	 * 6. Creating the object globally for the class in the TestNG class makes the method to be called inside each @test method, Initally it was called without creating the 
	 * object for the class. Directly called using the package.javafilename.methodname, then we declared the object for the class where the method is placed
	 */

public class VowelsCount {
	

	public static void main(String[] args) {
		String strInput = "#!#@#@$";
		VowelsCount objVowelsCount = new VowelsCount();
		int vowelCount = objVowelsCount.vowelsCount(strInput);
		System.out.println(vowelCount+"---Count");

	}
	
	
	public int vowelsCount(String input) {
		int count = 0;
		
		if(input==null)
		return 0;
		
			input = input.toLowerCase();
		
		char[] vowels = {'a','e','i','o','u'};
		
		 for(int i = 0; i<input.length();i++){
		 
			for(int j = 0; j<vowels.length;j++){
				
				if(input.charAt(i)==vowels[j]){
					count = count+1;
					break;
				}
			}
		 
		 }
			
	
	return count;
}

}
