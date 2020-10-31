
package appdados;

import javax.swing.ImageIcon;

public class Imagenes1 {
    
    public ImageIcon iconimage;
    
    public ImageIcon gifDado1 (int Dado1) {
        
        switch (Dado1) {
            
           case 1: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Gifs/dados-01.gif")); break;
                    
                    }
            case 2: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Gifs/dados-02.gif")); break;
                    
                    }
            case 3: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Gifs/dados-03.gif")); break;
                    
                    }
            case 4: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Gifs/dados-04.gif")); break;
                    
                    }
            case 5: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Gifs/dados-05.gif")); break;
                    
                    }
            case 6: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Gifs/dados-06.gif")); break;
                    
                    }
        } 
        return iconimage;  
    } 
}
