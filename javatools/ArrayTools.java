package javatools;

public class ArrayTools {

	public static int count(byte[] bytes, byte b) {
		int count = 0;
		for (int i = 0; i < bytes.length; i++) {
			if (bytes[i] == b) {
				count++;
			}
		}
		return count;
	}

}
