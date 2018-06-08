 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.ftm.graficos;

import java.awt.AlphaComposite;
import sm.ftm.graficos.Forma;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.Rectangle;
import java.awt.Composite;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.RenderingHints;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 * Clase que define una figura, tiene todo los atributos a cada figura
 * @author thejoker
 */

public class Shape implements java.awt.Shape { 
    
    /**
     * Creates new form Shape
     */
    public Shape(){
        this.forma = Forma.POINT;
        this.colortrazo = Color.BLACK;
        this.colorrellenosimple = Color.WHITE;
        this.trazo = new BasicStroke(1.0F);
        this.tipotrazo = "Continua";
        this.rellenosimple = false;
        this.rellenogradienteH = false;
        this.rellenogradienteV = false;
        this.alisado = false;
        this.comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        this.compvalue = 100;                
    }
    
    /**
     * Creates new form Shape
     * @param p
     */
    public Shape(Shape p){
        this.forma = p.getForma();
        this.colortrazo = p.getColorTrazo();
        this.colorrellenosimple = p.getColorerellenoSimple();
        this.trazo = p.getTrazo();
        this.tipotrazo = p.getTipotrazo();
        this.rellenosimple = p.isRellenoSimple();
        this.rellenogradienteH = p.isRellenoGradienteH();
        this.rellenogradienteV = p.isRellenoGradienteV();
        this.alisado = p.isAlisado();
        this.comp = p.getComp();
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
     * @return the colorerellenosimple
     */
    public Color getColorerellenoSimple() {
        return colorrellenosimple;
    }

    /**
     * @param colorerellenosimple the colorerelleno to set
     */
    public void setColorerellenoSimple(Color colorerellenosimple) {
        this.colorrellenosimple = colorerellenosimple;
    }
    
    /**
     * @return the trazo
     */
    public Stroke getTrazo() {
        return (BasicStroke) trazo;
    }

    /**
     * Devuelve el valor en float del ancho del trazo
     * @return
     */
    public Float getStrokeWidth(){
        return ((BasicStroke) this.trazo).getLineWidth();
    }
    
    /**
     * @param trazo the stroke to set
     */
    public void setTrazo(Stroke trazo) {
        this.trazo = trazo;
    }

    /**
     * @return the tipotrazo
     */
    public String getTipotrazo() {
        return tipotrazo;
    }

    /**
     * @param tipotrazo the tipotrazo to set
     */
    public void setTipotrazo(String tipotrazo) {
        this.tipotrazo = tipotrazo;
    }
    
    /**
     * @return the relleno
     */
    public boolean isRellenoSimple() {
        return rellenosimple;
    }

    /**
     * @param relleno the relleno to set
     */
    public void setRellenoSimple(boolean relleno) {
        this.rellenosimple = relleno;
    }

    /*
     * @return the rellenogradienteH
     */
    public boolean isRellenoGradienteH() {
        return rellenogradienteH;
    }

    /**
     * @param rellenogradiente the relleno to set
     */
    public void setRellenoGradienteH(boolean rellenogradienteH) {
        this.rellenogradienteH = rellenogradienteH;
    }
    
    /*
     * @return the rellenogradienteV
     */
    public boolean isRellenoGradienteV() {
        return rellenogradienteV;
    }

    /**
     * @param rellenogradienteV the relleno to set
     */
    public void setRellenoGradienteV(boolean rellenogradienteV) {
        this.rellenogradienteV = rellenogradienteV;
    }
    
    /**
     * @return the alisado
     */
    public boolean isAlisado() {
        return alisado;
    }

    /**
     * @param alisado the alisado to set
     */
    public void setAlisado(boolean alisado) {
        this.alisado = alisado;
    }

    /**
     * @return the comp
     */
    public Composite getComp() {
        return comp;
    }
    
    /**
     * @param value the comp to set
     */
    public void setComp(float value) {
        this.compvalue = value;
        this.comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, value);
    }
  
    /**
     * @return the compvalue
     */
    public float getCompvalue() {
        return compvalue;
    }

    /**
     * @param compvalue the compvalue to set
     */
    public void setCompvalue(float compvalue) {
        this.compvalue = compvalue;
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
     * Dibuja la figura atendiendo a su características
     * @param g
     */
    public void draw(Graphics2D g){
        g.setStroke(this.getTrazo());
        
        if(this.isRellenoSimple() || this.isRellenoGradienteH() || this.isRellenoGradienteV()){
            if (this.isRellenoSimple())
                g.setPaint(this.getColorerellenoSimple());
            else{
                if(this.isRellenoGradienteH()){
                    GradientPaint gradiente = new GradientPaint(this.getBounds().x, this.getBounds().y, this.getColorTrazo(), this.getBounds().x + this.getBounds().width, this.getBounds().y, this.getColorerellenoSimple());
                    g.setPaint(gradiente);
                }else{
                    GradientPaint gradiente = new GradientPaint(this.getBounds().x, this.getBounds().y, this.getColorTrazo(), this.getBounds().x, this.getBounds().y + this.getBounds().height, this.getColorerellenoSimple());
                    g.setPaint(gradiente);
                }
            }
            g.setComposite(this.getComp());
            g.fill(this);
        }else{
            g.setComposite(this.getComp());
        }
        
        if(this.isAlisado())
            g.setRenderingHints(this.render);
        
        g.setPaint(this.getColorTrazo());
        g.draw(this);
    }
    
    /**
     * figura actual creada desde Lienzo2D
     */
   
    protected java.awt.Shape formainterna;
    
    /**
     * Forma de la figura
     */
    private Forma forma;
    
    /**
     * Color del trazo
     */
    private Color colortrazo;
    
    /**
     * Color del relleno
     */
    private Color colorrellenosimple;
    
    /**
     * Tipo del trazo
     */
    private Stroke trazo;
    
    /**
     * Tipo del trazo utilizado para actualizar el parent de VentanaInternaImagen
     */
    private String tipotrazo;
    
    /**
     * Establecer el relleno simple
     */
    private boolean rellenosimple = false;
    
    /**
     * Establecer el relleno gradiente horizontal
     */
    private boolean rellenogradienteH = false;
    
    /**
     * Establecer el relleno gradicente vertical
     */
    private boolean rellenogradienteV = false;
    
    /**
     * Vector de formas
     */
    private boolean alisado = false;
    
    /**
     * Atributo del alisado
     */
    private RenderingHints render = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    
    /**
     * Atributo de la transparencia
     */
    private Composite comp;
    
    /**
     * Valor de la transparencia para el Slider de transparencia
     */
    private float compvalue;
}