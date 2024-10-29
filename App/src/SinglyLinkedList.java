public class SinglyLinkedList {
    Nodo cabeza;

    SinglyLinkedList() {
        this.cabeza = null;
    }

    public void insertar(Integer valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + "->");
            temp = temp.siguiente;
        }
        System.out.println(" NULL ");
    }

    public boolean valoraBuscar(Integer conseguir) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.dato == conseguir) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
        
    }
}
