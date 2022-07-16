package view;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Client;
import model.Organization;
import persistence.ClientDAOImp;
import persistence.OrganizationDAOImp;
import util.Util;

public class ClientEdit extends javax.swing.JFrame {
    
    //Collection of Organization
    private ArrayList<Organization> listOrganization;
    private int mode;
    private Client client;

    public ClientEdit() {
        initComponents();
        loadOrganizationJList();
        this.setLocationRelativeTo(null);
    }
    
    //Este constructor se usa para recibir el objeto Client, desde la forma de 
    //ClientList para editar los datos.
    public ClientEdit(Client client, int mode) {
        this.mode=mode;
        if (this.mode == 1) {
            initComponents();
            loadOrganizationJList();
            this.setLocationRelativeTo(null);
            clientModeLbl.setText("Update mode");
            jPanel1.setBackground(Color.red);
            clientIdTxtF.setText(String.valueOf(client.getId()));
            clientEmailTxtF.setText(client.getEmail());
            clientFullNameTxtF.setText(client.getFullName());
            clientAddressTxtF.setText(client.getAddress());;
            clientNotesTxtA.setText(client.getNotes());
            clientPhoneTxtF.setText(client.getPhone());
            var idx = clientTypeCmB.getItemCount();
            for (int i = 0; i < idx; i++) {
                if (clientTypeCmB.getItemAt(i).compareTo(client.getType()) == 0) {
                    clientTypeCmB.setSelectedIndex(i);
                    break;
                }
                else
                    clientTypeCmB.setSelectedIndex(2);
            }
            clientStateChB.setSelected(client.isState());
            Organization o=client.getOrg();
            idx=getIdxLstOrg(o);
            orgJList.setSelectedIndex(idx);
        }
    }
    
    public void cleanAll(){
        clientIdTxtF.setText("");
        clientEmailTxtF.setText("");
        clientFullNameTxtF.setText("");
        clientAddressTxtF.setText("");;
        clientNotesTxtA.setText("");
        clientPhoneTxtF.setText("");
        //clientStateTxtF.setText("");
        //clienteTypeTxtF.setText("");
    }
    //Para cargar los datos de organizaciones al control List ordenados por nombre.
    public void loadOrganizationJList(){
        OrganizationDAOImp organizationDaoImp = new OrganizationDAOImp();
        //Se traen los datos de la BD
        DefaultListModel model = new DefaultListModel<>();
   
        try {
            listOrganization = (ArrayList<Organization>) organizationDaoImp.listOrganization();
            Collections.sort(listOrganization);
            for (Organization organization: listOrganization) {
                model.addElement(organization.getComercialName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        orgJList.setModel(model);
    }
    //Para encontrar el indice de la organización en listOrganization
    public int getIdxLstOrg(Organization o){
        int idx=0;
        int i=-1;
        for (Organization org: listOrganization) {
                i++;
                if(o.getId().compareTo(org.getId())==0){
                    idx=i;
                    break;
                }
        }
        return idx;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clientModeLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        clientIdTxtF = new javax.swing.JTextField();
        clientFullNameTxtF = new javax.swing.JTextField();
        clientAddressTxtF = new javax.swing.JTextField();
        clientEmailTxtF = new javax.swing.JTextField();
        clientPhoneTxtF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientNotesTxtA = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        clientSaveBtn = new javax.swing.JButton();
        clientRestartBtn = new javax.swing.JButton();
        clientCloseBtn = new javax.swing.JButton();
        clientStateChB = new javax.swing.JCheckBox();
        clientTypeCmB = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        orgJList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Clients");

        clientModeLbl.setText("Add Mode");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(clientModeLbl))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clientModeLbl)
                .addContainerGap())
        );

        jLabel2.setText("Id");

        jLabel3.setText("Full Name");

        jLabel4.setText("Address");

        jLabel5.setText("Phone");

        jLabel6.setText("Email");

        jLabel8.setText("Type");

        jLabel9.setText("Notes");

        clientEmailTxtF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                clientEmailTxtFFocusLost(evt);
            }
        });

        clientNotesTxtA.setColumns(20);
        clientNotesTxtA.setRows(5);
        jScrollPane2.setViewportView(clientNotesTxtA);

        clientSaveBtn.setText("Save");
        clientSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientSaveBtnActionPerformed(evt);
            }
        });

        clientRestartBtn.setText("Restart");
        clientRestartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientRestartBtnActionPerformed(evt);
            }
        });

        clientCloseBtn.setText("Close");
        clientCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientCloseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(clientSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(clientRestartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clientCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientSaveBtn)
                    .addComponent(clientRestartBtn)
                    .addComponent(clientCloseBtn))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        clientStateChB.setSelected(true);
        clientStateChB.setText("Check if State is Active");
        clientStateChB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientStateChBActionPerformed(evt);
            }
        });

        clientTypeCmB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frequent", "Normal", "Especial", "Referred", " " }));
        clientTypeCmB.setSelectedIndex(1);
        clientTypeCmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientTypeCmBActionPerformed(evt);
            }
        });

        orgJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(orgJList);

        jLabel7.setText("Select Organization:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(clientStateChB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addGap(26, 26, 26)
                                    .addComponent(clientTypeCmB, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(clientAddressTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(clientPhoneTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(clientIdTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(clientFullNameTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(clientEmailTxtF)))))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clientIdTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(clientFullNameTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientAddressTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(clientPhoneTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientEmailTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientStateChB)
                    .addComponent(jLabel8)
                    .addComponent(clientTypeCmB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientSaveBtnActionPerformed
        if (this.mode == 1) {
            try {
                ClientDAOImp clientDAOImp = new ClientDAOImp();
                Client client = new Client();
                client.setId(Long.parseLong(clientIdTxtF.getText()));
                client.setFullName(clientFullNameTxtF.getText());
                client.setAddress(clientAddressTxtF.getText());
                client.setEmail(clientEmailTxtF.getText());
                client.setType(clientTypeCmB.getItemAt(clientTypeCmB.getSelectedIndex()));
                client.setState(clientStateChB.isSelected());
                client.setNotes(clientNotesTxtA.getText());
                var idx = orgJList.getSelectedIndex();
                var org = listOrganization.get(idx);
                client.setOrg(org);
                clientDAOImp.updateClient(client);
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Client updated!");
                this.cleanAll();

            } catch (NumberFormatException e) {

            }

        } else {
            try {
                ClientDAOImp clientDAOImp = new ClientDAOImp();
                Client client = new Client();
                client.setId(Long.parseLong(clientIdTxtF.getText()));
                client.setFullName(clientFullNameTxtF.getText());
                client.setAddress(clientAddressTxtF.getText());
                client.setEmail(clientEmailTxtF.getText());
                client.setType(clientTypeCmB.getItemAt(clientTypeCmB.getSelectedIndex()));
                client.setState(clientStateChB.isSelected());
                client.setNotes(clientNotesTxtA.getText());
                var idx = orgJList.getSelectedIndex();
                var org = listOrganization.get(idx);
                client.setOrg(org);
                String msg = clientDAOImp.addClient(client);
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, msg);
                this.cleanAll();

            } catch (IOException | NumberFormatException e) {

            }
        }
    }//GEN-LAST:event_clientSaveBtnActionPerformed

    private void clientCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientCloseBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_clientCloseBtnActionPerformed

    private void clientRestartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientRestartBtnActionPerformed
        this.cleanAll();
    }//GEN-LAST:event_clientRestartBtnActionPerformed

    private void clientStateChBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientStateChBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientStateChBActionPerformed

    private void clientTypeCmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientTypeCmBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientTypeCmBActionPerformed
//Para validar el campo de tipo email
    private void clientEmailTxtFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clientEmailTxtFFocusLost
        // TODO add your handling code here:
        if(!Util.isEmail(clientEmailTxtF.getText())){
            JOptionPane.showMessageDialog(null, "¡Debes validar el email!", "ATENCIÓN ADMINISTRADOR", JOptionPane.WARNING_MESSAGE);
            clientEmailTxtF.requestFocus();
        }
    }//GEN-LAST:event_clientEmailTxtFFocusLost

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
            java.util.logging.Logger.getLogger(ClientEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clientAddressTxtF;
    private javax.swing.JButton clientCloseBtn;
    private javax.swing.JTextField clientEmailTxtF;
    private javax.swing.JTextField clientFullNameTxtF;
    private javax.swing.JTextField clientIdTxtF;
    private javax.swing.JLabel clientModeLbl;
    private javax.swing.JTextArea clientNotesTxtA;
    private javax.swing.JTextField clientPhoneTxtF;
    private javax.swing.JButton clientRestartBtn;
    private javax.swing.JButton clientSaveBtn;
    private javax.swing.JCheckBox clientStateChB;
    private javax.swing.JComboBox<String> clientTypeCmB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> orgJList;
    // End of variables declaration//GEN-END:variables
    
}
