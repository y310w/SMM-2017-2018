/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.geom.Point2D;

/**
 * Clase punto que hereda de Linea
 * @author thejoker
 */
public class Punto extends Linea{

    /**
     * Creates new form Punto
     * @param p
     */
    public Punto(sm.ftm.graficos.Shape p) {
        super(p);
    }
    
    /**
     * Creates new form Punto
     * @param p
     * @param point
     */
    public Punto(sm.ftm.graficos.Shape p, Point2D point){
        super(p,point);
    }
}
