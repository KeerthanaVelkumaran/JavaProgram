package programPractice;

public class MoveZeroToLeftRight {

    /**Move Zero to left/Right side of array
     Input: [1,0,3,4,0,7] -> Output: [1,3,4,7,0,0] */

    public static void main(String[] args) {
		int[] arrayInput = {1,0,3,4,0,0,7};
        MoveZeroToLeftRight objRef = new MoveZeroToLeftRight();
        int output[] = objRef.moveZerosToFront(arrayInput);
        

        for(int num : output){
            System.out.print(num+" ");
        }
        

	}

    public int[] moveZerosToEnd(int[] inputArray){
        
        int lengthOfArray = inputArray.length;
        int j = 0;
        int[] finalArray = new int[lengthOfArray];
        for(int i=0;i<lengthOfArray;i++){

            if(inputArray[i]!=0){
                finalArray[j++] = inputArray[i];
            }

        }
        while(j<lengthOfArray){
            finalArray[j++] = 0; 

        }

        return finalArray;

    }

    public int[] moveZerosToFront(int[] inputArray){
        
        int lengthOfArray = inputArray.length;
        int j = 0;
        int[] finalArray = new int[lengthOfArray];
        for(int i=0;i<lengthOfArray;i++){

            if(inputArray[i]==0){
                finalArray[j++] = 0;
            }

        }
        for(int i=0;i<lengthOfArray;i++){

            if(inputArray[i]!=0){
                finalArray[j++] = inputArray[i];
            }

        }

        return finalArray;

    }




}
