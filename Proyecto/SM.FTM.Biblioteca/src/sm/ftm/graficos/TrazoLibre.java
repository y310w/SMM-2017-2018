/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase trazo libre que hereda de Shape
 * @author thejoker
 */
public class TrazoLibre extends Shape{

    /**
     * Creates new form TrazoLibre
     * @param s
     * @param p
     */
    public TrazoLibre(Shape s, Point2D p) {
        super(s);
        this.formainterna = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        
        ((GeneralPath) this.formainterna).moveTo(p.getX(), p.getY());
    }
   
    /**
     * Fin del trazo libre
     * @param p
     */
    public void Fin(Point2D p){
        ((GeneralPath) this.formainterna).moveTo(p.getX(), p.getY());
    }
}
