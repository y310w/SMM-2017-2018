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
 * caso el efecto de hormigueo sobre la imagen
 * @author thejoker
 */
public class RandomOp extends BufferedImageOpAdapter{
    /**
     * Creates new form Infrarojos
     */
    public RandomOp() {
        
    }

    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        for (int x = 0; x < srcRaster.getWidth(); x++) {
            for (int y = 0; y < srcRaster.getHeight(); y++) {
                for (int band = 0; band < srcRaster.getNumBands(); band++) {
                    int sample = srcRaster.getSample(x, y, band);
                    
                    double n = Math.random()*10;
                    
                    double valor = ((255+n)/Math.pow(n, 2)) % 255;
                    
                    
                    sample = (int) ( valor + sample );
                    destRaster.setSample(x, y, band, sample);
                }
            }
        }
        return dest;
    }
}
