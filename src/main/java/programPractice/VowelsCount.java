package programPractice;
/**--Count the vowels in a string

1. string can be anything like "i am a boy" or "Keerthana" or "this is the java programming .m/hd"

approach would be
1. vowels are {a,e,i,o,u} - in char array
2. i need to traverse through the string through each char by char and loop for all the vowels
3. first for loop would be each char of the string and second for loop would be vowels array
4. first i will take the charAt(0) of the string and compare it to the each char of Vowels array
	**/
public class VowelsCount {
	
	int count = 0;

	public static void main(String[] args) {
		VowelsCount vc = new VowelsCount();
		String strInput = "#!#@#@$";
		int vowCount = vc.vowelsCount(strInput);
		System.out.println(vowCount+"---Count");

	}
	
	
	public int vowelsCount(String strString) // change the parameter name "strString"  -> it does not making sense
	{
		if(strString==null) 
			return 0;
		strString = strString.toLowerCase();
		char[] chVow = {'a','e','i','o','u'}; //try to give the properFullName ->  like vowelCharacters or CharVowels
		
		 for(int i = 0; i<strString.length();i++){
			char currentChar = strString.charAt(i);
			switch(currentChar){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				count++;
				break;
			}
		 
		 }
		return count;
		
	}

}
