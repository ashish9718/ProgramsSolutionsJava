package sorting;
//

//import java.util.Arrays;
//
//public class QuickSort {
//
//	public static void main(String[] args) {
//
//		int a[] = { 1, 5, 6, 7, 2, 3, 9 };
//		sort(a, 0, a.length -1);
//		System.out.println(Arrays.toString(a));
//	}
//
//	static void sort(int[] a, int l, int h) {
//
//		if (l < h) {
//			int pivot = partition(a, l, h);
//			sort(a, l, pivot - 1);
//			sort(a, pivot + 1, h);
//		}
//	}
//
//	static int partition(int[] a, int l, int h) {
//
//		int pivot = a[l];
//		int i = l, j = h;
//		while (i < j) {
//			while (a[i] <= pivot)
//				i++;
//			while (a[j] > pivot)
//				j--;
//			if (i < j)
//				swap(a, i, j);
//		}
//		swap(a, l, j);
//		return j;
//	}
//
//	static void swap(int[] a, int i, int j) {
//		a[i] = a[i] ^ a[j];
//		a[j] = a[i] ^ a[j];
//		a[i] = a[i] ^ a[j];
//	}
//}

//Java implementation of QuickSort for last element as pivot
import java.io.*;

class QuickSort {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	static int partition(int[] arr, int low, int high) {

		// pivot
		int pivot = arr[high];

		// Index of smaller element and
		// indicates the right position
		// of pivot found so far
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			// If current element is smaller
			// than the pivot
			if (arr[j] < pivot) {

				// Increment index of
				// smaller element
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {

			// pi is partitioning index, arr[p]
			// is now at right place
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

//Function to print an array
	static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

//Driver Code
	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 7, 2, 3, 9 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);
		printArray(arr, n);
	}
}
