/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author thejoker
 */
public class Lienzo extends javax.swing.JPanel {

    Point pi = new Point(0,0);
    Point pf = new Point(0,0);
    
    Color color = Color.BLACK;
    Formas forma = Formas.Punto;
    boolean relleno = false;   
    
    public Lienzo() {
        initComponents();
        
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        // Cambiar el color cuando se pulse
        g.setColor(color);
        
        if(relleno){
            switch(forma){
                case Punto:
                    g.fillOval(pi.x, pi.y, 5, 5);
                    break;
                case Linea:
                    g.drawLine(pi.x,pi.y,pf.x,pf.y);
                    break;
                case Rectangulo:
                    g.fillRect(pi.x, pi.y, pf.x, pf.y);
                    break;
                case Ovalo:
                    g.fillOval(pi.x, pi.y, pf.x, pf.y);
                    break;
            }
        }else{
            switch(forma){
                case Punto:
                    g.fillOval(pi.x, pi.y, 5, 5);
                    break;
                case Linea:
                    g.drawLine(pi.x,pi.y,pf.x,pf.y);
                    break;
                case Rectangulo:
                    g.drawRect(pi.x, pi.y, pf.x, pf.y);
                    break;
                case Ovalo:
                    g.drawOval(pi.x, pi.y, pf.x, pf.y);
                    break;
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void setForma(Formas f){
        this.forma = f;
    }
    
    public Formas getForma(){
        return this.forma;
    }
    
    public void setColor(Color c){
        this.color = c;
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public void setRelleno(boolean relleno){
        this.relleno = relleno;
    }
    
    public boolean getRelleno(){
        return this.relleno;
    }
    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        pi = evt.getPoint();
        this.repaint();
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        pi = evt.getPoint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        pf = evt.getPoint();
        this.repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        pf = evt.getPoint();
        this.repaint();
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
