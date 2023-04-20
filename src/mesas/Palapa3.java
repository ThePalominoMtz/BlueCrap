package mesas;

import mesas.GettersandSetters;
import Conexiones.conexionconsqllite;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author cruzh
 */
public class Palapa3 extends javax.swing.JPanel {
    Connection cn = conexionconsqllite.getConexion();
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;

    /**
     * Creates new form Palapa3
     */
    public Palapa3() {
        initComponents();
        jTblVisulizarCuentas.setBackground( new Color(246,229,186));
        jTableProductosBuscados.setBackground( new Color(246,229,186));
        this.mostrardatosG();
//        this.mostardatosP();
        this.Suma();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblVisulizarCuentas = new javax.swing.JTable();
        BtnCuenta9 = new javax.swing.JLabel();
        LabelBuscar = new javax.swing.JLabel();
        BtnCuenta12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductosBuscados = new javax.swing.JTable();
        BtnCuenta13 = new javax.swing.JLabel();
        BtnCuenta14 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        BtnCuenta15 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        JpanelEliminar = new javax.swing.JPanel();
        LabelEliminar = new javax.swing.JLabel();
        JpanelAgregar = new javax.swing.JPanel();
        BtnAgregar2 = new javax.swing.JLabel();
        jTxtBuscarP1 = new javax.swing.JTextField();
        jLabelSuma = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnCuenta10 = new javax.swing.JLabel();
        BtnCuenta11 = new javax.swing.JLabel();
        BtnCuenta16 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(90, 185, 225));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTblVisulizarCuentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTblVisulizarCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Productos consumidops", "Piezas", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblVisulizarCuentas.setRowHeight(25);
        jTblVisulizarCuentas.getTableHeader().setReorderingAllowed(false);
        jTblVisulizarCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblVisulizarCuentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblVisulizarCuentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 560, 350));

        BtnCuenta9.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BtnCuenta9.setForeground(new java.awt.Color(0, 0, 0));
        BtnCuenta9.setText("Precio");
        BtnCuenta9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(BtnCuenta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 520, 70, 40));

        LabelBuscar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        LabelBuscar.setForeground(new java.awt.Color(0, 0, 0));
        LabelBuscar.setText("Buscar producto:");
        LabelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(LabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 200, -1));

        BtnCuenta12.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BtnCuenta12.setForeground(new java.awt.Color(0, 0, 0));
        BtnCuenta12.setText("Tabla productos buscados");
        BtnCuenta12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(BtnCuenta12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 290, -1));

        jTableProductosBuscados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NombreP", "Piezas", "Precio"
            }
        ));
        jTableProductosBuscados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosBuscadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProductosBuscados);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 510, 350));

        BtnCuenta13.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BtnCuenta13.setForeground(new java.awt.Color(0, 0, 0));
        BtnCuenta13.setText("Numero de mesa: 1");
        BtnCuenta13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(BtnCuenta13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 220, -1));

        BtnCuenta14.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BtnCuenta14.setForeground(new java.awt.Color(0, 0, 0));
        BtnCuenta14.setText("Tabla productos en mesa");
        BtnCuenta14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(BtnCuenta14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 290, -1));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 560, 60, 40));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 560, 60, 40));

        BtnCuenta15.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BtnCuenta15.setForeground(new java.awt.Color(0, 0, 0));
        BtnCuenta15.setText("Total: $ ");
        BtnCuenta15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(BtnCuenta15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 100, -1));
        jPanel1.add(txtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 510, 40));

        JpanelEliminar.setBackground(new java.awt.Color(250, 186, 86));
        JpanelEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JpanelEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JpanelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JpanelEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JpanelEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JpanelEliminarMouseExited(evt);
            }
        });
        JpanelEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        LabelEliminar.setForeground(new java.awt.Color(0, 0, 0));
        LabelEliminar.setText("  Eliminar");
        JpanelEliminar.add(LabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        jPanel1.add(JpanelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 140, 50));

        JpanelAgregar.setBackground(new java.awt.Color(250, 186, 86));
        JpanelAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JpanelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JpanelAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JpanelAgregarMouseExited(evt);
            }
        });
        JpanelAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAgregar2.setBackground(new java.awt.Color(246, 229, 186));
        BtnAgregar2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        BtnAgregar2.setForeground(new java.awt.Color(0, 0, 0));
        BtnAgregar2.setText("  Agregar ");
        BtnAgregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAgregar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAgregar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAgregar2MouseExited(evt);
            }
        });
        JpanelAgregar.add(BtnAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        jPanel1.add(JpanelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 140, 50));

        jTxtBuscarP1.setBackground(new java.awt.Color(255, 153, 102));
        jTxtBuscarP1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTxtBuscarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBuscarP1ActionPerformed(evt);
            }
        });
        jTxtBuscarP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtBuscarP1KeyReleased(evt);
            }
        });
        jPanel1.add(jTxtBuscarP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 360, 40));

        jLabelSuma.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jPanel1.add(jLabelSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 200, 40));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salvar (1).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 40, 50));

        BtnCuenta10.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BtnCuenta10.setForeground(new java.awt.Color(0, 0, 0));
        BtnCuenta10.setText("Mesero:");
        BtnCuenta10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(BtnCuenta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 90, 40));

        BtnCuenta11.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BtnCuenta11.setForeground(new java.awt.Color(0, 0, 0));
        BtnCuenta11.setText("Nombre del producto");
        BtnCuenta11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(BtnCuenta11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 260, 40));

        BtnCuenta16.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BtnCuenta16.setForeground(new java.awt.Color(0, 0, 0));
        BtnCuenta16.setText("Pzas");
        BtnCuenta16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(BtnCuenta16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 520, -1, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void jTblVisulizarCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblVisulizarCuentasMouseClicked
        if (evt.getClickCount()==1){
            JTable receptor = (JTable) evt.getSource();
            txtNombreP.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            txtCantidad.setText((receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString()));
            txtPrecio.setText((receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString()));
        }
    }//GEN-LAST:event_jTblVisulizarCuentasMouseClicked

    private void jTableProductosBuscadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosBuscadosMouseClicked
        if (evt.getClickCount()==1){
            JTable receptor = (JTable) evt.getSource();
            txtNombreP.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            txtCantidad.setText((receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString()));
            txtPrecio.setText((receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString()));
        }//se inserto esta llave, si se borra, los productos buscados se pueden insertar en la tabla mesa1
    }//GEN-LAST:event_jTableProductosBuscadosMouseClicked

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void JpanelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelEliminarMouseClicked
        conexionconsqllite objConexion = new conexionconsqllite();
        GettersandSetters oUsuarios = recuperarDatosGUI();
        String strSentenciaInsert = String.format("DELETE FROM Palapa3 WHERE PConsumidos = '%s'" , oUsuarios.getNombreProducto());
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrardatosG();
    }//GEN-LAST:event_JpanelEliminarMouseClicked

    private void JpanelEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelEliminarMouseEntered
        //        JpanelAgreggar.setBackground(new Color(250,186,86));
    }//GEN-LAST:event_JpanelEliminarMouseEntered

    private void JpanelEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelEliminarMouseExited
        //        BtnEditar.setBackground(new Color (186,202,246));
    }//GEN-LAST:event_JpanelEliminarMouseExited

    private void BtnAgregar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregar2MouseClicked
        conexionconsqllite objConexion = new conexionconsqllite();  // Creamos una conexion para poder insertar la informacion
        GettersandSetters oUsuarios = recuperarDatosGUI();  //Obtencion de datos atraves de la interfaz grafica
        String strSentenciaInsert = String.format("INSERT INTO Palapa3 (PConsumidos,Cantidad,Precio) "   //Aqui se inserta la informacion
            + "VALUES ('%s', '%d' , '%d')", oUsuarios.getNombreProducto(), oUsuarios.getCantidad(),oUsuarios.getPrecio());
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert); //Aqui se ejecuta la informacion
        this.mostrardatosG();
    }//GEN-LAST:event_BtnAgregar2MouseClicked

    private void BtnAgregar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregar2MouseEntered

    private void BtnAgregar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregar2MouseExited

    private void JpanelAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelAgregarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JpanelAgregarMouseEntered

    private void JpanelAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelAgregarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_JpanelAgregarMouseExited

    private void jTxtBuscarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBuscarP1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableProductosBuscados.getModel();
        String[] registros = new String[200];
        String sql = "SELECT * FROM Productos WHERE NombreProducto LIKE '%" + jTxtBuscarP1.getText() + "%' ";
        Connection conect = conexionconsqllite.getConexion();
        try
        {
            st = (Statement) conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                registros[0] = rs.getString("NombreProducto");
                registros[1] = rs.getString("Cantidad");
                registros[2] = rs.getString("Precio");
                model.addRow(registros);
            }
            jTableProductosBuscados.setModel(model);
        } catch (SQLException ex)
        {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }
    }//GEN-LAST:event_jTxtBuscarP1ActionPerformed

    private void jTxtBuscarP1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBuscarP1KeyReleased
        //        this.mostardatosP(jTxtBuscarP1.getText());
        //        DefaultTableModel model = (DefaultTableModel) jTableProductosBuscados.getModel();
        //        String[] registros = new String[200];
        //        String sql = "SELECT * FROM Productos WHERE NombreProducto LIKE '%" + jTxtBuscarP1.getText() + "%' ";
        //        Connection conect = conexionconsqllite.getConexion();
        //        try
        //        {
            //            st = (Statement) conect.createStatement();
            //            rs = st.executeQuery(sql);
            //            while (rs.next())
            //            {
                //                registros[0] = rs.getString("NombreProducto");
                //                registros[1] = rs.getString("Cantidad");
                //                registros[2] = rs.getString("Precio");
                //                model.addRow(registros);
                //            }
            //            jTableProductosBuscados.setModel(model);
            //        } catch (SQLException ex)
        //        {
            //            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
            //        }
    }//GEN-LAST:event_jTxtBuscarP1KeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(null, "El mesero se agrego correctamente");
    }//GEN-LAST:event_jLabel1MouseClicked
        public void mostrardatosG(){
        DefaultTableModel model = (DefaultTableModel) jTblVisulizarCuentas.getModel();
        while (model.getRowCount()>0){
            model.removeRow(0);
        }
        conexionconsqllite objConexion = new conexionconsqllite();
         try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM Palapa3");
            while (resultado.next()) {
                System.err.println(resultado.getString("PConsumidos"));
                System.err.println(resultado.getString("Cantidad"));
                System.err.println(resultado.getString("Precio"));
                       Object[] oUsuario = {resultado.getString("PConsumidos"),resultado.getString("Cantidad"), resultado.getString("Precio")};
                       model.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
        public void mostardatosP(){
        DefaultTableModel model = (DefaultTableModel) jTableProductosBuscados.getModel();
        while (model.getRowCount()>0){
            model.removeRow(0);
        }
        conexionconsqllite objConexion = new conexionconsqllite();
         try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM Productos");
            while (resultado.next()) {
                System.err.println(resultado.getString("NombreProducto"));
                System.err.println(resultado.getString("Cantidad"));
                System.err.println(resultado.getString("Precio"));
                       Object[] oUsuario = {resultado.getString("NombreProducto"),resultado.getString("Cantidad"), resultado.getString("Precio")};
                       model.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
        
    
     public GettersandSetters recuperarDatosGUI(){
    GettersandSetters oUsuarios = new GettersandSetters();
    int Precio = (txtPrecio.getText().isEmpty())?0: Integer.parseInt(txtPrecio.getText());
    oUsuarios.setPrecio(Precio);
    int Cantidad = (txtCantidad.getText().isEmpty())?0: Integer.parseInt(txtCantidad.getText());
    oUsuarios.setCantidad(Cantidad);
    oUsuarios.setNombreProducto(txtNombreP.getText());
    return oUsuarios;
}
public void Suma(){
    int t=0;
    int p=0;
    if(jTblVisulizarCuentas.getRowCount()>0){
        for(int i=0; i<jTblVisulizarCuentas.getRowCount();i++){
            p=Integer.parseInt(jTblVisulizarCuentas.getValueAt(i,2).toString());
            t+=p;
        }
        jLabelSuma.setText("$"+t);
    }else{
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnAgregar2;
    private javax.swing.JLabel BtnCuenta10;
    private javax.swing.JLabel BtnCuenta11;
    private javax.swing.JLabel BtnCuenta12;
    private javax.swing.JLabel BtnCuenta13;
    private javax.swing.JLabel BtnCuenta14;
    private javax.swing.JLabel BtnCuenta15;
    private javax.swing.JLabel BtnCuenta16;
    private javax.swing.JLabel BtnCuenta9;
    private javax.swing.JPanel JpanelAgregar;
    private javax.swing.JPanel JpanelEliminar;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelSuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProductosBuscados;
    private javax.swing.JTable jTblVisulizarCuentas;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtBuscarP1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
