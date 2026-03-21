package Lista_5;

import Lista_4.inverter;

public class atv5 {
    public int[] mergVetor(int[] vetor1, int[] vetor2) {
        int[] new_vetor;
        new_vetor= Juncao(vetor1, vetor2);
        new_vetor = deletarDuplicate(new_vetor);
        ordenarCrescente(new_vetor);
        return new_vetor;
    }
    public int[] deletarDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    array[j] = 0;
                }
            }
        }
        return  Deslocamento(array);
    }
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
    public int[] Juncao(int[] vetor1, int[] vetor2){
        int[] new_vetor = new  int[vetor1.length + vetor2.length];
        for(int i=0; i< vetor1.length; i++){
            new_vetor[i] = vetor1[i];
        }
        for(int i=vetor1.length; i< new_vetor.length; i++){
            new_vetor[i] = vetor2[i-vetor1.length];
        }
        imprimir_vetor(new_vetor);
        return new_vetor;
    }
    public static void imprimir_vetor(int[] vetor){
        inverter.imprimir_vetor(vetor);
    }
    public int[] ordenarCrescente(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length - 1 - i; j++){
                if(vetor[j] > vetor[j + 1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        return vetor;
    }
    public void main(){
        int[] vetor1 = {50, 50, 50, 20, 1};
        int[] vetor2 = {25, 30, 51, 20, 1};
        imprimir_vetor(vetor1);
        imprimir_vetor(vetor2);
        int[] new_vetor = mergVetor(vetor1, vetor2);
        imprimir_vetor(new_vetor);

    }
}
