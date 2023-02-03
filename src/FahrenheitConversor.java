package src;

public class FahrenheitConversor {
    public static final double ABSOLUTE_ZERO_TEMPERATURE = 459.67;

    public static final int WATER_FUSION_TEMPERATURE = 32;

    public static final double CONVERSION_RATIO = 1.8;

    public static void toCelsius(double fahrenheit) {
        System.out.println((fahrenheit - WATER_FUSION_TEMPERATURE) * CONVERSION_RATIO);
    }

    public static void toKelvin(double fahrenheit) {
        System.out.println((fahrenheit + ABSOLUTE_ZERO_TEMPERATURE) * CONVERSION_RATIO);
    }
}
