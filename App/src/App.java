public class App {
    public static void main(String[] args) throws Exception {
        
        SinglyLinkedList lista = new SinglyLinkedList();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.mostrar();
        lista.insertar(5);
        lista.mostrar();

        if (lista.valoraBuscar(5)){
            System.out.println(lista);
        }else{
            System.out.println("No se encontro nadotaaaa");
        }
    }
}
