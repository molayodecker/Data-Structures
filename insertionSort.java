/*
@author: Arthur Decker
@Title:  Insection sort
Category: Data Structures
*/

import java.util.Arrays;

public class insertionSort{

public static void main(String[] args){
	//TODO: data array of unsorted numbers
	int[] data = {9,4,6,2,10,3,8,5,1,7};

	//TODO: Daisychain the method with the constructor
	new insertionSort().sort(data);
	//TODO: Print out the sorted data and trigger the toString method
	System.out.println(Arrays.toString(data));
} 

	public void sort(int[] data){
		for(int i = 0; i < data.length; i++){
	//Assign the first position of the array to the literal variable "current"
			int current = data[i];
    //Subtract one (1) from the i so that "J" will always to point at one less than the cu
    //the current index i is pointing to.		
			int j = i - 1;	
			//While loop will run as long a the index of J is greater than Zero and the Point
			//index of the data array is greater than the current point.	
				while(j >= 0 && data[j] > current){	
				//Assign the Jth position to the array of the Jth position plus one (1)				   
					data [j+1] = data[j];
					//j-1;
					j--;
				}
			data[j+1] = current;
		}
	}	
}


