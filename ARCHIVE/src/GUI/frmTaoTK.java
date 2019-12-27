/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ngoc
 */
public class frmTaoTK extends javax.swing.JPanel {


    private Connection conn;
    /**
     * Creates new form frmTaoTK
     */
    public frmTaoTK() {
        initComponents();
        getCBbox();
    }

    
    private void getCBbox() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
            PreparedStatement ps = conn.prepareStatement("SELECT MaNV FROM TblTTNVCoBan EXCEPT SELECT NhanVien FROM tbuser");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbxMaNV.addItem(rs.getString("MaNV"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icoTen1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        icoTenDangNhap = new javax.swing.JLabel();
        icoPassword = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        icoTen = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        cbxTen = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        icoNhanVien = new javax.swing.JLabel();
        cbxMaNV = new javax.swing.JComboBox<>();

        icoTen1.setBackground(new java.awt.Color(3, 100, 117));
        icoTen1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        icoTen1.setForeground(new java.awt.Color(3, 100, 117));
        icoTen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlnstl/src/name (1).png"))); // NOI18N
        icoTen1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(107, 195, 196)));

        setBackground(new java.awt.Color(107, 195, 196));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(107, 195, 196)));

        jPanel1.setBackground(new java.awt.Color(107, 195, 196));

        jPanel3.setBackground(new java.awt.Color(254, 255, 250));

        lblUsername.setBackground(new java.awt.Color(3, 100, 117));
        lblUsername.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(3, 100, 117));
        lblUsername.setText("Tên đăng nhập");

        lblPassword.setBackground(new java.awt.Color(3, 100, 117));
        lblPassword.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(3, 100, 117));
        lblPassword.setText("Mật khẩu");

        txtUsername.setBackground(new java.awt.Color(254, 255, 250));
        txtUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(3, 100, 117));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(107, 195, 196)));

        txtPassword.setBackground(new java.awt.Color(254, 255, 250));
        txtPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(3, 100, 117));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(107, 195, 196)));

        icoTenDangNhap.setBackground(new java.awt.Color(3, 100, 117));
        icoTenDangNhap.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        icoTenDangNhap.setForeground(new java.awt.Color(3, 100, 117));
        icoTenDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlnstl/src/user(1).png"))); // NOI18N
        icoTenDangNhap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(107, 195, 196)));

        icoPassword.setBackground(new java.awt.Color(3, 100, 117));
        icoPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        icoPassword.setForeground(new java.awt.Color(3, 100, 117));
        icoPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlnstl/src/key-silhouette-security-tool-interface-symbol-of-password.png"))); // NOI18N
        icoPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(107, 195, 196)));

        lblTen.setBackground(new java.awt.Color(3, 100, 117));
        lblTen.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblTen.setForeground(new java.awt.Color(3, 100, 117));
        lblTen.setText("Chức vụ");

        icoTen.setBackground(new java.awt.Color(3, 100, 117));
        icoTen.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        icoTen.setForeground(new java.awt.Color(3, 100, 117));
        icoTen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlnstl/src/name (1).png"))); // NOI18N

        lblNhanVien.setBackground(new java.awt.Color(3, 100, 117));
        lblNhanVien.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(3, 100, 117));
        lblNhanVien.setText("Mã nhân viên");

        btnSignUp.setBackground(new java.awt.Color(3, 100, 117));
        btnSignUp.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(254, 255, 250));
        btnSignUp.setText("Tạo");
        btnSignUp.setBorder(null);
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        cbxTen.setBackground(new java.awt.Color(254, 255, 250));
        cbxTen.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cbxTen.setForeground(new java.awt.Color(3, 100, 117));
        cbxTen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direction", "Managers", "Employees" }));

        jPanel2.setBackground(new java.awt.Color(3, 100, 117));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblLogo.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(254, 255, 250));
        lblLogo.setText("Tạo tài khoản");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lblLogo)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        icoNhanVien.setBackground(new java.awt.Color(3, 100, 117));
        icoNhanVien.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        icoNhanVien.setForeground(new java.awt.Color(3, 100, 117));
        icoNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlnstl/src/name (1).png"))); // NOI18N

        cbxMaNV.setBackground(new java.awt.Color(254, 255, 250));
        cbxMaNV.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cbxMaNV.setForeground(new java.awt.Color(3, 100, 117));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTen)
                    .addComponent(lblNhanVien)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(103, 103, 103))
                            .addComponent(cbxMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(icoPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(icoTenDangNhap))
                            .addComponent(icoTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icoNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoTenDangNhap))
                .addGap(31, 31, 31)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoPassword))
                .addGap(31, 31, 31)
                .addComponent(lblTen)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxTen))
                .addGap(30, 30, 30)
                .addComponent(lblNhanVien)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icoNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxMaNV))
                .addGap(38, 38, 38)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpMouseClicked

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        if (txtUsername.getText().equals("") == true) {
            JOptionPane.showMessageDialog(null, "Tên đăng nhập không được để trống");
        } else if (txtPassword.getText().equals("") == true) {
            JOptionPane.showMessageDialog(null, "Mật khấu không được để trống");
        } else {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLNS;" + "username=sa;password=123456");
                String sql = "INSERT INTO tbuser(Username, Pass, ChucVu, NhanVien)"
                + "values(?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, txtUsername.getText());
                ps.setString(2, txtPassword.getText());
                ps.setString(3, cbxTen.getSelectedItem().toString());
                ps.setString(4, cbxMaNV.getSelectedItem().toString());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Tạo thành công!");
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
        }    
    }//GEN-LAST:event_btnSignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> cbxMaNV;
    private javax.swing.JComboBox<String> cbxTen;
    private javax.swing.JLabel icoNhanVien;
    private javax.swing.JLabel icoPassword;
    private javax.swing.JLabel icoTen;
    private javax.swing.JLabel icoTen1;
    private javax.swing.JLabel icoTenDangNhap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblUsername;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
