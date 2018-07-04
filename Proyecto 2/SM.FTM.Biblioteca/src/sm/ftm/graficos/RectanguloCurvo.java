/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author thejoker
 */
public class RectanguloCurvo extends Shape{

    /**
     * Creates new form Rectangulo
     * @param s
     */
    public RectanguloCurvo(sm.ftm.graficos.Shape s){
        super(s);
        this.formainterna = new RoundRectangle2D.Double();
    }
    
    /**
     * Creates new form Rectangulo
     * @param s
     * @param pi
     * @param pf
     */
    public RectanguloCurvo(sm.ftm.graficos.Shape s, Point2D pi, Point2D pf){
        super(s);
        this.pi = pi;
        this.pf = pf;
        double ancho = Math.abs(pf.getX() - pi.getX());
        double alto = Math.abs(pf.getY() - pi.getY());
        this.formainterna = new RoundRectangle2D.Double(pi.getX(), pi.getY(), 0, 0,10,10);
    }
 
    /**
     * Establece el punto final del rectangulo
     * @param pf
     */
    public void setPf(Point2D pf){
        ((RoundRectangle2D) formainterna).setFrameFromDiagonal(pi, pf);
    }
    
    /**
     * Establece la localización del rectangulo
     * @param p
     */
    public void setLocation(Point2D p){
        ((RoundRectangle2D) formainterna).setFrame(p, new Dimension((int) ((RoundRectangle2D) formainterna).getWidth(), (int) ((RoundRectangle2D) formainterna).getHeight()));
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
