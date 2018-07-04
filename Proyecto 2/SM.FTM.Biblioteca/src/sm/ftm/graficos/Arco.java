/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.Dimension;
import java.awt.geom.Arc2D;
import java.awt.geom.Point2D;

/**
 *
 * @author thejoker
 */
public class Arco extends Shape{

    /**
     * Creates new form Elipse
     * @param s
     */
    public Arco(sm.ftm.graficos.Shape s){
        super(s);
        this.formainterna = new Arc2D.Double();
    }
    
    /**
     * Creates new form Elipse
     * @param s
     * @param pi
     * @param pf
     */
    public Arco(Shape s, Point2D pi, Point2D pf){
        super(s);
        this.pi = pi;
        this.pf = pf;
        double ancho = Math.abs(pf.getX() - pi.getX());
        double alto = Math.abs(pf.getY() - pi.getY());
        this.formainterna = new Arc2D.Double(pi.getX(), pi.getY(), ancho, alto, 90, 90, 0);
    }
    public void setPf(Point2D pf) {
        ((Arc2D) formainterna).setFrameFromDiagonal(pi, pf);
    }

    public void setLocation(Point2D p) {
        ((Arc2D) formainterna).setFrame(p, new Dimension((int) ((Arc2D) formainterna).getWidth(), (int) ((Arc2D) formainterna).getHeight()));
    }
    
    /**
     * Punto inicial del rectangulo
     */
    private Point2D pi;
    
    /**
     * Punto final del rectangulo
     */
    private Point2D pf;
}
