/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author thejoker
 */
public class Elipse extends Shape{
    public Elipse(sm.ftm.graficos.Shape s){
        super(s);
        this.formainterna = new Ellipse2D.Double(0, 0, 0, 0);
    }
    
    public Elipse(Shape s, Point2D pi, Point2D pf){
        super(s);
        this.pi = pi;
        this.pf = pf;
        double ancho = Math.abs(pf.getX() - pi.getX());
        double alto = Math.abs(pf.getY() - pi.getY());
        this.formainterna = new Ellipse2D.Double(pi.getX(), pi.getY(), ancho, alto);
    }
    
    public void setPf(Point2D pf){
        ((Ellipse2D) formainterna).setFrameFromDiagonal(pi, pf);
    }
    
    public void setLocation(Point2D p){
        ((Ellipse2D) formainterna).setFrame(p, new Dimension((int) ((Ellipse2D) formainterna).getWidth(), (int) ((Ellipse2D) formainterna).getHeight()));
    }
    
    private Point2D pi;
    private Point2D pf;
}
