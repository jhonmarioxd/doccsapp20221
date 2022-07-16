package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employees;
import persistence.EmployeesDAOImp;

public final class EmployeesList extends javax.swing.JFrame {
 ArrayList<Employees> listEmployees = new ArrayList();
    DefaultTableModel dtmEmployess = new DefaultTableModel();
    private Iterable<Employees> Employees;
    private Object dtm;

    public EmployeesList() {
        initComponents();
        this.setLocationRelativeTo(null);
        setModelo();
    }

    public void setModelo() {
        String[] header = {"Id", "Full Name", "Address", "Email", "Phone", "Payments", "Hours", "Notes"};
        dtmEmployess.setColumnIdentifiers(header);
        employeesTbl.setModel(dtmEmployess);
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeesTbl = new javax.swing.JTable();
        EmployeesDeleteTxt = new javax.swing.JButton();
        EmployeesUpdateTxt = new javax.swing.JButton();
        EmployeesCloseTxt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EmployeesDataTxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(employeesTbl);

        EmployeesDeleteTxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        EmployeesDeleteTxt.setText("Delete");
        EmployeesDeleteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeesDeleteTxtActionPerformed(evt);
            }
        });

        EmployeesUpdateTxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        EmployeesUpdateTxt.setText("Update");
        EmployeesUpdateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeesUpdateTxtActionPerformed(evt);
            }
        });

        EmployeesCloseTxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        EmployeesCloseTxt.setText("Close");
        EmployeesCloseTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeesCloseTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(EmployeesCloseTxt)
                .addGap(67, 67, 67)
                .addComponent(EmployeesDeleteTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(EmployeesUpdateTxt)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeesDeleteTxt)
                    .addComponent(EmployeesCloseTxt)
                    .addComponent(EmployeesUpdateTxt))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Employees");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("List Mode");

        EmployeesDataTxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        EmployeesDataTxt.setText("Data");
        EmployeesDataTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeesDataTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmployeesDataTxt)
                    .addComponent(jLabel2))
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(EmployeesDataTxt)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeesDataTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeesDataTxtActionPerformed
        EmployeesDAOImp employeesDAOImp = new EmployeesDAOImp();
        //Se traen los datos de la BD
        try {
            listEmployees = (ArrayList<Employees>) employeesDAOImp.listEmployees();
            Object[] data = new Object[dtmEmployess.getColumnCount()];
            int i = 1;
            dtmEmployess.setRowCount(0);
            for (Employees employees : listEmployees) {
                data[0] = employees.getId();
                data[1] = employees.getFullName();
                data[2] = employees.getAddress();
                data[3] = employees.getEmail();
                data[4] = employees.getPhone();
                data[5] = employees.getHours();
                data[6] = employees.getPayments();
                data[7] = employees.getNotes();
                i++;
                dtmEmployess.addRow(data);
            }
            employeesTbl.setModel(dtmEmployess);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EmployeesDataTxtActionPerformed

    private void EmployeesDeleteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeesDeleteTxtActionPerformed
                int index = employeesTbl.getSelectedRow();
        Employees employees = listEmployees.get(index);
        //JOptionPane.showMessageDialog(null, client.getId());
       EmployeesDAOImp employeesDAOImp = new EmployeesDAOImp();
        int rta = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?",
                "Remove Employees Registry", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (rta == 0) {
            try {
                employeesDAOImp.deleteEmployees(employees);
                JOptionPane.showMessageDialog(null, "Deleted Employees Record");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Operation Not Performed");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operation Not Performed");
        }
        if (dtmEmployess.getRowCount() > 0) {
            for (int i = dtmEmployess.getRowCount() - 1; i > -1; i--) {
                dtmEmployess.removeRow(i);
            }
            try {
                var employeesl = employeesDAOImp.listEmployees();
                Object[] data = new Object[dtmEmployess.getColumnCount()];
                int i = 1;
                dtmEmployess.setRowCount(0);
                for (Employees e : employeesl) {
                    data[0] = e.getId();
                    data[1] = e.getFullName();
                    data[2] = e.getAddress();
                    data[3] = e.getEmail();
                    data[4] = e.getPhone();
                    data[5] = e.getHours();
                    data[6] = e.getPayments();
                    data[7] = e.getNotes();
                    i++;
                     dtmEmployess.addRow(data);
                }
                employeesTbl.setModel( dtmEmployess);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
         
    
    }//GEN-LAST:event_EmployeesDeleteTxtActionPerformed

    private void EmployeesUpdateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeesUpdateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeesUpdateTxtActionPerformed

    private void EmployeesCloseTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeesCloseTxtActionPerformed
        
    }//GEN-LAST:event_EmployeesCloseTxtActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EmployeesList().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployeesCloseTxt;
    private javax.swing.JButton EmployeesDataTxt;
    private javax.swing.JButton EmployeesDeleteTxt;
    private javax.swing.JButton EmployeesUpdateTxt;
    private javax.swing.JTable employeesTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
