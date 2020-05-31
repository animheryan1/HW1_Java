package Part6;

public class CurrencyConverter {

    public double convertDollarToEuro(double dollar) {
        return dollar * 0.9;
    }

    public double convertDollarToDram(double dollar) {
        return dollar * 483.69;
    }

    public double convertDollarToRuble(double dollar) {
        return dollar * 70.38;
    }

    public double convertEuroToDollar(double euro) {
        return euro * 1.11;
    }

    public double convertEuroToDram(double euro) {
        return euro * 537.62;
    }

    public double convertEuroToRuble(double euro) {
        return euro * 78.23;
    }

    public double convertDramToDollar(double dram) {
        return dram * 0.0021;
    }

    public double convertDramToEuro(double dram) {
        return dram * 0.0019;
    }

    public double convertDramToRuble(double dram) {
        return dram * 0.15;
    }

    public double convertRubleToDollar(double ruble) {
        return ruble * 0.014;
    }

    public double convertRubleToEuro(double ruble) {
        return ruble * 0.013;
    }

    public double convertRubleToDram(double ruble) {
        return ruble * 6.87;
    }
}

