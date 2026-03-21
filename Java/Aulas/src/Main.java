import MyArrayList.MyArrayList;

void main() {
    Scanner sc = new Scanner(System.in);
    MyArrayList lista = new MyArrayList();

    int opcao;

    do {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Add First");
        System.out.println("2 - Add Last");
        System.out.println("3 - Insert At");
        System.out.println("4 - Remove First");
        System.out.println("5 - Remove Last");
        System.out.println("6 - Remove At");
        System.out.println("7 - Remove");
        System.out.println("8 - Find");
        System.out.println("9 - Get");
        System.out.println("10 - Set");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                lista.addFirst();
                break;
            case 2:
                lista.addLast();
                break;
            case 3:
                lista.insertAt();
                break;
            case 4:
                lista.removeFIrst();
                break;
            case 5:
                lista.removeLast();
                break;
            case 6:
                lista.removeAt();
                break;
            case 7:
                lista.remove();
                break;
            case 8:
                lista.find();
                break;
            case 9:
                lista.get();
                break;
            case 10:
                lista.set();
                break;
            case 0:
                System.out.println("Encerrando...");
                break;
            default:
                System.out.println("Opção inválida.");
        }

    } while (opcao != 0);

    sc.close();


}