package formulario;
import static com.mysql.jdbc.Messages.getString;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.UIManager.getInt;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Jose Felix
 */
public class JFVentas extends javax.swing.JFrame {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    DefaultTableModel modelo;
    public void Conectar(){
    
        try{
        conexion=DriverManager.getConnection("jdbc:mysql://localhost:3307/proyecto","root","");
            st=conexion.createStatement();
            
            
        
        
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null,"Error"+err.getMessage());
        }
    }
    /**
     * Creates new form ventas
     */
    public JFVentas() {
        initComponents();
        this.Conectar();
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
        jl_codigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jl_cantidad = new javax.swing.JLabel();
        jb_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_ventas = new javax.swing.JTable();
        jtf_cantidad = new javax.swing.JTextField();
        jb_salir = new javax.swing.JButton();
        jl_tolal = new javax.swing.JLabel();
        jtf_total = new javax.swing.JTextField();
        jb_guardar = new javax.swing.JButton();
        jl_codigo_producto = new javax.swing.JLabel();
        jtf_codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jl_codigo.setBackground(new java.awt.Color(51, 204, 255));
        jl_codigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/Resize Image_1533787075919.jpg"))); // NOI18N
        jl_codigo.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ventas");
        jLabel1.setFocusTraversalPolicyProvider(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jl_cantidad.setBackground(new java.awt.Color(153, 204, 255));
        jl_cantidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_cantidad.setText("Cantidad");
        jl_cantidad.setOpaque(true);

        jb_agregar.setBackground(new java.awt.Color(51, 0, 255));
        jb_agregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_agregar.setForeground(new java.awt.Color(255, 255, 255));
        jb_agregar.setText("Agregar");
        jb_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarMouseClicked(evt);
            }
        });
        jb_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarActionPerformed(evt);
            }
        });

        jt_ventas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jt_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jt_ventas);

        jb_salir.setBackground(new java.awt.Color(51, 0, 255));
        jb_salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setText("Salir");
        jb_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMouseClicked(evt);
            }
        });

        jl_tolal.setBackground(new java.awt.Color(153, 204, 255));
        jl_tolal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_tolal.setText("Total");
        jl_tolal.setOpaque(true);

        jb_guardar.setBackground(new java.awt.Color(51, 0, 255));
        jb_guardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");
        jb_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarMouseClicked(evt);
            }
        });

        jl_codigo_producto.setBackground(new java.awt.Color(153, 204, 255));
        jl_codigo_producto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_codigo_producto.setText("Codigo del producto");
        jl_codigo_producto.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jl_tolal)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_codigo_producto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_cantidad)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jl_codigo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl_codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_codigo_producto)
                    .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_cantidad)
                    .addComponent(jtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_agregar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_tolal)
                    .addComponent(jtf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_salir)
                    .addComponent(jb_guardar))
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMouseClicked
        JFMenu_principal jf_menu_principal=new JFMenu_principal();
        jf_menu_principal.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jb_salirMouseClicked

    private void jb_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardarMouseClicked

    private void jb_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarMouseClicked
        DefaultTableModel modelo = new DefaultTableModel(); // TODO add your handling code here:
        this.jt_ventas.setModel(modelo);
        try {
            rs=st.executeQuery("select * from ventas");
            rs.last();
            String cantidad = this.jtf_cantidad.getText();
            String codigo = this.jtf_codigo.getText();
            rs=st.executeQuery("select * from prod_existencia where codigo='"+codigo+"';");
            rs.next();
            String precio=(rs.getString("precio_de_venta"));
            modelo.setColumnIdentifiers(new Object[]{"codigo del poducto", "modelo", "marca","precio","cantidad" });
            modelo.addRow(new Object[]{rs.getInt("codigo"), rs.getString("modelo"), rs.getString("marca"), rs.getInt("precio_de_venta"),(cantidad)});
            float Cantidad;
            Cantidad=Float.parseFloat(cantidad);
            float Precio;
            Precio=Float.parseFloat(precio);
            float total=Precio*Cantidad;
            String Total;
            Total=Float.toString(total);
            jtf_total.setText(Total);
        } catch (SQLException ex) {
            Logger.getLogger(JFVentas.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jb_agregarMouseClicked

    private void jb_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(JFVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JLabel jl_cantidad;
    private javax.swing.JLabel jl_codigo;
    private javax.swing.JLabel jl_codigo_producto;
    private javax.swing.JLabel jl_tolal;
    private javax.swing.JTable jt_ventas;
    private javax.swing.JTextField jtf_cantidad;
    private javax.swing.JTextField jtf_codigo;
    private javax.swing.JTextField jtf_total;
    // End of variables declaration//GEN-END:variables
}
