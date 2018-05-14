/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.image;

import java.awt.image.ByteLookupTable;
import java.awt.image.LookupTable;

/**
 *
 * @author thejoker
 */
public class imageUtility {
    private LookupTable imageUtility;
    
    private LookupTable seno(double w)
        {
        double K = 255.0; // Cte de normalización
        // Código implementado f(x)=|sin(wx)|

        byte[] lt = new byte[256];
        for (int i = 0; i < 256; ++i)
            lt[i] = (byte)Math.abs(K * Math.sin( w * i ));

        ByteLookupTable slt = new ByteLookupTable(0, lt);
        return slt;
    }
}
