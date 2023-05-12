
package redesway;

import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class facturacion extends javax.swing.JFrame {
    private int descuento;
    private int retefuente;
    PreparedStatement ps;  
    ResultSet rs;
    conexion con = new conexion();
    PaginaPrincipal principal = new PaginaPrincipal();
    servicioDAO Servicio = new servicioDAO();
     DefaultTableModel modelo = new DefaultTableModel();
      
    
    
    public facturacion() {
        initComponents();
       
       
        desc.setText("0");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        fecha.setVisible(false);
        int a=20;
        String c="Helvetica";
        //servicio.setFont(new Font(c, Font.BOLD, a));
        //nit.setFont(new Font(c, Font.BOLD, a));
        
        nit.setForeground(Color.blue);
        nit.setText("001");
        correo.setText("Cliente Ocasional");   
        codigo.setText("001");
        servicio.setText("Generico");
        precios.setText("");
        //Configuracion header por defecto tabla principal
        JTableHeader headerPrincipal = tabla.getTableHeader();
        ((DefaultTableCellRenderer)headerPrincipal.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        //Configuracion  header por defecto tabla servicio
      
        //configuracion header por defecto tabla nombre
        
        //Configuracion tabla principal
        DefaultTableModel modeloPrincipal = new DefaultTableModel();
        modeloPrincipal.addColumn("Codigo");
        modeloPrincipal.addColumn("Servicio");
        modeloPrincipal.addColumn("Cantidad");
        modeloPrincipal.addColumn("Precio");
        tabla.setModel(modeloPrincipal);
        //configuracion tabla servicio
        DefaultTableModel modeloServicio = new DefaultTableModel();
        modeloServicio.addColumn("Codigo");
        modeloServicio.addColumn("Servicio");
        modeloServicio.addColumn("precio");
        DefaultTableCellRenderer render = new  DefaultTableCellRenderer();
        DefaultTableCellRenderer renderRight = new  DefaultTableCellRenderer();
       
       
        tabla.setModel(modelo);
        modelo.addColumn("Codigo");
        modelo.addColumn("Servicio");
        modelo.addColumn("Valor unitario");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Valor total");
        
        tabla.getColumnModel().getColumn(0).setPreferredWidth(1);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(1);
        render.setHorizontalAlignment(JLabel.CENTER);
        renderRight.setHorizontalAlignment(JLabel.RIGHT);
        tabla.getColumnModel().getColumn(0).setCellRenderer(render);
        tabla.getColumnModel().getColumn(1).setCellRenderer(render);
        tabla.getColumnModel().getColumn(2).setCellRenderer(renderRight);
        tabla.getColumnModel().getColumn(3).setCellRenderer(renderRight);
        
        
       
        
    }
    
         //Parametros de la tabla
        
      
    public void agregar(){
        try{
            String code = codigo.getText();
            String service= servicio.getText();
            String precio= precios.getText();
            String cantidad="";
            String datos[]={code,service,precio,cantidad};
            modelo.addRow(datos);
            int sum=0;
            for(int i=0; i<tabla.getRowCount();i++){
                sum= sum+Integer.parseInt(tabla.getValueAt(i, 2).toString());
                int descu= sum- Integer.parseInt(desc.getText());
                Neto.setText(Integer.toString(sum));
                total.setText(Integer.toString(descu));
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
        PagPrincipal = new javax.swing.JButton();
        PagPrincipal2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        PagPrincipal3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PagPrincipal1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        codigo = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        precios = new javax.swing.JTextField();
        servicio = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        nit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jButton6.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PagPrincipal.setText("Resumen");
        PagPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(PagPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 120, 60));

        PagPrincipal2.setText("Clientes");
        PagPrincipal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagPrincipal2ActionPerformed(evt);
            }
        });
        jPanel1.add(PagPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 90));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 110, 30));

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 110, 30));

        PagPrincipal3.setText("Servicios");
        PagPrincipal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagPrincipal3ActionPerformed(evt);
            }
        });
        jPanel1.add(PagPrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 120, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Facturacion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 150, 50));

        PagPrincipal1.setText("Pagina Principal");
        PagPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagPrincipal1ActionPerformed(evt);
            }
        });
        jPanel1.add(PagPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 120, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1156778_2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -10, 870, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1156778(1)_2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 710));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("servicio"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Codigo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 51, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 120, 10));

        codigo.setBorder(null);
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoKeyPressed(evt);
            }
        });
        jPanel2.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 120, 20));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 80, 10));

        precios.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        precios.setBorder(null);
        jPanel2.add(precios, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 70, 20));

        servicio.setBorder(null);
        jPanel2.add(servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 300, 20));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 300, 10));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Precio");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 80, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Servicio");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 400, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 150, 10));

        correo.setBorder(null);
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                correoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });
        jPanel3.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 150, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 60, -1));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 120, 10));

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
        jPanel3.add(nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 120, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nit");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 51, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 450, 80));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));
        jPanel4.setAlignmentX(10.0F);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        total.setEditable(false);
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 130, 30));

        Neto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(Neto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 130, 30));

        desc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });
        desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descKeyReleased(evt);
            }
        });
        jPanel4.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 130, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Valor Total");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Valor Neto");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Descuento");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setText("Guardar");
        jPanel5.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 50));

        jButton8.setText("PDF");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 90, 50));

        jButton5.setText("Borrar");
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, 50));

        jButton9.setText("Buscar");
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 90, 50));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 350, 180));

        jRadioButton1.setText("Ret.Fuente");
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tabla);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 810, 180));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 850, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitKeyPressed
         
    }//GEN-LAST:event_nitKeyPressed

    private void correoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyPressed
          
    }//GEN-LAST:event_correoKeyPressed

    private void nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitActionPerformed
              
    }//GEN-LAST:event_nitActionPerformed

    private void nitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitKeyTyped
     
    }//GEN-LAST:event_nitKeyTyped

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
       
    }//GEN-LAST:event_correoKeyTyped

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void PagPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagPrincipalActionPerformed
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PagPrincipalActionPerformed

    private void descKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descKeyPressed
        
          
        
    }//GEN-LAST:event_descKeyPressed

    private void PagPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagPrincipal1ActionPerformed
        PaginaPrincipal pag = new PaginaPrincipal();
        pag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PagPrincipal1ActionPerformed

    private void PagPrincipal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagPrincipal2ActionPerformed
        cliente Clientes = new cliente();
        Clientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PagPrincipal2ActionPerformed

    private void PagPrincipal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagPrincipal3ActionPerformed
        servicio Servicios = new servicio();
        Servicios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PagPrincipal3ActionPerformed

    private void codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyPressed
       
    }//GEN-LAST:event_codigoKeyPressed

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
       
    }//GEN-LAST:event_descActionPerformed

    private void descKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descKeyReleased
         try{ 
            int s= Integer.parseInt(Neto.getText());
            int descu= s- Integer.parseInt(desc.getText());
            total.setText(Integer.toString(descu));
           }catch(Exception e){
               System.out.println(e);
           }
    }//GEN-LAST:event_descKeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
    private javax.swing.JButton PagPrincipal;
    private javax.swing.JButton PagPrincipal1;
    private javax.swing.JButton PagPrincipal2;
    private javax.swing.JButton PagPrincipal3;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField desc;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nit;
    private javax.swing.JTextField precios;
    private javax.swing.JTextField servicio;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
