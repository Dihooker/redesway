
package redesway;

import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class facturacion extends javax.swing.JFrame {
    private int descuento;
    private int retefuente;
    PreparedStatement ps;  
    ResultSet rs;
    conexion con = new conexion();
    public facturacion() {
        initComponents();
        nit.setText("001");
        correo.setText("Generico");     
        search();
          
    }
public void search(){
     
        String  whereLike="WHERE nit LIKE '%"+nit.getText()+"%'";
        try{
            //busqueda en la base de datos
            ps= con.getconexion().prepareStatement("SELECT nit,nombre,direccion,telefono, email FROM cliente "+whereLike);
            rs=ps.executeQuery();
            ResultSetMetaData rsMd =rs.getMetaData();
            //Configuracion de  la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            int cantidadColumnas= rsMd.getColumnCount();
            //Asignacion de columnas
            modelo.addColumn("Nit");
            modelo.addColumn("Nombre");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            
            int [] anchos ={100,100,100,100,100};
            //Asignacion de tamaño de celdas
            for(int x=0;x<cantidadColumnas;x++){
                tabla.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            while(rs.next()){
                String a=rs.getString("nombre");
               correo.setText(a);
                //System.out.println(a);
                Object[] filas = new Object[cantidadColumnas];
                for(int i=0; i<cantidadColumnas; i++){
                    filas[i]= rs.getObject(i+1); 
                }
                modelo.addRow(filas);
            }
          }
          catch(Exception e){
              System.out.println(e);       
          }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        codigo = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        cantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        servicio = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        nit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        total = new javax.swing.JTextField();
        Neto = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        buscar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jButton6.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 90));

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 110, 30));

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 195, 1));
        jButton4.setText("Pagina Principal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 40));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 195, 1));
        jButton3.setText("Crear Servicio");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 120, 40));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 195, 1));
        jButton2.setText("Crear Servicio");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 120, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Facturacion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WallpaperDog-10724738_1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 880, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo-rojo.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 620));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("servicio"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Codigo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 51, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 10));

        codigo.setBorder(null);
        jPanel2.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 120, 20));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 70, 30));

        cantidad.setBorder(null);
        jPanel2.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 70, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 380, 60));

        servicio.setBorder(null);
        jPanel2.add(servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 300, 20));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 300, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Cantidad");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 80, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Servicio");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 20));

        jButton1.setText("Agregar");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 410, 210));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 160, 30));

        correo.setBorder(null);
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                correoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });
        jPanel3.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 160, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 60, -1));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 30));

        nit.setBorder(null);
        nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitActionPerformed(evt);
            }
        });
        nit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitKeyTyped(evt);
            }
        });
        jPanel3.add(nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 120, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nit");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 51, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 410, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 450, 210));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Descuento");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        jLabel13.setText("Total");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 30, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tabla);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 580, 180));
        jPanel4.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 130, -1));
        jPanel4.add(Neto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 130, -1));
        jPanel4.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Valor Total");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Valor Neto");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Descuento");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setText("Guardar");
        jPanel5.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 50));

        jButton8.setText("PDF");
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 90, 50));

        jButton5.setText("Borrar");
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 50));

        jButton9.setText("Buscar");
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 90, 50));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 230, 230));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 860, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     PaginaPrincipal pagPrincipal = new PaginaPrincipal();
     pagPrincipal.setVisible(true);
     setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitKeyPressed
        
       
    }//GEN-LAST:event_nitKeyPressed

    private void correoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyPressed
           String  whereLike="WHERE nombre LIKE '%"+correo.getText()+"%'";
        try{
            //busqueda en la base de datos
            ps= con.getconexion().prepareStatement("SELECT nit,nombre,direccion,telefono, email FROM cliente "+whereLike);
            rs=ps.executeQuery();
            ResultSetMetaData rsMd =rs.getMetaData();
            //Configuracion de  la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            int cantidadColumnas= rsMd.getColumnCount();
            //Asignacion de columnas
            modelo.addColumn("Nit");
            modelo.addColumn("Nombre");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            
            int [] anchos ={100,100,100,100,100};
            //Asignacion de tamaño de celdas
            for(int x=0;x<cantidadColumnas;x++){
                tabla.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            while(rs.next()){
                String a=rs.getString("nit");
               nit.setText(a);
                //System.out.println(a);
                Object[] filas = new Object[cantidadColumnas];
                for(int i=0; i<cantidadColumnas; i++){
                    filas[i]= rs.getObject(i+1); 
                }
                modelo.addRow(filas);
            }
          }
          catch(Exception e){
              System.out.println(e);       
          }
    }//GEN-LAST:event_correoKeyPressed

    private void nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitActionPerformed
               String  whereLike="WHERE nit LIKE '%"+nit.getText()+"%'";
        try{
            //busqueda en la base de datos
            ps= con.getconexion().prepareStatement("SELECT nit,nombre,direccion,telefono, email FROM cliente "+whereLike);
            rs=ps.executeQuery();
            ResultSetMetaData rsMd =rs.getMetaData();
            //Configuracion de  la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            int cantidadColumnas= rsMd.getColumnCount();
            //Asignacion de columnas
            modelo.addColumn("Nit");
            modelo.addColumn("Nombre");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            
            int [] anchos ={100,100,100,100,100};
            //Asignacion de tamaño de celdas
            for(int x=0;x<cantidadColumnas;x++){
                tabla.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            while(rs.next()){
                // String a=rs.getString("nombre");
                //System.out.println(a);
                Object[] filas = new Object[cantidadColumnas];
                for(int i=0; i<cantidadColumnas; i++){
                    filas[i]= rs.getObject(i+1); 
                }
                modelo.addRow(filas);
            }
          }
          catch(Exception e){
              System.out.println(e);       
          }
    }//GEN-LAST:event_nitActionPerformed

    private void nitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitKeyTyped
       search();
    }//GEN-LAST:event_nitKeyTyped

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_correoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Neto;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField desc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nit;
    private javax.swing.JTextField servicio;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
