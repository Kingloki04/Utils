package utils;

/**
 * TODO Write description of GeometryUtils
 */
public class GeometryUtil {

    private GeometryUtil() {}

    public static int rectangleArea(int width, int length) {
        return width * length;
    }

    public static double rectangleArea(double width, double length) {
        return width * length;
    }

    public static int rectanglePerimeter(int width, int length) {
        return width * 2 + length * 2;
    }

    public static double rectanglePerimeter(double width, double length) {
        return width * 2.0 + length * 2.0;
    }
}
