/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase curva que hereda de Shape
 * @author thejoker
 */
public class Curva extends Shape{

    /**
     * Creates new form Curva
     * @param s
     */
    public Curva(Shape s) {
        super(s);
        this.formainterna = new QuadCurve2D.Double();
    }
    
    /**
     * Creates new form Curva
     * @param s
     * @param p
     */
    public Curva(Shape s, Point2D p){
        super(s);
        this.puntoCtrl = new Point2D.Double(20,20);
        this.formainterna = new QuadCurve2D.Double(p.getX(), p.getY(), p.getX(), p.getY(), p.getX(), p.getY());
    }
    
    
    /**
     * Establece el punto de control de la curva
     * @param p
     */
    public void setPCtrl(Point2D p){
        this.puntoCtrl = p;
        ((QuadCurve2D) this.formainterna).setCurve(((QuadCurve2D) this.formainterna).getP1(), p, ((QuadCurve2D) this.formainterna).getP2());
    }
    
    /**
     * Devuelve el punto de control de la curva
     * @return
     */
    public Point2D getPCtrl(){
        return this.puntoCtrl;
    }
    
    /**
     * Establece el punto final de la curva
     * @param p
     */
    public void setPf(Point2D p){
        double ancho = Math.abs(((QuadCurve2D)this.formainterna).getX1() - p.getX());
        double alto = Math.abs(((QuadCurve2D)this.formainterna).getY1() - p.getY());
        
        Point2D pf = new Point2D.Double(ancho, alto);
        
        ((QuadCurve2D) this.formainterna).setCurve(((QuadCurve2D) this.formainterna).getP1(), this.puntoCtrl, pf);
    }
    
    /**
     * Establece la localización de la curva
     * @param p
     */
    public void setLocation(Point2D p){
        Point2D pinicial = ((QuadCurve2D) this.formainterna).getP1();
        Point2D pctrl = ((QuadCurve2D) this.formainterna).getCtrlPt();
        Point2D pfin = ((QuadCurve2D) this.formainterna).getP2();

        double dx = p.getX() - pinicial.getX();
        double dy = p.getY() - pinicial.getY();
        
        ((QuadCurve2D) this.formainterna).setCurve(p.getX(), p.getY(),pctrl.getX() + dx, pctrl.getY() + dy, pfin.getX() + dx, pfin.getY() + dy);
    }
    
    /**
     * Punto inicial de la curva
     */
    private Point2D puntoCtrl;
}
