package OOP;

/**
 * Represents a temperature conversion utility.
 */
public class TemperatureConverter {
    /**
     * Converts a temperature from Fahrenheit to Celsius.
     * @param fahrenheit the temperature in Fahrenheit
     * @return the temperature in Celsius
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit.
     * @param celsius the temperature in Celsius
     * @return the temperature in Fahrenheit
     */
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }
}
