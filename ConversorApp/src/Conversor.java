public class Conversor {
    private final ConsultaApi consulta = new ConsultaApi();

    public double convertirMoneda(String from, String to, double cantidad) {
        TasaDeCambio tasa = consulta.buscaTasaCambio(from);
        double valorCambio = tasa.getTasa(to);
        return cantidad * valorCambio;
    }
}
