
package appdados;

import javax.swing.ImageIcon;


public class ImagenesRes {
    
    public ImageIcon iconimage;
    
    public ImageIcon imagen (int vDados) {
        
        switch (vDados) {
            
             case 1: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Imagenes/1.png")); break;
                    
                    }
            case 2: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Imagenes/2.png")); break;
                    
                    }
            case 3: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Imagenes/3.png")); break;
                    
                    }
            case 4: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Imagenes/4.png")); break;
                    
                    }
            case 5: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Imagenes/5.png")); break;
                    
                    }
            case 6: {
                    iconimage = new ImageIcon(this.getClass().getResource("/Imagenes/6.png")); break;              
                    }                  
        }  
        return iconimage;     
    }   
}
