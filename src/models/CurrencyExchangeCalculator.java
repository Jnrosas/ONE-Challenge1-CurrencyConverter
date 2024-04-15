package models;

import java.util.Map;

public class CurrencyExchangeCalculator {

    private Map<String, Object> conversion_rates;

    public CurrencyExchangeCalculator(Map<String, Object> conversionRates) {
        conversion_rates = conversionRates;
    }

    public double calculateARS2USD(double ars){
        return ars / (Double) conversion_rates.get("ARS");
    }

    public double calculateDollarsToOthers(double usd){
        return usd / (Double) conversion_rates.get("USD");
    }

    public double calculateBRL2USD(double brl){
        return brl / (Double) conversion_rates.get("BRL");
    }

    public double calculateMXN2USD(double mxn) {
        return mxn / (Double) conversion_rates.get("MXN");
    }

    public double calculateCLP2USD(double clp) {
        return clp / (Double) conversion_rates.get("CLP");
    }

    public Map<String, Object> getConversion_rates() {
        return conversion_rates;
    }

    @Override
    public String toString() {
        return "conversion_rates: " + conversion_rates;
    }
}
