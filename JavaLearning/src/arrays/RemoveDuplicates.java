package arrays;

public class RemoveDuplicates {
	
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,2,4,3,5,2,1};
		int outputArr[]=null;
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			
			//for the first element , copy it to final array.
			if(i==0)
			{
				outputArr = new int[1];
				outputArr[i]=arr[i];
			}
			else {
				int len =outputArr.length;
				//if not first element, then iterate the final array and check if the output array contains the original array element
				for(int index=0;index<len;index++)
				{
					//If the element is present in the output array then ignore the original array element
					//and proceed for next element from the original array
					if(outputArr[index]==arr[i])
					{
						flag=true;
						break;
					}
				}
				//If the element form the original array is not present in the output array
				if(!flag)
				{
					//Then create a temp array and set length = output array length +1
					int length=outputArr.length+1;
					int[] temp = new int[length];
					//copy all the elements from the output array to the temp array
					for(int ind = 0; ind<outputArr.length;ind++)
					{
						temp[ind]=outputArr[ind];
					}
					//add the original array element to the temp array in the last index.
					temp[outputArr.length]=arr[i];
					
					//assign the elements of temp array to output array
					outputArr=temp;
				}
			}
		}
		
		//print the output array
		for(int i=0;i<outputArr.length;i++)
		{
			System.out.println(outputArr[i]);
		}

	}

}
