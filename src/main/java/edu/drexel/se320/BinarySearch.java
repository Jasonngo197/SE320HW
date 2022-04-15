package edu.drexel.se320;

import java.util.NoSuchElementException;

public class BinarySearch {

    public static <T extends Comparable<T>> int find(T[] array, T elem) {
	// TODO: Implement binary search here. The signature above sets you up to ensure the array elements have a compareTo method
        int left = 0;
        int right = array.length - 1;

        while (right >= left){
            try {
                int mid = (left + (right + 1)) / 2;
                if(array[mid].compareTo(elem) == 0){
                    return mid;
                }
                else if(array[mid].compareTo(elem) < 0){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            } catch (NullPointerException e){
                throw new IllegalArgumentException("The argument is invalid");
            }
        }
        throw new NoSuchElementException("Array is not properly sorted or no such element exist in array");
    }

    public void exampleCalls() {
        // Java generics do not treat primitives the same as object types.
        // To pass a primitive type (int, double, etc.) to the find method, you need to actually use the corresponding "boxed" version (Integer, Double, etc.) which is a class-based version of each primitive.
        // For types which are already/always objects, like String, everything will just work.
        // This method is not part of a test, but just a refresher/crash-course for those who may not have tried passing primitives to generic Java methods previously.

        Integer[] arr = { 0, 1, 2 };
        find(arr, 1);

        String[] arr2 = { "a", "b", "c", "foo" };
        find(arr2, "c");

    }
}
