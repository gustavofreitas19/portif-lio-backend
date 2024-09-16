package com.example.exercicio08;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class meuControlador {
    public String consultarFipe(String marca, String modelo, String ano) {
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            // Crie a URL da API da FIPE
            String url = "https://veiculos.fipe.org.br/api/v1/carros/marcas/"+marca+"/modelos/"+ modelo+"/anos/"+ano;

            // Crie a requisição GET
            HttpGet request = new HttpGet(url);

            // Execute a requisição
            org.apache.http.HttpResponse response = httpClient.execute(request);

            // Verifique se a requisição foi bem-sucedida
            if (response.getStatusLine().getStatusCode() == 200) {
                // Obtenha a resposta JSON
                String jsonResponse = EntityUtils.toString(response.getEntity());

                // Processe a resposta JSON
                ObjectMapper objectMapper = new ObjectMapper();
                FipeResponse fipeResponse = objectMapper.readValue(jsonResponse, FipeResponse.class);

                // Retorne o valor da tabela FIPE
                return fipeResponse.getValor();
            } else {
                return "Erro na requisição: " + response.getStatusLine().getStatusCode();
            }
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }
}
