/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formulario;

/**
 *
 * @author Jose Felix
 */
public class JFMenu_principal extends javax.swing.JFrame {
    

    /** Creates new form menu_principal */
    public JFMenu_principal() {
        initComponents();
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jl_menu = new javax.swing.JLabel();
        jb_productos = new javax.swing.JButton();
        jb_proveedores = new javax.swing.JButton();
        jb_ventas = new javax.swing.JButton();
        jb_ayuda = new javax.swing.JButton();
        jb_ayuda1 = new javax.swing.JButton();
        jb_usuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/Resize Image_1533787075919.jpg"))); // NOI18N

        jl_menu.setBackground(new java.awt.Color(0, 0, 153));
        jl_menu.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jl_menu.setForeground(new java.awt.Color(255, 255, 255));
        jl_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_menu.setText("Menu");
        jl_menu.setFocusTraversalPolicyProvider(true);
        jl_menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jl_menu.setOpaque(true);

        jb_productos.setBackground(new java.awt.Color(51, 0, 255));
        jb_productos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_productos.setForeground(new java.awt.Color(255, 255, 255));
        jb_productos.setText("Productos");
        jb_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_productosMouseClicked(evt);
            }
        });

        jb_proveedores.setBackground(new java.awt.Color(51, 0, 255));
        jb_proveedores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_proveedores.setForeground(new java.awt.Color(255, 255, 255));
        jb_proveedores.setText("Proveedores");
        jb_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_proveedoresMouseClicked(evt);
            }
        });

        jb_ventas.setBackground(new java.awt.Color(51, 0, 255));
        jb_ventas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_ventas.setForeground(new java.awt.Color(255, 255, 255));
        jb_ventas.setText("Ventas");
        jb_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ventasMouseClicked(evt);
            }
        });

        jb_ayuda.setBackground(new java.awt.Color(51, 0, 255));
        jb_ayuda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_ayuda.setForeground(new java.awt.Color(255, 255, 255));
        jb_ayuda.setText("Ayuda");

        jb_ayuda1.setBackground(new java.awt.Color(51, 0, 255));
        jb_ayuda1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_ayuda1.setForeground(new java.awt.Color(255, 255, 255));
        jb_ayuda1.setText("Salir");
        jb_ayuda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ayuda1MouseClicked(evt);
            }
        });

        jb_usuarios.setBackground(new java.awt.Color(51, 0, 255));
        jb_usuarios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        jb_usuarios.setText("Usuarios");
        jb_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_usuariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jb_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jb_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_ayuda1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_productos)
                    .addComponent(jb_ventas))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_proveedores)
                    .addComponent(jb_ayuda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_usuarios)
                    .addComponent(jb_ayuda1))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_proveedoresMouseClicked
        JFProveedores jf_proveedores=new JFProveedores();
        jf_proveedores.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_proveedoresMouseClicked

    private void jb_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_productosMouseClicked
        JFAaltas jf_altas=new JFAaltas();
        jf_altas.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jb_productosMouseClicked

    private void jb_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ventasMouseClicked
        JFVentas jf_ventas=new JFVentas();
        jf_ventas.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jb_ventasMouseClicked

    private void jb_ayuda1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ayuda1MouseClicked
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jb_ayuda1MouseClicked

    private void jb_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_usuariosMouseClicked
        JFUsuarios jf_usuarios=new JFUsuarios();
        jf_usuarios.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jb_usuariosMouseClicked

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
            java.util.logging.Logger.getLogger(JFMenu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_ayuda;
    private javax.swing.JButton jb_ayuda1;
    private javax.swing.JButton jb_productos;
    private javax.swing.JButton jb_proveedores;
    private javax.swing.JButton jb_usuarios;
    private javax.swing.JButton jb_ventas;
    private javax.swing.JLabel jl_menu;
    // End of variables declaration//GEN-END:variables

}
