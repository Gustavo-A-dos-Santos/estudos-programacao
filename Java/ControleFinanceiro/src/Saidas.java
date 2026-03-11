import java.util.Scanner;
public class Saidas{
    Scanner input = new Scanner(System.in);
    public double saida(double saldo){
        double saida = input.nextDouble();
        return saldo-=saida;
    }

}
