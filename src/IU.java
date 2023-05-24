/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC-LORENZO
 */
public class IU extends javax.swing.JFrame {

    /**
     * Creates new form IU
     */
    public IU() {
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

        jPanel1 = new javax.swing.JPanel();
        speedNLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        modelField = new javax.swing.JTextField();
        plateField = new javax.swing.JTextField();
        speedDownButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        speedUpButton = new javax.swing.JButton();
        plateLabel = new javax.swing.JLabel();
        plateSearchLabel = new javax.swing.JLabel();
        plateSearchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        speedLabel = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        speedNLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        speedNLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(speedNLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, 100, 70));

        modelLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        modelLabel.setForeground(new java.awt.Color(255, 255, 255));
        modelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modelLabel.setText("MODELO:");
        jPanel1.add(modelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 175, 65));

        modelField.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        modelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelFieldActionPerformed(evt);
            }
        });
        jPanel1.add(modelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 270, 60));

        plateField.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        plateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateFieldActionPerformed(evt);
            }
        });
        jPanel1.add(plateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 270, 60));

        speedDownButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        speedDownButton.setText("BAJAR VELOCIDAD");
        speedDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedDownButtonActionPerformed(evt);
            }
        });
        jPanel1.add(speedDownButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 430, 210, 60));

        title.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("MVC COCHES LONOAL");
        title.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 30, 316, 88));

        createButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        createButton.setText("CREAR");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 210, 60));

        speedUpButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        speedUpButton.setText("SUBIR VELOCIDAD");
        speedUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(speedUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, 210, 60));

        plateLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        plateLabel.setForeground(new java.awt.Color(255, 255, 255));
        plateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plateLabel.setText("MATRICULA:");
        jPanel1.add(plateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 175, 65));

        plateSearchLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        plateSearchLabel.setForeground(new java.awt.Color(255, 255, 255));
        plateSearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plateSearchLabel.setText("MATRICULA:");
        jPanel1.add(plateSearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 175, 65));

        plateSearchField.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        plateSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateSearchFieldActionPerformed(evt);
            }
        });
        jPanel1.add(plateSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 270, 60));

        searchButton.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        searchButton.setText("BUSCAR");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 210, 60));

        speedLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        speedLabel.setForeground(new java.awt.Color(255, 255, 255));
        speedNLabel.setForeground(new java.awt.Color(255, 255, 255));
        speedLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        speedLabel.setText("VELOCIDAD: ");
        jPanel1.add(speedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 210, 120, 70));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\COD\\MVC_coches_LONOAL\\icons\\bg.jpg")); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelFieldActionPerformed

    private void plateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plateFieldActionPerformed

    private void plateSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plateSearchFieldActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        Controller.crearCoche(modelField.getText(),plateField.getText());
    }//GEN-LAST:event_createButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void speedDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedDownButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speedDownButtonActionPerformed

    private void speedUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedUpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speedUpButtonActionPerformed


    public static void start() {
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
            java.util.logging.Logger.getLogger(IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton createButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modelField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField plateField;
    private javax.swing.JLabel plateLabel;
    private javax.swing.JTextField plateSearchField;
    private javax.swing.JLabel plateSearchLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton speedDownButton;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JLabel speedNLabel;
    private javax.swing.JButton speedUpButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
