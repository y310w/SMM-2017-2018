/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import static aplicacion.Formas.*;

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
        botonNegro = new javax.swing.JToggleButton();
        botonRojo = new javax.swing.JToggleButton();
        botonAzul = new javax.swing.JToggleButton();
        botonBlanco = new javax.swing.JToggleButton();
        botonVerde = new javax.swing.JToggleButton();
        botonAmarillo = new javax.swing.JToggleButton();
        checkBoxRelleno = new javax.swing.JCheckBox();
        lienzo = new aplicacion.Lienzo();
        MenuSuperior = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        edicion = new javax.swing.JMenu();
        verbarra = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraestados.setText("Punto");
        barraestados.setToolTipText("Modo de pintura");
        getContentPane().add(barraestados, java.awt.BorderLayout.PAGE_END);

        PanelCentral.setLayout(new java.awt.BorderLayout());

        PanelSuperior.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        Herramientas.setBorder(null);
        Herramientas.setFloatable(false);
        Herramientas.setRollover(true);
        Herramientas.setBorderPainted(false);
        Herramientas.setPreferredSize(new java.awt.Dimension(150, 40));

        botonesHerramientas.add(botonPunto);
        botonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        botonPunto.setSelected(true);
        botonPunto.setToolTipText("Dibujar puntos");
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
        botonLinea.setToolTipText("Dibujar líneas");
        botonLinea.setFocusable(false);
        botonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLineaActionPerformed(evt);
            }
        });
        Herramientas.add(botonLinea);

        botonesHerramientas.add(botonCuadrado);
        botonCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        botonCuadrado.setToolTipText("Dibujar Rectangulos");
        botonCuadrado.setFocusable(false);
        botonCuadrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCuadrado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuadradoActionPerformed(evt);
            }
        });
        Herramientas.add(botonCuadrado);

        botonesHerramientas.add(botonOvalo);
        botonOvalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        botonOvalo.setToolTipText("Dibujar Ovalo");
        botonOvalo.setFocusable(false);
        botonOvalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOvalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOvalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOvaloActionPerformed(evt);
            }
        });
        Herramientas.add(botonOvalo);

        PanelSuperior.add(Herramientas);

        PanelCentral.add(PanelSuperior, java.awt.BorderLayout.PAGE_START);

        PanelInferior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelInferior.setPreferredSize(new java.awt.Dimension(210, 61));
        PanelInferior.setLayout(new java.awt.BorderLayout());

        PanelColores.setPreferredSize(new java.awt.Dimension(100, 40));

        botonNegro.setBackground(new java.awt.Color(0, 0, 0));
        botonesColores.add(botonNegro);
        botonNegro.setSelected(true);
        botonNegro.setToolTipText("Negro");
        botonNegro.setPreferredSize(new java.awt.Dimension(25, 20));
        botonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNegroActionPerformed(evt);
            }
        });
        PanelColores.add(botonNegro);

        botonRojo.setBackground(new java.awt.Color(238, 0, 0));
        botonesColores.add(botonRojo);
        botonRojo.setToolTipText("Rojo");
        botonRojo.setPreferredSize(new java.awt.Dimension(25, 20));
        botonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRojoActionPerformed(evt);
            }
        });
        PanelColores.add(botonRojo);

        botonAzul.setBackground(new java.awt.Color(0, 0, 238));
        botonesColores.add(botonAzul);
        botonAzul.setToolTipText("Azul");
        botonAzul.setPreferredSize(new java.awt.Dimension(25, 20));
        botonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAzulActionPerformed(evt);
            }
        });
        PanelColores.add(botonAzul);

        botonBlanco.setBackground(new java.awt.Color(255, 255, 255));
        botonesColores.add(botonBlanco);
        botonBlanco.setToolTipText("Blanco");
        botonBlanco.setPreferredSize(new java.awt.Dimension(25, 20));
        botonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBlancoActionPerformed(evt);
            }
        });
        PanelColores.add(botonBlanco);

        botonVerde.setBackground(new java.awt.Color(108, 255, 0));
        botonesColores.add(botonVerde);
        botonVerde.setToolTipText("Verde");
        botonVerde.setPreferredSize(new java.awt.Dimension(25, 20));
        botonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerdeActionPerformed(evt);
            }
        });
        PanelColores.add(botonVerde);

        botonAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        botonesColores.add(botonAmarillo);
        botonAmarillo.setToolTipText("Amarillo");
        botonAmarillo.setPreferredSize(new java.awt.Dimension(25, 20));
        botonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAmarilloActionPerformed(evt);
            }
        });
        PanelColores.add(botonAmarillo);

        PanelInferior.add(PanelColores, java.awt.BorderLayout.LINE_START);

        checkBoxRelleno.setText("Relleno");
        checkBoxRelleno.setToolTipText("");
        checkBoxRelleno.setPreferredSize(new java.awt.Dimension(79, 20));
        checkBoxRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxRellenoActionPerformed(evt);
            }
        });
        PanelInferior.add(checkBoxRelleno, java.awt.BorderLayout.LINE_END);

        PanelCentral.add(PanelInferior, java.awt.BorderLayout.PAGE_END);

        lienzo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        PanelCentral.add(lienzo, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelCentral, java.awt.BorderLayout.CENTER);

        archivo.setText("Archivo");
        archivo.setToolTipText("");

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        archivo.add(nuevo);

        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        archivo.add(abrir);

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        archivo.add(guardar);

        MenuSuperior.add(archivo);

        edicion.setText("Edición");

        verbarra.setSelected(true);
        verbarra.setText("Ver barra de estado");
        verbarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verbarraActionPerformed(evt);
            }
        });
        edicion.add(verbarra);

        MenuSuperior.add(edicion);

        setJMenuBar(MenuSuperior);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abrirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed

    private void verbarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verbarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verbarraActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        this.lienzo.setForma(Punto);
        this.barraestados.setText("Punto");
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLineaActionPerformed
        this.lienzo.setForma(Linea);
        this.barraestados.setText("Línea");
    }//GEN-LAST:event_botonLineaActionPerformed

    private void botonCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuadradoActionPerformed
        this.lienzo.setForma(Rectangulo);
        this.barraestados.setText("Rectangulo");
    }//GEN-LAST:event_botonCuadradoActionPerformed

    private void botonOvaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOvaloActionPerformed
        this.lienzo.setForma(Ovalo);
        this.barraestados.setText("Ovalo");
    }//GEN-LAST:event_botonOvaloActionPerformed

    private void botonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNegroActionPerformed
        this.lienzo.setColor(this.botonNegro.getBackground());
    }//GEN-LAST:event_botonNegroActionPerformed

    private void botonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRojoActionPerformed
        this.lienzo.setColor(this.botonRojo.getBackground());
    }//GEN-LAST:event_botonRojoActionPerformed

    private void botonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzulActionPerformed
        this.lienzo.setColor(this.botonAzul.getBackground());
    }//GEN-LAST:event_botonAzulActionPerformed

    private void botonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBlancoActionPerformed
        this.lienzo.setColor(this.botonBlanco.getBackground());
    }//GEN-LAST:event_botonBlancoActionPerformed

    private void botonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerdeActionPerformed
        this.lienzo.setColor(this.botonVerde.getBackground());
    }//GEN-LAST:event_botonVerdeActionPerformed

    private void botonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAmarilloActionPerformed
        this.lienzo.setColor(this.botonAmarillo.getBackground());
    }//GEN-LAST:event_botonAmarilloActionPerformed

    private void checkBoxRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxRellenoActionPerformed

    }//GEN-LAST:event_checkBoxRellenoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar Herramientas;
    private javax.swing.JMenuBar MenuSuperior;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelColores;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenu archivo;
    private javax.swing.JLabel barraestados;
    private javax.swing.JToggleButton botonAmarillo;
    private javax.swing.JToggleButton botonAzul;
    private javax.swing.JToggleButton botonBlanco;
    private javax.swing.JToggleButton botonCuadrado;
    private javax.swing.JToggleButton botonLinea;
    private javax.swing.JToggleButton botonNegro;
    private javax.swing.JToggleButton botonOvalo;
    private javax.swing.JToggleButton botonPunto;
    private javax.swing.JToggleButton botonRojo;
    private javax.swing.JToggleButton botonVerde;
    private javax.swing.ButtonGroup botonesColores;
    private javax.swing.ButtonGroup botonesHerramientas;
    private javax.swing.JCheckBox checkBoxRelleno;
    private javax.swing.JMenu edicion;
    private javax.swing.JMenuItem guardar;
    private aplicacion.Lienzo lienzo;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JCheckBoxMenuItem verbarra;
    // End of variables declaration//GEN-END:variables
}
