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
 *
 * @author thejoker
 */
public class TintadoOp extends BufferedImageOpAdapter{
    /**
     * Creates new form Sepia
     */
    public TintadoOp(){
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
        
        int sepiaR, sepiaG, sepiaB;
        
        for(int x = 0; x < src.getWidth(); x++){
            for(int y = 0; y < src.getHeight(); y++){
                int[] pixelComp=null;
                pixelComp = srcRaster.getPixel(x, y, pixelComp);
                
                sepiaR = (int) Math.min(255, 0.393 * pixelComp[0] + 0.769 * pixelComp[1] + 0.189 * pixelComp[2]);
                sepiaG = (int) Math.min(255, 0.349 * pixelComp[0] + 0.686 * pixelComp[1] + 0.168 * pixelComp[2]);
                sepiaB = (int) Math.min(255, 0.272 * pixelComp[0] + 0.534 * pixelComp[1] + 0.131 * pixelComp[2]);
                
                pixelComp[0] = sepiaR;
                pixelComp[1] = sepiaG; 
                pixelComp[2] = sepiaB;
                
                destRaster.setPixel(x, y, pixelComp);
            }
        }
        
        return dest;
    }
}
