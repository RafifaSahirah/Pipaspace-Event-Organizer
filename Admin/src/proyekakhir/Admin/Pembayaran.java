/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyekakhir.Admin;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import proyekakhir.ConnectDB;

/**
 *
 * @author Bagas A
 */
public class Pembayaran extends javax.swing.JPanel {

    DefaultTableModel tbl;
    Connection con = ConnectDB.getConnection();
    Statement s = null;
    ResultSet rs;
    boolean row_Is_Selected = false;
    int index = 0;
    DefaultTableModel nav;

    /**
     * Creates new form Pembayaran
     */
    public Pembayaran() {
        initComponents();
        TampilData();
        try {
            s = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = s.executeQuery("SELECT kodePembayaran, metodePembayaran, total, tanggalPembayaran, kodePesanan FROM Pembayaran");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void TampilData()
    {
        tbl = new DefaultTableModel();
        tbl.addColumn("Kode Pembayaran");
        tbl.addColumn("Metode Pembayaran");
        tbl.addColumn("Total");
        tbl.addColumn("Tanggal Pembayaran");
        tbl.addColumn("Kode Pesanan");
        tablePembayaran.setModel(tbl);
        
        try {
            java.sql.Statement statement = con.createStatement();
            String sql = "SELECT * FROM Pembayaran";
            java.sql.ResultSet result = statement.executeQuery(sql);
            while(result.next()) {
                tbl.addRow(new Object[] {
                    result.getString("kodePembayaran"),
                    result.getString("metodePembayaran"),
                    result.getString("total"),
                    result.getString("tanggalPembayaran"),
                    result.getString("kodePesanan")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputKodePembayaran = new javax.swing.JTextField();
        inputKodePesanan = new javax.swing.JTextField();
        inputTanggalPembayaran = new com.toedter.calendar.JDateChooser();
        inputTotal = new javax.swing.JTextField();
        inputMetodePembayaran = new javax.swing.JComboBox<>();
        bSave = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePembayaran = new javax.swing.JTable();
        JBCari = new javax.swing.JButton();
        InputPencarian = new javax.swing.JTextField();
        CBTipeData = new javax.swing.JComboBox<>();
        bFirst1 = new javax.swing.JButton();
        bPrev1 = new javax.swing.JButton();
        bNext1 = new javax.swing.JButton();
        bLast1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1142, 521));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("INFORMASI PEMBAYARAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Kode Pembayaran");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Kode Pesanan");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setText("Metode Pembayaran");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setText("Total");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setText("Tanggal Pembayaran");

        inputMetodePembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Transfer Bank", "DANA", "Gopay", "Shopeepay" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(inputKodePembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputKodePesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputTanggalPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(inputTotal)
                            .addComponent(inputMetodePembayaran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputKodePembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputMetodePembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputTanggalPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputKodePesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        bSave.setBackground(new java.awt.Color(153, 153, 153));
        bSave.setText("SAVE");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bCancel.setBackground(new java.awt.Color(153, 153, 153));
        bCancel.setText("CANCEL");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        bUpdate.setBackground(new java.awt.Color(153, 153, 153));
        bUpdate.setText("UPDATE");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setBackground(new java.awt.Color(153, 153, 153));
        bDelete.setText("DELETE");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        tablePembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePembayaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePembayaran);

        JBCari.setText("Cari");
        JBCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCariActionPerformed(evt);
            }
        });

        InputPencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // InputPencarianActionPerformed(evt);
            }
        });

        CBTipeData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Pembayaran", "Metode Pembayaran", "Total", "Tanggal Pembayaran", "Kode Pesanan" }));
        CBTipeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // CBTipeDataActionPerformed(evt);
            }
        });

        bFirst1.setBackground(new java.awt.Color(153, 153, 153));
        bFirst1.setText("<<");
        bFirst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFirst1ActionPerformed(evt);
            }
        });

        bPrev1.setBackground(new java.awt.Color(153, 153, 153));
        bPrev1.setText("<");
        bPrev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrev1ActionPerformed(evt);
            }
        });

        bNext1.setBackground(new java.awt.Color(153, 153, 153));
        bNext1.setText(">");
        bNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNext1ActionPerformed(evt);
            }
        });

        bLast1.setBackground(new java.awt.Color(153, 153, 153));
        bLast1.setText(">>");
        bLast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLast1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBTipeData, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(InputPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBCari))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bPrev1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bLast1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSave)
                            .addComponent(bCancel)
                            .addComponent(bUpdate)
                            .addComponent(bDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBTipeData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBCari))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLast1)
                    .addComponent(bNext1)
                    .addComponent(bFirst1)
                    .addComponent(bPrev1))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        try {
            PreparedStatement statement = con.prepareStatement("INSERT INTO Pembayaran (kodePembayaran, metodePembayaran, total, tanggalPembayaran, kodePesanan) VALUES (?, ?, ?, ?, ?)");
            
            statement.setString(1, inputKodePembayaran.getText());
            if(inputMetodePembayaran.getSelectedItem().equals("Transfer Bank")) {
                statement.setString(2, "Transfer Bank");
            } else if(inputMetodePembayaran.getSelectedItem().equals("DANA")) {
                statement.setString(2, "DANA");
            } else if(inputMetodePembayaran.getSelectedItem().equals("Gopay")) {
                statement.setString(2, "Gopay");
            } else if(inputMetodePembayaran.getSelectedItem().equals("Shopeepay")) {
                statement.setString(2, "Shoopepay");
            }
            statement.setString(3, inputTotal.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(inputTanggalPembayaran.getDate());
            statement.setString(4, date);
            statement.setString(5, inputKodePesanan.getText());

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bSaveActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        inputKodePembayaran.setText("");
        inputMetodePembayaran.setSelectedIndex(0);
        inputTotal.setText("");
        inputTanggalPembayaran.setDate(new Date());
        inputKodePesanan.setText("");
        buttonGroup1.clearSelection();
        InputPencarian.setText("");
        TampilData();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        try {
            PreparedStatement stmt = con.prepareStatement(
                "UPDATE Pembayaran SET kodePembayaran=?, metodePembayaran=?, total=?, tanggalPembayaran=?, kodePesanan=? WHERE kodePembayaran=?");
            stmt.setString(1, inputKodePembayaran.getText());
            if(inputMetodePembayaran.getSelectedItem().equals("Transfer Bank")) {
                stmt.setString(2, "Transfer Bank");
            } else if(inputMetodePembayaran.getSelectedItem().equals("DANA")) {
                stmt.setString(2, "DANA");
            } else if(inputMetodePembayaran.getSelectedItem().equals("Gopay")) {
                stmt.setString(2, "Gopay");
            } else if(inputMetodePembayaran.getSelectedItem().equals("Shopeepay")) {
                stmt.setString(2, "Shoopepay");
            }
            stmt.setString(3, inputTotal.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(inputTanggalPembayaran.getDate());
            stmt.setString(4, date);
            stmt.setString(5, inputKodePesanan.getText());
            stmt.setString(6, inputKodePembayaran.getText());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        try {
            PreparedStatement stmt = con.prepareStatement(
                "DELETE FROM Pembayaran WHERE kodePembayaran='" + inputKodePembayaran.getText() + "'");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            inputKodePembayaran.setText("");
            inputMetodePembayaran.setSelectedIndex(0);
            inputTotal.setText("");
            inputTanggalPembayaran.setDate(new Date());
            inputKodePembayaran.setText("");
            buttonGroup1.clearSelection();
            TampilData();
        } catch (Exception e) {
            System.out.println("Error di sini");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void tablePembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePembayaranMouseClicked
        int row = tablePembayaran.getSelectedRow();
        inputKodePembayaran.setText(tablePembayaran.getValueAt(row, 0).toString());
        inputMetodePembayaran.setSelectedItem(tablePembayaran.getValueAt(row, 1).toString());
        inputTotal.setText(tablePembayaran.getValueAt(row, 2).toString());
        
        try {
            DefaultTableModel model = (DefaultTableModel) tablePembayaran.getModel();
            int tempRow = tablePembayaran.getSelectedRow();
            Date tgl = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(tempRow, 3));
            inputTanggalPembayaran.setDate(tgl);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        inputKodePesanan.setText(tablePembayaran.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tablePembayaranMouseClicked

    private void JBCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCariActionPerformed
        tbl = new DefaultTableModel();
        tbl.addColumn("Kode Pembayaran");
        tbl.addColumn("Metode Pembayaran");
        tbl.addColumn("Total");
        tbl.addColumn("Tanggal Pembayaran");
        tbl.addColumn("Kode Pesanan");
        tablePembayaran.setModel(tbl);

        String sql = "";
        try {
            java.sql.Statement st = con.createStatement();
            if(CBTipeData.getSelectedItem().equals("Kode Pembayaran")) {
                String input = InputPencarian.getText();
                if (input.substring(input.length() - 1).equals("%")) {
                    sql = "SELECT * FROM Pembayaran WHERE kodePembayaran LIKE '" + input.replace("%", "") + "%'";
                } else if (input.substring(0,1).equals("%")) {
                    sql = "SELECT * FROM Pembayaran WHERE kodePembayaran LIKE '%" + input.replace("%", "") + "'";
                } else if (input.contains(input)) {
                    sql = "SELECT * FROM Pembayaran WHERE kodePembayaran LIKE '%" + input + "%'";
                }
            } else if (CBTipeData.getSelectedItem().equals("Metode Pembayaran")) {
                String input = InputPencarian.getText();
                if (input.substring(input.length() - 1).equals("%")) {
                    sql = "SELECT * FROM Pembayaran WHERE metodePembayaran LIKE '" + input.replace("%", "") + "%'";
                } else if (input.substring(0,1).equals("%")) {
                    sql = "SELECT * FROM Pembayaran WHERE metodePembayaran LIKE '%" + input.replace("%", "") + "'";
                } else if (input.contains(input)) {
                    sql = "SELECT * FROM Pembayaran WHERE metodePembayaran LIKE '%" + input + "%'";
                }
            } else if (CBTipeData.getSelectedItem().equals("Total")) {
                String input = InputPencarian.getText();
                if (input.substring(input.length() - 1).equals("%")) {
                    sql = "SELECT * FROM Pembayaran WHERE total LIKE '" + input.replace("%", "") + "%'";
                } else if (input.substring(0,1).equals("%")) {
                    sql = "SELECT * FROM Pembayaran WHERE total LIKE '%" + input.replace("%", "") + "'";
                } else if (input.contains(input)) {
                    sql = "SELECT * FROM Pembayaran WHERE total LIKE '%" + input + "%'";
                }
            } else if (CBTipeData.getSelectedItem().equals("Tanggal Pembayaran")) {
                String input = InputPencarian.getText();
                if (input.substring(input.length() - 1).equals("%")) {
                    sql = "SELECT * FROM Pembayaran WHERE tanggalPembayaran LIKE '" + input.replace("%", "") + "%'";
                } else if (input.substring(0,1).equals("%")) {
                    sql = "SELECT * FROM Pembayaran WHERE tanggalPembayaran LIKE '%" + input.replace("%", "") + "'";
                } else if (input.contains(input)) {
                    sql = "SELECT * FROM Pembayaran WHERE tanggalPembayaran LIKE '%" + input + "%'";
                }
            } else {
                sql = "SELECT * FROM Pembayaran WHERE kodePesanan LIKE '%" + InputPencarian.getText() + "%'";
            }

            java.sql.ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                tbl.addRow(new Object[] {
                    res.getString("kodePembayaran"),
                    res.getString("metodePembayaran"),
                    res.getString("total"),
                    res.getString("tanggalPembayaran"),
                    res.getString("kodePesanan")
                });
            }
            inputKodePembayaran.setText("");
            inputMetodePembayaran.setSelectedIndex(0);
            inputTotal.setText("");
            inputTanggalPembayaran.setDate(new Date());
            inputKodePesanan.setText("");
            buttonGroup1.clearSelection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_JBCariActionPerformed

    // private void InputPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPencarianActionPerformed

    // }//GEN-LAST:event_InputPencarianActionPerformed

    // private void CBTipeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTipeDataActionPerformed
    //     //     // TODO add your handling code here:
    // }//GEN-LAST:event_CBTipeDataActionPerformed

    private void bFirst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFirst1ActionPerformed
        tablePembayaran.changeSelection(0, 0, false, false);
        highlightMouseClicked();
    }//GEN-LAST:event_bFirst1ActionPerformed

    private void bPrev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrev1ActionPerformed
        int i = tablePembayaran.getSelectedRow();
        TableModel model = tablePembayaran.getModel();
        tablePembayaran.changeSelection(i-1, 0, false, false);
        highlightMouseClicked();
    }//GEN-LAST:event_bPrev1ActionPerformed

    private void bNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNext1ActionPerformed
        int i = tablePembayaran.getSelectedRow();
        if (tablePembayaran.getRowCount() - 1 != i) {
            TableModel model = tablePembayaran.getModel();
            tablePembayaran.changeSelection(i+1, 0, false, false);
            highlightMouseClicked();
        }
    }//GEN-LAST:event_bNext1ActionPerformed

    private void bLast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLast1ActionPerformed
        tablePembayaran.changeSelection(tablePembayaran.getRowCount() - 1, 0, false, false);
        highlightMouseClicked();
    }//GEN-LAST:event_bLast1ActionPerformed
    
    private void highlightMouseClicked() {
        int row = tablePembayaran.getSelectedRow();
        inputKodePembayaran.setText(tablePembayaran.getValueAt(row, 0).toString());
        inputMetodePembayaran.setSelectedItem(tablePembayaran.getValueAt(row, 1).toString());
        inputTotal.setText(tablePembayaran.getValueAt(row, 2).toString());
        
        try {
            DefaultTableModel model = (DefaultTableModel) tablePembayaran.getModel();
            int tempRow = tablePembayaran.getSelectedRow();
            Date tgl = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(tempRow, 3));
            inputTanggalPembayaran.setDate(tgl);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        inputKodePesanan.setText(tablePembayaran.getValueAt(row, 4).toString());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBTipeData;
    private javax.swing.JTextField InputPencarian;
    private javax.swing.JButton JBCari;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bFirst1;
    private javax.swing.JButton bLast1;
    private javax.swing.JButton bNext1;
    private javax.swing.JButton bPrev1;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField inputKodePembayaran;
    private javax.swing.JTextField inputKodePesanan;
    private javax.swing.JComboBox<String> inputMetodePembayaran;
    private com.toedter.calendar.JDateChooser inputTanggalPembayaran;
    private javax.swing.JTextField inputTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePembayaran;
    // End of variables declaration//GEN-END:variables
}