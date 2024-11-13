package example;
public class Refact33_01 {
	public int method(int value) {
		if (0 < value)
			value--;
		else if (value < 0)
			value++;
		return value;
	}
}
