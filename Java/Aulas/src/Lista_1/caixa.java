package Lista_1;

public class caixa {
    public void calcTroco(int number){
        int[] notas= {50, 20, 10};
        for(int i : notas){
            if(number/i>0){
                System.out.print(number/i+" notas de "+i);
                number=number%i;
            }
        }
    }
    /*int valor = 100;
    Lista_1.caixa c =new Lista_1.caixa();
    c.calcTroco(valor);*/
}
