/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

/**
 *
 * @author Arun
 */
import java.util.Arrays;

public class ArrayDoubleTriple {
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] *= 2;
            } else {
                arr[i] *= 3;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        modifyArray(arr);
        System.out.println("Modified array: " + Arrays.toString(arr));
    }
}

   
   
  
   






    

