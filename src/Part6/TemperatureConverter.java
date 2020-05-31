package Part6;

public class TemperatureConverter {

    public double convertFarenheitToCelsius(double tempFarenheit) {
        return (tempFarenheit - 32) * 5 / 9;
    }

    public double convertFarenheitToKelvin(double tempFarenheit) {
        return (tempFarenheit - 32) * 5 / 9 + 273.15;
    }

    public double convertCelsiusToFarenheit(double tempCelsius) {
        return (tempCelsius * 9 / 5) + 32;
    }

    public double convertCelsiusToKelvin(double tempCelsius) {
        return tempCelsius + 273.15;
    }

    public double convertKelvinToFarenheit(double tempKelvin) {
        return (tempKelvin - 273.15) * 9 / 5 + 32;
    }

    public double convertKelvinToCelsius(double tempKelvin) {
        return tempKelvin - 273.15;
    }
}
