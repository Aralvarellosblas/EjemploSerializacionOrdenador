package ejemploserializacionordenador;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Arturo
 */
public class MeuObjectOutputStream extends ObjectOutputStream{

    // constructores :
    public MeuObjectOutputStream() throws IOException{

    }

    public MeuObjectOutputStream(OutputStream ou) throws IOException{
        super(ou);
    }

    /* redefinición do método que escribe a cabeceira para que non faga nada */
    @Override
    protected void writeStreamHeader() throws IOException{
    }

}
