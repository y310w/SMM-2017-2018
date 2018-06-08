/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.imagenOp;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;

/**
 * Clase que define una operación sobre la imagen, en este 
 * caso el efecto de Deutenaropia (Tipo de daltonismo)
 * @author thejoker
 */
public class DeutenaropiaOp extends BufferedImageOpAdapter {

    /**
     * Creates new form Deutenaropia
     */
    public DeutenaropiaOp(){
    }
    
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest){
        if(src == null){
            throw new NullPointerException("src image ins null");
        }       
        
        if(dest == null){
            dest = createCompatibleDestImage(src, null);
        }
        
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        
        int DeuR, DeuG, DeuB;
        
        for(int x = 0; x < src.getWidth(); x++){
            for(int y = 0; y < src.getHeight(); y++){
                int[] pixelComp=null;
                pixelComp = srcRaster.getPixel(x, y, pixelComp);
                
                DeuR = (int) Math.min(255, pixelComp[0]);
                DeuG = (int) Math.min(255, pixelComp[0]);
                DeuB = (int) Math.min(255, pixelComp[2]);
                
                pixelComp[0] = DeuR;
                pixelComp[1] = DeuG; 
                pixelComp[2] = DeuB;
                
                destRaster.setPixel(x, y, pixelComp);
            }
        }
        
        return dest;
    }
}
