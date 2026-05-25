 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;
import main.*;
import objetos.*;

/**
 *
 * @author ACER
 */
public class visual_Admin extends javax.swing.JFrame {
    Funciones a = Funciones.getInstancia();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(visual_Admin.class.getName());

    private javax.swing.DefaultListModel<String> modeloListaUsuarios = new javax.swing.DefaultListModel<>();
    private javax.swing.DefaultListModel<String> modeloListaFarmaceutas = new javax.swing.DefaultListModel<>();
    private javax.swing.DefaultListModel<String> modeloListaDoctores = new javax.swing.DefaultListModel<>();
    /**
     * Creates new form visual_Admin
     */
    public visual_Admin() {
        initComponents();
        
        // 1. Configuracion de listas
        jList1_usuario.setModel(modeloListaUsuarios);
        actualizarListaUsuarios();
        jList_farmaceutas.setModel(modeloListaFarmaceutas);
        
        // 2. Escuchadores de las listas (Para que se llenen los campos al dar clic)
        jList1_usuario.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && jList1_usuario.getSelectedValue() != null) {
                cargarCamposDesdeLista();
            }
        });
        
        jList_farmaceutas.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && jList_farmaceutas.getSelectedValue() != null) {
                cargarCamposDesdeListaFarmaceuta();
            }
        }); 

        // --- LISTA DOCTORES ---
        jList_doctor.setModel(modeloListaDoctores);
        actualizarListaDoctores();
        
        jList_doctor.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && jList_doctor.getSelectedValue() != null) {
                cargarCamposDesdeListaDoctor();
            }
        });
        
        // --- LIMPIEZA Y CONFIGURACIÓN DE BOTONES: USUARIO ---
        for (java.awt.event.ActionListener al : B_registrar_usuario.getActionListeners()) {
            B_registrar_usuario.removeActionListener(al);
        }
        B_registrar_usuario.addActionListener(this::B_registrar_usuarioActionPerformed);
        
        for (java.awt.event.ActionListener al : B_modificar_usuario.getActionListeners()) {
            B_modificar_usuario.removeActionListener(al);
        }
        B_modificar_usuario.addActionListener(this::B_modificar_usuarioActionPerformed);

        for (java.awt.event.ActionListener al : B_visualizar_usuario.getActionListeners()) {
            B_visualizar_usuario.removeActionListener(al);
        }
        B_visualizar_usuario.addActionListener(this::B_visualizar_usuarioActionPerformed);

        for (java.awt.event.ActionListener al : B_eliminar_usuario.getActionListeners()) {
            B_eliminar_usuario.removeActionListener(al);
        }
        B_eliminar_usuario.addActionListener(this::B_eliminar_usuarioActionPerformed);
        
        // --- LIMPIEZA Y CONFIGURACIÓN DE BOTONES: FARMACEUTA ---
        for (java.awt.event.ActionListener al : B_registrar_farmaceuta.getActionListeners()) {
            B_registrar_farmaceuta.removeActionListener(al);
        }
        B_registrar_farmaceuta.addActionListener(this::B_registrar_farmaceutaActionPerformed);

        for (java.awt.event.ActionListener al : B_modificar_farmaceuta.getActionListeners()) {
            B_modificar_farmaceuta.removeActionListener(al);
        }
        B_modificar_farmaceuta.addActionListener(this::B_modificar_farmaceutaActionPerformed);

        for (java.awt.event.ActionListener al : B_visualizar_farmaceuta.getActionListeners()) {
            B_visualizar_farmaceuta.removeActionListener(al);
        }
        B_visualizar_farmaceuta.addActionListener(this::B_visualizar_farmaceutaActionPerformed);

        for (java.awt.event.ActionListener al : B_eliminar_farmaceuta.getActionListeners()) {
            B_eliminar_farmaceuta.removeActionListener(al);
        }
        B_eliminar_farmaceuta.addActionListener(this::B_eliminar_farmaceutaActionPerformed);

        // --- LIMPIEZA Y CONFIGURACIÓN DE BOTONES: DOCTOR ---
        for (java.awt.event.ActionListener al : B_registrar_doctor.getActionListeners()) {
            B_registrar_doctor.removeActionListener(al);
        }
        B_registrar_doctor.addActionListener(this::B_registrar_doctorActionPerformed);

        for (java.awt.event.ActionListener al : B_modificar_doctor.getActionListeners()) {
            B_modificar_doctor.removeActionListener(al);
        }
        B_modificar_doctor.addActionListener(this::B_modificar_doctorActionPerformed);

        for (java.awt.event.ActionListener al : B_visualizar_doctor.getActionListeners()) {
            B_visualizar_doctor.removeActionListener(al);
        }
        B_visualizar_doctor.addActionListener(this::B_visualizar_doctorActionPerformed);

        for (java.awt.event.ActionListener al : B_eliminar_doctor.getActionListeners()) {
            B_eliminar_doctor.removeActionListener(al);
        }
        B_eliminar_doctor.addActionListener(this::B_eliminar_doctorActionPerformed);

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
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        B_registrar_usuario = new javax.swing.JButton();
        B_modificar_usuario = new javax.swing.JButton();
        B_visualizar_usuario = new javax.swing.JButton();
        B_eliminar_usuario = new javax.swing.JButton();
        jScrollPane_usuario = new javax.swing.JScrollPane();
        jList1_usuario = new javax.swing.JList<>();
        txr_cedula_usuario = new javax.swing.JTextField();
        txt_nombre_usuario = new javax.swing.JTextField();
        txt_edad_usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_farmaceutas = new javax.swing.JList<>();
        txt_cedula_farmaceuta = new javax.swing.JTextField();
        txt_nombre_farmaceuta = new javax.swing.JTextField();
        txt_edad_farmaceuta = new javax.swing.JTextField();
        B_registrar_farmaceuta = new javax.swing.JButton();
        B_modificar_farmaceuta = new javax.swing.JButton();
        B_visualizar_farmaceuta = new javax.swing.JButton();
        B_eliminar_farmaceuta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_doctor = new javax.swing.JList<>();
        txt_cedula_doctor = new javax.swing.JTextField();
        txt_nombre_doctor = new javax.swing.JTextField();
        txt_edad_doctor = new javax.swing.JTextField();
        B_registrar_doctor = new javax.swing.JButton();
        B_modificar_doctor = new javax.swing.JButton();
        B_visualizar_doctor = new javax.swing.JButton();
        B_eliminar_doctor = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_especialidad_doctor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap(508, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("ADMINISTRACION");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 680, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("CEDULA:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        jLabel7.setText("NOMBRE");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 30));

        jLabel9.setText("EDAD");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 30));

        B_registrar_usuario.setBackground(new java.awt.Color(0, 255, 0));
        B_registrar_usuario.setText("REGISTRAR");
        B_registrar_usuario.addActionListener(this::B_registrar_usuarioActionPerformed);
        jPanel4.add(B_registrar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        B_modificar_usuario.setBackground(new java.awt.Color(255, 255, 51));
        B_modificar_usuario.setText("MODIFICAR");
        B_modificar_usuario.addActionListener(this::B_modificar_usuarioActionPerformed);
        jPanel4.add(B_modificar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        B_visualizar_usuario.setBackground(new java.awt.Color(51, 204, 255));
        B_visualizar_usuario.setText("VISUALIZAR");
        B_visualizar_usuario.addActionListener(this::B_visualizar_usuarioActionPerformed);
        jPanel4.add(B_visualizar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        B_eliminar_usuario.setBackground(new java.awt.Color(255, 51, 51));
        B_eliminar_usuario.setText("ELIMINAR");
        B_eliminar_usuario.addActionListener(this::B_eliminar_usuarioActionPerformed);
        jPanel4.add(B_eliminar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 90, -1));

        jList1_usuario.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane_usuario.setViewportView(jList1_usuario);

        jPanel4.add(jScrollPane_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 320, 380));
        jPanel4.add(txr_cedula_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 42, 150, 30));
        jPanel4.add(txt_nombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 112, 150, 30));
        jPanel4.add(txt_edad_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 182, 140, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_admin.jpg"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        jTabbedPane1.addTab("USUARIO", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("CEDULA:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        jLabel11.setText("NOMBRE:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 30));

        jLabel12.setText("EDAD:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 60, 30));

        jList_farmaceutas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList_farmaceutas);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 320, 380));
        jPanel5.add(txt_cedula_farmaceuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, 30));
        jPanel5.add(txt_nombre_farmaceuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 150, 30));
        jPanel5.add(txt_edad_farmaceuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 30));

        B_registrar_farmaceuta.setBackground(new java.awt.Color(0, 255, 0));
        B_registrar_farmaceuta.setText("REGISTRAR");
        B_registrar_farmaceuta.addActionListener(this::B_registrar_farmaceutaActionPerformed);
        jPanel5.add(B_registrar_farmaceuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        B_modificar_farmaceuta.setBackground(new java.awt.Color(255, 255, 51));
        B_modificar_farmaceuta.setText("MODIFICAR");
        B_modificar_farmaceuta.addActionListener(this::B_modificar_farmaceutaActionPerformed);
        jPanel5.add(B_modificar_farmaceuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        B_visualizar_farmaceuta.setBackground(new java.awt.Color(51, 204, 255));
        B_visualizar_farmaceuta.setText("VISUALIZAR");
        B_visualizar_farmaceuta.addActionListener(this::B_visualizar_farmaceutaActionPerformed);
        jPanel5.add(B_visualizar_farmaceuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        B_eliminar_farmaceuta.setBackground(new java.awt.Color(255, 51, 51));
        B_eliminar_farmaceuta.setText("ELIMINAR");
        B_eliminar_farmaceuta.addActionListener(this::B_eliminar_farmaceutaActionPerformed);
        jPanel5.add(B_eliminar_farmaceuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 90, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_admin.jpg"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        jTabbedPane1.addTab("FARMACEUTA", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("CEDULA:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        jLabel14.setText("NOMBRE:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 30));

        jLabel15.setText("EDAD:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        jPanel6.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 60, 30));

        jList_doctor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList_doctor);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 320, 380));
        jPanel6.add(txt_cedula_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, 30));
        jPanel6.add(txt_nombre_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 150, 30));
        jPanel6.add(txt_edad_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 30));

        B_registrar_doctor.setBackground(new java.awt.Color(0, 255, 0));
        B_registrar_doctor.setText("REGISTRAR");
        B_registrar_doctor.addActionListener(this::B_registrar_doctorActionPerformed);
        jPanel6.add(B_registrar_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        B_modificar_doctor.setBackground(new java.awt.Color(255, 255, 51));
        B_modificar_doctor.setText("MODIFICAR");
        B_modificar_doctor.addActionListener(this::B_modificar_doctorActionPerformed);
        jPanel6.add(B_modificar_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        B_visualizar_doctor.setBackground(new java.awt.Color(51, 204, 255));
        B_visualizar_doctor.setText("VISUALIZAR");
        B_visualizar_doctor.addActionListener(this::B_visualizar_doctorActionPerformed);
        jPanel6.add(B_visualizar_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        B_eliminar_doctor.setBackground(new java.awt.Color(255, 51, 51));
        B_eliminar_doctor.setText("ELIMINAR");
        B_eliminar_doctor.addActionListener(this::B_eliminar_doctorActionPerformed);
        jPanel6.add(B_eliminar_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 90, -1));

        jLabel16.setText("ESPECIALIDAD:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 30));
        jPanel6.add(txt_especialidad_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 130, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_admin.jpg"))); // NOI18N
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        jTabbedPane1.addTab("DOCTOR", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 630, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_visual_adminjpg.jpg"))); // NOI18N
        jLabel1.setText("\n");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 680, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_registrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_registrar_usuarioActionPerformed
    String cedula = txr_cedula_usuario.getText().trim();
        String nombre = txt_nombre_usuario.getText().trim();
        String edadStr = txt_edad_usuario.getText().trim();

        if (cedula.isEmpty() || nombre.isEmpty() || edadStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        // Validar si el paciente ya existe por cédula
        if (a.buscarPaciente(cedula) != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Esta cédula ya se encuentra registrada.");
            return;
        }

        try {
            int edad = Integer.parseInt(edadStr);
            // Creamos el nuevo objeto Paciente y lo mandamos al ArrayList/Archivo por medio de Funciones
            Paciente nuevoPaciente = new Paciente(cedula, nombre, edad);
            a.registrarPaciente(nuevoPaciente);
            
            actualizarListaUsuarios();
            limpiarCampos();
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario registrado con éxito.");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "La edad debe ser un número válido.");
        }
    }//GEN-LAST:event_B_registrar_usuarioActionPerformed

    private void B_visualizar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_visualizar_usuarioActionPerformed
        actualizarListaUsuarios();
        javax.swing.JOptionPane.showMessageDialog(this, "Lista de usuarios sincronizada.");
    }//GEN-LAST:event_B_visualizar_usuarioActionPerformed

    private void B_modificar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_modificar_usuarioActionPerformed
       String cedula = txr_cedula_usuario.getText().trim();
        String nuevoNombre = txt_nombre_usuario.getText().trim();
        String nuevaEdadStr = txt_edad_usuario.getText().trim();

        if (cedula.isEmpty() || nuevoNombre.isEmpty() || nuevaEdadStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un usuario o digite la cédula correspondiente.");
            return;
        }

        Paciente paciente = a.buscarPaciente(cedula);
        if (paciente == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe un usuario registrado con esa cédula.");
            return;
        }

        try {
            int nuevaEdad = Integer.parseInt(nuevaEdadStr);
            // Actualizamos los atributos del objeto encontrado
            paciente.setNombre(nuevoNombre);
            paciente.setEdad(nuevaEdad);
            
            // Guardamos los cambios permanentemente en el archivo de texto externo
            a.guardarPacientes(); 
            
            actualizarListaUsuarios();
            limpiarCampos();
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del usuario modificados con éxito.");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "La edad debe ser un número válido.");
        }
    }//GEN-LAST:event_B_modificar_usuarioActionPerformed

    private void B_eliminar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_eliminar_usuarioActionPerformed
       String cedula = txr_cedula_usuario.getText().trim();

        if (cedula.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un usuario o digite su cédula para eliminarlo.");
            return;
        }

        Paciente paciente = a.buscarPaciente(cedula);
        if (paciente == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún usuario con esa cédula.");
            return;
        }

        int confirmar = javax.swing.JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que desea eliminar a " + paciente.getNombre() + "?", 
                "Confirmar eliminación", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirmar == javax.swing.JOptionPane.YES_OPTION) {
            // Removemos de las colecciones de Funciones y guardamos el estado del archivo limpio
            a.getPacientes().remove(paciente);
            a.guardarPacientes();
            
            actualizarListaUsuarios();
            limpiarCampos();
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario eliminado del sistema.");
        }
    }//GEN-LAST:event_B_eliminar_usuarioActionPerformed

    private void B_registrar_farmaceutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_registrar_farmaceutaActionPerformed
      String cedula = txt_cedula_farmaceuta.getText().trim();
        String nombre = txt_nombre_farmaceuta.getText().trim();
        String edadStr = txt_edad_farmaceuta.getText().trim();

        if (cedula.isEmpty() || nombre.isEmpty() || edadStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }
        // Validación crucial: evitar duplicar cédulas con otros farmaceutas
        if (a.buscarFarmaceuta(cedula) != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Esta cédula ya le pertenece a un farmaceuta registrado.");
            return;
        }
        try {
            int edad = Integer.parseInt(edadStr);
            Farmaceuta nuevoFar = new Farmaceuta(cedula, nombre, edad);
            a.registrarFarmaceuta(nuevoFar);
            actualizarListaFarmaceutas();
            limpiarCamposFarmaceuta();
            javax.swing.JOptionPane.showMessageDialog(this, "Farmaceuta registrado con éxito.");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "La edad debe ser un número entero válido.");
        }
    }//GEN-LAST:event_B_registrar_farmaceutaActionPerformed

    private void B_modificar_farmaceutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_modificar_farmaceutaActionPerformed
      String cedula = txt_cedula_farmaceuta.getText().trim();
        String nuevoNombre = txt_nombre_farmaceuta.getText().trim();
        String nuevaEdadStr = txt_edad_farmaceuta.getText().trim();

        if (cedula.isEmpty() || nuevoNombre.isEmpty() || nuevaEdadStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un farmaceuta o digite la cédula correspondiente.");
            return;
        }
        Farmaceuta far = a.buscarFarmaceuta(cedula);
        if (far == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún farmaceuta registrado con esa cédula.");
            return;
        }
        try {
            int nuevaEdad = Integer.parseInt(nuevaEdadStr);
            far.setNombre(nuevoNombre);
            far.setEdad(nuevaEdad);
            a.guardarFarmaceutas(); // Recuerda poner este método como public en Funciones
            actualizarListaFarmaceutas();
            limpiarCamposFarmaceuta();
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del farmaceuta modificados con éxito.");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "La edad debe ser un número entero válido.");
        }
    }//GEN-LAST:event_B_modificar_farmaceutaActionPerformed

    private void B_visualizar_farmaceutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_visualizar_farmaceutaActionPerformed
       actualizarListaFarmaceutas();
       javax.swing.JOptionPane.showMessageDialog(this, "Lista de farmaceutas sincronizada.");
    }//GEN-LAST:event_B_visualizar_farmaceutaActionPerformed

    private void B_eliminar_farmaceutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_eliminar_farmaceutaActionPerformed
       String cedula = txt_cedula_farmaceuta.getText().trim();

        if (cedula.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un farmaceuta o digite su cédula para eliminarlo.");
            return;
        }
        Farmaceuta far = a.buscarFarmaceuta(cedula);
        if (far == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún farmaceuta con esa cédula.");
            return;
        }
        int confirmar = javax.swing.JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que desea eliminar al farmaceuta " + far.getNombre() + "?", 
                "Confirmar eliminación", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirmar == javax.swing.JOptionPane.YES_OPTION) {
            a.getFarmaceutas().remove(far);
            a.guardarFarmaceutas();
            actualizarListaFarmaceutas();
            limpiarCamposFarmaceuta();
            javax.swing.JOptionPane.showMessageDialog(this, "Farmaceuta eliminado del sistema.");
        }
    }//GEN-LAST:event_B_eliminar_farmaceutaActionPerformed

    private void B_registrar_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_registrar_doctorActionPerformed
      String cedula = txt_cedula_doctor.getText().trim();
        String nombre = txt_nombre_doctor.getText().trim();
        String edadStr = txt_edad_doctor.getText().trim();
        // Capturamos lo que el admin escriba como "especialidad" y lo tratamos como el "tipo"
        String tipoEspecialidad = txt_especialidad_doctor.getText().trim().toLowerCase(); 

        if (cedula.isEmpty() || nombre.isEmpty() || edadStr.isEmpty() || tipoEspecialidad.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos, incluyendo la especialidad.");
            return;
        }

        // VALIDACIÓN ESTRICTA
        if (!tipoEspecialidad.equals("cardiologia") && !tipoEspecialidad.equals("dermatologia") 
            && !tipoEspecialidad.equals("pediatria") && !tipoEspecialidad.equals("cita general") && !tipoEspecialidad.equals("general")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Especialidad inválida.\nSolo se permite: Cardiologia, Dermatologia, Pediatria o Cita General.");
            return;
        }
        
        // Si escribe "cita general", lo guardamos como "general" en el sistema
        if (tipoEspecialidad.equals("cita general")) {
            tipoEspecialidad = "general";
        }

        if (a.buscarDoctor(cedula) != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Esta cédula ya le pertenece a un doctor registrado.");
            return;
        }
        try {
            int edad = Integer.parseInt(edadStr);
            // PASAMOS 4 PARÁMETROS: tipo, cedula, nombre, edad (Tal cual lo tienes en Funciones)
            Doctor nuevoDoc = new Doctor(tipoEspecialidad, cedula, nombre, edad);
            a.registrarDoctor(nuevoDoc);
            
            actualizarListaDoctores();
            limpiarCamposDoctor();
            javax.swing.JOptionPane.showMessageDialog(this, "Doctor registrado con éxito.");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "La edad debe ser un número entero válido.");
        }
    }//GEN-LAST:event_B_registrar_doctorActionPerformed

    private void B_modificar_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_modificar_doctorActionPerformed
      String cedula = txt_cedula_doctor.getText().trim();
        String nuevoNombre = txt_nombre_doctor.getText().trim();
        String nuevaEdadStr = txt_edad_doctor.getText().trim();
        String nuevoTipo = txt_especialidad_doctor.getText().trim().toLowerCase();

        if (cedula.isEmpty() || nuevoNombre.isEmpty() || nuevaEdadStr.isEmpty() || nuevoTipo.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un doctor y asegúrese de que todos los campos estén llenos.");
            return;
        }
        
        // VALIDACIÓN AL MODIFICAR
        if (!nuevoTipo.equals("cardiologia") && !nuevoTipo.equals("dermatologia") 
            && !nuevoTipo.equals("pediatria") && !nuevoTipo.equals("cita general") && !nuevoTipo.equals("general")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Especialidad inválida.\nSolo se permite: Cardiologia, Dermatologia, Pediatria o Cita General.");
            return;
        }
        if (nuevoTipo.equals("cita general")) {
            nuevoTipo = "general";
        }

        Doctor doc = a.buscarDoctor(cedula);
        if (doc == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún doctor registrado con esa cédula.");
            return;
        }
        try {
            int nuevaEdad = Integer.parseInt(nuevaEdadStr);
            doc.setNombre(nuevoNombre);
            doc.setEdad(nuevaEdad);
            doc.setTipo(nuevoTipo); // Actualizamos el tipo directamente
            
            a.guardarDoctores(); 
            actualizarListaDoctores();
            limpiarCamposDoctor();
            javax.swing.JOptionPane.showMessageDialog(this, "Datos del doctor modificados con éxito.");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "La edad debe ser un número entero válido.");
        }
    }//GEN-LAST:event_B_modificar_doctorActionPerformed

    private void B_visualizar_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_visualizar_doctorActionPerformed
      actualizarListaDoctores();
      javax.swing.JOptionPane.showMessageDialog(this, "Lista de doctores sincronizada.");
    }//GEN-LAST:event_B_visualizar_doctorActionPerformed

    private void B_eliminar_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_eliminar_doctorActionPerformed
      String cedula = txt_cedula_doctor.getText().trim();

        if (cedula.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un doctor o digite su cédula para eliminarlo.");
            return;
        }
        Doctor doc = a.buscarDoctor(cedula);
        if (doc == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún doctor con esa cédula.");
            return;
        }
        int confirmar = javax.swing.JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que desea eliminar al doctor " + doc.getNombre() + "?", 
                "Confirmar eliminación", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirmar == javax.swing.JOptionPane.YES_OPTION) {
            a.getDoctores().remove(doc);
            a.guardarDoctores();
            actualizarListaDoctores();
            limpiarCamposDoctor();
            javax.swing.JOptionPane.showMessageDialog(this, "Doctor eliminado del sistema.");
        }
    }//GEN-LAST:event_B_eliminar_doctorActionPerformed

    private void actualizarListaDoctores() {
        modeloListaDoctores.clear(); 
        for (Doctor d : a.getDoctores()) {
            modeloListaDoctores.addElement(d.getCedula() + " - " + d.getNombre() + " (" + d.getEdad() + " años)");
        }
    }

    private void limpiarCamposDoctor() {
        txt_cedula_doctor.setText("");
        txt_nombre_doctor.setText("");
        txt_edad_doctor.setText("");
        jList_doctor.clearSelection();
    }

    private void cargarCamposDesdeListaDoctor() {
        String seleccion = jList_doctor.getSelectedValue();
        if (seleccion != null) {
            String[] partes = seleccion.split(" - ");
            txt_cedula_doctor.setText(partes[0].trim());
            
            String[] subPartes = partes[1].split(" \\(");
            txt_nombre_doctor.setText(subPartes[0].trim());
            
            String edadLimpia = subPartes[1].replace(" años)", "").trim();
            txt_edad_doctor.setText(edadLimpia);
        }
    }
    
    private void actualizarListaFarmaceutas() {
        modeloListaFarmaceutas.clear(); 
        for (Farmaceuta f : a.getFarmaceutas()) {
            modeloListaFarmaceutas.addElement(f.getCedula() + " - " + f.getNombre() + " (" + f.getEdad() + " años)");
        }
    }

    
    private void limpiarCamposFarmaceuta() {
        txt_cedula_farmaceuta.setText("");
        txt_nombre_farmaceuta.setText("");
        txt_edad_farmaceuta.setText("");
        jList_farmaceutas.clearSelection();
    }

   
    private void cargarCamposDesdeListaFarmaceuta() {
        String seleccion = jList_farmaceutas.getSelectedValue();
        if (seleccion != null) {
            String[] partes = seleccion.split(" - ");
            txt_cedula_farmaceuta.setText(partes[0].trim());
            
            String[] subPartes = partes[1].split(" \\(");
            txt_nombre_farmaceuta.setText(subPartes[0].trim());
            
            String edad = subPartes[1].replace(" años)", "").trim();
            txt_edad_farmaceuta.setText(edad);
        }
    }
    
    // 1. Método que actualiza dinámicamente el JList con los pacientes reales
    private void actualizarListaUsuarios() {
        modeloListaUsuarios.clear();
        for (Paciente p : a.getPacientes()) {
            modeloListaUsuarios.addElement(p.getCedula() + " - " + p.getNombre() + " (" + p.getEdad() + " años)");
        }
    }

    // 2. Método que limpia todas las cajas de texto automáticamente
    private void limpiarCampos() {
        txr_cedula_usuario.setText("");
        txt_nombre_usuario.setText("");
        txt_edad_usuario.setText("");
        jList1_usuario.clearSelection();
    }

    // 3. Método que toma los datos seleccionados del JList y los carga en los JTextFields
    private void cargarCamposDesdeLista() {
        String seleccion = jList1_usuario.getSelectedValue();
        if (seleccion != null) {
            String[] partes = seleccion.split(" - ");
            txr_cedula_usuario.setText(partes[0].trim());
            
            String[] subPartes = partes[1].split(" \\(");
            txt_nombre_usuario.setText(subPartes[0].trim());
            
            String edad = subPartes[1].replace(" años)", "").trim();
            txt_edad_usuario.setText(edad);
        }
    }
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new visual_Admin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_eliminar_doctor;
    private javax.swing.JButton B_eliminar_farmaceuta;
    private javax.swing.JButton B_eliminar_usuario;
    private javax.swing.JButton B_modificar_doctor;
    private javax.swing.JButton B_modificar_farmaceuta;
    private javax.swing.JButton B_modificar_usuario;
    private javax.swing.JButton B_registrar_doctor;
    private javax.swing.JButton B_registrar_farmaceuta;
    private javax.swing.JButton B_registrar_usuario;
    private javax.swing.JButton B_visualizar_doctor;
    private javax.swing.JButton B_visualizar_farmaceuta;
    private javax.swing.JButton B_visualizar_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1_usuario;
    private javax.swing.JList<String> jList_doctor;
    private javax.swing.JList<String> jList_farmaceutas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane_usuario;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txr_cedula_usuario;
    private javax.swing.JTextField txt_cedula_doctor;
    private javax.swing.JTextField txt_cedula_farmaceuta;
    private javax.swing.JTextField txt_edad_doctor;
    private javax.swing.JTextField txt_edad_farmaceuta;
    private javax.swing.JTextField txt_edad_usuario;
    private javax.swing.JTextField txt_especialidad_doctor;
    private javax.swing.JTextField txt_nombre_doctor;
    private javax.swing.JTextField txt_nombre_farmaceuta;
    private javax.swing.JTextField txt_nombre_usuario;
    // End of variables declaration//GEN-END:variables
}

