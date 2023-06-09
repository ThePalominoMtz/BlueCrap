package Ventanas;


import Conexiones.conexionconsqllite;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author cruzh
 */
public class JPanelGenreal extends javax.swing.JPanel {

    /**
     * Creates new form JPanelGenreal
     */
    public JPanelGenreal() {
        initComponents();
        jTableGeneral.setBackground( new Color(246,229,186));
        Color nino = new Color(246,229,186);
        jTableNumMesas.setBackground(nino);
        this.mostardatosG();
        this.mostardatosM();
    }
    public void mostardatosG(){
        DefaultTableModel model = (DefaultTableModel) jTableGeneral.getModel();
        while (model.getRowCount()>0){
            model.removeRow(0);
        }
        conexionconsqllite objConexion = new conexionconsqllite();
         try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM CuentaPrueba");
            while (resultado.next()) {
                System.err.println(resultado.getString("Productosconsumidos"));
                System.err.println(resultado.getString("Cantidad"));
                System.err.println(resultado.getString("Precio"));
                System.err.println(resultado.getString("PreTotal"));
                       Object[] oUsuario = {resultado.getString("Productosconsumidos"),resultado.getString("Cantidad"), resultado.getString("Precio")
                       , resultado.getString("PreTotal")};
                       model.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
        public void mostardatosM(){
        DefaultTableModel model = (DefaultTableModel) jTableNumMesas.getModel();
        while (model.getRowCount()>0){
            model.removeRow(0);
        }
        conexionconsqllite objConexion = new conexionconsqllite();
         try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM Mesas");
            while (resultado.next()) {
                System.err.println(resultado.getString("NumMesa"));
                       Object[] oUsuario = {resultado.getString("NumMesa")};
                       model.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNumMesas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableGeneral = new javax.swing.JTable();

        setBackground(new java.awt.Color(90, 185, 225));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableNumMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Numero Mesas"
            }
        ));
        jTableNumMesas.setIntercellSpacing(new java.awt.Dimension(4, 4));
        jTableNumMesas.setRowHeight(25);
        jScrollPane1.setViewportView(jTableNumMesas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 480));

        jTableGeneral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Productos consumidos", "Cantidad", "$ Unidad", "Pre-Total"
            }
        ));
        jTableGeneral.setFocusable(false);
        jTableGeneral.setGridColor(new java.awt.Color(246, 229, 186));
        jTableGeneral.setRowHeight(25);
        jTableGeneral.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jScrollPane2.setViewportView(jTableGeneral);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 670, 480));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableGeneral;
    private javax.swing.JTable jTableNumMesas;
    // End of variables declaration//GEN-END:variables
}
