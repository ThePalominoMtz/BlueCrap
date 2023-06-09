package Ventanas;


import mesas.GettersandSetters;
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
public class JPanelAgregarProductos extends javax.swing.JPanel {
//    DefaultTableModel nino = new DefaultTableModel();

    /**
     * Creates new form JPanelAgregarProductos
     */
    public JPanelAgregarProductos() {
        initComponents();
        jTblAgregarProductos.setBackground( new Color(246,229,186));
        this.mostardatos();
//        String[] titulo = new String[] {"Nombre del producto", "Cantidad", "Precio", "Proveedor"};
//        nino.setColumnIdentifiers(titulo);
//        jTblAgregarProductos.setModel(nino);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCuenta7 = new javax.swing.JLabel();
        BtnCuenta8 = new javax.swing.JLabel();
        JtxtNombreP = new javax.swing.JTextField();
        JtxtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblAgregarProductos = new javax.swing.JTable();
        JpanelEliminar = new javax.swing.JPanel();
        LabelEliminar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlabelfondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(90, 185, 225));
        setMaximumSize(new java.awt.Dimension(1330, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCuenta7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        BtnCuenta7.setForeground(new java.awt.Color(0, 0, 0));
        BtnCuenta7.setText("Nombre del producto");
        BtnCuenta7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(BtnCuenta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        BtnCuenta8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        BtnCuenta8.setForeground(new java.awt.Color(0, 0, 0));
        BtnCuenta8.setText("Cantidad");
        BtnCuenta8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(BtnCuenta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        JtxtNombreP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JtxtNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtNombrePActionPerformed(evt);
            }
        });
        add(JtxtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 690, 50));

        JtxtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JtxtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtCantidadActionPerformed(evt);
            }
        });
        add(JtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 690, 50));

        jTblAgregarProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTblAgregarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre del producto", "Cantidad"
            }
        ));
        jTblAgregarProductos.setRowHeight(25);
        jScrollPane1.setViewportView(jTblAgregarProductos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1200, 300));

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
        LabelEliminar.setText(" ELIMINAR");
        JpanelEliminar.add(LabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        add(JpanelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, 160, 50));

        jPanel1.setBackground(new java.awt.Color(250, 186, 86));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("AGREGAR");
        jPanel1.add(jLabel1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 170, 50));

        jlabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoprincipal1.png"))); // NOI18N
        add(jlabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void JtxtNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtNombrePActionPerformed

    private void JtxtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtCantidadActionPerformed

    private void JpanelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelEliminarMouseClicked
        conexionconsqllite objConexion = new conexionconsqllite();
        GettersandSetters oUsuarios = recuperarDatosGUI();
        String strSentenciaInsert = String.format("DELETE FROM Mesa1 WHERE PConsumidos = '%s'" , oUsuarios.getNombreProducto());
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostardatos();
    }//GEN-LAST:event_JpanelEliminarMouseClicked

    private void JpanelEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelEliminarMouseEntered
        //        JpanelAgreggar.setBackground(new Color(250,186,86));
    }//GEN-LAST:event_JpanelEliminarMouseEntered

    private void JpanelEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelEliminarMouseExited
        //        BtnEditar.setBackground(new Color (186,202,246));
    }//GEN-LAST:event_JpanelEliminarMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Agregar();
    }//GEN-LAST:event_jPanel1MouseClicked
        public void Agregar(){
//        nino.addRow(new Object[]{JtxtNombredelproducto.getText(), JtxtCantidad.getText(), JtxtPrecio.getText(),JtxtProveedor.getText()});
        conexionconsqllite objConexion = new conexionconsqllite();  // Creamos una conexion para poder insertar la informacion
        GettersandSetters oUsuarios = recuperarDatosGUI();  //Obtencion de datos atraves de la interfaz grafica
        String strSentenciaInsert = String.format("INSERT INTO Inventario (NombreProducto,Cantidad) "   //Aqui se inserta la informacion
                + "VALUES ('%s', '%s', '%s', '%s')",oUsuarios.getNombreProducto(),oUsuarios.getCantidad());
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert); //Aqui se ejecuta la informacion
        this.mostardatos();
        this.limpiar();
    }
        public void mostardatos(){
        DefaultTableModel model = (DefaultTableModel) jTblAgregarProductos.getModel();
        while (model.getRowCount()>0){
            model.removeRow(0);
        }
        conexionconsqllite objConexion = new conexionconsqllite();
         try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM Inventario");
            while (resultado.next()) {
                System.err.println(resultado.getString("NombreProducto"));
                System.err.println(resultado.getString("Cantidad"));
                       Object[] oUsuario = {resultado.getString("NombreProducto"),resultado.getString("Cantidad")};
                       model.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
    public GettersandSetters recuperarDatosGUI(){
    int cantidad = (JtxtCantidad.getText().isEmpty())?0: Integer.parseInt(JtxtCantidad.getText());
    GettersandSetters oUsuarios = new GettersandSetters();
    oUsuarios.setNombreProducto(JtxtNombreP.getText());
    oUsuarios.setCantidad(cantidad);
    return oUsuarios;
}
    public void limpiar (){
        JtxtNombreP.setText("");
        JtxtCantidad.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnCuenta7;
    private javax.swing.JLabel BtnCuenta8;
    private javax.swing.JPanel JpanelEliminar;
    private javax.swing.JTextField JtxtCantidad;
    private javax.swing.JTextField JtxtNombreP;
    private javax.swing.JLabel LabelEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblAgregarProductos;
    private javax.swing.JLabel jlabelfondo;
    // End of variables declaration//GEN-END:variables
}
