import java.util.ArrayList;
import java.util.List;

//FIRST IN FIRST OUT
public class Main {
    public static void main(String[] args) {

        //Guardar distintos objetos de tipo persona en el ArrayList
        //Arreglo (lista) de objetos
        List<Persona> lista = new ArrayList<Persona>();
        //Agregar Personas (elementos)
        lista.add(new Persona(1, "Jesu", 26));
        lista.add(new Persona(2,"orlando", 30));
        lista.add(new Persona(3, "Jose", 55));
        lista.add(new Persona(4, "Maria", 53));
        lista.add(new Persona(5, "Luis", 78));

        //Recorrer por indice (for simple)
                                    //tamaño = size
        //indice inicia en 0

        System.out.println("-------FOR--------");
        for (int i = 0; i < lista.size(); i++){
                                            //posicion de la persona
                                                        //obtiene el nombre de la persona en la posicion en la que esta
            System.out.println("prueba: " + lista.get(i).getNum() + lista.get(i).getNombre() + lista.get(i).getEdad());
            //System.out.println("-------");
            //System.out.println(lista.get(i));

        }

        System.out.println("-------FOREACH--------");
        //Recorrer por foreach (foreach = por cada (uno))
            //Por cada Persona creada "persona" dentro de la lista
        for (Persona persona: lista){
            System.out.println("prueba: " + persona.getNombre());
        }


    }
}

/*
    COLECCIONES:

        -Son estructuras similares a los arreglos pero su principal característica es que son dinámicos,
         su tamaño y cantidad de elementos puede variar en el tiempo.
        -En java, se emplean mediante la INTERFAZ "Collections", que permite implementar una serie de métodos comunes
         como son: AÑADIR, ELIMINAR, OBTENER EL TAMAÑO DE LA COLECCIÓN, etc.
        -Tienen el tamaño que se quiera y la capacidad de manera dinamica ajustandose a lo que se requiera.

        Tipos principales de Collections:
            -LIST           De los mas utilizados
            -SET
            -QUEUE
            -MAP            De los mas utilizados


        *ARRAYLIST:
            -Las lista son un conjunto de elementos relacionados entre si que tienen un determinado orden.
            -Su tamaño es dinámico (puede cambiar en el tiempo).

            *CARACTERISTICAS:
                >Es un tipo de CLASE ESPECIAL que se representa como una matriz dinámica qu e permite almacenar elementos.
                >Hereda de la clase AbstractList, la cual implementa la Interfaz List.
                >Permite colecciones o elementos duplicados.
                >El orden de los registros es el orden que fueron insertados.
                >Permite acceso aleatorio (tiene índice)
                >Manipulacion lenta (se necesita recorrer todo el arraylist para hacer un cambio).

            -En java existen diferentes tipos de listas:
                +ArrayList  (FIFO)
                +LinkedList (FIFO)
                +Stack      (LIFO)

            Tipo de orden que pueden tener las listas:
                -FIFO: First in First Out (El primero en entrar es el primero en salir)
                -LIFO: Last in First Out (El ultimo que entro va a ser el primero en salir)


*/