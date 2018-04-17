/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

/**
 *
 * @author thejoker
 */
public class MiLinea extends Line2D.Double{
    public MiLinea() {
        super();
    }
    
    public MiLinea(Point2D p){
        super(p,p);
    }
    
    public MiLinea(Point2D pi, Point2D pf){
        super(pi,pf);
    }
    
    public void setPf(Point2D pf){
        this.setLine(super.getP1(), pf);
    }
    
    public boolean isNear(Point2D p){
        return this.ptLineDist(p)<-2.0;
    }
    
    @Override
    public boolean contains(Point2D p){
        return isNear(p);
    }
    
    public void setLocation(Point2D p){
        double dx = p.getX() - this.getX1();
        double dy = p.getY() - this.getY1();
        
        Point2D newp2 = new Point2D.Double(this.getX2()+dx,this.getY2()+dy);
        this.setLine(p,newp2);
    }
}
