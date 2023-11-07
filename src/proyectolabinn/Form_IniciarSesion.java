package proyectolabinn;

import ConexiónDB.CheckConnection;
import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Form_IniciarSesion extends javax.swing.JFrame {
   
   public static String usuNombre;
   public static String IDUsuario; // Global, para usarlo en otros formularios
   
   public Form_IniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);  // centrar ventana
}
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Text_Password = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnCancelarInicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIAR SESION");
        setMinimumSize(new java.awt.Dimension(200, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Usuario : ");

        Text_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_UsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Contraseña :");

        Text_Password.setToolTipText("");
        Text_Password.setMinimumSize(new java.awt.Dimension(150, 20));
        Text_Password.setName(""); // NOI18N

        btnIniciarSesion.setBackground(new java.awt.Color(153, 153, 153));
        btnIniciarSesion.setText("ACEPTAR");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnCancelarInicio.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarInicio.setText("CANCELAR");
        btnCancelarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarInicioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIENDAS");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(250, 250, 250));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("\"PURIY CLASS\"");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectolabinn/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnIniciarSesion)
                                .addGap(34, 34, 34)
                                .addComponent(btnCancelarInicio))
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Text_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarSesion)
                    .addComponent(btnCancelarInicio))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarInicioActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarInicioActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

        CheckConnection cn = new CheckConnection(); // invoca a la clase que conecta

        Statement  st = null;
        ResultSet  rs = null;
        String query;

        int band = 0; //bandera para verificación

        String userNombre = Text_Usuario.getText();
        String usuPassword = Text_Password.getText();

        if("".equals(Text_Usuario.getText()))
        JOptionPane.showMessageDialog(null, "Ingrese nombre de usuario");
        else
        if("".equals(Text_Password.getText()))
        JOptionPane.showMessageDialog(null, "Ingrese contraseña");
        else
        {   query = "SELECT * FROM tblUsuarios WHERE usuNombre = '"+userNombre+"' AND usuPassword = '"+usuPassword+"'";

            try{
                st = cn.ObtenerConexion().createStatement();
                rs = st.executeQuery(query);

                while(rs.next()){
                    if(rs.getString(1) == null)
                    band = 0;  // no coincide user o passw
                    else
                    band = 1;
                }
            }
            catch (SQLException ex){
                JOptionPane.showConfirmDialog(null, "ERROR DE ACCESO"+ex);
            }

            if (band == 1)
            {
                usuNombre = Text_Usuario.getText();

                this.setVisible(false);

                try {

                    final Form_Main vp = new Form_Main();

                    vp.setVisible(true);

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Fatal ERROR, Carga erronea de los modulos");
                }
            }
            else
            {   JOptionPane.showMessageDialog(null,"ERROR. Vuelva a Ingresar");
                this.setVisible(rootPaneCheckingEnabled);   // muestra la ventana actual
                this.Text_Usuario.setText("");
                this.Text_Password.setText("");
                this.Text_Usuario.requestFocus();
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void Text_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_UsuarioActionPerformed

    }//GEN-LAST:event_Text_UsuarioActionPerformed

public static void main(String args[]) {
  
     java.awt.EventQueue.invokeLater(new Runnable() {

     public void run() {
                new Form_IniciarSesion().setVisible(true);
            }
     });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Text_Password;
    public javax.swing.JTextField Text_Usuario;
    private javax.swing.JButton btnCancelarInicio;
    public javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


