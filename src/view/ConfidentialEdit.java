
package view;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Confidential;
import model.Organization;
import persistence.ConfidentialDAOlmp;
import persistence.OrganizationDAOImp;
import util.Util;

public class ConfidentialEdit extends javax.swing.JFrame {
    
   Calendar fecha_actual=new GregorianCalendar();
    private ArrayList<Organization> listOrganization;
    private int mode;
    private Confidential confidential;
    
    public ConfidentialEdit() {
        initComponents();
        ConfidentialDateChooser1.setCalendar(fecha_actual);
        ConfidentialfinancialinstitutionsTxtF.addItem("Credit");
        ConfidentialfinancialinstitutionsTxtF.addItem("Saving");
         ConfidentialfinancialinstitutionsTxtF.addItem("None");
        ConfidentialsourceTxtF.addItem("Active");
        ConfidentialsourceTxtF.addItem("Inactive");
        ConfidentialsourceTxtF.addItem("Incapacitated");
        ConfidentialsourceTxtF.addItem("None");
        loadOrganizationJList();
        this.setLocationRelativeTo(null);
    }
       public ConfidentialEdit(Confidential Confidential, int mode) {
        this.mode=mode;
        if (this.mode == 1) {
            initComponents();
            loadOrganizationJList();
            this.setLocationRelativeTo(null);
            confidentialModeLbl.setText("Update mode");
            jPanel1.setBackground(Color.yellow);
            ConfidentialIDTxtF.setText(String.valueOf(Confidential.getId()));
            confidentialemailTxtF.setText(Confidential.getEmail());
            ConfidentialcomercialNameTxtF.setText(Confidential.getFullName());
            ConfidentialnotesTxtA.setText(Confidential.getNotes());
            ConfidentialphoneTxtF.setText(Confidential.getPhone());
            ConfidentialpasswordTxtP.setText(Confidential.getPassword());
            confidential.setDate(ConfidentialDateChooser1.getDateFormatString());
            confidential.setSource(ConfidentialsourceTxtF.getItemAt(ConfidentialsourceTxtF.getSelectedIndex()));
            ConfidentialemployeessalaryTxtF.setText(Confidential.getEmployeessalary());
            confidential.setTaxreturns(ConfidentialtaxreturnsjSlider1.toString());
            ConfidentialinsurancerecordsTxtF.setText(Confidential.getInsurancerecords());
            ConfidentialbankcardsTxtF.setText(Confidential.getBankcards());
            confidential.setFinancialinstitutions(ConfidentialfinancialinstitutionsTxtF.getItemAt(ConfidentialfinancialinstitutionsTxtF.getSelectedIndex()));
            ConfidentialcountryTxtF.setText(Confidential.getCountry());
            ConfidentialcityTxtF.setText(Confidential.getCity());
            var idx = ConfidentialTypeCmB.getItemCount();
            for (int i = 0; i < idx; i++) {
                if (ConfidentialTypeCmB.getItemAt(i).compareTo(Confidential.getType()) == 0) {
                    ConfidentialTypeCmB.setSelectedIndex(i);
                    break;
                }
                else
                    ConfidentialTypeCmB.setSelectedIndex(2);
            }
            ConfidentialStateChB.setSelected(Confidential.isState());
            Organization o=Organization.getOrg();
            idx=getIdxLstorg(o);
            orgJList.setSelectedIndex(idx);
        }
    }
    public void cleanAll(){
        ConfidentialIDTxtF.setText("");
        ConfidentialcomercialNameTxtF.setText("");
        ConfidentialpasswordTxtP.setText("");
        ConfidentialphoneTxtF.setText("");
        confidentialemailTxtF.setText("");
        //ConfidentialdateTxtF.setText("");
       // ConfidentialsourceTxtF.setText("");
        ConfidentialemployeessalaryTxtF.setText("");
        //ConfidentialtaxreturnsTxtF.setText("");
        ConfidentialinsurancerecordsTxtF.setText("");
        ConfidentialbankcardsTxtF.setText("");
       // ConfidentialfinancialinstitutionsTxtF.setText("");
        ConfidentialcountryTxtF.setText("");
        ConfidentialcityTxtF.setText("");
        //ConfidentialstateTxtF.setText("");
        //ConfidentialTypeTxtF.setText("");
        ConfidentialnotesTxtA.setText("");
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
    public int getIdxLstorg(Organization o){
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ConfidentialphoneTxtF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ConfidentialemployeessalaryTxtF = new javax.swing.JTextField();
        ConfidentialbankcardsTxtF = new javax.swing.JTextField();
        ConfidentialinsurancerecordsTxtF = new javax.swing.JTextField();
        ConfidentialcityTxtF = new javax.swing.JTextField();
        ComercialName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ConfidentialpasswordTxtP = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConfidentialnotesTxtA = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ConfidentialcountryTxtF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ConfidentialTypeCmB = new javax.swing.JComboBox<>();
        ConfidentialStateChB = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        orgJList = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        confidentialemailTxtF = new javax.swing.JTextField();
        ConfidentialcomercialNameTxtF = new javax.swing.JTextField();
        ConfidentialsourceTxtF = new javax.swing.JComboBox<>();
        txtresultado = new javax.swing.JTextField();
        ConfidentialfinancialinstitutionsTxtF = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ConfidentialIDTxtF = new javax.swing.JTextField();
        ConfidentialDateChooser1 = new com.toedter.calendar.JDateChooser();
        ConfidentialtaxreturnsjSlider1 = new javax.swing.JSlider();
        jTextField1 = new javax.swing.JTextField();
        confidentialModeLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ConfidentialSaveBtm = new javax.swing.JButton();
        ConfidentialResetBtm = new javax.swing.JButton();
        ConfidentialCloseBtm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONFIDENTIAL EDITION");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(102, 102, 255));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Phione");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("  salary");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tax returns");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Insurance records");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Bank cards");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Country");

        ConfidentialemployeessalaryTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialemployeessalaryTxtFActionPerformed(evt);
            }
        });

        ComercialName.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ComercialName.setForeground(new java.awt.Color(51, 51, 51));
        ComercialName.setText("Comercial Name");

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Type");

        ConfidentialpasswordTxtP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialpasswordTxtPActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Notes");

        ConfidentialnotesTxtA.setColumns(20);
        ConfidentialnotesTxtA.setRows(5);
        jScrollPane1.setViewportView(ConfidentialnotesTxtA);

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Financial institutions");

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("City");

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Employee");

        ConfidentialTypeCmB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frequent", "Normal", "Especial", "Referred", " " }));
        ConfidentialTypeCmB.setSelectedIndex(1);
        ConfidentialTypeCmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialTypeCmBActionPerformed(evt);
            }
        });

        ConfidentialStateChB.setSelected(true);
        ConfidentialStateChB.setText("Check if State is Active");
        ConfidentialStateChB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialStateChBActionPerformed(evt);
            }
        });

        orgJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(orgJList);

        jLabel19.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Select Organization:");

        confidentialemailTxtF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confidentialemailTxtFFocusLost(evt);
            }
        });
        confidentialemailTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confidentialemailTxtFActionPerformed(evt);
            }
        });

        ConfidentialcomercialNameTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialcomercialNameTxtFActionPerformed(evt);
            }
        });

        ConfidentialsourceTxtF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        ConfidentialsourceTxtF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ConfidentialsourceTxtFItemStateChanged(evt);
            }
        });
        ConfidentialsourceTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialsourceTxtFActionPerformed(evt);
            }
        });

        txtresultado.setBackground(new java.awt.Color(204, 204, 204));

        ConfidentialfinancialinstitutionsTxtF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        ConfidentialfinancialinstitutionsTxtF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ConfidentialfinancialinstitutionsTxtFItemStateChanged(evt);
            }
        });
        ConfidentialfinancialinstitutionsTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialfinancialinstitutionsTxtFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ID");

        ConfidentialDateChooser1.setDateFormatString("yyyy/MM/dd");

        ConfidentialtaxreturnsjSlider1.setBackground(new java.awt.Color(51, 51, 51));
        ConfidentialtaxreturnsjSlider1.setMajorTickSpacing(10);
        ConfidentialtaxreturnsjSlider1.setMinorTickSpacing(1);
        ConfidentialtaxreturnsjSlider1.setPaintLabels(true);
        ConfidentialtaxreturnsjSlider1.setPaintTicks(true);
        ConfidentialtaxreturnsjSlider1.setValue(50);
        ConfidentialtaxreturnsjSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ConfidentialtaxreturnsjSlider1StateChanged(evt);
            }
        });
        ConfidentialtaxreturnsjSlider1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ConfidentialtaxreturnsjSlider1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConfidentialpasswordTxtP, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(ConfidentialIDTxtF)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ComercialName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConfidentialTypeCmB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confidentialemailTxtF)
                            .addComponent(ConfidentialphoneTxtF)
                            .addComponent(ConfidentialcomercialNameTxtF)
                            .addComponent(ConfidentialsourceTxtF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtresultado)
                            .addComponent(ConfidentialDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(116, 116, 116))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(jLabel17))
                                                    .addComponent(jLabel11))
                                                .addGap(97, 97, 97))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(jLabel10))
                                                .addComponent(jLabel9)))
                                        .addGap(59, 59, 59)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ConfidentialinsurancerecordsTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ConfidentialbankcardsTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ConfidentialemployeessalaryTxtF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ConfidentialfinancialinstitutionsTxtF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ConfidentialcityTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ConfidentialcountryTxtF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel8)
                                .addGap(40, 40, 40)
                                .addComponent(ConfidentialtaxreturnsjSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(332, 332, 332)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConfidentialStateChB)
                        .addGap(129, 129, 129))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(ConfidentialIDTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(ConfidentialpasswordTxtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComercialName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfidentialcomercialNameTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ConfidentialphoneTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confidentialemailTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConfidentialDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ConfidentialsourceTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfidentialTypeCmB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(ConfidentialbankcardsTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ConfidentialfinancialinstitutionsTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ConfidentialcountryTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ConfidentialcityTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(ConfidentialemployeessalaryTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(ConfidentialinsurancerecordsTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ConfidentialtaxreturnsjSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConfidentialStateChB)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19)
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(208, 208, 208))
        );

        confidentialModeLbl.setForeground(new java.awt.Color(0, 0, 0));
        confidentialModeLbl.setText("Add Mode");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(confidentialModeLbl)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(confidentialModeLbl)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 0, 0));

        ConfidentialSaveBtm.setBackground(new java.awt.Color(153, 153, 153));
        ConfidentialSaveBtm.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ConfidentialSaveBtm.setForeground(new java.awt.Color(0, 0, 0));
        ConfidentialSaveBtm.setText("Save");
        ConfidentialSaveBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialSaveBtmActionPerformed(evt);
            }
        });

        ConfidentialResetBtm.setBackground(new java.awt.Color(204, 204, 204));
        ConfidentialResetBtm.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ConfidentialResetBtm.setForeground(new java.awt.Color(0, 0, 0));
        ConfidentialResetBtm.setText("Reset");
        ConfidentialResetBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialResetBtmActionPerformed(evt);
            }
        });

        ConfidentialCloseBtm.setBackground(new java.awt.Color(204, 204, 204));
        ConfidentialCloseBtm.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ConfidentialCloseBtm.setForeground(new java.awt.Color(0, 0, 0));
        ConfidentialCloseBtm.setText("Close");
        ConfidentialCloseBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfidentialCloseBtmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(ConfidentialSaveBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(ConfidentialResetBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(ConfidentialCloseBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfidentialSaveBtm)
                    .addComponent(ConfidentialResetBtm)
                    .addComponent(ConfidentialCloseBtm))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfidentialSaveBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialSaveBtmActionPerformed
int worth =ConfidentialtaxreturnsjSlider1.getValue();
        System.out.println("Worth:" + worth);
        if(this.mode == 1){
        try{
            ConfidentialDAOlmp ConfidentialDAOlmp = new ConfidentialDAOlmp();
            Confidential confidential = new Confidential();
            confidential.setId(Long.parseLong(ConfidentialIDTxtF.getText()));
            confidential.setFullName(ConfidentialcomercialNameTxtF.getText());
            confidential.setPassword(ConfidentialpasswordTxtP.getText());
            confidential.setPhone(ConfidentialphoneTxtF.getText());
            confidential.setEmail(confidentialemailTxtF.getText());
            confidential.setDate(ConfidentialDateChooser1.getDateFormatString());
            confidential.setSource(ConfidentialsourceTxtF.getItemAt(ConfidentialsourceTxtF.getSelectedIndex()));
            confidential.setEmployeessalary(ConfidentialemployeessalaryTxtF.getText());
            confidential.setTaxreturns(ConfidentialtaxreturnsjSlider1.toString());
            confidential.setInsurancerecords(ConfidentialinsurancerecordsTxtF.getText());
            confidential.setBankcards(ConfidentialbankcardsTxtF.getText());
            confidential.setFinancialinstitutions(ConfidentialfinancialinstitutionsTxtF.getItemAt(ConfidentialfinancialinstitutionsTxtF.getSelectedIndex()));
            confidential.setCountry(ConfidentialcountryTxtF.getText());
            confidential.setCity(ConfidentialcityTxtF.getText());
            confidential.setType(ConfidentialTypeCmB.getItemAt(ConfidentialTypeCmB.getSelectedIndex()));
            confidential.setState(ConfidentialStateChB.isSelected());
            confidential.setNotes(ConfidentialnotesTxtA.getText());
            var idx = orgJList.getSelectedIndex();
            var org = listOrganization.get(idx);
           confidential.setOrg(org);
           ConfidentialDAOlmp.updateConfidential(confidential);
           JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame,"Confidential update!");
            this.cleanAll(); 
            
        } catch (NumberFormatException e) {

        }
       } else {
            try {
            ConfidentialDAOlmp ConfidentialDAOlmp = new ConfidentialDAOlmp();
            Confidential confidential = new Confidential();
            confidential.setId(Long.parseLong(ConfidentialIDTxtF.getText()));
            confidential.setFullName(ConfidentialcomercialNameTxtF.getText());
            confidential.setPassword(ConfidentialpasswordTxtP.getText());
            confidential.setPhone(ConfidentialphoneTxtF.getText());
            confidential.setEmail(confidentialemailTxtF.getText());
            confidential.setDate(ConfidentialDateChooser1.getDateFormatString());
            confidential.setSource(ConfidentialsourceTxtF.getItemAt(ConfidentialsourceTxtF.getSelectedIndex()));
            confidential.setEmployeessalary(ConfidentialemployeessalaryTxtF.getText());
            confidential.setTaxreturns(ConfidentialtaxreturnsjSlider1.toString());
            confidential.setInsurancerecords(ConfidentialinsurancerecordsTxtF.getText());
            confidential.setBankcards(ConfidentialbankcardsTxtF.getText());
            confidential.setFinancialinstitutions(ConfidentialfinancialinstitutionsTxtF.getItemAt(ConfidentialfinancialinstitutionsTxtF.getSelectedIndex()));
            confidential.setCountry(ConfidentialcountryTxtF.getText());
            confidential.setCity(ConfidentialcityTxtF.getText());
            confidential.setType(ConfidentialTypeCmB.getItemAt(ConfidentialTypeCmB.getSelectedIndex()));
            confidential.setState(ConfidentialStateChB.isSelected());
            confidential.setNotes(ConfidentialnotesTxtA.getText());
            var idx = orgJList.getSelectedIndex();
            var Org = listOrganization.get(idx);
            confidential.setOrg(Org);
            String msg = ConfidentialDAOlmp.addConfidential(confidential);
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, msg);
             this.cleanAll();

            } catch (IOException | NumberFormatException e) {

            }
        }
       
    }//GEN-LAST:event_ConfidentialSaveBtmActionPerformed

    private void ConfidentialResetBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialResetBtmActionPerformed
        this.cleanAll();
    }//GEN-LAST:event_ConfidentialResetBtmActionPerformed

    private void ConfidentialCloseBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialCloseBtmActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ConfidentialCloseBtmActionPerformed

    private void ConfidentialpasswordTxtPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialpasswordTxtPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfidentialpasswordTxtPActionPerformed

    private void ConfidentialTypeCmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialTypeCmBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfidentialTypeCmBActionPerformed

    private void ConfidentialStateChBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialStateChBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfidentialStateChBActionPerformed

    private void confidentialemailTxtFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confidentialemailTxtFFocusLost
        // TODO add your handling code here:
        if(!Util.isEmail(confidentialemailTxtF.getText())){
            JOptionPane.showMessageDialog(null, "¡Debes validar el email!", "ATENCIÓN ADMINISTRADOR", JOptionPane.WARNING_MESSAGE);
            confidentialemailTxtF.requestFocus();
        }
    }//GEN-LAST:event_confidentialemailTxtFFocusLost

    private void confidentialemailTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confidentialemailTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confidentialemailTxtFActionPerformed

    private void ConfidentialemployeessalaryTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialemployeessalaryTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfidentialemployeessalaryTxtFActionPerformed

    private void ConfidentialcomercialNameTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialcomercialNameTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfidentialcomercialNameTxtFActionPerformed

    private void ConfidentialsourceTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialsourceTxtFActionPerformed
      
    }//GEN-LAST:event_ConfidentialsourceTxtFActionPerformed

    private void ConfidentialsourceTxtFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ConfidentialsourceTxtFItemStateChanged
        // TODO add your handling code here:
        String tipo =(String) ConfidentialsourceTxtF.getSelectedItem();
        if (tipo.equals("Active")){
            txtresultado.setText("active in the company");
        }
        if (tipo.equals("Inactive")){
            txtresultado.setText("Inactive in the company");
        }
         if (tipo.equals("Incapacitated")){
            txtresultado.setText("Incapacitated in the company");
        }
         if (tipo.equals("None")){
            txtresultado.setText ("I am not an employee");
         }
       
    }//GEN-LAST:event_ConfidentialsourceTxtFItemStateChanged

    private void ConfidentialfinancialinstitutionsTxtFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ConfidentialfinancialinstitutionsTxtFItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfidentialfinancialinstitutionsTxtFItemStateChanged

    private void ConfidentialfinancialinstitutionsTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfidentialfinancialinstitutionsTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfidentialfinancialinstitutionsTxtFActionPerformed

    private void ConfidentialtaxreturnsjSlider1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ConfidentialtaxreturnsjSlider1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfidentialtaxreturnsjSlider1PropertyChange

    private void ConfidentialtaxreturnsjSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ConfidentialtaxreturnsjSlider1StateChanged
        int worth =ConfidentialtaxreturnsjSlider1.getValue();
        jTextField1.setText(String.valueOf(worth +"millón"));
    }//GEN-LAST:event_ConfidentialtaxreturnsjSlider1StateChanged

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
            java.util.logging.Logger.getLogger(ConfidentialEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfidentialEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfidentialEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfidentialEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfidentialEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ComercialName;
    private javax.swing.JButton ConfidentialCloseBtm;
    private com.toedter.calendar.JDateChooser ConfidentialDateChooser1;
    private javax.swing.JTextField ConfidentialIDTxtF;
    private javax.swing.JButton ConfidentialResetBtm;
    private javax.swing.JButton ConfidentialSaveBtm;
    private javax.swing.JCheckBox ConfidentialStateChB;
    private javax.swing.JComboBox<String> ConfidentialTypeCmB;
    private javax.swing.JTextField ConfidentialbankcardsTxtF;
    private javax.swing.JTextField ConfidentialcityTxtF;
    private javax.swing.JTextField ConfidentialcomercialNameTxtF;
    private javax.swing.JTextField ConfidentialcountryTxtF;
    private javax.swing.JTextField ConfidentialemployeessalaryTxtF;
    private javax.swing.JComboBox<String> ConfidentialfinancialinstitutionsTxtF;
    private javax.swing.JTextField ConfidentialinsurancerecordsTxtF;
    private javax.swing.JTextArea ConfidentialnotesTxtA;
    private javax.swing.JPasswordField ConfidentialpasswordTxtP;
    private javax.swing.JTextField ConfidentialphoneTxtF;
    private javax.swing.JComboBox<String> ConfidentialsourceTxtF;
    private javax.swing.JSlider ConfidentialtaxreturnsjSlider1;
    private javax.swing.JLabel confidentialModeLbl;
    private javax.swing.JTextField confidentialemailTxtF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> orgJList;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables

   
}
