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
public class BioregenEuro extends javax.swing.JFrame {
    Connection conn = new BioregenInventory().connect();
    
    public BioregenEuro() {
         
        initComponents();
        update_table1();
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
        partnum.setText("");
        desc.setText("");
        price.setText("");
        rate.setText("");
        remarks.setText("");
        total.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        partnum = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        remarks = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        compute = new javax.swing.JButton();
        price = new javax.swing.JFormattedTextField();
        rate = new javax.swing.JFormattedTextField();
        jPanel15 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        frestable = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bioregen Inventory System");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24), new java.awt.Color(51, 0, 153))); // NOI18N
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
        jLabel7.setText("UM:");

        partnum.setToolTipText("Enter Part Number");

        desc.setToolTipText("Enter Part Description");

        remarks.setToolTipText("UM/Remarks");
        remarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remarksActionPerformed(evt);
            }
        });

        total.setToolTipText("Price Equivalent in Peso");
        total.setCaretColor(new java.awt.Color(255, 255, 255));
        total.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Php");

        jPanel6.setBackground(new java.awt.Color(0, 255, 102));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/clear.png"))); // NOI18N
        clear.setToolTipText("Clear Field");
        clear.setContentAreaFilled(false);
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        compute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/compute.png"))); // NOI18N
        compute.setToolTipText("CALCULATE ");
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
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(compute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(compute, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        price.setForeground(new java.awt.Color(102, 102, 102));
        price.setText("Please Enter Numbers Only");
        price.setToolTipText("Price In Dollar");
        price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                priceFocusGained(evt);
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

        rate.setForeground(new java.awt.Color(102, 102, 102));
        rate.setText("Please Enter Numbers Only");
        rate.setToolTipText("Enter Philippine Rate");
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

        jPanel15.setBackground(new java.awt.Color(0, 255, 102));
        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel15.setForeground(new java.awt.Color(51, 51, 51));
        jPanel15.setToolTipText("");

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/update1.png"))); // NOI18N
        update.setToolTipText("UPDATE");
        update.setContentAreaFilled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/delete1.png"))); // NOI18N
        delete.setToolTipText("DELETE");
        delete.setContentAreaFilled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/add1.png"))); // NOI18N
        add.setToolTipText("ADD");
        add.setContentAreaFilled(false);
        add.setIconTextGap(0);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(rate)
                    .addComponent(partnum)
                    .addComponent(remarks))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(23, 23, 23)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
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
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioregeninventorysystem/icons/logo.png"))); // NOI18N

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lists of Fresenius Spare Parts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24), new java.awt.Color(51, 0, 153))); // NOI18N

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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        search.setBackground(new java.awt.Color(204, 255, 204));
        search.setToolTipText("Search Spare Parts");
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(251, 251, 251))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(692, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void frestableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frestableMouseClicked
        DefaultTableModel m = (DefaultTableModel) frestable.getModel();

        partnum.setText(m.getValueAt(frestable.getSelectedRow(), 0).toString());
        desc.setText(m.getValueAt(frestable.getSelectedRow(), 1).toString());
        price.setText(m.getValueAt(frestable.getSelectedRow(), 2).toString());
        remarks.setText(m.getValueAt(frestable.getSelectedRow(), 3).toString());
        total.setText(m.getValueAt(frestable.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_frestableMouseClicked

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

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        DefaultTableModel model = (DefaultTableModel) frestable.getModel();
        if((partnum.getText().equals(""))||(desc.getText().equals(""))||(price.getText().equals(""))|(remarks.getText().equals(""))||(total.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Complete All of the Fields");
            if(frestable.getSelectedRow()==-1){
                if(frestable.getRowCount()==0){
                    JOptionPane.showMessageDialog(null, "Table is Empty");
                }else
                JOptionPane.showMessageDialog(null, "Please fill all fields");
            }
        }
        else{

            try {

                //String strID = jtfID.getText();
                String part = partnum.getText();
                String des = desc.getText();
                String pri = price.getText();
                String mark = remarks.getText();
                String tot = total.getText();

                String sql="UPDATE freseniustbl SET Part_Number='"+part+"', Description='"+des+"', Price_Dollars='"+pri+"',UM='"+mark+"',Peso_Equivalent='"+tot+"' WHERE Part_Number='"+part+"'; ";
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
                    model.setValueAt(total.getText(), frestable.getSelectedRow(), 4);
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

    private void rateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateKeyTyped
        char c;
        c = evt.getKeyChar();
        if (Character.isLetter(c)&&!evt.isAltDown()){
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

    private void rateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateKeyPressed
        if(rate.getForeground()!= Color.BLACK)
        {if(rate.getText().equals("Please Enter Numbers Only"))
            {rate.setText("");
            }

        }
        rate.setForeground(Color.BLACK);
    }//GEN-LAST:event_rateKeyPressed

    private void rateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rateFocusGained
        rate.setCaretPosition(0);
    }//GEN-LAST:event_rateFocusGained

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        char c;
        c = evt.getKeyChar();
        if (Character.isLetter(c)&&!evt.isAltDown()){
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

    private void priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyPressed
        if(price.getForeground()!= Color.BLACK)
        {if(price.getText().equals("Please Enter Numbers Only"))
            {price.setText("");
            }

        }
        price.setForeground(Color.BLACK);
    }//GEN-LAST:event_priceKeyPressed

    private void priceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFocusGained
        price.setCaretPosition(0);
    }//GEN-LAST:event_priceFocusGained

    private void computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeActionPerformed

        double a1 = Double.parseDouble(price.getText());
        double a2 = Double.parseDouble(rate.getText());
        double result = a1*a2;
        total.setText(String.valueOf(result));
    }//GEN-LAST:event_computeActionPerformed

    private void computeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computeMouseExited
        compute.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_computeMouseExited

    private void computeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computeMouseEntered
        compute.setBackground(Color.WHITE);
    }//GEN-LAST:event_computeMouseEntered

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clearText();
    }//GEN-LAST:event_clearActionPerformed

    private void remarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remarksActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if((partnum.getText().equals(""))||(desc.getText().equals(""))||(price.getText().equals(""))||(rate.getText().equals(""))||(remarks.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Complete All of the Fields");
        }
        else{
            String sql = "Insert into freseniustbl (Part_Number,Description,Price_Dollars,UM,Peso_Equivalent) values (?,?,?,?)";
            try {

                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, partnum.getText());
                ps.setString(2, desc.getText());
                ps.setString(3, rate.getText());
                ps.setString(4, remarks.getText());
                ps.setString(5, total.getText());

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
            java.util.logging.Logger.getLogger(BioregenEuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BioregenEuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BioregenEuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BioregenEuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BioregenEuro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton compute;
    private javax.swing.JButton delete;
    private javax.swing.JTextField desc;
    private javax.swing.JTable frestable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField partnum;
    private javax.swing.JFormattedTextField price;
    private javax.swing.JFormattedTextField rate;
    private javax.swing.JTextField remarks;
    private javax.swing.JTextField search;
    private javax.swing.JTextField total;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
