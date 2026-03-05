package Lista_5;

import Lista_4.inverter;



public class DescolamentoElemento {
    public void main(){
        int[] vetor = {50, 40, 30, 20, 10};
        int num = 25;
        int[] vetor_novo =Deslocamento(vetor, num, IndiceDesloq(vetor, num));
        imprimir_vetor(vetor);
        imprimir_vetor(vetor_novo);

    }
    public int IndiceDesloq(int[] vetor, int num){
        for(int i=0; i<vetor.length;i++){
            if(vetor[i]<num){
                return i;
            }
        }
        return vetor.length;
    }
    public int[] Deslocamento(int[] vetor, int num, int indice){
        int[] vetor_novo = new int[vetor.length+1];
        for(int i=0; i<vetor_novo.length; i++){
            if(i<indice){
                vetor_novo[i] = vetor[i];
            } else if (i==indice) {
                vetor_novo[i] = num;
            } else{
                vetor_novo[i] = vetor[i-1];
            }
        }
        return vetor_novo;
    }
    public static void imprimir_vetor(int[] vetor){
        inverter.imprimir_vetor(vetor);
    }
}
