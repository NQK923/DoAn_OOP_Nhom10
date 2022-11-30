/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewAndController;

import ConnectDatabase.ConnectToXampp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import modun.Account;
import modun.banyanFlower;
import modun.listFlower;
import modun.singleFlower;

/**
 *
 * @author HP
 */
public class View_Login extends javax.swing.JFrame {

    private View_Admin vAdmin;
    private View_NhanVien vNhanVien;
    private List<Account> listAcc = new ArrayList<>();

    /**
     * Creates new form login
     */
    public View_Login() {
        uploadData();
        initComponents();
        formsigin.setVisible(false);
        formpass.setVisible(false);
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
        formin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userlogin = new javax.swing.JTextField();
        passlogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sigup = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        formsigin = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        usersigup = new javax.swing.JTextField();
        passsigup = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passnextsigup = new javax.swing.JTextField();
        gmail = new javax.swing.JTextField();
        formpass = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        usergetpass = new javax.swing.JTextField();
        emailgetpass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        urPass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        formin.setBackground(new java.awt.Color(204, 255, 204));
        formin.setForeground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME");

        userlogin.setBackground(new java.awt.Color(0, 255, 204));
        userlogin.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        userlogin.setForeground(new java.awt.Color(255, 255, 255));
        userlogin.setText("USER NAME:");
        userlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userloginMouseClicked(evt);
            }
        });

        passlogin.setBackground(new java.awt.Color(0, 255, 204));
        passlogin.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        passlogin.setForeground(new java.awt.Color(255, 255, 255));
        passlogin.setText("PASSWORD:");
        passlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passloginMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        sigup.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        sigup.setForeground(new java.awt.Color(204, 0, 51));
        sigup.setText("SIGNUP");
        sigup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sigupMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOT A MENBER ?.");

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("FORGOT   PASSWORD ?.");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sigup)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userlogin)
                            .addComponent(passlogin))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(userlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sigup)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout forminLayout = new javax.swing.GroupLayout(formin);
        formin.setLayout(forminLayout);
        forminLayout.setHorizontalGroup(
            forminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forminLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        forminLayout.setVerticalGroup(
            forminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forminLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        formsigin.setBackground(new java.awt.Color(204, 255, 204));
        formsigin.setForeground(new java.awt.Color(204, 255, 204));

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WELCOME");

        usersigup.setBackground(new java.awt.Color(0, 255, 204));
        usersigup.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        usersigup.setForeground(new java.awt.Color(255, 255, 255));
        usersigup.setText("USER NAME:");
        usersigup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersigupMouseClicked(evt);
            }
        });
        usersigup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersigupActionPerformed(evt);
            }
        });

        passsigup.setBackground(new java.awt.Color(0, 255, 204));
        passsigup.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        passsigup.setForeground(new java.awt.Color(255, 255, 255));
        passsigup.setText("PASSWORD:");
        passsigup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passsigupMouseClicked(evt);
            }
        });
        passsigup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passsigupActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setText("SIGNUP");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        passnextsigup.setBackground(new java.awt.Color(0, 255, 204));
        passnextsigup.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        passnextsigup.setForeground(new java.awt.Color(255, 255, 255));
        passnextsigup.setText(" CONFIRM PASSWORD:");
        passnextsigup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passnextsigupMouseClicked(evt);
            }
        });
        passnextsigup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passnextsigupActionPerformed(evt);
            }
        });

        gmail.setBackground(new java.awt.Color(0, 255, 204));
        gmail.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        gmail.setForeground(new java.awt.Color(255, 255, 255));
        gmail.setText("Email:");
        gmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gmailMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usersigup)
                            .addComponent(passsigup)
                            .addComponent(passnextsigup)
                            .addComponent(gmail))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(137, 137, 137))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(usersigup, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passsigup, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passnextsigup, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gmail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formsiginLayout = new javax.swing.GroupLayout(formsigin);
        formsigin.setLayout(formsiginLayout);
        formsiginLayout.setHorizontalGroup(
            formsiginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formsiginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        formsiginLayout.setVerticalGroup(
            formsiginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formsiginLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        formpass.setBackground(new java.awt.Color(204, 255, 204));
        formpass.setForeground(new java.awt.Color(204, 255, 204));

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("WELCOME");

        usergetpass.setBackground(new java.awt.Color(0, 255, 204));
        usergetpass.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        usergetpass.setForeground(new java.awt.Color(255, 255, 255));
        usergetpass.setText("USER NAME:");
        usergetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usergetpassMouseClicked(evt);
            }
        });
        usergetpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usergetpassActionPerformed(evt);
            }
        });

        emailgetpass.setBackground(new java.awt.Color(0, 255, 204));
        emailgetpass.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        emailgetpass.setForeground(new java.awt.Color(255, 255, 255));
        emailgetpass.setText("Email:");
        emailgetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailgetpassMouseClicked(evt);
            }
        });
        emailgetpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailgetpassActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 204));
        jLabel9.setText("get password ");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        urPass.setBackground(new java.awt.Color(0, 255, 204));
        urPass.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        urPass.setForeground(new java.awt.Color(255, 255, 255));
        urPass.setText("your password:");
        urPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urPassActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 153));
        jLabel10.setText(" come back");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usergetpass)
                            .addComponent(emailgetpass)
                            .addComponent(urPass))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(usergetpass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailgetpass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(64, 64, 64)
                .addComponent(urPass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout formpassLayout = new javax.swing.GroupLayout(formpass);
        formpass.setLayout(formpassLayout);
        formpassLayout.setHorizontalGroup(
            formpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formpassLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        formpassLayout.setVerticalGroup(
            formpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formpassLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(formin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formsigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(635, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formsigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersigupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersigupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usersigupActionPerformed

    private void passnextsigupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passnextsigupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passnextsigupActionPerformed

    private void usergetpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usergetpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usergetpassActionPerformed

    private void urPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urPassActionPerformed

    private void userloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userloginMouseClicked
        userlogin.setText("");
    }//GEN-LAST:event_userloginMouseClicked

    private void passloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passloginMouseClicked
        passlogin.setText("");
    }//GEN-LAST:event_passloginMouseClicked

    private void sigupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigupMouseClicked
        formin.setVisible(false);
        formsigin.setVisible(true);
    }//GEN-LAST:event_sigupMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        formin.setVisible(false);
        formpass.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.signUp();
        formsigin.setVisible(false);
        formin.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void usersigupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersigupMouseClicked
        usersigup.setText("");
    }//GEN-LAST:event_usersigupMouseClicked

    private void passsigupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passsigupActionPerformed
        passsigup.setText("");
    }//GEN-LAST:event_passsigupActionPerformed

    private void passnextsigupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passnextsigupMouseClicked
        passnextsigup.setText("");
    }//GEN-LAST:event_passnextsigupMouseClicked

    private void gmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gmailMouseClicked
        gmail.setText("");
    }//GEN-LAST:event_gmailMouseClicked

    private void usergetpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usergetpassMouseClicked
        usergetpass.setText("");
    }//GEN-LAST:event_usergetpassMouseClicked

    private void emailgetpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailgetpassMouseClicked
        emailgetpass.setText("");
    }//GEN-LAST:event_emailgetpassMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        formpass.setVisible(false);
        formin.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void passsigupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passsigupMouseClicked
        passsigup.setText("");
    }//GEN-LAST:event_passsigupMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.uploadData();
        this.ktAccount();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void emailgetpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailgetpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailgetpassActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Login().setVisible(true);
            }
        });
    }

    public void ktAccount() {
        for (Account account : listAcc) {
            if (userlogin.getText().equals("admin") && userlogin.getText().equals(account.getUserName()) && passlogin.getText().equals(account.getPassWord())) {
                vAdmin = new View_Admin();
                vAdmin.setVisible(true);
            } else if (!userlogin.getText().equals("admin") && userlogin.getText().equals(account.getUserName()) && passlogin.getText().equals(account.getPassWord())) {
                vNhanVien = new View_NhanVien();
                vNhanVien.setVisible(true);
            }
        }

    }

    private void uploadData() {
        listAcc = ConnectToXampp.findAllAccount();
        for (Account account : listAcc) {

            listAcc.add(new Account(account.getUserName(), account.getGmail(), account.getPassWord()));
        }
    }

    private void signUp() {
        String userName = usersigup.getText();
        String gmail = this.gmail.getText();
        String passWord = passsigup.getText();
        String cfPW = passnextsigup.getText();

        if (userName.equals("") || gmail.equals("") || passWord.equals("") || cfPW.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Hãy điền đủ thông tin!");
            return;
        }
        if (passWord.equals(cfPW)) {
            JOptionPane.showMessageDialog(rootPane, "Xác nhận mật khẩu không chính xác, vui lòng nhập lại!");
            return;
        }
        Account accountTemp = new Account(userName, gmail, passWord);

        for (Account account : listAcc) {
            if (userName.equals(account.getUserName())) {
                JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập đã tồn tại!");
                return;
            }
            listAcc.add(new Account(userName, gmail, passWord));
            ConnectToXampp.insertAccount(accountTemp);
        }
    }

    private void fogotPass() {
        String userName = usergetpass.getText();
        String gmail = emailgetpass.getText();

        if (userName.equals("") || gmail.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Hãy điền đủ thông tin!");
            return;
        }
        for (Account account : listAcc) {
            if (userName.equals(account.getUserName()) && gmail.equals(account.getGmail())) {
                urPass.setText(account.getPassWord());
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Thông tin bạn nhập không chính xác!");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailgetpass;
    private javax.swing.JPanel formin;
    private javax.swing.JPanel formpass;
    private javax.swing.JPanel formsigin;
    private javax.swing.JTextField gmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField passlogin;
    private javax.swing.JTextField passnextsigup;
    private javax.swing.JTextField passsigup;
    private javax.swing.JLabel sigup;
    private javax.swing.JTextField urPass;
    private javax.swing.JTextField usergetpass;
    private javax.swing.JTextField userlogin;
    private javax.swing.JTextField usersigup;
    // End of variables declaration//GEN-END:variables
}
