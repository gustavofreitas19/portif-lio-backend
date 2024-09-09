package org.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MeuControlador {

    @GetMapping("/calcular")
    public String calcular(@RequestParam("numero1") int numero1,
                           @RequestParam("numero2") int numero2,
                           @RequestParam("operacao") String operacao) {

        int resultado = 0;

        switch (operacao) {
            case "soma":
                resultado = numero1 + numero2;
                break;
            case "subtracao":
                resultado = numero1 - numero2;
                break;
            case "multiplicacao":
                resultado = numero1 * numero2;
                break;
            case "divisao":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    return "Erro: Divisão por zero!";
                }
                break;
            default:
                return "Operação inválida!";
        }

        return "O resultado da operação é: " + resultado;
    }

}
