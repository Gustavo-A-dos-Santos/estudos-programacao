import java.util.Scanner;
public class Menu {
    Scanner entrada = new Scanner(System.in);
    public int Interface(){
        System.out.print("Digite o numero da lista de exercicio:\n1, 2, 3 e 4 disponiveis");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1 -> System.out.print("Escolha o exercicio: 1 ou 2");
        }
        return opcao;
    }
}
