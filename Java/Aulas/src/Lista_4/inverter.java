package Lista_4;

public class inverter {

    public void main(){
        int[] vetor = {10, 20, 30, 40, 50};
        imprimir_vetor(vetor);
        inverter_vetor(vetor);
        imprimir_vetor(vetor);

    }

    public static void  inverter_vetor(int[] vetor){
        for(int i=0; i<vetor.length/2; i++){
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length -(i+1)];
            vetor[vetor.length -(i+1)]=temp;
        }
    }

    public static void imprimir_vetor(int[] vetor){
        for (int i:vetor){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
