package example;
public class Refact35_01 {
	public int method(int x, int y) {
		int result = 0;
		int tmp = 0;
		if (x > 0) {
			tmp = y * 2;
			result = y + tmp;
		} else {
			tmp = y * 3;
			result = y + tmp;
		}
		return result;
	}
}
