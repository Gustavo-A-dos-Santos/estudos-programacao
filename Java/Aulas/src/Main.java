import MyArrayList.MyArrayList;

void main() {
    MyArrayList lista = new MyArrayList(10);
    lista.addFirst(1);
    lista.addLast(2);
    lista.addLast(3);
    lista.insertAt(4, 2);
    lista.display();
    lista.remove(4);
    lista.display();

}