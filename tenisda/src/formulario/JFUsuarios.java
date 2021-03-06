package formulario;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class JFUsuarios extends javax.swing.JFrame {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    public void Conectar(){
        try{
        conexion=DriverManager.getConnection("jdbc:mysql://localhost:3307/proyecto","root","");
            st=conexion.createStatement();
            rs=st.executeQuery("Select * from usuarios");
        
            rs.next();
        
        this.jtf_id.setText(rs.getString("id"));
        this.jtf_usuario.setText(rs.getString("usuario"));
        this.jfp_password.setText(rs.getString("contra"));
        this.jtf_fecha.setText(rs.getString("fecha"));
        jb_guardar.setVisible(false);
        jb_actualizar.setVisible(false);
        jb_cancelar.setVisible(false);
        jtf_id.setVisible(false);
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null,"Error"+err.getMessage());
        }
    }
    /**
     * Creates new form JFUsuarios
     */
    public JFUsuarios() {
        initComponents();
        this.Conectar();
    }
    public void moverPrimerRegistro() {
        try {
            rs.first();
            llenarDatos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001" + ex.getMessage());
        }
    }

    public void moverRegistroSiguiente() {
        try {
            if (!rs.isLast()) {
                rs.next();
                llenarDatos();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001" + ex.getMessage());
        }
    }
    
    public void moverRegistroAnterior() {
        try {
            if (!rs.isFirst()) {
                rs.previous();
                llenarDatos();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001" + ex.getMessage());
        }
    }
    
    public void moverUltimoRegistro() {
        try {
            rs.last();
            llenarDatos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 001" + ex.getMessage());
        }
    }

    public void llenarDatos() {
        try {
            this.jtf_id.setText(rs.getString("id"));
            this.jtf_usuario.setText(rs.getString("usuario"));
            this.jfp_password.setText(rs.getString("contra"));
            this.jtf_fecha.setText(rs.getString("fecha"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 002" + ex.getMessage());
        }
    }
    public void deshabilitarEdicion(){
        jtf_usuario.setEditable(false);
        jfp_password.setEditable(false);
        jtf_fecha.setEditable(false);
        
}
    public void habilitarEdicion(){
        jtf_usuario.setEditable(false);
        jfp_password.setEditable(true);
        jtf_fecha.setEditable(true);
        
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
        jPanel3 = new javax.swing.JPanel();
        jb_primer_registro = new javax.swing.JButton();
        jb_registro_anterior = new javax.swing.JButton();
        jb_siguiente_registro = new javax.swing.JButton();
        jb_ultimo_registro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jb_nuevo = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jb_actualizar = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jl_usuario = new javax.swing.JLabel();
        jtf_usuario = new javax.swing.JTextField();
        jl_contra = new javax.swing.JLabel();
        jl_fecha = new javax.swing.JLabel();
        jtf_fecha = new javax.swing.JTextField();
        jfp_password = new javax.swing.JPasswordField();
        jtf_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jb_primer_registro.setBackground(new java.awt.Color(0, 102, 255));
        jb_primer_registro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_primer_registro.setForeground(new java.awt.Color(255, 255, 255));
        jb_primer_registro.setText("|<");
        jb_primer_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_primer_registroMouseClicked(evt);
            }
        });
        jb_primer_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_primer_registroActionPerformed(evt);
            }
        });

        jb_registro_anterior.setBackground(new java.awt.Color(0, 102, 255));
        jb_registro_anterior.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_registro_anterior.setForeground(new java.awt.Color(255, 255, 255));
        jb_registro_anterior.setText("<<");
        jb_registro_anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registro_anteriorMouseClicked(evt);
            }
        });

        jb_siguiente_registro.setBackground(new java.awt.Color(0, 102, 255));
        jb_siguiente_registro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_siguiente_registro.setForeground(new java.awt.Color(255, 255, 255));
        jb_siguiente_registro.setText(">>");
        jb_siguiente_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_siguiente_registroMouseClicked(evt);
            }
        });
        jb_siguiente_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_siguiente_registroActionPerformed(evt);
            }
        });

        jb_ultimo_registro.setBackground(new java.awt.Color(0, 102, 255));
        jb_ultimo_registro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_ultimo_registro.setForeground(new java.awt.Color(255, 255, 255));
        jb_ultimo_registro.setText(">|");
        jb_ultimo_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ultimo_registroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_primer_registro)
                .addGap(81, 81, 81)
                .addComponent(jb_registro_anterior)
                .addGap(96, 96, 96)
                .addComponent(jb_siguiente_registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jb_ultimo_registro)
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_primer_registro)
                    .addComponent(jb_registro_anterior)
                    .addComponent(jb_siguiente_registro)
                    .addComponent(jb_ultimo_registro))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jb_nuevo.setBackground(new java.awt.Color(51, 0, 255));
        jb_nuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jb_nuevo.setText("Nuevo");
        jb_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_nuevoMouseClicked(evt);
            }
        });

        jb_borrar.setBackground(new java.awt.Color(51, 51, 255));
        jb_borrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_borrar.setForeground(new java.awt.Color(255, 255, 255));
        jb_borrar.setText("Borrar");
        jb_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_borrarMouseClicked(evt);
            }
        });

        jb_modificar.setBackground(new java.awt.Color(51, 0, 255));
        jb_modificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        jb_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarMouseClicked(evt);
            }
        });

        jb_guardar.setBackground(new java.awt.Color(51, 0, 255));
        jb_guardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");
        jb_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarMouseClicked(evt);
            }
        });
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        jb_cancelar.setBackground(new java.awt.Color(51, 0, 204));
        jb_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        jb_cancelar.setText("Cancelar");
        jb_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cancelarMouseClicked(evt);
            }
        });

        jb_actualizar.setBackground(new java.awt.Color(51, 0, 255));
        jb_actualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jb_actualizar.setText("Actualizar");
        jb_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_actualizarMouseClicked(evt);
            }
        });

        jb_salir.setBackground(new java.awt.Color(51, 0, 255));
        jb_salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setText("Salir");
        jb_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_nuevo)
                .addGap(37, 37, 37)
                .addComponent(jb_borrar)
                .addGap(41, 41, 41)
                .addComponent(jb_modificar)
                .addGap(27, 27, 27)
                .addComponent(jb_salir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jb_actualizar)
                .addGap(30, 30, 30)
                .addComponent(jb_guardar)
                .addGap(30, 30, 30)
                .addComponent(jb_cancelar)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USUARIOS");
        jLabel1.setFocusTraversalPolicyProvider(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/Resize Image_1533787075919.jpg"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        jl_usuario.setBackground(new java.awt.Color(153, 204, 255));
        jl_usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_usuario.setText("Usuario");
        jl_usuario.setOpaque(true);

        jtf_usuario.setEditable(false);
        jtf_usuario.setBackground(new java.awt.Color(153, 255, 255));
        jtf_usuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtf_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_usuarioActionPerformed(evt);
            }
        });

        jl_contra.setBackground(new java.awt.Color(153, 204, 255));
        jl_contra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_contra.setText("Contraseña");
        jl_contra.setOpaque(true);

        jl_fecha.setBackground(new java.awt.Color(153, 204, 255));
        jl_fecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_fecha.setText("Fecha");
        jl_fecha.setOpaque(true);

        jtf_fecha.setEditable(false);
        jtf_fecha.setBackground(new java.awt.Color(153, 255, 255));
        jtf_fecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jfp_password.setEditable(false);
        jfp_password.setBackground(new java.awt.Color(153, 255, 255));

        jtf_id.setEditable(false);
        jtf_id.setBackground(new java.awt.Color(153, 255, 255));
        jtf_id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_usuario)
                    .addComponent(jl_contra)
                    .addComponent(jl_fecha))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jfp_password, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_usuario)
                    .addComponent(jtf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_contra)
                    .addComponent(jfp_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_fecha)
                    .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_primer_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_primer_registroMouseClicked
        moverPrimerRegistro();// TODO add your handling code here:
    }//GEN-LAST:event_jb_primer_registroMouseClicked

    private void jb_primer_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_primer_registroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_primer_registroActionPerformed

    private void jb_registro_anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registro_anteriorMouseClicked
        moverRegistroAnterior();// TODO add your handling code here:
    }//GEN-LAST:event_jb_registro_anteriorMouseClicked

    private void jb_siguiente_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_siguiente_registroMouseClicked
        moverRegistroSiguiente();// TODO add your handling code here:
    }//GEN-LAST:event_jb_siguiente_registroMouseClicked

    private void jb_siguiente_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_siguiente_registroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_siguiente_registroActionPerformed

    private void jb_ultimo_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ultimo_registroMouseClicked
        moverUltimoRegistro();// TODO add your handling code here:
    }//GEN-LAST:event_jb_ultimo_registroMouseClicked

    private void jb_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_nuevoMouseClicked
        jtf_usuario.setText("");
        jtf_usuario.setEditable(true);
        jfp_password.setText("");
        jfp_password.setEditable(true);
        jtf_fecha.setVisible(false);
        jl_fecha.setVisible(false);
        
        jb_nuevo.setVisible(false);
        jb_borrar.setVisible(false);
        jb_modificar.setVisible(false);
        jb_guardar.setEnabled(true);
        jb_cancelar.setEnabled(true);
        jb_primer_registro.setEnabled(false);
        jb_siguiente_registro.setEnabled(false);
        jb_registro_anterior.setEnabled(false);
        jb_ultimo_registro.setEnabled(false);
        jb_guardar.setVisible(true);
        jb_cancelar.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jb_nuevoMouseClicked

    private void jb_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_borrarMouseClicked
        String usuario=jtf_usuario.getText();
        try{
            st.executeUpdate("delete from usuarios where usuario='"+usuario+"';");
            JOptionPane.showMessageDialog(null,"Se borro el usuario");
            Conectar();

        } catch(SQLException err){
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_borrarMouseClicked

    private void jb_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarMouseClicked
        habilitarEdicion();
        jb_nuevo.setVisible(false);
        jb_borrar.setVisible(false);
        jb_modificar.setVisible(false);
        jb_guardar.setEnabled(false);
        jb_actualizar.setVisible(true);
        jb_cancelar.setVisible(true);
        jb_primer_registro.setEnabled(false);
        jb_siguiente_registro.setEnabled(false);
        jb_registro_anterior.setEnabled(false);
        jb_ultimo_registro.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_modificarMouseClicked

    private void jb_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarMouseClicked
        try{
            String usuario=this.jtf_usuario.getText();
            String contra=this.jfp_password.getText();
            

            st.executeUpdate("Insert into usuarios (usuario, contra)"+" values ('"+usuario+"','"+contra+"');");
            JOptionPane.showMessageDialog(null,"Se a guardado el usuario");
            jtf_usuario.setText("");
            jtf_usuario.setEditable(true);
            jfp_password.setText("");
            jfp_password.setEditable(true);
            jtf_fecha.setVisible(false);
            

        } catch(SQLException err)         {
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
        } // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardarMouseClicked

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cancelarMouseClicked
        jb_nuevo.setEnabled(true);
        jb_borrar.setEnabled(true);
        jb_modificar.setEnabled(true);
        jb_guardar.setEnabled(true);
        jb_cancelar.setEnabled(true);
        jb_primer_registro.setEnabled(true);
        jb_siguiente_registro.setEnabled(true);
        jb_registro_anterior.setEnabled(true);
        jb_ultimo_registro.setEnabled(true);
        jb_guardar.setVisible(false);
        jb_actualizar.setVisible(false);
        jb_cancelar.setVisible(false);
        jb_nuevo.setVisible(true);
        jb_borrar.setVisible(true);
        jb_modificar.setVisible(true);
        jtf_fecha.setVisible(true);
        jl_fecha.setVisible(true);
        Conectar();
        llenarDatos();
        deshabilitarEdicion();
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jb_cancelarMouseClicked

    private void jb_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_actualizarMouseClicked
         try {
            String id = this.jtf_id.getText();
            String usuario = this.jtf_usuario.getText();
            String contra = this.jfp_password.getText();
            

            String sql = ("update usuarios set usuario='" + usuario+ "', contra='" + contra + "' where id='" + id + "';");
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se a actualizado el usuario");
            this.Conectar();
            this.moverUltimoRegistro();
            jb_nuevo.setVisible(true);
            jb_borrar.setVisible(true);
            jb_modificar.setVisible(true);
            jb_primer_registro.setEnabled(true);
            jb_siguiente_registro.setEnabled(true);
            jb_registro_anterior.setEnabled(true);
            jb_ultimo_registro.setEnabled(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se a actualizado"+ex.getMessage());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jb_actualizarMouseClicked

    private void jb_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMouseClicked
        JFMenu_principal jf_menu_principal=new JFMenu_principal();
        jf_menu_principal.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jb_salirMouseClicked

    private void jtf_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(JFUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jb_actualizar;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_nuevo;
    private javax.swing.JButton jb_primer_registro;
    private javax.swing.JButton jb_registro_anterior;
    private javax.swing.JButton jb_salir;
    private javax.swing.JButton jb_siguiente_registro;
    private javax.swing.JButton jb_ultimo_registro;
    private javax.swing.JPasswordField jfp_password;
    private javax.swing.JLabel jl_contra;
    private javax.swing.JLabel jl_fecha;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JTextField jtf_fecha;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_usuario;
    // End of variables declaration//GEN-END:variables
}
