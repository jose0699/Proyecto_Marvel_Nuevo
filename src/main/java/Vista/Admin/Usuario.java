/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Admin;

/**
 *
 * @author José Luis López
 */
public class Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Buscar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Buscar_Usuario = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        pais_priv = new javax.swing.JLabel();
        pais = new javax.swing.JLabel();
        Genero_priv = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        Fecha_priv = new javax.swing.JLabel();
        fecha_nacimiento = new javax.swing.JLabel();
        Nombre_priv = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        usuario_priv = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        Correo_electronico = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        Tarjeta = new javax.swing.JLabel();
        Nro_Tarjeta = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        Contra = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Buscar.setText("Buscar");

        Regresar.setText("Regresar");

        Buscar_Usuario.setText("Corre electronico / Usuario");

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo.setText("Informacion personal");

        Titulo2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo2.setText("Informacion del usuario");

        pais_priv.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pais_priv.setText("Pais");

        pais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Genero_priv.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Genero_priv.setText("Genero");

        Fecha_priv.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Fecha_priv.setText("Fecha de nacimiento");

        fecha_nacimiento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fecha_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Nombre_priv.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Nombre_priv.setText("Nombre");

        Nombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        usuario_priv.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usuario_priv.setText("Usuario");

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Correo_electronico.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Correo_electronico.setText("Correo electronico");

        Tarjeta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Tarjeta.setText("Numero de tarjeta");

        Nro_Tarjeta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Nro_Tarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        contraseña.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Contra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Contra.setText("Contraseña");
        Contra.setToolTipText("");

        Eliminar.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Genero_priv)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombre_priv)
                                .addGap(63, 63, 63)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Buscar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(Buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Fecha_priv)
                                .addGap(49, 49, 49)
                                .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usuario_priv)
                                .addGap(36, 36, 36)
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Correo_electronico)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tarjeta)
                                .addGap(91, 91, 91)
                                .addComponent(Nro_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Contra)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(pais_priv)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Titulo2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(Regresar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(contraseña))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Eliminar)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2)))
                .addContainerGap(1282, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(31, 31, 31)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombre_priv)
                                .addGap(18, 18, 18)
                                .addComponent(pais_priv)
                                .addGap(34, 34, 34)
                                .addComponent(Genero_priv))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha_priv)
                            .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Titulo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario_priv)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Correo_electronico)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(contraseña))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Contra)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tarjeta)
                    .addComponent(Nro_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(jButton2))
                .addGap(64, 64, 64)
                .addComponent(Regresar)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton Buscar;
    private javax.swing.JTextField Buscar_Usuario;
    private javax.swing.JLabel Contra;
    private javax.swing.JLabel Correo_electronico;
    public javax.swing.JButton Eliminar;
    private javax.swing.JLabel Fecha_priv;
    private javax.swing.JLabel Genero_priv;
    public javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre_priv;
    public javax.swing.JLabel Nro_Tarjeta;
    public javax.swing.JButton Regresar;
    private javax.swing.JLabel Tarjeta;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo2;
    public javax.swing.JLabel contraseña;
    public javax.swing.JLabel correo;
    public javax.swing.JLabel fecha_nacimiento;
    public javax.swing.JLabel genero;
    private javax.swing.JButton jButton2;
    public javax.swing.JLabel pais;
    private javax.swing.JLabel pais_priv;
    public javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario_priv;
    // End of variables declaration//GEN-END:variables
}
