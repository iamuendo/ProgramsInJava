package registrationform2;

// Import necessary libraries
import java.sql.*; // For database operations
import javax.swing.table.DefaultTableModel; // For managing table data
import javax.swing.JOptionPane; // For displaying dialog boxes
/**
 *
 * @admno: BSE-01-0024/2025
 * @Name: Muendo Isaac Maingi
 */

// Creates a main class extending JFrame 
public class form2 extends javax.swing.JFrame {
    
    // Declare the table model to manage data for the table
    private final DefaultTableModel tableModel;
    
    // Enter database connection details
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/CAT2registration?autoReconnect=true&useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    // Create a constructor for form 2
    public form2() {
        initComponents(); // Initialize the form components
        
        // Define column names for the table
        String[] columns = {"ID", "Name", "Gender", "Contact", "Address"};
        // Create a new table model with the defined columns and 0 initial rows
        tableModel = new DefaultTableModel(columns, 0);
        // Set the table model for the form2Tbl
        form2Tbl.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        TitleTxt = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        genderLbl = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        maleRbtn = new javax.swing.JRadioButton();
        femaleRbtn = new javax.swing.JRadioButton();
        addressLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        contactLbl = new javax.swing.JLabel();
        contactTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        form2Tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BSE-01-0024/2025 Muendo Isaac Maingi");

        TitleTxt.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        TitleTxt.setText("Registration Form");

        idLbl.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        idLbl.setText("ID");

        nameLbl.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        nameLbl.setText("Name");

        genderLbl.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        genderLbl.setText("Gender");

        maleRbtn.setText("Male");

        femaleRbtn.setText("Female");

        addressLbl.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        addressLbl.setText("Address");

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        contactLbl.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        contactLbl.setText("Contact");

        form2Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Address", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(form2Tbl);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contactLbl)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(idLbl)
                        .addComponent(nameLbl)
                        .addComponent(genderLbl)
                        .addComponent(addressLbl)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TitleTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(exitBtn)
                                .addGap(18, 18, 18)
                                .addComponent(registerBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(maleRbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(femaleRbtn))
                            .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(idTxt)
                            .addComponent(contactTxt)
                            .addComponent(addressTxt))
                        .addGap(80, 80, 80)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(TitleTxt)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLbl)
                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLbl)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLbl)
                            .addComponent(maleRbtn)
                            .addComponent(femaleRbtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactLbl)
                            .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitBtn)
                            .addComponent(registerBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Create a method to handle the register button click event
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String id = idTxt.getText(); // Get the ID from the text field
        String name = nameTxt.getText(); // Get the name from the text field
        String gender = maleRbtn.isSelected() ? "Male" : femaleRbtn.isSelected() ? "Female" : "Not Specified"; // Determine the selected gender
        String contact = contactTxt.getText(); // Get the contact number from the text field
        String address = addressTxt.getText(); // Get the address from the text field
       
        // Check if all fields are filled
        if (!id.isEmpty() && !name.isEmpty() && !gender.isEmpty() && !contact.isEmpty() && !address.isEmpty()) {
            // Create a row array with the input data
            Object[] row = {id, name, gender, contact, address};
            // Add the row to the table model
            tableModel.addRow(row);
            
            // Clear input fields after registration
            idTxt.setText(""); // Clear the ID text field
            nameTxt.setText(""); // Clear the name text field
            contactTxt.setText(""); // Clear the contact text field
            addressTxt.setText(""); // Clear the address text field
            maleRbtn.setSelected(false); // Deselect the male radio button
            femaleRbtn.setSelected(false); // Deselect the female radio button
        } else {
            // Display a message if any field is empty
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
        }
        
        // Try to connect to the database and insert the data
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO form2 (id, name, gender, contact, address) VALUES (?, ?, ?, ?, ?)")) {
            
            // Set the values for the prepared statement
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, gender);
            stmt.setString(4, contact);
            stmt.setString(5, address);
            
            // Execute the query and get the number of rows affected
            int rowsAffected = stmt.executeUpdate();
            
            // Display a success or failure message based on the result
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Registration saved successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save registration.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_registerBtnActionPerformed
    
    // Method to handle the exit button click event
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // Show a confirmation dialog
        int confirmed = JOptionPane.showConfirmDialog(null, 
            "Are you sure you want to exit the application?", "Exit Program",
            JOptionPane.YES_NO_OPTION);

        // If the user confirms, exit the application
        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    // Create a main method to launch the application
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
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleTxt;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JLabel contactLbl;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JRadioButton femaleRbtn;
    private javax.swing.JTable form2Tbl;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton maleRbtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
