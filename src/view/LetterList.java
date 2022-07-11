
package view;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Letter;
import persistence.LetterDAOlmp;


public class LetterList extends javax.swing.JFrame {

   ArrayList<Letter> listLetter = new ArrayList();
    DefaultTableModel dtmLetters = new DefaultTableModel();

    public LetterList() {
        initComponents();
        this.setLocationRelativeTo(null);
        setModelo();
    }

    public void setModelo() {
        String[] header = {"Id", "fullNameorbusiness", "Recipientsname", "Date", "address", "affair", "Phone" , "Email", "PostalCode", "place", "firm" , "State", "Type", "Notes"}; 
    dtmLetters.setColumnIdentifiers(header);
        letterTbl.setModel(dtmLetters);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        letterTbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        LetterData = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        letterCloseBtn = new javax.swing.JButton();
        letterUpdateBtn = new javax.swing.JButton();
        letterDeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        letterTbl.setBackground(new java.awt.Color(0, 102, 51));
        letterTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(letterTbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        LetterData.setBackground(new java.awt.Color(255, 255, 51));
        LetterData.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        LetterData.setForeground(new java.awt.Color(0, 0, 0));
        LetterData.setText("Data");
        LetterData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterDataActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("LETTERS");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("List Mode");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
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
                        .addGap(420, 420, 420))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LetterData)
                        .addGap(455, 455, 455))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LetterData)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        letterCloseBtn.setBackground(new java.awt.Color(51, 255, 102));
        letterCloseBtn.setText("Close");
        letterCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterCloseBtnActionPerformed(evt);
            }
        });

        letterUpdateBtn.setBackground(new java.awt.Color(51, 51, 255));
        letterUpdateBtn.setText("Update");

        letterDeleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        letterDeleteBtn.setText("Delete");
        letterDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterDeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(letterDeleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(letterUpdateBtn)
                .addGap(354, 354, 354)
                .addComponent(letterCloseBtn)
                .addGap(67, 67, 67))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letterCloseBtn)
                    .addComponent(letterUpdateBtn)
                    .addComponent(letterDeleteBtn))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LetterDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterDataActionPerformed
        LetterDAOlmp letterDAOlmp = new LetterDAOlmp();
       
        try {
            listLetter = (ArrayList<Letter>) letterDAOlmp.listLetter();
            Object[] data = new Object[dtmLetters.getColumnCount()];
            int i = 1;
            dtmLetters.setRowCount(0);
            for (Letter letter : listLetter) {
                data[0] = letter.getId();
                data[1] = letter.getFullNameorbusiness();
                data[2] = letter.getRecipientsname();
                data[3] = letter.getDate();
                data[4] = letter.getAddress();
                data[5] = letter.getAffair();
                data[6] = letter.getPhone();
                data[7] = letter.getEmail();
                data[8] = letter.getPostalCode();
                data[9] = letter.getPlace();
                data[10] = letter.getFirm();
                data[11] = letter.isState();
                data[12] = letter.getType();
                data[13] = letter.getNotes();
                i++;
                dtmLetters.addRow(data);
            }
            letterTbl.setModel(dtmLetters);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LetterDataActionPerformed

    private void letterCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterCloseBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_letterCloseBtnActionPerformed

    private void letterDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterDeleteBtnActionPerformed
         int index = letterTbl.getSelectedRow();
        Letter letter = listLetter.get(index);
        LetterDAOlmp LetterDAOlmp = new LetterDAOlmp();
        int rta = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?",
                "Remove Client Registry", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (rta == 0) {
            try {
                LetterDAOlmp.deleteLetter(letter);
                JOptionPane.showMessageDialog(null, "Deleted Client Record");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Operation Not Performed");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operation Not Performed");
        }
        if (dtmLetters.getRowCount() > 0) {
            for (int i = dtmLetters.getRowCount() - 1; i > -1; i--) {
                dtmLetters.removeRow(i);
            }
            try {
                var letters = LetterDAOlmp.listLetter();
                Object[] data = new Object[dtmLetters.getColumnCount()];
                int i = 1;
                dtmLetters.setRowCount(0);
                for (Letter c : letters) {
                data[0] = letter.getId();
                data[1] = letter.getFullNameorbusiness();
                data[2] = letter.getRecipientsname();
                data[3] = letter.getDate();
                data[4] = letter.getAddress();
                data[5] = letter.getAffair();
                data[6] = letter.getEmail();
                data[7] = letter.getPhone();
                data[8] = letter.getFirm();
                data[9] = letter.getPostalCode();
                data[10] = letter.getPlace();
                data[11] = letter.isState();
                data[12] = letter.getType();
                data[13] = letter.getNotes();
                i++;
                    dtmLetters.addRow(data);
                }
                letterTbl.setModel(dtmLetters);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_letterDeleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LetterList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LetterList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LetterList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LetterList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LetterList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LetterData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton letterCloseBtn;
    private javax.swing.JButton letterDeleteBtn;
    private javax.swing.JTable letterTbl;
    private javax.swing.JButton letterUpdateBtn;
    // End of variables declaration//GEN-END:variables
}
