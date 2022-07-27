
package view;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Confidential;
import persistence.ConfidentialDAOlmp;

public class ConfidentialList extends javax.swing.JFrame {
ArrayList<Confidential> listConfidential = new ArrayList();
    DefaultTableModel dtmConfidentials = new DefaultTableModel();
    
    public ConfidentialList() {
        initComponents();
         this.setLocationRelativeTo(null);
        setModelo();
    }
    
public void setModelo() {
        String[] header = {"Id", "Password", "Comercial Name", "phone", "Email", "Date","Employee", "salary", "Insurance records" , "Bank cards", "Financial institutions", "Country", "City", "Tax returns","State", "Type" , "Notes","Organization"}; 
    dtmConfidentials.setColumnIdentifiers(header);
        confidentialTbl.setModel(dtmConfidentials);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ConfidentialData = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        confidentialModeLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        confidentialTbl = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        confidentialCloseBtn = new javax.swing.JButton();
        confidentialUpdateBtn = new javax.swing.JButton();
        confidentialDeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        ConfidentialData.setBackground(new java.awt.Color(255, 255, 51));
        ConfidentialData.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        ConfidentialData.setForeground(new java.awt.Color(0, 0, 0));
        ConfidentialData.setText("Data");
        ConfidentialData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialDataActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("CONFIDENTIAL");

        confidentialModeLbl.setBackground(new java.awt.Color(255, 255, 255));
        confidentialModeLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confidentialModeLbl.setText("List Mode");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(confidentialModeLbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(confidentialModeLbl)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(413, 413, 413))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ConfidentialData)
                        .addGap(479, 479, 479))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConfidentialData)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        confidentialTbl.setBackground(new java.awt.Color(0, 102, 51));
        confidentialTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(confidentialTbl);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        confidentialCloseBtn.setBackground(new java.awt.Color(51, 255, 102));
        confidentialCloseBtn.setText("Close");
        confidentialCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confidentialCloseBtnActionPerformed(evt);
            }
        });

        confidentialUpdateBtn.setBackground(new java.awt.Color(51, 51, 255));
        confidentialUpdateBtn.setText("Update");
        confidentialUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confidentialUpdateBtnActionPerformed(evt);
            }
        });

        confidentialDeleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        confidentialDeleteBtn.setText("Delete");
        confidentialDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confidentialDeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(confidentialDeleteBtn)
                .addGap(404, 404, 404)
                .addComponent(confidentialUpdateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confidentialCloseBtn)
                .addGap(67, 67, 67))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confidentialCloseBtn)
                    .addComponent(confidentialUpdateBtn)
                    .addComponent(confidentialDeleteBtn))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfidentialDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialDataActionPerformed
        ConfidentialDAOlmp confidentialDAOlmp = new ConfidentialDAOlmp();
        //Se traen los datos de la BD
        try {
            listConfidential = (ArrayList<Confidential>) confidentialDAOlmp.listConfidential();
            Collections.sort(listConfidential);
            Object[] data = new Object[dtmConfidentials.getColumnCount()];
            int i = 1;
            dtmConfidentials.setRowCount(0);
            for (Confidential confidential : listConfidential) {
                data[0] = confidential.getId();
                data[1] = confidential.getFullName();
                data[2] = confidential.getPassword();
                data[3] = confidential.getPhone();
                data[4] = confidential.getEmail();
                data[5] = confidential.getDate();
                data[6] = confidential.getSource();
                data[7] = confidential.getEmployeessalary();
                data[8] = confidential.getTaxreturns();
                data[9] = confidential.getInsurancerecords();
                data[10] = confidential.getBankcards();
                data[11] = confidential.getFinancialinstitutions();
                data[12] = confidential.getCountry();
                data[13] = confidential.getCity();
                data[14] = confidential.isState();
                data[15] = confidential.getType();
                data[16] = confidential.getNotes();
                data[17] = confidential.getOrg().getComercialName();
                i++;
                dtmConfidentials.addRow(data);
            }
            confidentialTbl.setModel(dtmConfidentials);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ConfidentialDataActionPerformed

    private void confidentialCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confidentialCloseBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_confidentialCloseBtnActionPerformed

    private void confidentialDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confidentialDeleteBtnActionPerformed
        int index = confidentialTbl.getSelectedRow();
        Confidential confidential = listConfidential.get(index);
        //JOptionPane.showMessageDialog(null, Confidential.getId());
        ConfidentialDAOlmp ConfidentialDAOlmp = new ConfidentialDAOlmp();
        int rta = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?",
            "Remove Client Registry", JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE);
        if (rta == 0) {
            try {
                ConfidentialDAOlmp.deleteConfidential(confidential);
                JOptionPane.showMessageDialog(null, "Deleted Confidential Record");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Operation Not Performed");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operation Not Performed");
        }
        if (dtmConfidentials.getRowCount() > 0) {
            for (int i = dtmConfidentials.getRowCount() - 1; i > -1; i--) {
                dtmConfidentials.removeRow(i);
            }
            try {
                var confidentials = ConfidentialDAOlmp.listConfidential();
                Object[] data = new Object[dtmConfidentials.getColumnCount()];
                int i = 1;
                dtmConfidentials.setRowCount(0);
                for (Confidential c : confidentials) {
                   data[0] = confidential.getId();
                data[1] = confidential.getFullName();
                data[2] = confidential.getPassword();
                data[3] = confidential.getPhone();
                data[4] = confidential.getEmail();
                data[5] = confidential.getDate();
                data[6] = confidential.getSource();
                data[7] = confidential.getEmployeessalary();
                data[8] = confidential.getTaxreturns();
                data[9] = confidential.getInsurancerecords();
                data[10] = confidential.getBankcards();
                data[11] = confidential.getFinancialinstitutions();
                data[12] = confidential.getCountry();
                data[13] = confidential.getCity();
                data[14] = confidential.isState();
                data[15] = confidential.getType();
                data[16] = confidential.getNotes();
                data[17] = confidential.getOrg().getComercialName();
                    i++;
                    dtmConfidentials.addRow(data);
                }
                confidentialTbl.setModel(dtmConfidentials);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_confidentialDeleteBtnActionPerformed

    private void confidentialUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confidentialUpdateBtnActionPerformed
        int index = confidentialTbl.getSelectedRow();
        Confidential confidential = listConfidential.get(index);
        System.out.println(confidential.toString());
        ConfidentialEdit confidentialEdit=new ConfidentialEdit(confidential,1);
        confidentialEdit.setVisible(true);
    }//GEN-LAST:event_confidentialUpdateBtnActionPerformed

    @SuppressWarnings("unchecked")
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
            java.util.logging.Logger.getLogger(ConfidentialList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfidentialList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfidentialList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfidentialList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfidentialList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfidentialData;
    private javax.swing.JButton confidentialCloseBtn;
    private javax.swing.JButton confidentialDeleteBtn;
    private javax.swing.JLabel confidentialModeLbl;
    private javax.swing.JTable confidentialTbl;
    private javax.swing.JButton confidentialUpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
