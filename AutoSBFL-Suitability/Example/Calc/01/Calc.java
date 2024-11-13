package example;
public class Calc {
    public int calcMain(int a, int b, char c) {
        int result = 0;
        if(c == '+'){
            result = sum(a, b);
        }
        else if(c == '-'){
            result = difference(a, b);
        }
        return result;
    }

    public int sum(int a, int b) {
        return a + b;
    }
    public int difference(int a, int b) {
        return a - b;
    }
}