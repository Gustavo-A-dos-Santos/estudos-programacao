package Lista_2;

public class criptografia {

    public void verSenha(String senha){
        char[] vetorS = senha.toCharArray();
        int tamanho = vetorS.length;
        boolean special = false;
        if (tamanho<8){
            System.out.print("Senha menor que 8 caracteres");
            return;
        }
        for(char c: vetorS){

            if((c >= '!' && c <= '/') || (c >= ':' && c <= '@') || (c >= '[' && c <= '`') || (c >= '{' && c <= '~')){
                special = true;
                break;
            }
        }
        if (!special){
            System.out.print("Sem caracter especial");
            return;
        }
        System.out.print("Senha Segura!!");
    }
}
/*String senha = "Shizukano98";

Lista_2.criptografia c= new Lista_2.criptografia();
c.verSenha(senha);*/
