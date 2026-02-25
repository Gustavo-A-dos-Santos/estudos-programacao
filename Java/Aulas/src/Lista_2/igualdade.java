package Lista_2;

public class igualdade {

    public void vectIgual(int[] vetor){
        for(int i=0; i<vetor.length; i++){
            int comp=vetor[i];
            for(int j=i+1; j<vetor.length; j++){
                int comp2=vetor[j];
                if (comp==comp2){
                    System.out.print("O vetor possui elementos iguais.");
                    return;
                }
            }
        }
        System.out.print("O vetor nao possui elementos iguais");
    }
}
/*Lista_2.igualdade i = new Lista_2.igualdade();
    int[] vetor = {10,1,2,3,4};
    i.vectIgual(vetor);*/