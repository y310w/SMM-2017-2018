/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

/**
 *
 * @author thejoker
 */
public class Curva extends Shape{

    /**
     *
     * @param s
     */
    public Curva(Shape s) {
        super(s);
        this.formainterna = new QuadCurve2D.Double();
        this.puntoCtrl = new Point2D.Double();
        this.puntoF = new Point2D.Double();
    }
    
    /**
     *
     * @param s
     * @param p
     */
    public Curva(Shape s, Point2D p){
        super(s);
        this.formainterna = new QuadCurve2D.Double(p.getX(), p.getY(), p.getX(), p.getY(), p.getX(), p.getY());
    }
    
    /**
     *
     * @param p
     */
    public void setPCtrl(Point2D p){
        this.puntoCtrl = p;
    }
    
    /**
     *
     * @return
     */
    public Point2D getPCtrl(){
        return this.puntoCtrl;
    }
    
    /**
     *
     * @param p
     */
    public void setPf(Point2D p){
        double ancho = Math.abs(((QuadCurve2D)this.formainterna).getX1() - p.getX());
        double alto = Math.abs(((QuadCurve2D)this.formainterna).getY1() - p.getY());
        
        Point2D pf = new Point2D.Double(ancho, alto);
        
        ((QuadCurve2D) this.formainterna).setCurve(((QuadCurve2D) this.formainterna).getP1(), this.puntoCtrl, pf);
        this.puntoF = p;
    }
    
    /**
     *
     * @return
     */
    public Point2D getPf(){
        return this.puntoF;
    }
    
    private Point2D puntoCtrl;
    private Point2D puntoF;
}
