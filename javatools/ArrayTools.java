package javatools;


public class ArrayTools {

	public static final int ITEM_NOT_FOUND = -1;

	public static int count(byte[] arr, byte item) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				count++;
			}
		}
		return count;
	}

	public static int indexOf(byte[] arr, byte item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return ITEM_NOT_FOUND;
	}

	public static <T> int indexOf(T[] arr, T item) {
		for (int i = 0; i < arr.length; i++) {
			if (item == null && arr[i] == null || (item != null && item.equals(arr[i]))) {
				return i;
			}
		}
		return ITEM_NOT_FOUND;
	}

	public static <T> boolean has(T[] arr, T item) {
		return indexOf(arr, item) != ITEM_NOT_FOUND;
	}

}
