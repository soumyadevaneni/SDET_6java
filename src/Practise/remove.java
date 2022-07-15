package Practise;

import java.util.Arrays;

public class remove {

	public static void main(String[] args) {
    
		 // Array with duplicate elements
        Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 ,8,8,8,};
 
        // This array has duplicate elements
        System.out.println(origArray.length);
        System.out.println(Arrays.toString(origArray));
 
        Integer[] tempArray = removeDuplicates(origArray);
 
        // Verify the array content
        System.out.println(Arrays.toString(tempArray));
    }
 
    private static Integer[] removeDuplicates(Integer[] origArray) {
 
        Integer[] tempArray = new Integer[origArray.length];
         
        int J = 0;
        for (int i = 0; i < origArray.length - 1; i++) 
        {
            Integer currentElement = origArray[i];
             
            if (currentElement != origArray[i+1]) {
                tempArray[J++] = currentElement;
            }
        }
         
        tempArray[J++] = origArray[origArray.length-1];
         
        return tempArray;
	}

}
