/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;


import java.awt.geom.CubicCurve2D;
import java.awt.geom.Point2D;

/**
 *
 * @author thejoker
 */
public class Curva2 extends Shape{
    /**
     * Creates new form Curva
     * @param s
     */
    public Curva2(Shape s) {
        super(s);
        this.formainterna = new CubicCurve2D.Double();
    }
    
    /**
     * Creates new form Curva
     * @param s
     * @param p
     */
    public Curva2(Shape s, Point2D p){
        super(s);
        this.puntoCtrl = new Point2D.Double(20,20);
        this.puntoCtrl1 = new Point2D.Double(30,30);
        this.formainterna = new CubicCurve2D.Double(p.getX(), p.getY(), p.getX(), p.getY(),  p.getX(), p.getY(), p.getX(), p.getY());
    }
    
    
    /**
     * Establece el punto de control de la curva
     * @param p
     */
    public void setPCtrl(Point2D p){
        this.puntoCtrl = p;
        ((CubicCurve2D) this.formainterna).setCurve(((CubicCurve2D) this.formainterna).getP1(), p, ((CubicCurve2D) this.formainterna).getCtrlP2(), ((CubicCurve2D) this.formainterna).getP2());
    }
    
    /**
     * Devuelve el punto de control de la curva
     * @return
     */
    public Point2D getPCtrl(){
        return this.puntoCtrl;
    }
    
    /**
     * Establece el segundo punto de control de la curva
     * @param p
     */
    public void setPCtrl1(Point2D p) {
        this.puntoCtrl1 = p;
        ((CubicCurve2D) this.formainterna).setCurve(((CubicCurve2D) this.formainterna).getP1(), ((CubicCurve2D) this.formainterna).getCtrlP1(), p,((CubicCurve2D) this.formainterna).getP2());
    }
    
    /**
     * Devuelve el segundo punto de control de la curva
     * @return
     */
    public Point2D getPCtrl1(){
        return this.puntoCtrl1;
    }
    
    /**
     * Establece el punto final de la curva
     * @param p
     */
    public void setPf(Point2D p){
        double ancho = Math.abs(((CubicCurve2D)this.formainterna).getX1() - p.getX());
        double alto = Math.abs(((CubicCurve2D)this.formainterna).getY1() - p.getY());
        
        Point2D pf = new Point2D.Double(ancho, alto);
        
        ((CubicCurve2D) this.formainterna).setCurve(((CubicCurve2D) this.formainterna).getP1(), this.puntoCtrl, this.puntoCtrl1, pf);
    }
    
    /**
     * Establece la localización de la curva
     * @param p
     */
    public void setLocation(Point2D p){
        Point2D pinicial = ((CubicCurve2D) this.formainterna).getP1();
        Point2D pctrl = ((CubicCurve2D) this.formainterna).getCtrlP1();
        Point2D pfin = ((CubicCurve2D) this.formainterna).getP2();
        Point2D pctrl1 = ((CubicCurve2D) this.formainterna).getCtrlP2();

        double dx = p.getX() - pinicial.getX();
        double dy = p.getY() - pinicial.getY();
        
        ((CubicCurve2D) this.formainterna).setCurve(p.getX(), p.getY(),pctrl.getX() + dx, pctrl.getY() + dy, pctrl1.getX() + dx, pctrl1.getY() + dy, pfin.getX() + dx, pfin.getY() + dy);
    }
    
    /**
     * Punto de control de la curva
     */
    private Point2D puntoCtrl;
    
    /**
     * Segundo punto de control de la curva
     */
    private Point2D puntoCtrl1;
}
