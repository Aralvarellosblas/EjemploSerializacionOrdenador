package ejemploserializacionordenador;

/**
 *
 * @author Arturo
 */
public class EjemploSerializacionOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m=new Metodos();
        m.escribeFichero("ordenadores.dat");
        //m.engadeFicheiro("ordenadores.dat");
        m.lerFicheiro("ordenadores.dat");
    }

}
