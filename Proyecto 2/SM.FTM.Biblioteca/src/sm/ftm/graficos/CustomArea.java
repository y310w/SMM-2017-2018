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
        this.formainterna = new Area();
    }
    
     
    public void paint (Graphics2D g) {
        
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
        
        g.fill(circ1);
        g.fill(circ2);
        g.fill(circ3);
        g.fill(circ4);
        g.fill(circ5);
        g.draw(rect1);
    }
    
    /**
     * Establece la localizacion de la figura
     * @param p
     */
    public void setLocation(Point2D p) {
       CustomArea newArea = new CustomArea((Shape) formainterna,p);
    }
    
    
    Point2D punto;
    Ellipse2D circulo;
    Rectangle2D rectangulo;
    Area circ1, circ2, circ3, circ4, circ5, circ6, rect1;

    
}
