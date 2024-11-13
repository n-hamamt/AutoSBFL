package example;

public class Refact36 {
	public int method(int[] array) {
		int result = 0;
		boolean found = false;
		for(int i : array) {
			if (found != true) {
				if (i == 0) {
					found = true;
				}
				result = result - i;
			}
		}
		return result;
	}
}
