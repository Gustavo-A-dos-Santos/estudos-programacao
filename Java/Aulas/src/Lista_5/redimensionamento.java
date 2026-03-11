package Lista_5;

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
        System.out.println("Array lotado, crie outro");
        return null;
    }
    public void main(){
        int[] vetor = {50, 40, 30, 20, 1};
        adicionar(vetor, 10);
        int[] novo_vetor = novo_array(vetor, 10);


    }
}
