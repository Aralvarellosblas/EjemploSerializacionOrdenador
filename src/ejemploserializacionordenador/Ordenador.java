package ejemploserializacionordenador;

import java.io.Serializable;

/**
 *
 * @author Arturo
 */
public class Ordenador implements Serializable{
    private Cpu procesador;
    private Pantalla pantalla;
    private Rato rato;
    private Teclado teclado;
    
    public Ordenador(Cpu proce, Pantalla pantalla, Rato rato, Teclado tec){
        procesador=proce;
        this.pantalla=pantalla;
        this.rato=rato;
        this.teclado=tec;
    }

    public Ordenador(){
        procesador=new Cpu();
        pantalla=new Pantalla();
        rato=new Rato();
    }

    public Cpu getProcesador(){
        return procesador;
    }

    public void setProcesador(Cpu procesador){
        this.procesador=procesador;
    }

    public Pantalla getPantalla(){
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla){
        this.pantalla=pantalla;
    }

    public Rato getRato(){
        return rato;
    }

    public void setRato(Rato rato){
        this.rato=rato;
    }

    @Override
    public String toString(){
        return ("Ordenador: \nProcesador = "+procesador+"\nPantalla = "+pantalla+"\nRato = "+rato+"\nTeclado = "+teclado);
    }
    
    
}
