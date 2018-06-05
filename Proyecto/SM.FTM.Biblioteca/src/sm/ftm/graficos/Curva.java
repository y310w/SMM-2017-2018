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

    public Curva(Shape s) {
        super(s);
        this.formainterna = new QuadCurve2D.Double();
        this.puntoCtrl = new Point2D.Double();
    }
    
    public Curva(Shape s, Point2D p){
        super(s);
        this.formainterna = new QuadCurve2D.Double(p.getX(), p.getY(), p.getX(), p.getY(), p.getX(), p.getY());
    }
    
    public void setPCtrl(Point2D p){
        this.puntoCtrl.setLocation(p);
    }
    
    public void setPf(Point2D p){
        ((QuadCurve2D) this.formainterna).setCurve(((QuadCurve2D) this.formainterna).getP1(), this.puntoCtrl, p);
    }
    
    private Point2D puntoCtrl;
}
