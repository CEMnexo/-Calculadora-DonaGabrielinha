import java.util.Scanner;

public class CalculadoraMenu {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Menu();
    }

    public static void ValidarResp(int resp) {
        if(resp == 1){
            PreçoTotal();
        }else if(resp == 2){
            CalcularTroco();
        }
    }

    public static void Menu() {
        Scanner scan = new Scanner(System.in);
        int resp = 1000;
        do{
        System.out.println("-----------Menu-----------");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");
        resp = scan.nextInt();
        scan.nextLine();
        ValidarResp(resp);
        }while (resp != 3);
        System.out.println("Obrigado por utilizar a calculadora!!!");
    }

    public static void PreçoTotal() {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----Calcular-Preço-Total-----");
        System.out.println("Adicione a quantidade de plantas vendidas");
        int quantPlant = scan.nextInt();
        scan.nextLine();
        System.out.println("Adicione o preco da plantas vendida");
        double precoPlant = scan.nextDouble();
        scan.nextLine();
        double resultTotal = quantPlant * precoPlant;

        System.out.printf("O preco total da venda sera %.2f%n", resultTotal);
    }

    public static void CalcularTroco(){
        Scanner scan = new Scanner(System.in);

        System.out.println("-----Calcular-Troco-----");
        System.out.println("O preco que o cliente pagou");
        double precoCliente = scan.nextDouble();
        scan.nextLine();
        System.out.println("adicione o total da venda");
        double precoTotal = scan.nextDouble();
        scan.nextLine();

        double troco = precoCliente - precoTotal;
        if(troco > 0){
            System.out.printf("Voce deve %.2f de troco!%n", troco);
        }else if(troco < 0){
            System.out.printf("O cliente ainda deve %.2f%n", troco);
        }else if(troco == 0){
            System.out.println("Ninguem deve nada!!!");
        }
    }
}