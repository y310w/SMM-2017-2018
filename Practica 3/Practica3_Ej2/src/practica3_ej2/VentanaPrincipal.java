/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_ej2;

/**
 *
 * @author thejoker
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        desktop.setLayout(new java.awt.FlowLayout());
        getContentPane().add(desktop);

        archivo.setText("Archivo");

        nuevo.setText("Nuevo");
        archivo.add(nuevo);

        menu.add(archivo);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivo;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem nuevo;
    // End of variables declaration//GEN-END:variables
}
