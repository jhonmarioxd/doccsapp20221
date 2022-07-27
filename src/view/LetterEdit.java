package view;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS windows 5   CÓDIGO : 20212200869

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Letter;
import model.Organization;
import persistence.LetterDAOlmp;
import persistence.OrganizationDAOImp;
import util.Util;

public class LetterEdit extends javax.swing.JFrame {
    Calendar fecha_actual=new GregorianCalendar();
    private ArrayList<Organization> listOrganization;
    private int mode;
    private Letter letter;
    
    public LetterEdit() {
         
        initComponents();
        LetterDateChooser1.setCalendar(fecha_actual);
        LetterSourceTxtF.addItem("Payment");
        LetterSourceTxtF.addItem("Debtor");
        LetterSourceTxtF.addItem("Share");
        LetterSourceTxtF.addItem("None");
         this.setLocationRelativeTo(null);
    }
     public LetterEdit(Letter Letter, int mode) {
        this.mode=mode;
        if (this.mode == 1) {
            initComponents();
            loadOrganizationJList();
            this.setLocationRelativeTo(null);
            letterModeLbl.setText("Update mode");
            jPanel1.setBackground(Color.BLUE);
            LetterIDTxtF.setText(String.valueOf(Letter.getId()));
            LetterEmailTxtF.setText(Letter.getEmail());
            LetterfullNameorbusinessTxtF.setText(Letter.getFullNameorbusiness());
            LetterNotesTxtA.setText(Letter.getNotes());
            LetterPhoneTxtF.setText(Letter.getPhone());
            LetterAddressTxtF.setText(Letter.getAddress());
            Letter.setDate(LetterDateChooser1.getDateFormatString());
            LetterRecipientsnameTxtF.setText(Letter.getRecipientsname());
            LetterAffairTxtF.setText(Letter.getAffair());
            LetterPostalCodeTxtF.setText(Letter.getPostalCode());
            LetterPlaceTxtF.setText(Letter.getPlace());
            LetterFirmTxtF.setText(Letter.getFirm());
            Letter.setSource(LetterSourceTxtF.getItemAt(LetterSourceTxtF.getSelectedIndex()));
            LetterCountryTxtF.setText(Letter.getCountry());
            var idx = LetterTypeCmB.getItemCount();
            for (int i = 0; i < idx; i++) {
                if (LetterTypeCmB.getItemAt(i).compareTo(Letter.getType()) == 0) {
                    LetterTypeCmB.setSelectedIndex(i);
                    break;
                }
                else
                    LetterTypeCmB.setSelectedIndex(2);
            }
            LetterStateChB.setSelected(Letter.isState());
            Organization o=Organization.getOrg();
            idx=getIdxLstorg(o);
            orgJList.setSelectedIndex(idx);
        }
     }
    
    public void cleanAll(){
        LetterIDTxtF.setText("");
        LetterfullNameorbusinessTxtF.setText("");
        LetterRecipientsnameTxtF.setText("");
        //LetterDateTxtF.setText("");
        LetterAddressTxtF.setText("");
        LetterAffairTxtF.setText("");
        LetterPhoneTxtF.setText("");
        LetterPostalCodeTxtF.setText("");
        LetterPlaceTxtF.setText("");
        LetterEmailTxtF.setText("");
        LetterFirmTxtF.setText("");
       // LetterSourceTxtF.setText("");
        LetterCountryTxtF.setText("");
        //LetterStateTxtF.setText("");
        //LetterTypeTxtF.setText("");
        LetterNotesTxtA.setText("");

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
        jLabel2 = new javax.swing.JLabel();
        LetterIDTxtF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LetterfullNameorbusinessTxtF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LetterRecipientsnameTxtF = new javax.swing.JTextField();
        LetterAffairTxtF = new javax.swing.JTextField();
        LetterAddressTxtF = new javax.swing.JTextField();
        LetterPhoneTxtF = new javax.swing.JTextField();
        LetterPostalCodeTxtF = new javax.swing.JTextField();
        LetterPlaceTxtF = new javax.swing.JTextField();
        LetterFirmTxtF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LetterNotesTxtA = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LetterSaveBtm = new javax.swing.JButton();
        LetterResetBtm = new javax.swing.JButton();
        LetterCloseBtm = new javax.swing.JButton();
        LetterCountryTxtF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        LetterStateChB = new javax.swing.JCheckBox();
        LetterTypeCmB = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orgJList = new javax.swing.JList<>();
        LetterEmailTxtF = new javax.swing.JTextField();
        LetterSourceTxtF = new javax.swing.JComboBox<>();
        resultado = new javax.swing.JTextField();
        LetterDateChooser1 = new com.toedter.calendar.JDateChooser();
        letterModeLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Letters Edition");

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FullName Or Business");

        LetterIDTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterIDTxtFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID ");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recipients Name");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Affair");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Postal Code");

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Place");

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Firm");

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Type");

        jLabel15.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Notes");

        LetterRecipientsnameTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterRecipientsnameTxtFActionPerformed(evt);
            }
        });

        LetterPostalCodeTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterPostalCodeTxtFActionPerformed(evt);
            }
        });

        LetterNotesTxtA.setColumns(20);
        LetterNotesTxtA.setRows(5);
        jScrollPane1.setViewportView(LetterNotesTxtA);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Client Source");

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        LetterSaveBtm.setBackground(new java.awt.Color(153, 153, 153));
        LetterSaveBtm.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LetterSaveBtm.setForeground(new java.awt.Color(0, 0, 0));
        LetterSaveBtm.setText("Save");
        LetterSaveBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterSaveBtmActionPerformed(evt);
            }
        });

        LetterResetBtm.setBackground(new java.awt.Color(204, 204, 204));
        LetterResetBtm.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LetterResetBtm.setForeground(new java.awt.Color(0, 0, 0));
        LetterResetBtm.setText("Reset");
        LetterResetBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterResetBtmActionPerformed(evt);
            }
        });

        LetterCloseBtm.setBackground(new java.awt.Color(204, 204, 204));
        LetterCloseBtm.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LetterCloseBtm.setForeground(new java.awt.Color(0, 0, 0));
        LetterCloseBtm.setText("Close");
        LetterCloseBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterCloseBtmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(LetterSaveBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(LetterResetBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(LetterCloseBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LetterResetBtm)
                    .addComponent(LetterSaveBtm)
                    .addComponent(LetterCloseBtm))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Country");

        LetterStateChB.setSelected(true);
        LetterStateChB.setText("Check if State is Active");
        LetterStateChB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterStateChBActionPerformed(evt);
            }
        });

        LetterTypeCmB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frequent", "Normal", "Especial", "Referred", " " }));
        LetterTypeCmB.setSelectedIndex(1);
        LetterTypeCmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterTypeCmBActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Select Organization:");

        orgJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(orgJList);

        LetterEmailTxtF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LetterEmailTxtFFocusLost(evt);
            }
        });
        LetterEmailTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterEmailTxtFActionPerformed(evt);
            }
        });

        LetterSourceTxtF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        LetterSourceTxtF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LetterSourceTxtFItemStateChanged(evt);
            }
        });

        resultado.setBackground(new java.awt.Color(204, 204, 204));

        LetterDateChooser1.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)))
                                .addGap(150, 150, 150))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(154, 154, 154))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel19)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel10)))
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(149, 149, 149)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LetterIDTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LetterfullNameorbusinessTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LetterRecipientsnameTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LetterAddressTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LetterAffairTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LetterPhoneTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LetterPostalCodeTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LetterPlaceTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LetterFirmTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LetterEmailTxtF)
                                    .addComponent(LetterCountryTxtF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LetterDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(61, 61, 61))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LetterSourceTxtF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LetterTypeCmB, 0, 146, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(resultado)
                                .addGap(25, 25, 25))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LetterStateChB)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel18)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LetterIDTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetterfullNameorbusinessTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetterRecipientsnameTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetterDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetterAddressTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetterAffairTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetterPhoneTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(LetterEmailTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetterPostalCodeTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetterPlaceTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetterFirmTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LetterCountryTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(LetterStateChB)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LetterSourceTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel14))
                    .addComponent(LetterTypeCmB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        letterModeLbl.setForeground(new java.awt.Color(0, 0, 0));
        letterModeLbl.setText("Add Mode");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(269, 269, 269))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(letterModeLbl)
                        .addGap(347, 347, 347))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(letterModeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(486, 486, 486))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LetterSaveBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterSaveBtmActionPerformed
      if(this.mode == 1){
        try{
            LetterDAOlmp LetterDAOlmp = new LetterDAOlmp();
            Letter letter = new Letter();
             Letter Letter = new Letter();
            Letter.setId(Long.parseLong(LetterIDTxtF.getText()));
            Letter.setFullNameorbusiness(LetterfullNameorbusinessTxtF.getText());
            Letter.setRecipientsname(LetterRecipientsnameTxtF.getText());
            Letter.setDate(LetterDateChooser1.getDateFormatString());
            Letter.setAddress(LetterAddressTxtF.getText());   
            Letter.setAffair(LetterAffairTxtF.getText());
            Letter.setEmail(LetterEmailTxtF.getText());
            Letter.setPhone(LetterPhoneTxtF.getText());
            Letter.setFirm(LetterFirmTxtF.getText());
            Letter.setPostalCode(LetterPostalCodeTxtF.getText());
            Letter.setPlace(LetterPlaceTxtF.getText());
            Letter.setSource(LetterSourceTxtF.getItemAt(LetterSourceTxtF.getSelectedIndex()));
            Letter.setCountry(LetterCountryTxtF.getText());
            Letter.setType(LetterTypeCmB.getItemAt(LetterTypeCmB.getSelectedIndex()));
            Letter.setState(LetterStateChB.isSelected());
            Letter.setNotes(LetterNotesTxtA.getText());
            var idx = orgJList.getSelectedIndex();
            var org = listOrganization.get(idx);
           letter.setOrg(org);
           LetterDAOlmp.updateLetter(letter);
           JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame,"Letter update!");
            this.cleanAll(); 
            
        } catch (NumberFormatException e) {
        }
    } else {
        try{
        LetterDAOlmp LetterDAOlmp = new LetterDAOlmp();
            Letter Letter = new Letter();
            Letter.setId(Long.parseLong(LetterIDTxtF.getText()));
            Letter.setFullNameorbusiness(LetterfullNameorbusinessTxtF.getText());
            Letter.setRecipientsname(LetterRecipientsnameTxtF.getText());
            Letter.setDate(LetterDateChooser1.getDateFormatString());
            Letter.setAddress(LetterAddressTxtF.getText());   
            Letter.setAffair(LetterAffairTxtF.getText());
            Letter.setEmail(LetterEmailTxtF.getText());
            Letter.setPhone(LetterPhoneTxtF.getText());
            Letter.setFirm(LetterFirmTxtF.getText());
            Letter.setPostalCode(LetterPostalCodeTxtF.getText());
            Letter.setPlace(LetterPlaceTxtF.getText());
            Letter.setSource(LetterSourceTxtF.getItemAt(LetterSourceTxtF.getSelectedIndex()));
            Letter.setCountry(LetterCountryTxtF.getText());
            Letter.setType(LetterTypeCmB.getItemAt(LetterTypeCmB.getSelectedIndex()));
            Letter.setState(LetterStateChB.isSelected());
            Letter.setNotes(LetterNotesTxtA.getText());
            String msg = LetterDAOlmp.addLetter(Letter);
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, msg);
            this.cleanAll();
            
        } catch (IOException | NumberFormatException e) {
            }
        }   
    }//GEN-LAST:event_LetterSaveBtmActionPerformed

    private void LetterResetBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterResetBtmActionPerformed
       this.cleanAll();
    }//GEN-LAST:event_LetterResetBtmActionPerformed

    private void LetterIDTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterIDTxtFActionPerformed
       
    }//GEN-LAST:event_LetterIDTxtFActionPerformed

    private void LetterRecipientsnameTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterRecipientsnameTxtFActionPerformed
        
    }//GEN-LAST:event_LetterRecipientsnameTxtFActionPerformed

    private void LetterCloseBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterCloseBtmActionPerformed
        System.exit(0);
    }//GEN-LAST:event_LetterCloseBtmActionPerformed

    private void LetterPostalCodeTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterPostalCodeTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetterPostalCodeTxtFActionPerformed

    private void LetterStateChBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterStateChBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetterStateChBActionPerformed

    private void LetterTypeCmBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterTypeCmBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetterTypeCmBActionPerformed

    private void LetterEmailTxtFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LetterEmailTxtFFocusLost
        // TODO add your handling code here:
        if(!Util.isEmail(LetterEmailTxtF.getText())){
            JOptionPane.showMessageDialog(null, "¡Debes validar el email!", "ATENCIÓN ADMINISTRADOR", JOptionPane.WARNING_MESSAGE);
            LetterEmailTxtF.requestFocus();
        }
    }//GEN-LAST:event_LetterEmailTxtFFocusLost

    private void LetterEmailTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterEmailTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetterEmailTxtFActionPerformed

    private void LetterSourceTxtFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LetterSourceTxtFItemStateChanged
        // TODO add your handling code here:
         String tipo =(String) LetterSourceTxtF.getSelectedItem();
        if (tipo.equals("Payment")){
            resultado.setText("PAYMENT CLIENT");
        }
        if (tipo.equals("Debtor")){
            resultado.setText("DEBTOR CLIENT");
        }
         if (tipo.equals("Share")){
            resultado.setText("SHARE CLIENT");
        }
         if (tipo.equals("None")){
            resultado.setText ("I AM NOT AN EMPLOYEE");
         }
    }//GEN-LAST:event_LetterSourceTxtFItemStateChanged

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
            java.util.logging.Logger.getLogger(LetterEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LetterEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LetterEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LetterEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LetterEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LetterAddressTxtF;
    private javax.swing.JTextField LetterAffairTxtF;
    private javax.swing.JButton LetterCloseBtm;
    private javax.swing.JTextField LetterCountryTxtF;
    private com.toedter.calendar.JDateChooser LetterDateChooser1;
    private javax.swing.JTextField LetterEmailTxtF;
    private javax.swing.JTextField LetterFirmTxtF;
    private javax.swing.JTextField LetterIDTxtF;
    private javax.swing.JTextArea LetterNotesTxtA;
    private javax.swing.JTextField LetterPhoneTxtF;
    private javax.swing.JTextField LetterPlaceTxtF;
    private javax.swing.JTextField LetterPostalCodeTxtF;
    private javax.swing.JTextField LetterRecipientsnameTxtF;
    private javax.swing.JButton LetterResetBtm;
    private javax.swing.JButton LetterSaveBtm;
    private javax.swing.JComboBox<String> LetterSourceTxtF;
    private javax.swing.JCheckBox LetterStateChB;
    private javax.swing.JComboBox<String> LetterTypeCmB;
    private javax.swing.JTextField LetterfullNameorbusinessTxtF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel letterModeLbl;
    private javax.swing.JList<String> orgJList;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
