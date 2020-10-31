
package appdados;

import java.util.Random;

public class Generanum {
    
    public int valortira;
    
    public int calculonumero () {
        
        Random Generar = new Random();
        valortira = Generar.nextInt(6)+1;
        
        return valortira;
        
    }
    
}
