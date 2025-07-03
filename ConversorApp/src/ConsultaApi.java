import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;

public class ConsultaApi {
    public TasaDeCambio buscaTasaCambio(String moneda) {
        String apiKey = "012296c6dd1ea75546851b4a";
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moneda.toUpperCase(Locale.ROOT);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TasaDeCambio.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontré esa Tasa de cambio...");
        }
    }
}


