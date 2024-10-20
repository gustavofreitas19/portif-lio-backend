Método: Selecione POST.
URL: Digite http://localhost:9090/transacoes (ou a porta que você configurou).
Headers: Adicione um header com Content-Type: application/json.
Body: Selecione raw e insira o JSON que representa a transação:
{
"origem": "500-1",
"destino": "320-2",
"valor": 100
}