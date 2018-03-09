/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.awt.Color;

/**
 *
 * @author thejoker
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        
        this.setTitle("Paint Básico");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesHerramientas = new javax.swing.ButtonGroup();
        botonesColores = new javax.swing.ButtonGroup();
        barraestados = new javax.swing.JLabel();
        PanelCentral = new javax.swing.JPanel();
        PanelSuperior = new javax.swing.JPanel();
        Herramientas = new javax.swing.JToolBar();
        botonPunto = new javax.swing.JToggleButton();
        botonLinea = new javax.swing.JToggleButton();
        botonCuadrado = new javax.swing.JToggleButton();
        botonOvalo = new javax.swing.JToggleButton();
        PanelInferior = new javax.swing.JPanel();
        PanelColores = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        lienzo1 = new aplicacion.Lienzo();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        edicion = new javax.swing.JMenu();
        verbarra = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraestados.setText("jLabel1");
        getContentPane().add(barraestados, java.awt.BorderLayout.PAGE_END);

        PanelCentral.setLayout(new java.awt.BorderLayout());

        PanelSuperior.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        Herramientas.setRollover(true);

        botonesHerramientas.add(botonPunto);
        botonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        botonPunto.setFocusable(false);
        botonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPunto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        Herramientas.add(botonPunto);

        botonesHerramientas.add(botonLinea);
        botonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        botonLinea.setFocusable(false);
        botonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Herramientas.add(botonLinea);

        botonesHerramientas.add(botonCuadrado);
        botonCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        botonCuadrado.setFocusable(false);
        botonCuadrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCuadrado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Herramientas.add(botonCuadrado);

        botonesHerramientas.add(botonOvalo);
        botonOvalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        botonOvalo.setFocusable(false);
        botonOvalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOvalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Herramientas.add(botonOvalo);

        PanelSuperior.add(Herramientas);

        PanelCentral.add(PanelSuperior, java.awt.BorderLayout.PAGE_START);

        PanelInferior.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        botonesColores.add(jToggleButton1);
        PanelColores.add(jToggleButton1);

        botonesColores.add(jToggleButton2);
        PanelColores.add(jToggleButton2);

        botonesColores.add(jToggleButton3);
        PanelColores.add(jToggleButton3);

        botonesColores.add(jToggleButton4);
        PanelColores.add(jToggleButton4);

        botonesColores.add(jToggleButton5);
        PanelColores.add(jToggleButton5);
        PanelColores.add(jToggleButton6);

        PanelInferior.add(PanelColores);

        jCheckBox1.setText("jCheckBox1");
        PanelInferior.add(jCheckBox1);

        PanelCentral.add(PanelInferior, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        PanelCentral.add(lienzo1, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelCentral, java.awt.BorderLayout.CENTER);

        archivo.setText("Archivo");

        nuevo.setText("Nuevo");
        archivo.add(nuevo);

        abrir.setText("Abrir");
        archivo.add(abrir);

        guardar.setText("Guardar");
        archivo.add(guardar);

        jMenuBar1.add(archivo);

        edicion.setText("Edición");

        verbarra.setSelected(true);
        verbarra.setText("Ver barra de estado");
        edicion.add(verbarra);

        jMenuBar1.add(edicion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPuntoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar Herramientas;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelColores;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenu archivo;
    private javax.swing.JLabel barraestados;
    private javax.swing.JToggleButton botonCuadrado;
    private javax.swing.JToggleButton botonLinea;
    private javax.swing.JToggleButton botonOvalo;
    private javax.swing.JToggleButton botonPunto;
    private javax.swing.ButtonGroup botonesColores;
    private javax.swing.ButtonGroup botonesHerramientas;
    private javax.swing.JMenu edicion;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private aplicacion.Lienzo lienzo1;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JCheckBoxMenuItem verbarra;
    // End of variables declaration//GEN-END:variables
}
