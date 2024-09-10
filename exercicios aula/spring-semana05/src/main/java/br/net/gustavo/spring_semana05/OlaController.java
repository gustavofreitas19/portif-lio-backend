package br.net.gustavo.spring_semana05;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
public class OlaController {
    @GetMapping("/ola")
    public String olaMundo(){
        return "ola mundo!";
    }
    @GetMapping("/temperatura")
    public double convertTermperatura (@RequestParam double fahrenheit){
        double celcuis = (fahrenheit-32) * (5.0/9.0);
        return celcuis;
    }
    @GetMapping("/pdf")
    public ResponseEntity<InputStreamResource> gerarPDF() throws IOException {
        PDDocument documento = new PDDocument();  //instancia um documento PDF

        PDPage pagina = new PDPage(); //instancia uma pagina em branco

        documento.addPage(pagina);

        PDPageContentStream escritor = new PDPageContentStream(documento, pagina);
        PDType1Font fonte = new PDType1Font(Standard14Fonts.FontName.TIMES_BOLD);

        escritor.setFont(fonte, 18.5f);
        escritor.beginText();
        escritor.newLineAtOffset(25, 500);
        escritor.showText("suave rapaze");
        escritor.newLine();
        escritor.endText();
        escritor.close();
        documento.close();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        documento.save(outputStream);
        byte[] binario = outputStream.toByteArray();

        ByteArrayInputStream InputStream = new ByteArrayInputStream(binario);
        InputStreamResource resource = new InputStreamResource(InputStream);

        return ResponseEntity.status(201).contentType(MediaType.APPLICATION_PDF).body(resource);

    }

}
