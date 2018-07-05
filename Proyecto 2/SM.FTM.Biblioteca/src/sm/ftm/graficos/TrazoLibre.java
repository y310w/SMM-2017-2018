/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
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
        pinicial = p;
    }
   
    /**
     * Punto final del trazo libre
     * @param p
     */
    public void setPf(Point2D p){
        ((GeneralPath) this.formainterna).lineTo(p.getX(), p.getY());
    }
    
    public void setLocation(Point2D p){
        Point2D pfin = ((GeneralPath) this.formainterna).getCurrentPoint();
        
        double dinicialx = p.getX() - pinicial.getX();
        double dinicialy = p.getY() - pinicial.getY();
        double dfinx;
        double dfiny;
        
        if(pinicial.distance(pfin) <= 5.0){
            dfinx = pfin.getX() - 2*pinicial.getX();
            dfiny = pfin.getY() - 2*pinicial.getY();
        }else{
            dfinx = pfin.getX() - 2*((GeneralPath) this.formainterna).getBounds().width;
            dfiny = pfin.getY() - 2*((GeneralPath) this.formainterna).getBounds().height;
        }
        
        ((GeneralPath) this.formainterna).transform(AffineTransform.getTranslateInstance(dinicialx - dfinx,dinicialy - dfiny));
    }
    
    /**
     * Punto inicial de la curva
     */
    private Point2D pinicial;
}
