package Lista_2;

public class horas {
    public void calcTmp(int segund){
        int minutos = segund/60;
        segund=segund%60;
        int horas = minutos/60;
        minutos = minutos%60;
        System.out.print(horas+" Lista_2.horas, "+minutos+" minutos, "+segund+" segundos");
    }
}
/*Lista_2.horas h = new Lista_2.horas();
    int segundos = 60;

    h.calcTmp(segundos);*/
