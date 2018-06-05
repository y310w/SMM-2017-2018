/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import sm.ftm.graficos.Forma;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.Rectangle;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.RenderingHints;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author thejoker
 */

public class Shape implements java.awt.Shape { 
    
    /**
     *
     */
    public Shape(){
        this.colortrazo = Color.BLACK;
        this.colorerelleno = Color.WHITE;
        this.forma = Forma.POINT;
        this.trazo = new BasicStroke(1.0F);
        this.relleno = false;
        this.mover = false;
    }
    
    /**
     *
     * @param p
     */
    public Shape(Shape p){
        this.colortrazo = p.colortrazo;
        this.colorerelleno = p.colorerelleno;
        this.forma = p.forma;
        this.trazo = p.trazo;
        this.relleno = p.relleno;
        this.mover = p.mover;
    }
    
    /**
     * @return the forma
     */
    public Forma getForma() {
        return forma;
    }

    /**
     * @param forma the forma to set
     */
    public void setForma(Forma forma) {
        this.forma = forma;
    }
    
    /**
     * @return the color
     */
    public Color getColorTrazo() {
        return colortrazo;
    }

    /**
     * @param color the color to set
     */
    public void setColorTrazo(Color color) {
        this.colortrazo = color;
    }

    /**
     * @return the colorerelleno
     */
    public Color getColorerelleno() {
        return colorerelleno;
    }

    /**
     * @param colorerelleno the colorerelleno to set
     */
    public void setColorerelleno(Color colorerelleno) {
        this.colorerelleno = colorerelleno;
    }
    
    /**
     * @return the trazo
     */
    public BasicStroke getTrazo() {
        return (BasicStroke) trazo;
    }

    /**
     * @param trazo the stroke to set
     */
    public void setTrazo(Stroke trazo) {
        this.trazo = trazo;
    }

    /**
     * @return the relleno
     */
    public boolean isRelleno() {
        return relleno;
    }

    /**
     * @param relleno the relleno to set
     */
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    /**
     * @return the render
     */
    public RenderingHints getRender() {
        return render;
    }

    /**
     * @param render the render to set
     */
    public void setRender(RenderingHints render) {
        this.render = render;
    }

    /**
     * @return the comp
     */
    public Composite getComp() {
        return comp;
    }

    /**
     * @param comp the comp to set
     */
    public void setComp(Composite comp) {
        this.comp = comp;
    }

    /**
     * @return the mover
     */
    public boolean isMover() {
        return mover;
    }

    /**
     * @param mover the mover to set
     */
    public void setMover(boolean mover) {
        this.mover = mover;
    }
    
    @Override
    public Rectangle getBounds() {
        return this.formainterna.getBounds();
    }

    @Override
    public Rectangle2D getBounds2D() {
        return this.formainterna.getBounds2D();
    }

    @Override
    public boolean contains(double x, double y) {
        return this.formainterna.contains(x, y);
    }

    @Override
    public boolean contains(Point2D p) {
        return this.formainterna.contains(p);
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return this.formainterna.contains(x, y, w, h);
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return this.formainterna.contains(r);
    }
    
    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return this.formainterna.intersects(x, y, w, h);
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return this.formainterna.intersects(r);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return this.formainterna.getPathIterator(at);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return this.formainterna.getPathIterator(at, flatness);
    }
    
    /**
     *
     * @param g
     */
    public void draw(Graphics2D g){
        g.setStroke(this.getTrazo());
        g.setPaint(this.getColorTrazo());
        g.draw(this);
    }
    
    protected java.awt.Shape formainterna;
    private Forma forma;
    private Color colortrazo;
    private Color colorerelleno;
    private Stroke trazo;
    private boolean relleno = false;
    private RenderingHints render = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    private Composite comp;
    private boolean mover = false;
}