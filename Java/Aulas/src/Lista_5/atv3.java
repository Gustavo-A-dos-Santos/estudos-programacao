package Lista_5;

import Lista_4.inverter;

public class atv3 {

    public int[] Deslocamento(int[] vetor){
        for(int i=0; i<vetor.length; i++){
            if(vetor[i]==0){
                for(int j=i+1; j<vetor.length; j++){
                    if(vetor[j]!=0){
                        vetor[i]=vetor[j];
                        vetor[j]=0;
                        break;
                    }
                }
            }
        }
        return vetor;
    }

    public int[] deletar(int[] array, int del) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == del) {
                array[i] = 0;
            }
        }
        return  Deslocamento(array);
    }
    public static void imprimir_vetor(int[] vetor){
        inverter.imprimir_vetor(vetor);
    }
    public void main(){
        int[] vetor = {50, 50, 50, 20, 1};
        imprimir_vetor(vetor);
        vetor = deletar(vetor, 20);
        imprimir_vetor(vetor);



    }


}
