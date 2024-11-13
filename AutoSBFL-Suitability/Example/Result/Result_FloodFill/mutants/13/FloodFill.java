package example;

public final class FloodFill {
    private FloodFill() {
    }

    public static int getPixel(final int[][] image, final int x, final int y) {
        return image[x][y];
    }

    public static void putPixel(final int[][] image, final int x, final int y, final int newColor) {
        image[x][y] = newColor;
    }

    public static void floodFill(final int[][] image, final int x, final int y, final int newColor, final int oldColor) {
        if (y >= image[x].length) {
            return;
        }

        putPixel(image, x, y, newColor);

        /* Recursively check for horizontally & vertically adjacent coordinates */
        floodFill(image, x + 1, y, newColor, oldColor);
        floodFill(image, x - 1, y, newColor, oldColor);
        floodFill(image, x, y + 1, newColor, oldColor);
        floodFill(image, x, y - 1, newColor, oldColor);

        /* Recursively check for diagonally adjacent coordinates  */
        floodFill(image, x + 1, y - 1, newColor, oldColor);
        floodFill(image, x + 1, y + 1, newColor, oldColor);
        floodFill(image, x + 1, y + 1, newColor, oldColor);
        floodFill(image, x - 1, y - 1, newColor, oldColor);
    }
}