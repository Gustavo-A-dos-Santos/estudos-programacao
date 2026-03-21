package Lista_5;

import Lista_4.inverter;

public class atv5_q {
    public static int[] mergeOrdenado(int[] vetor1, int[] vetor2){

        int[] resultado = new int[vetor1.length + vetor2.length];

        int i = 0; // percorre vetor1
        int j = 0; // percorre vetor2
        int k = 0; // percorre resultado

        while(i < vetor1.length && j < vetor2.length){

            if(vetor1[i] <= vetor2[j]){
                resultado[k] = vetor1[i];
                i++;
            }else{
                resultado[k] = vetor2[j];
                j++;
            }

            k++;
        }

        while(i < vetor1.length){
            resultado[k] = vetor1[i];
            i++;
            k++;
        }

        while(j < vetor2.length){
            resultado[k] = vetor2[j];
            j++;
            k++;
        }

        return resultado;
    }

    public static void imprimir_vetor(int[] vetor){
        inverter.imprimir_vetor(vetor);
    }

    public static void main(String[] args){

        atv5 obj = new atv5();

        int[] vetor1 = {1, 20, 50};
        int[] vetor2 = {20, 25, 30, 51};

        imprimir_vetor(vetor1);
        imprimir_vetor(vetor2);

        int[] resultado = mergeOrdenado(vetor1, vetor2);

        imprimir_vetor(resultado);
    }
}
