package Lista_5;

import Lista_4.inverter;

public class redimensionamento {
    public int[] novo_array(int[] array, int add) {
        int[] novo_array = new int[array.length * 2];
        for(int i = 0; i < array.length; i++){
            novo_array[i] = array[i];
        }
        novo_array[array.length] = add;
        return novo_array;
    }

    public int[] adicionar(int[] array, int add) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = add;
                return array;
            }
        }
        return  novo_array(array, add);
    }
    public static void imprimir_vetor(int[] vetor){
        inverter.imprimir_vetor(vetor);
    }
    public void main(){
        int[] vetor = {50, 40, 30, 20, 1};
        imprimir_vetor(vetor);
        vetor = adicionar(vetor, 10);
        imprimir_vetor(vetor);



    }
}
