package ejemploserializacionordenador;

import java.io.Serializable;

/**
 *
 * @author Arturo
 */
public class Teclado implements Serializable{

    private String idioma;

    public Teclado(){
    }

    public Teclado(String idioma){
        this.idioma=idioma;
    }

    public String getIdioma(){
        return idioma;
    }

    public void setIdioma(String idioma){
        this.idioma=idioma;
    }

    @Override
    public String toString(){
        return ("Idioma: "+idioma);
    }
}
