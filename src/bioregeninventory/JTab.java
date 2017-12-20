/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioregeninventory;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import static java.awt.Color.GRAY;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.text.*;
import java.awt.print.*;
import javax.swing.JTable;



/**
 *
 * @author LALAI
 */
public class JTab extends javax.swing.JFrame {
    Connection conn = new BioregenInventory().connect();
    
    public JTab() {
         
        initComponents();
        update_table();
        update_table1();
     }       
     private void update_table() {
        String sql = "select * from usersTbl";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            tblUSERS.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     private void update_table1() {
        String sql1 = "select * from freseniustbl";
        try {
            PreparedStatement ps = conn.prepareStatement(sql1);
            
            ResultSet rs = ps.executeQuery();
            frestable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
   public void clearText(){
        txtEId.setText("");
        txtEPass.setText("");
        txtPos.setText("");
        txtEName.setText("");     
        partnum.setText("");
        desc.setText("");
        price.setText("");
        rate.setText("");
        remarks.setText("");
        quantity.setText("");
        total.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jpUsers = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtEId = new javax.swing.JTextField();
        txtPos = new javax.swing.JTextField();
        txtEName = new javax.swing.JTextField();
        txtEPass = new javax.swing.JPasswordField();
        jPanel11 = new javax.swing.JPanel();
        btnADD = new javax.swing.JButton();
        btnUPDATE = new javax.swing.JButton();
        btnDELETE = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        clear1 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUSERS = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        partnum = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        remarks = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        compute = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        frestable = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setAutoscrolls(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(1580, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1580, 720));

        jTabbedPane2.setBackground(new java.awt.Color(0, 204, 0));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N

        jpUsers.setBackground(new java.awt.Color(0, 255, 102));
        jpUsers.setAutoscrolls(true);

        jPanel7.setBackground(new java.awt.Color(102, 255, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User's Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24), new java.awt.Color(51, 0, 153))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(0, 255, 102));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        label1.setText("Employee ID:");

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        label2.setText("Password:");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        label3.setText("Complete Name:");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        label4.setText("Position:");

        txtEId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEIdActionPerformed(evt);
            }
        });

        txtPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosActionPerformed(evt);
            }
        });

        txtEName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtENameActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(0, 255, 102));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/add1.png"))); // NOI18N
        btnADD.setContentAreaFilled(false);
        btnADD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnADD.setIconTextGap(0);
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnUPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/update1.png"))); // NOI18N
        btnUPDATE.setContentAreaFilled(false);
        btnUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEActionPerformed(evt);
            }
        });

        btnDELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/delete1.png"))); // NOI18N
        btnDELETE.setContentAreaFilled(false);
        btnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnADD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnUPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDELETE)
            .addComponent(btnADD)
        );

        jPanel5.setBackground(new java.awt.Color(0, 255, 102));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        clear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/clear.png"))); // NOI18N
        clear1.setContentAreaFilled(false);
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(print, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEName)
                            .addComponent(txtEPass)
                            .addComponent(txtEId)
                            .addComponent(txtPos))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(102, 255, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lists of Users", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24))); // NOI18N
        jPanel9.setFocusCycleRoot(true);

        jPanel10.setBackground(new java.awt.Color(0, 255, 102));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tblUSERS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUSERS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUSERSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUSERS);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtSearch.setBackground(new java.awt.Color(204, 255, 204));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/search.png"))); // NOI18N
        jLabel1.setText("Search Users");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout jpUsersLayout = new javax.swing.GroupLayout(jpUsers);
        jpUsers.setLayout(jpUsersLayout);
        jpUsersLayout.setHorizontalGroup(
            jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsersLayout.createSequentialGroup()
                .addGroup(jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUsersLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUsersLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpUsersLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jpUsersLayout.setVerticalGroup(
            jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsersLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(245, 245, 245))
        );

        jTabbedPane2.addTab("Users Option", jpUsers);

        jPanel3.setBackground(new java.awt.Color(0, 255, 102));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24), new java.awt.Color(51, 0, 153))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N

        jPanel12.setBackground(new java.awt.Color(0, 255, 102));
        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.darkGray, java.awt.Color.black));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setText("Part Number:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setText("Description:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setText("Price in $:");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setText("Peso Rate:");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setText("Remarks:");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setText("TOTAL");

        price.setForeground(new java.awt.Color(102, 102, 102));
        price.setText("Please Enter Numbers Only");
        price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                priceFocusGained(evt);
            }
        });
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });

        remarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remarksActionPerformed(evt);
            }
        });

        quantity.setForeground(new java.awt.Color(102, 102, 102));
        quantity.setText("Please Enter Numbers Only");
        quantity.setToolTipText("Please Enter Numbers Only");
        quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantityFocusGained(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });

        total.setEditable(false);
        total.setCaretColor(new java.awt.Color(255, 255, 255));
        total.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel9.setText("Quantity:");

        rate.setForeground(new java.awt.Color(102, 102, 102));
        rate.setText("Please Enter Numbers Only");
        rate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rateFocusGained(evt);
            }
        });
        rate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rateKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rateKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Php");

        jPanel6.setBackground(new java.awt.Color(0, 255, 102));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/clear.png"))); // NOI18N
        clear.setContentAreaFilled(false);
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        compute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/compute.png"))); // NOI18N
        compute.setToolTipText("Calculate");
        compute.setAlignmentX(0.5F);
        compute.setContentAreaFilled(false);
        compute.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        compute.setIconTextGap(0);
        compute.setMargin(new java.awt.Insets(0, 0, 0, 0));
        compute.setMaximumSize(new java.awt.Dimension(50, 50));
        compute.setMinimumSize(new java.awt.Dimension(50, 50));
        compute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                computeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                computeMouseExited(evt);
            }
        });
        compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(compute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(compute, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rate, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(price)
                                    .addComponent(partnum, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(desc, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8))
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(partnum, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/logo.png"))); // NOI18N

        jPanel13.setBackground(new java.awt.Color(102, 255, 102));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lists of Fresenius Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24), new java.awt.Color(51, 0, 153))); // NOI18N

        jPanel14.setBackground(new java.awt.Color(0, 255, 102));
        jPanel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.darkGray, java.awt.Color.black));

        frestable.setAutoCreateRowSorter(true);
        frestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        frestable.setFocusable(false);
        frestable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frestableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(frestable);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel15.setForeground(new java.awt.Color(51, 51, 51));
        jPanel15.setToolTipText("");

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/add1.png"))); // NOI18N
        add.setContentAreaFilled(false);
        add.setIconTextGap(0);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/update1.png"))); // NOI18N
        update.setContentAreaFilled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/delete1.png"))); // NOI18N
        delete.setContentAreaFilled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(add)
                .addGap(41, 41, 41)
                .addComponent(update)
                .addGap(34, 34, 34)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        search.setBackground(new java.awt.Color(204, 255, 204));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/search.png"))); // NOI18N
        jLabel10.setText("Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        jTabbedPane2.addTab("Fresenius", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 255, 102));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel12)
                .addContainerGap(1082, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1155, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Technical Reports", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblUSERSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUSERSMouseClicked
       DefaultTableModel m = (DefaultTableModel) tblUSERS.getModel();
        
        txtEId.setText(m.getValueAt(tblUSERS.getSelectedRow(), 0).toString());
        txtEPass.setText(m.getValueAt(tblUSERS.getSelectedRow(), 1).toString());
        txtEName.setText(m.getValueAt(tblUSERS.getSelectedRow(), 2).toString());
        txtPos.setText(m.getValueAt(tblUSERS.getSelectedRow(), 3).toString());
        
       
    }//GEN-LAST:event_tblUSERSMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
     DefaultTableModel model = (DefaultTableModel) tblUSERS.getModel();
        TableRowSorter<TableModel>sorter=new TableRowSorter<TableModel>(model);
        tblUSERS.setRowSorter(sorter);
        
        String text = txtSearch.getText();
        if(text.length()==0){
            sorter.setRowFilter(null);
        }
        else{
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

    private void frestableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frestableMouseClicked
    DefaultTableModel m = (DefaultTableModel) frestable.getModel();
        
        partnum.setText(m.getValueAt(frestable.getSelectedRow(), 0).toString());
        desc.setText(m.getValueAt(frestable.getSelectedRow(), 1).toString());
        price.setText(m.getValueAt(frestable.getSelectedRow(), 2).toString());
        remarks.setText(m.getValueAt(frestable.getSelectedRow(), 3).toString());
        quantity.setText(m.getValueAt(frestable.getSelectedRow(), 4).toString());
        total.setText(m.getValueAt(frestable.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_frestableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
    DefaultTableModel model = (DefaultTableModel) frestable.getModel();
        if((partnum.getText().equals(""))||(desc.getText().equals(""))||(price.getText().equals(""))|(remarks.getText().equals(""))||(quantity.getText().equals(""))||(total.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Complete All of the Fields");
            if(frestable.getSelectedRow()==-1){
            if(frestable.getRowCount()==0){
                JOptionPane.showMessageDialog(null, "Table is Empty");
            }else
                JOptionPane.showMessageDialog(null, "You must Select a Product");
        }
        }
        else{
            
        
        try {
            
            //String strID = jtfID.getText();
            String part = partnum.getText();
            String des = desc.getText();
            String pri = price.getText();
            String mark = remarks.getText();
            String quan = quantity.getText();
            String tot = total.getText();
                
            
            String sql="UPDATE freseniustbl SET Part_Number='"+part+"', Description='"+des+"', Price='"+pri+"',UM='"+mark+"',Quantity='"+quan+"',Total='"+tot+"' WHERE Part_Number='"+part+"'; ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps = conn.prepareStatement(sql);
            int exit=JOptionPane.showConfirmDialog(null, "Are you sure you want to Update Data?");
            if(exit==0){
            ps.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            //model.setValueAt(jtfID.getText(), jtbUser.getSelectedRow(), 0);
            model.setValueAt(partnum.getText(), frestable.getSelectedRow(), 0);
            model.setValueAt(desc.getText(), frestable.getSelectedRow(), 1);
            model.setValueAt(price.getText(), frestable.getSelectedRow(), 2);
            model.setValueAt(remarks.getText(), frestable.getSelectedRow(), 3);
            model.setValueAt(quantity.getText(), frestable.getSelectedRow(), 4);
            model.setValueAt(total.getText(), frestable.getSelectedRow(), 5);
            clearText();
            }
            else if (exit==1){
             clearText();
            }
            else{
             JOptionPane.showMessageDialog(null, "Adding Canceled");
             clearText();
            }
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        clearText();    
    }//GEN-LAST:event_updateActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

     
    private void computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeActionPerformed
       
    
        double a1,a2,result;
        int a3;
        //String t = " ";
        a1=Double.parseDouble(price.getText());
        a2=Double.parseDouble(rate.getText());
        a3=Integer.parseInt(quantity.getText());
        
        if((a1 != 0)&&(a2 != 0)&&(a3 != 0)){
          result = (a1*a2)*a3;
          total.setText("Php"+String.valueOf(result));    
        }else if((a1 != 0)&&(a2 != 0)) {
          result = a1*a2;
          total.setText("Php. "+String.valueOf(result));  
        }else{
            total.setText("$"+String.valueOf(a1*a3));
            
        }
         
//                if(a3 == 0 ){
//                    JOptionPane.showMessageDialog(null, "Quantity entry is empty or should be number type.");
//                }else if(quantity.getText() == ""){
//                    JOptionPane.showMessageDialog(null, "Quantity entry is empty or should be number type.");
//                }
                // TODO add your handling code here:
    }//GEN-LAST:event_computeActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    DefaultTableModel model = (DefaultTableModel) frestable.getModel();
        if(frestable.getSelectedRow()==-1){
            if(frestable.getRowCount()==0){
                JOptionPane.showMessageDialog(null, "Table is Empty");
            }else
                JOptionPane.showMessageDialog(null, "Please fill all fields");
        }
        else{
        try {
            String part = partnum.getText();
            String sql ="DELETE from freseniustbl WHERE Part_Number='"+part+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps=conn.prepareStatement(sql);
            int exit=JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete Data?");
            if (exit==0){
                ps.execute();
                model.removeRow(frestable.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Deleted");
                clearText();
           }
            else if (exit==1){
                clearText();
            }
            else{
                JOptionPane.showMessageDialog(null, "Delete Canceled");
                clearText();
            }
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }    
    }
    }//GEN-LAST:event_deleteActionPerformed

    private void quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyPressed
    if(quantity.getForeground()!= Color.BLACK) 
        {if(quantity.getText().equals("Please Enter Numbers Only"))
        {quantity.setText("");   
            }
         
        }
        quantity.setForeground(Color.BLACK);
    }//GEN-LAST:event_quantityKeyPressed

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
     char vchar = evt.getKeyChar();
     if (!(Character.isDigit(vchar))||(vchar == KeyEvent.VK_BACKSPACE)||(vchar == KeyEvent.VK_DELETE)){
         evt.consume();   
     }
    }//GEN-LAST:event_quantityKeyTyped

    private void quantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusGained
     quantity.setCaretPosition(0);
    }//GEN-LAST:event_quantityFocusGained

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
     if(quantity.getText().isEmpty()==true){
         quantity.setText("Please Enter Numbers Only");
         quantity.setCaretPosition(0);
         quantity.setForeground(new java.awt.Color(102,102,102));
         
     }
    }//GEN-LAST:event_quantityKeyReleased

    private void priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyPressed
       if(price.getForeground()!= Color.BLACK) 
        {if(price.getText().equals("Please Enter Numbers Only"))
        {price.setText("");   
            }
         
        }
        price.setForeground(Color.BLACK);
    }//GEN-LAST:event_priceKeyPressed

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
     char vchar = evt.getKeyChar();
     if (!(Character.isDigit(vchar))||(vchar == KeyEvent.VK_BACKSPACE)||(vchar == KeyEvent.VK_DELETE)){
         evt.consume();   
     }
    }//GEN-LAST:event_priceKeyTyped

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
     if(price.getText().isEmpty()==true){
         price.setText("Please Enter Numbers Only");
         price.setCaretPosition(0);
         price.setForeground(new java.awt.Color(102,102,102));
         
     }
    }//GEN-LAST:event_priceKeyReleased

    private void rateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateKeyPressed
    if(rate.getForeground()!= Color.BLACK) 
        {if(rate.getText().equals("Please Enter Numbers Only"))
        {rate.setText("");   
            }
         
        }
        rate.setForeground(Color.BLACK);
    }//GEN-LAST:event_rateKeyPressed

    private void rateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateKeyTyped
    char vchar = evt.getKeyChar();
     if (!(Character.isDigit(vchar))||(vchar == KeyEvent.VK_BACKSPACE)||(vchar == KeyEvent.VK_DELETE)){
         evt.consume();   
     }
    }//GEN-LAST:event_rateKeyTyped

    private void rateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateKeyReleased
     if(rate.getText().isEmpty()==true){
         rate.setText("Please Enter Numbers Only");
         rate.setCaretPosition(0);
         rate.setForeground(new java.awt.Color(102,102,102));
         
     }
    }//GEN-LAST:event_rateKeyReleased

    private void priceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFocusGained
        price.setCaretPosition(0);
    }//GEN-LAST:event_priceFocusGained

    private void rateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rateFocusGained
        rate.setCaretPosition(0);
    }//GEN-LAST:event_rateFocusGained

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       clearText();
    }//GEN-LAST:event_clearActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
     DefaultTableModel model = (DefaultTableModel) frestable.getModel();
        TableRowSorter<TableModel>sorter=new TableRowSorter<TableModel>(model);
        frestable.setRowSorter(sorter);
        
        String text = search.getText();
        if(text.length()==0){
            sorter.setRowFilter(null);
        }
        else{
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_searchKeyReleased

    private void computeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computeMouseEntered
       compute.setBackground(Color.WHITE);
    }//GEN-LAST:event_computeMouseEntered

    private void computeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computeMouseExited
     compute.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_computeMouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

//fresenius Panel
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if((partnum.getText().equals(""))||(desc.getText().equals(""))||(price.getText().equals(""))||(remarks.getText().equals(""))||(quantity.getText().equals(""))||(total.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Complete All of the Fields");
        }
        else{
            String sql = "Insert into freseniustbl (Part_Number,Description,Price,UM,Quantity,Total) values (?,?,?,?,?,?)";
            try {

                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, partnum.getText());
                ps.setString(2, desc.getText());
                ps.setString(3, price.getText());
                ps.setString(4, remarks.getText());
                ps.setString(5, quantity.getText());
                ps.setString(6, total.getText());
                int exit=JOptionPane.showConfirmDialog(null, "Are you sure you want to Add this Data?");
                if(exit==0){
                    ps.execute();
                    update_table1();
                    JOptionPane.showMessageDialog(null, "Data Added");
                    clearText();
                }
                else if (exit==1){
                    clearText();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Adding Canceled");
                    clearText();
                }
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void remarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remarksActionPerformed

    private void btnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblUSERS.getModel();
        if(tblUSERS.getSelectedRow()==-1){
            if(tblUSERS.getRowCount()==0){
                JOptionPane.showMessageDialog(null, "Table is Empty");
            }else
            JOptionPane.showMessageDialog(null, "Please fill all fields");
        }
        else{
            try {
                String emp = txtEId.getText();
                String sql ="Delete from usersTbl where Employee_ID='"+emp+"';";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps=conn.prepareStatement(sql);
                int exit=JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete Data?");
                if (exit==0){
                    ps.execute();
                    model.removeRow(tblUSERS.getSelectedRow());
                    JOptionPane.showMessageDialog(null, "Data Deleted");
                    clearText();
                }
                else if (exit==1){
                    clearText();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Delete Canceled");
                }
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnDELETEActionPerformed

    private void btnUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblUSERS.getModel();
        if((txtEId.getText().equals(""))||(txtEPass.getText().equals(""))||(txtEName.getText().equals(""))||(txtPos.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Complete All of the Fields");
            if(tblUSERS.getSelectedRow()==-1){
                if(tblUSERS.getRowCount()==0){
                    JOptionPane.showMessageDialog(null, "Table is Empty");
                }else
                JOptionPane.showMessageDialog(null, "Please fill all fields");
            }
        }
        else{

            try {

                //String strID = jtfID.getText();
                String empID = txtEId.getText();
                String pass = txtEPass.getText();
                String position = txtEName.getText();
                String compName = txtPos.getText();

                String sql="UPDATE usersTbl SET Employee_ID='"+empID+"', Password='"+pass+"', Complete_Name='"+compName+"',Position='"+position+"' WHERE Employee_ID='"+empID+"'; ";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps = conn.prepareStatement(sql);
                int exit=JOptionPane.showConfirmDialog(null, "Are you sure you want to Update Data?");
                if(exit==0){
                    ps.execute();
                    model.setValueAt(txtEId.getText(), tblUSERS.getSelectedRow(), 0);
                    model.setValueAt(txtEPass.getText(), tblUSERS.getSelectedRow(), 1);
                    model.setValueAt(txtEName.getText(), tblUSERS.getSelectedRow(), 2);
                    model.setValueAt(txtPos.getText(), tblUSERS.getSelectedRow(), 3);

                    JOptionPane.showMessageDialog(null, "Data Updated");
                }
                else if (exit==1){
                    clearText();}
                else {
                    JOptionPane.showMessageDialog(null, "Update Canceled)");
                    clearText();
                }
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        clearText();
    }//GEN-LAST:event_btnUPDATEActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        if((txtEId.getText().equals(""))||(txtEPass.getText().equals(""))||(txtEName.getText().equals(""))||(txtPos.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Complete All of the Fields");
        }
        else{
            String sql = "Insert into usersTbl (Employee_ID,Complete_Name,Position,Password) values (?,?,?,?)";
            try {

                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, txtEId.getText());
                ps.setString(2, txtEPass.getText());
                ps.setString(3, txtEName.getText());
                ps.setString(4, txtPos.getText());

                int exit=JOptionPane.showConfirmDialog(null, "Are you sure you want to Add this Data?");
                if(exit==0){
                    ps.execute();
                    update_table();
                    JOptionPane.showMessageDialog(null, "Data Added");
                    clearText();
                }
                else if (exit==1){
                    clearText();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Adding Canceled");
                    clearText();
                }
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnADDActionPerformed

    private void txtENameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtENameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtENameActionPerformed

    private void txtPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosActionPerformed

    private void txtEIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEIdActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        clearText();
    }//GEN-LAST:event_clear1ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("Report Print");
        MessageFormat footer = new MessageFormat("Page{Fresenius,string}");
            try {
             tblUSERS.print(JTable.PrintMode.FIT_WIDTH, header, footer, rootPaneCheckingEnabled, null, rootPaneCheckingEnabled, null);
            
            }
            catch (java.awt.print.PrinterException e){
                System.err.format("Cannot print ", e.getMessage());
            }
    }//GEN-LAST:event_printActionPerformed
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnUPDATE;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JButton compute;
    private javax.swing.JButton delete;
    private javax.swing.JTextField desc;
    private javax.swing.JTable frestable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
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
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel jpUsers;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JTextField partnum;
    private javax.swing.JTextField price;
    private javax.swing.JButton print;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField rate;
    private javax.swing.JTextField remarks;
    private javax.swing.JTextField search;
    private javax.swing.JTable tblUSERS;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txtEId;
    private javax.swing.JTextField txtEName;
    private javax.swing.JPasswordField txtEPass;
    private javax.swing.JTextField txtPos;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
