package Application;


import service.CaixaService;

public class Program {
    public static void main(String[] args) {

        CaixaService service = new CaixaService();

        System.out.print("Valor do Saque: ");
        int valor = service.lerValorInteiro();

        int[] notas = service.sacarDinheiro(valor);
        service.imprimirCedulasSacadas(notas);
    }
}
