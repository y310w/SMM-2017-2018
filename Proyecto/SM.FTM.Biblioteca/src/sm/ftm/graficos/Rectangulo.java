/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase rectangulo que hereda de Shape
 * @author thejoker
 */
public class Rectangulo extends Shape{

    /**
     * Creates new form Rectangulo
     * @param s
     */
    public Rectangulo(sm.ftm.graficos.Shape s){
        super(s);
        this.formainterna = new Rectangle2D.Double(0, 0, 0, 0);
    }
    
    /**
     * Creates new form Rectangulo
     * @param s
     * @param pi
     * @param pf
     */
    public Rectangulo(sm.ftm.graficos.Shape s, Point2D pi, Point2D pf){
        super(s);
        this.pi = pi;
        this.pf = pf;
        double ancho = Math.abs(pf.getX() - pi.getX());
        double alto = Math.abs(pf.getY() - pi.getY());
        this.formainterna = new Rectangle2D.Double(pi.getX(), pi.getY(), 0, 0);
    }
    
    /**
     * Establece el punto final del rectangulo
     * @param pf
     */
    public void setPf(Point2D pf){
        ((Rectangle2D) formainterna).setFrameFromDiagonal(pi, pf);
    }
    
    /**
     * Establece la localización del rectangulo
     * @param p
     */
    public void setLocation(Point2D p){
        ((Rectangle2D) formainterna).setFrame(p, new Dimension((int) ((Rectangle2D) formainterna).getWidth(), (int) ((Rectangle2D) formainterna).getHeight()));
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
