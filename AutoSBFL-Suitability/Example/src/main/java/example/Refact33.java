package example;
public class Refact33 {
	public int method(int value) {
		boolean isPositive = (0 < value);
		boolean isNegative = (value < 0);
		if (isPositive)
			value--;
		else if (isNegative)
			value++;
		return value;
	}
}
