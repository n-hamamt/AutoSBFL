package example;
public class Refact37_01 {
	public int method(int x, int y) {
		int result = 0;
		if (x > 0)
			result = -10;
		else if (y > 0)
			result = -20;
		else
			result = -30;
		return result;
	}
}
