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
        botonNegro = new javax.swing.JToggleButton();
        botonRojo = new javax.swing.JToggleButton();
        botonAzul = new javax.swing.JToggleButton();
        botonBlanco = new javax.swing.JToggleButton();
        botonVerde = new javax.swing.JToggleButton();
        botonAmarillo = new javax.swing.JToggleButton();
        checkBoxRelleno = new javax.swing.JCheckBox();
        lienzo1 = new aplicacion.Lienzo();
        MenuSuperior = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        edicion = new javax.swing.JMenu();
        verbarra = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraestados.setText("Texto");
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
        Herramientas.add(botonPunto);

        botonesHerramientas.add(botonLinea);
        botonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        botonLinea.setToolTipText("Dibujar líneas");
        botonLinea.setFocusable(false);
        botonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Herramientas.add(botonLinea);

        botonesHerramientas.add(botonCuadrado);
        botonCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        botonCuadrado.setToolTipText("Dibujar Rectangulos");
        botonCuadrado.setFocusable(false);
        botonCuadrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCuadrado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Herramientas.add(botonCuadrado);

        botonesHerramientas.add(botonOvalo);
        botonOvalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        botonOvalo.setToolTipText("Dibujar Ovalo");
        botonOvalo.setFocusable(false);
        botonOvalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOvalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
        PanelColores.add(botonNegro);

        botonRojo.setBackground(new java.awt.Color(238, 0, 0));
        botonesColores.add(botonRojo);
        botonRojo.setToolTipText("Rojo");
        botonRojo.setPreferredSize(new java.awt.Dimension(25, 20));
        PanelColores.add(botonRojo);

        botonAzul.setBackground(new java.awt.Color(0, 0, 238));
        botonesColores.add(botonAzul);
        botonAzul.setToolTipText("Azul");
        botonAzul.setPreferredSize(new java.awt.Dimension(25, 20));
        PanelColores.add(botonAzul);

        botonBlanco.setBackground(new java.awt.Color(255, 255, 255));
        botonesColores.add(botonBlanco);
        botonBlanco.setToolTipText("Blanco");
        botonBlanco.setPreferredSize(new java.awt.Dimension(25, 20));
        PanelColores.add(botonBlanco);

        botonVerde.setBackground(new java.awt.Color(108, 255, 0));
        botonesColores.add(botonVerde);
        botonVerde.setToolTipText("Verde");
        botonVerde.setPreferredSize(new java.awt.Dimension(25, 20));
        PanelColores.add(botonVerde);

        botonAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        botonesColores.add(botonAmarillo);
        botonAmarillo.setToolTipText("Amarillo");
        botonAmarillo.setPreferredSize(new java.awt.Dimension(25, 20));
        PanelColores.add(botonAmarillo);

        PanelInferior.add(PanelColores, java.awt.BorderLayout.LINE_START);

        checkBoxRelleno.setText("Relleno");
        checkBoxRelleno.setToolTipText("");
        PanelInferior.add(checkBoxRelleno, java.awt.BorderLayout.LINE_END);

        PanelCentral.add(PanelInferior, java.awt.BorderLayout.PAGE_END);

        lienzo1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        PanelCentral.add(lienzo1, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelCentral, java.awt.BorderLayout.CENTER);

        archivo.setText("Archivo");
        archivo.setToolTipText("");

        nuevo.setText("Nuevo");
        archivo.add(nuevo);

        abrir.setText("Abrir");
        archivo.add(abrir);

        guardar.setText("Guardar");
        archivo.add(guardar);

        MenuSuperior.add(archivo);

        edicion.setText("Edición");

        verbarra.setSelected(true);
        verbarra.setText("Ver barra de estado");
        edicion.add(verbarra);

        MenuSuperior.add(edicion);

        setJMenuBar(MenuSuperior);

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
    private aplicacion.Lienzo lienzo1;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JCheckBoxMenuItem verbarra;
    // End of variables declaration//GEN-END:variables
}
