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
public class MiElipse extends Ellipse2D.Double{
    
    private Point2D pi;
    private Point2D pf;
    
    public MiElipse(){
        super();
        this.pi = new Point2D.Double(0,0);
        this.pf = new Point2D.Double(0,0);
    }
    
    public MiElipse(Point2D pi, Point2D pf){
        super();
        this.pi = pi;
        this.pf = pf;
    }
    
    public void setPf(Point2D pf){
        this.setFrameFromDiagonal(pi, pf);
    }
    
    public void setLocation(Point2D p){
        this.setFrame(p, new Dimension((int) this.width, (int) this.height));
    }
}
