/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author thejoker
 */
public class CustomArea1 extends Shape{

    /**
     * @param s
     * @param p
     */
    public CustomArea1(Shape s, Point2D p){
        super(s);
       
        this.punto = p;
        this.pinicial = new Point2D.Double(p.getX()-9,p.getY()-9);
        this.formainterna = new Area();
    }
    
    /**
     * Establezco el punto del area
     * @param punto
     */
    public void setPunto(Point2D punto) {
        this.punto = punto;
    }
    
    /**
     * Pinto mi area
     * @param g
     * @param s
     */
    public void paint (Graphics2D g, Shape s) {
        g.setStroke(new BasicStroke(1.0F));
        
        circulo = new Ellipse2D.Double(); 
        Point2D p = new Point2D.Double(punto.getX(),punto.getY()-10);
        circulo.setFrame(p, new Dimension(30,30));
        circ1 = new Area(circulo);
          
        p = new Point2D.Double(punto.getX()-10, punto.getY()+10);
        circulo.setFrame(p, new Dimension(30,30));
        circ2 = new Area(circulo);
        
        p = new Point2D.Double(punto.getX()+10, punto.getY()+10);
        circulo.setFrame(p, new Dimension(30,30));
        circ3 = new Area(circulo);
        
        g.setPaint(Color.RED);
        g.draw(circ1);
        g.setPaint(Color.GREEN);
        g.draw(circ2);
        g.setPaint(Color.BLUE);
        g.draw(circ3);
        
        rect = new Rectangle2D.Double(p.getX() - 20, p.getY() - 20, 50, 50);
        
        if(this.equals(s)){
            g.setColor(Color.BLUE);
            g.setStroke(new BasicStroke(1.0F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{3}, 0));
            g.drawRect(this.rect.getBounds().x - 2, this.rect.getBounds().y - 2, this.rect.getBounds().width + 4, this.rect.getBounds().height + 4);
        }
    }
    
    @Override
    public boolean contains(Point2D p){
       return circ1.contains(p) || circ2.contains(p) || circ3.contains(p);
    }
    
    /**
     * Establece la localizacion de la figura
     * @param p
     */
    public void setLocation(Point2D p) {
        double dx = p.getX() - pinicial.getX();
        double dy = p.getY() - pinicial.getY();
        
        double dfinx = pinicial.getX() - this.rect.getBounds().width/2;
        double dfiny = pinicial.getY() - this.rect.getBounds().height/2;
        
        Point2D punto = new Point2D.Double(dx + 2*dfinx, dy + 2*dfiny);
        this.setPunto(punto);
    }
    
    Point2D punto, pinicial;
    Ellipse2D circulo;
    Rectangle2D rect;
    Area circ1, circ2, circ3, circ4, circ5, circ6; 
    
}
