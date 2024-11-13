
package proyectolistaenlazadasimplecircular;

public class ProyectoListaEnlazadaSimpleCircular {


    public static void main(String[] args) {
        ListaEnlazadaSimpleCircular miLista = new ListaEnlazadaSimpleCircular();
                       
        miLista.insertarInicio("Maria");
        miLista.InsertarFinal("Pedro");
        miLista.InsertarFinal("Rosario");
        
        
        System.out.println("Tamaño de la lista: " + miLista.tamaño());
        System.out.println("Elementos en la Lista: " +"\n" + miLista.obtenerlista());
        System.out.println("Direcciones: " + miLista.obtenerDirecciones());
       
        miLista.EliminarInicial();
        miLista.EliminarFinal();
        miLista.EliminarFinal();
     
        
        System.out.println("Tamaño de la lista: " + miLista.tamaño());
        System.out.println("Elementos en la Lista: " +"\n" + miLista.obtenerlista());
        System.out.println("Direcciones: " + miLista.obtenerDirecciones());
        
          miLista.EstaListaVacia();
       
    }
    
}
