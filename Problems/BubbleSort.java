/*
  Write a method that takes in an array of ints and uses the Bubble Sort algorithm to sort the array 'in place'
  in ascending order. The method should return the same, in-place sorted array
*/

import java.util.*;
import java.util.streams.*;

public static int[] bubbleSortArray(int[] arr){
    
    int i, j, temp;
    
    for (i = 0; i < ( arr.length - 1 ); i++) {
        for (j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j+1]) {
               temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
        }
    }
    
    return arr;
}

/* 
  BONUS: Bubble Sort in descending order also
*/

import java.util.*;
import java.util.streams.*;

public static int[] bubbleSortArray(int[] arr){
    
    int i, j, temp;
    
    for (i = 0; i < ( arr.length - 1 ); i++) {
        for (j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] < arr[j+1]) {
               temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
        }
    }
    
    return arr;
}
