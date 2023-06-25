/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author José Luis López
 */
public class Registrarse_dos extends javax.swing.JFrame {

    /**
     * Creates new form Registrarse_dos
     */
    public Registrarse_dos() {
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

        Usuario_1 = new javax.swing.JLabel();
        Contra = new javax.swing.JLabel();
        Confirmar_Contra = new javax.swing.JLabel();
        Confirmar_Correo_Electronico = new javax.swing.JLabel();
        Correo_Electronico = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Valor = new javax.swing.JLabel();
        Tipo_Mem = new javax.swing.JLabel();
        Tarjeta = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Titulo_dos = new javax.swing.JLabel();
        Titulo_Tres = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Contrasena = new javax.swing.JTextField();
        Confirmar_Contrasena = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Confirmar_Correo = new javax.swing.JTextField();
        Numero_Tarjeta = new javax.swing.JTextField();
        Tipo_Membresia = new javax.swing.JComboBox<>();
        Regresar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario_1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Usuario_1.setForeground(new java.awt.Color(255, 255, 255));
        Usuario_1.setText("Nombre de usuario*");
        getContentPane().add(Usuario_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        Contra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Contra.setForeground(new java.awt.Color(255, 255, 255));
        Contra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contra.setText("Contraseña*\n");
        getContentPane().add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        Confirmar_Contra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Confirmar_Contra.setForeground(new java.awt.Color(255, 255, 255));
        Confirmar_Contra.setText("Confirmar contraseña*");
        getContentPane().add(Confirmar_Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        Confirmar_Correo_Electronico.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Confirmar_Correo_Electronico.setForeground(new java.awt.Color(255, 255, 255));
        Confirmar_Correo_Electronico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Confirmar_Correo_Electronico.setText("Confirmar correo electronico*");
        getContentPane().add(Confirmar_Correo_Electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        Correo_Electronico.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Correo_Electronico.setForeground(new java.awt.Color(255, 255, 255));
        Correo_Electronico.setText("Correo electronico*");
        getContentPane().add(Correo_Electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        Precio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Precio.setForeground(new java.awt.Color(255, 255, 255));
        Precio.setText("Precio:");
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, -1));

        Valor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Valor.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 50, 30));

        Tipo_Mem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Tipo_Mem.setForeground(new java.awt.Color(255, 255, 255));
        Tipo_Mem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tipo_Mem.setText("Tipo*");
        getContentPane().add(Tipo_Mem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        Tarjeta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Tarjeta.setForeground(new java.awt.Color(255, 255, 255));
        Tarjeta.setText("Número de tarjeta de credito*");
        getContentPane().add(Tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, 30));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Registrarse");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        Titulo_dos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo_dos.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_dos.setText("Información del usuario");
        getContentPane().add(Titulo_dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        Titulo_Tres.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo_Tres.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Tres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Tres.setText("Membresia\n");
        getContentPane().add(Titulo_Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        Usuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 300, 40));

        Contrasena.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Contrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contrasena.setText("\n");
        getContentPane().add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 230, 40));

        Confirmar_Contrasena.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Confirmar_Contrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Confirmar_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 230, 40));

        Correo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Correo.setText("\n");
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 230, 40));

        Confirmar_Correo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Confirmar_Correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Confirmar_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 230, 40));

        Numero_Tarjeta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Numero_Tarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Numero_Tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 230, 40));

        Tipo_Membresia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Tipo_Membresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free", "Gold", "Premium", "Vip" }));
        getContentPane().add(Tipo_Membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 200, 40));

        Regresar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Regresar.setText("Regresar");
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 150, 35));

        Registrar.setBackground(new java.awt.Color(50, 130, 250));
        Registrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Registrar.setText("Registrarse");
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 150, 35));

        Fondo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Registrase.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

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
            java.util.logging.Logger.getLogger(Registrarse_dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse_dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse_dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse_dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse_dos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Confirmar_Contra;
    public javax.swing.JTextField Confirmar_Contrasena;
    public javax.swing.JTextField Confirmar_Correo;
    private javax.swing.JLabel Confirmar_Correo_Electronico;
    private javax.swing.JLabel Contra;
    public javax.swing.JTextField Contrasena;
    public javax.swing.JTextField Correo;
    private javax.swing.JLabel Correo_Electronico;
    private javax.swing.JLabel Fondo;
    public javax.swing.JTextField Numero_Tarjeta;
    private javax.swing.JLabel Precio;
    public javax.swing.JButton Registrar;
    public javax.swing.JButton Regresar;
    private javax.swing.JLabel Tarjeta;
    private javax.swing.JLabel Tipo_Mem;
    public javax.swing.JComboBox<String> Tipo_Membresia;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo_Tres;
    private javax.swing.JLabel Titulo_dos;
    public javax.swing.JTextField Usuario;
    private javax.swing.JLabel Usuario_1;
    public javax.swing.JLabel Valor;
    // End of variables declaration//GEN-END:variables
}
