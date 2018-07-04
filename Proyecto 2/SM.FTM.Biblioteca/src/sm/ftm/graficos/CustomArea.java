/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Dimension2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

/**
 *
 * @author thejoker
 */
public class CustomArea extends Shape{
    
    /**
     * @param s
     * @param p
     */
    public CustomArea(Shape s, Point2D p){
        super(s);
       
        this.punto = p;
        this.pinicial = new Point2D.Double(p.getX()-36,p.getY()-36);
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
        g.setPaint(Color.BLACK);
        
        circulo = new Ellipse2D.Double(); 
        Point2D p = new Point2D.Double(punto.getX(),punto.getY()-12);
        circulo.setFrame(p, new Dimension(10,10));
        circ1 = new Area(circulo);
        
        p = new Point2D.Double(punto.getX()+12, punto.getY());
        circulo.setFrame(p, new Dimension(10,10));
        circ2 = new Area(circulo);
        
        p = new Point2D.Double(punto.getX()-12, punto.getY()+12);
        circulo.setFrame(p, new Dimension(10,10));
        circ3 = new Area(circulo);
        
        p = new Point2D.Double(punto.getX(), punto.getY()+12);
        circulo.setFrame(p, new Dimension(10,10));
        circ4 = new Area(circulo);
        
        p = new Point2D.Double(punto.getX()+12, punto.getY()+12);
        circulo.setFrame(p, new Dimension(10,10));
        circ5 = new Area(circulo);
        
        rectangulo = new Rectangle2D.Double(); 
        p = new Point2D.Double(punto.getX()-13, punto.getY()-13);
        rectangulo.setFrame(p, new Dimension(36,36));
        rect1 = new Area(rectangulo);
        
        rect1.add(circ1);
        rect1.add(circ2);
        rect1.add(circ3);
        rect1.add(circ4);
        rect1.add(circ5);
       
        g.fill(circ1);
        g.fill(circ2);
        g.fill(circ3);
        g.fill(circ4);
        g.fill(circ5);
        g.draw(rect1);
        
        if(this.equals(s)){
            g.setColor(Color.BLUE);
            g.setStroke(new BasicStroke(1.0F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{3}, 0));
            g.drawRect(this.rect1.getBounds().x - 2, this.rect1.getBounds().y - 2, this.rect1.getBounds().width + 4, this.rect1.getBounds().height + 4);
        }
    }
    
    @Override
    public boolean contains(Point2D p){
       return circ1.contains(p) || circ2.contains(p) || circ3.contains(p) || circ4.contains(p) || circ5.contains(p) || rect1.contains(p);
    }
    
    /**
     * Establece la localizacion de la figura
     * @param p
     */
    public void setLocation(Point2D p) {
        double dx = p.getX() - pinicial.getX();
        double dy = p.getY() - pinicial.getY();
        
        Point2D punto = new Point2D.Double(p.getX() - dx, p.getY() - dy);
        this.setPunto(punto);
    }
    
    Point2D punto, pinicial;
    Ellipse2D circulo;
    Rectangle2D rectangulo;
    Area circ1, circ2, circ3, circ4, circ5, rect1;  
}
