package example;

public class Refact36_02 {
	public int method(int[] array) {
		int result = 0;
		for(int i : array) {
			if (i == 0) {
				break;
			}
			result = result + i;
		}
		return result;
	}
}
