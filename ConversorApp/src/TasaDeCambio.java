import java.util.Map;

public class TasaDeCambio {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public double getTasa(String monedaDestino) {
        Double tasa = conversion_rates.get(monedaDestino.toUpperCase());
        if (tasa == null) {
            throw new IllegalArgumentException("No se encontró la tasa para " + monedaDestino);
        }
        return tasa;
    }
}
