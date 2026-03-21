package Lista_5;

import Lista_4.inverter;

public class atv4 {
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

    public int[] deletarDuplicata(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    array[j] = 0;
                }
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
        vetor = deletarDuplicata(vetor);
        imprimir_vetor(vetor);



    }

}
