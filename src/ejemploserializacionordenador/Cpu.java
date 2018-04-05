package ejemploserializacionordenador;

import java.io.Serializable;

/**
 *
 * @author Arturo
 */
public class Cpu implements Serializable{

    private int memoria, velocidade;

    public Cpu(){
    }

    public Cpu(int memoria, int velocidade){
        this.memoria=memoria;
        this.velocidade=velocidade;
    }

    public int getMemoria(){
        return memoria;
    }

    public void setMemoria(int memoria){
        this.memoria=memoria;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }

    @Override
    public String toString(){
        return ("Memoria: "+memoria+", Velocidade: "+velocidade);
    }
}
