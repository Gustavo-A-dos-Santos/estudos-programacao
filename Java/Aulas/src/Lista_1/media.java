package Lista_1;

public class media {

    public float somaTotal(float[] array){
        float soma = 0;
        for (float i : array){
            soma += i;
        }
        return soma;
    }
    public float value_Media(float soma, float[] array){
        return soma/array.length;
    }
    public int[] reprovados_aprovados(float value_Media, float[] array){
        int aprovados = 0;
        int reprovados = 0;

        for (float i : array){
            if (i >= value_Media){
                aprovados++;
            } else {
                reprovados++;
            }
        }

        return new int[]{aprovados, reprovados};
    }
    public void imp(float[] array){

        float soma = somaTotal(array);
        float mediaN = value_Media(soma, array);
        int[] alunos = reprovados_aprovados(mediaN, array);
        System.out.print("A Lista_1.media e igual a "+mediaN+"\nAprovados:"+alunos[0]+"\nReprovados:"+alunos[1]);
    }
}
/*float[] notas = {7.5f, 4.0f, 9.2f, 5.5f, 8.0f, 6.5f, 3.2f, 10.0f, 7.0f, 5.8f};
    Lista_1.media m = new Lista_1.media();
    m.imp(notas);*/
