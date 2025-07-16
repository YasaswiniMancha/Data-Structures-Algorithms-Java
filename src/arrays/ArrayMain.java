package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array lenth n: ");
		int n = sc.nextInt();
		System.out.println("enter your " + n + " elements: ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		} // array scanning

		System.out.println("enter k: ");
		int k = sc.nextInt();
		int kVal = array[k];
		System.out.println("value at kth position of array : " + kVal);

		int arrLength = array.length;
		System.out.println("array length: " + arrLength);

		Arrays.sort(array);
		System.out.println("sorted the array ");

		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

		int index = Arrays.binarySearch(array, 3); // binary search of an element
		System.out.println("found 3 using binary search at index : " + index);

		int[] arr = { 1, 2, 3, 7, 8 };

		System.out.println("is equal? : " + Arrays.equals(array, arr)); // boolean comparison

		System.out.println("converting arr into string :" + Arrays.toString(arr)); // conversion of array to string

		int[] copyArray = Arrays.copyOf(array, arr.length); // creating array copyArray with elements and size of our
															// desired array

		System.out.println("copied array: ");

		for (int i = 0; i < copyArray.length; i++) {
			System.out.println(copyArray[i]);
		}

		System.out.println("fill method on copied array: ");

		Arrays.fill(copyArray, 7); // Fills entire array with given value
		for (int i = 0; i < copyArray.length; i++) {
			System.out.println(copyArray[i]);
		}

		sc.close();

	}

}
