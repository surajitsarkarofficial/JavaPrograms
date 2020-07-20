package arrays;


/**
 * Write a program to accept an array and a number
 * copy the content of old array to new array
 * when ever the number is found in the array, 0 should be added to the next element in the new array
 * 
 * for example
 * origArray = {1,5,4,6,5,0,7,5};
 * number =5
 * 
 * This mean whenever 5 is found in the array , 0 should be added as next element
 * Expected O/P = 1 5 0 4 6 5 0 0 7 5 0
 * 
 * @author Suro
 *
 */

public class ArrayProgramToAddNewElements {
	
	static int[] origArray = {1,5,4,6,5,0,7,5};
	static int number = 5;

	public static void main(String[] args) {
		
		//Get the count of the 'number' being repeated in the array
		int count=0;
		for(int i =0;i<origArray.length;i++)
		{
			if(origArray[i]==number)
			{
				count++;
			}
		}
		//New array size  = orginal array + count of the 'number' being repeated in the array
		int[] newArray= new int[origArray.length+count];
		
		
		//Traver the original array and construct the new array
		int j=0;
		for(int i =0;i<origArray.length;i++)
		{
			newArray[j]=origArray[i];
			j++;
			
			if(origArray[i]==number)
			{
				newArray[j]=0;
				j++;
			}
		}
		//Print the new array
		for(int i =0;i<newArray.length;i++)
		{
			System.out.print(newArray[i]+ "\t");
		}

	}

}
