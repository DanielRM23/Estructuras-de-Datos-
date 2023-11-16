
/**
 * Clase de prueba para la clase Grafica.
 * Permite demostrar el uso de la clase Grafica y su algoritmo BFS.
 */
import java.util.LinkedList;

public class PruebaGrafica {
    /**
     * Método principal que crea una instancia de Grafica, realiza operaciones
     * como insertar vértices y aristas, imprime información sobre la gráfica,
     * aplica el algoritmo BFS y muestra la información actualizada.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Grafica<Integer> g = new Grafica<>();
        try {
            g.insertarVertice("v1", 5);
            g.insertarVertice("v2", 7);
            g.insertarVertice("v3", 9);
            g.insertarVertice("v4", 2);
            g.insertarVertice("v5", 0);
            g.insertarVertice("v6", 4);
            g.insertarVertice("v7", 8);
            g.insertarVertice("v8", 1);
            g.insertarVertice("v9", 3);
            g.insertarVertice("v10", 6);
            g.insertarArista("v1", "v3");
            g.insertarArista("v1", "v5");
            g.insertarArista("v1", "v7");
            g.insertarArista("v1", "v9");
            g.insertarArista("v2", "v1");
            g.insertarArista("v2", "v3");
            g.insertarArista("v2", "v4");
            g.insertarArista("v4", "v3");
            g.insertarArista("v5", "v7");
            g.insertarArista("v6", "v8");
            g.insertarArista("v7", "v9");
            g.insertarArista("v8", "v9");
            g.insertarArista("v9", "v2");
            System.out.println("G := (V, E), donde");
            LinkedList<Grafica<Integer>.Vertice> vertices = g.darVertices();
            LinkedList<Grafica<Integer>.Arista> aristas = g.darAristas();
            int orden = g.darOrden();
            int tamano = g.darTamano();
            System.out.print("  V := { ");
            int i = 1;
            for (Grafica.Vertice v : vertices) {
                if (i != orden) {
                    System.out.print(v.toString() + ", ");
                    i++;
                } else {
                    System.out.println(v.toString() + " }");
                }
            }
            System.out.print("  E := { ");
            int j = 1;
            for (Grafica.Arista e : aristas) {
                if (j != tamano) {
                    System.out.print(e.toString() + ", ");
                    j++;
                } else {
                    System.out.println(e.toString() + " }");
                }
            }
            System.out.println("El orden de G es " + orden);
            System.out.println("El tamano de G es " + tamano);

            g.algoritmoBFS("v5");

            // Después de g.algoritmoBFS("v5");
            System.out.println("Vértices de la gráfica después de aplicar BFS");
            System.out.print("  V := { ");
            int i1 = 1;
            for (Grafica.Vertice v : vertices) {
                if (i1 != orden) {
                    System.out.print(v.toString() + ", ");
                    i1++;
                } else {
                    System.out.println(v.toString() + " }");
                }
            }

        } catch (Exception error) {
            System.out.println(error);
        }
    }
}
