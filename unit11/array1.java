/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit11;

/**
 *
 * @author velmurugan
 */
public class array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//1D ARRAY
         int[] anArray;	        // declare an array of integers

        anArray = new int[10];	// create an array of integers

        // assign a value to each array element and print 
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i;
            System.out.print(anArray[i] + " ");
        }
        System.out.println();
    
    //2d array
    int[][] arr = {
			{1, 2, 3},
			{4, 5, 6, 7},
			null,
			{8, 9}
		};

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; (arr[i] != null && j < arr[i].length); j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}
                //3d array
                 int[][][] test = {
            {
              {1, -2, 3}, 
              {2, 3, 4}
            }, 
            { 
              {-4, -5, 6, 9}, 
              {1}, 
              {2, 3}
            } 
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
}
    }
    

