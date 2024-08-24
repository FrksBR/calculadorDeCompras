import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);
        var listaDeCompras = new ArrayList<Compra>();
        System.out.println("Informe o seu saldo Atual: ");
        var saldo = leitura.nextDouble();
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    1 - Cadastrar nova compra
                    2 - Ver saldo
                    3 - Ver todas as compras
                    0 - Sair""";
            System.out.println(menu);
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do compra: ");
                    var nomeCompra = leitura.next();
                    System.out.println("Digite o valor da compra: ");
                    var valorCompra = leitura.nextDouble();
                        if (valorCompra <= saldo){
                            saldo -= valorCompra;
                            var compra = new Compra(valorCompra, nomeCompra);
                            listaDeCompras.add(compra);
                        }
                        else {
                            System.out.println("Saldo insuficiente!");
                        }
                    break;
                case 2:
                    System.out.println("Seu saldo atual é: " +saldo);
                    break;
                case 3:
                    Collections.sort(listaDeCompras);
                    System.out.println(listaDeCompras);
                    break;
                case 0:
                    System.out.println("Essas são todas as suas compras!");
                    Collections.sort(listaDeCompras);
                    System.out.println(listaDeCompras);
                    System.out.println("Saindo!!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
