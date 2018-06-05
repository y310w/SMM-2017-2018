/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author thejoker
 */
public class Linea extends Shape{

    /**
     *
     * @param p
     */
    public Linea(sm.ftm.graficos.Shape p){
        super(p);
        this.formainterna = new Line2D.Double();
    }
    
    /**
     *
     * @param p
     * @param point
     */
    public Linea(sm.ftm.graficos.Shape p, Point2D point){
        super(p);
        this.formainterna = new Line2D.Double(point,point);
    }
    
    /**
     *
     * @param p
     * @param p1
     * @param p2
     */
    public Linea(sm.ftm.graficos.Shape p, Point2D p1, Point2D p2){
        super(p);
        this.formainterna = new Line2D.Double(p1,p2);
    }
    
    /**
     *
     * @param p2
     */
    public void setPF(Point2D p2){
       ((Line2D) formainterna).setLine(((Line2D) formainterna).getP1(), p2);
    }
    
    /**
     *
     * @param p
     * @return
     */
    public boolean isNear(Point2D p){
        if(((Line2D)formainterna).getP1().equals(((Line2D)formainterna).getP2()))
            return ((Line2D) formainterna).getP1().distance(p) <= 5.0;
        
        return ((Line2D)formainterna).ptLineDist(p) <= 2.0;
    }
    
    @Override
    public boolean contains(Point2D p){
        return isNear(p);
    }
    
    @Override
    public boolean contains(double x, double y) {
        Point2D p = new Point2D.Double(x,y);
        return isNear(p);
    }
    
    /**
     *
     * @param p
     */
    public void setLocation(Point2D p){
        double dx = p.getX() - ((Line2D) formainterna).getX1();
        double dy = p.getY() - ((Line2D) formainterna).getY1();
        
        Point2D newp2 = new Point2D.Double(((Line2D) formainterna).getX2()+dx, ((Line2D) formainterna).getY2()+dy);
        ((Line2D) formainterna).setLine(p,newp2);
    }
}
