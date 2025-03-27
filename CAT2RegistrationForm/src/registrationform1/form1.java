package registrationform1;

// Import necessary libraries
import java.util.Calendar; // For date related operations
import java.sql.*; // For database operations
import javax.swing.DefaultComboBoxModel; // For combo box models
import java.util.stream.IntStream; // For generating streams of integers
import javax.swing.JOptionPane; // For displaying dialog boxes

/**
 *
 * @admno: BSE-01-0024/2025
 * @Name: Muendo Isaac Maingi
 */

// Main class extending JFrame (Swing window)
public class form1 extends javax.swing.JFrame {
    
    // Enter database connection details
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/CAT2registration?autoReconnect=true&useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    // Create constructor for form1
    public form1() {
        initComponents(); // Initialize form components
        populateComboBoxes(); // Populate the combo boxes with data
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        ContainerPnl = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        mobileLbl = new javax.swing.JLabel();
        mobiletxt = new javax.swing.JTextField();
        genderLbl = new javax.swing.JLabel();
        maleRd = new javax.swing.JRadioButton();
        femaleRd = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        dobLbl = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        addressLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTxt = new javax.swing.JTextArea();
        termsCbox = new javax.swing.JCheckBox();
        submitBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        displayLbl = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BSE-01-0024/2025 Muendo Isaac Maingi");

        nameLbl.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        nameLbl.setText("Name");

        mobileLbl.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        mobileLbl.setText("Mobile");

        genderLbl.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        genderLbl.setText("Gender");

        maleRd.setText("Male");

        femaleRd.setText("Female");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setText("Registration Form");

        dobLbl.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        dobLbl.setText("DOB");

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addressLbl.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        addressLbl.setText("Address");

        addressTxt.setColumns(20);
        addressTxt.setRows(5);
        jScrollPane1.setViewportView(addressTxt);

        termsCbox.setText("Accept Terms and Conditions");

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        displayLbl.setBackground(new java.awt.Color(255, 255, 255));
        displayLbl.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        displayLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        displayLbl.setOpaque(true);

        javax.swing.GroupLayout ContainerPnlLayout = new javax.swing.GroupLayout(ContainerPnl);
        ContainerPnl.setLayout(ContainerPnlLayout);
        ContainerPnlLayout.setHorizontalGroup(
            ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPnlLayout.createSequentialGroup()
                .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerPnlLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContainerPnlLayout.createSequentialGroup()
                                .addComponent(addressLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(ContainerPnlLayout.createSequentialGroup()
                                .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderLbl)
                                    .addComponent(mobileLbl)
                                    .addComponent(nameLbl)
                                    .addComponent(dobLbl))
                                .addGap(18, 18, 18)
                                .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ContainerPnlLayout.createSequentialGroup()
                                        .addComponent(maleRd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(femaleRd))
                                    .addGroup(ContainerPnlLayout.createSequentialGroup()
                                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(mobiletxt)))))
                    .addGroup(ContainerPnlLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerPnlLayout.createSequentialGroup()
                                .addComponent(submitBtn)
                                .addGap(56, 56, 56)
                                .addComponent(resetBtn))
                            .addComponent(termsCbox))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(displayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(ContainerPnlLayout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContainerPnlLayout.setVerticalGroup(
            ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPnlLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerPnlLayout.createSequentialGroup()
                        .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLbl)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobiletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileLbl))
                        .addGap(18, 18, 18)
                        .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLbl)
                            .addComponent(maleRd)
                            .addComponent(femaleRd))
                        .addGap(18, 18, 18)
                        .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dobLbl)
                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLbl)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(termsCbox))
                    .addComponent(displayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContainerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn)
                    .addComponent(submitBtn))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContainerPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContainerPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Create a method to handle the reset button click event
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        nametxt.setText(""); 
        mobiletxt.setText("");
        maleRd.setSelected(false);
        femaleRd.setSelected(false);
        day.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);
        addressTxt.setText("");
        termsCbox.setSelected(false);
        displayLbl.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed
    
    // Create a method to handle the submit button click event
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed

        String name = nametxt.getText(); // Get the name from the text field
        String mobile = mobiletxt.getText(); // Get the mobile number from the text field
        String gender = maleRd.isSelected() ? "Male" : femaleRd.isSelected() ? "Female" : "Not Specified"; // Determine the selected gender
        String dob = day.getSelectedItem() + "-" + month.getSelectedItem() + "-" + year.getSelectedItem(); // Construct the date of birth string
        String address = addressTxt.getText(); // Get the address from the text area
        boolean termsAccepted = termsCbox.isSelected(); // Check if the terms checkbox is selected

        // Validate terms acceptance
        if (!termsAccepted) {
            displayLbl.setText("Please accept terms and conditions."); // Display a message if terms are not accepted
            return; // Exit the method
        }
        
        // Try to connect to the database and insert the data
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO form1 (name, mobile, gender, dob, address, terms) VALUES (?, ?, ?, ?, ?, ?)")) {
            
            // Set the values for the prepared statement
            stmt.setString(1, name);
            stmt.setString(2, mobile);
            stmt.setString(3, gender);
            stmt.setString(4, dob);
            stmt.setString(5, address);
            stmt.setBoolean(6, termsAccepted);
            
            // Execute the query and get the number of rows affected
            int rowsAffected = stmt.executeUpdate();
            
            // Display a success or failure message based on the result
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Registration saved successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save registration.");
            }

        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Display gathered information on displayLbl
        displayLbl.setText("<html>Name: " + name + "<br>Mobile: " + mobile
            + "<br>Gender: " + gender + "<br>DOB: " + dob
            + "<br>Address: " + address + "</html>");
    }//GEN-LAST:event_submitBtnActionPerformed
    
    // Method to populate all combo boxes
    private void populateComboBoxes() {
        populateDays(); // Populate the days combo box
        populateMonths(); // Populate the months combo box
        populateYears(); // Populate the years combo box

        // Add listener to update days based on selected month and year
        month.addActionListener(e -> updateDays()); // Update days when month changes
        year.addActionListener(e -> updateDays()); // Update days when year changes
    }
    
    // Create a method to populate the days combo box
    private void populateDays() {
        DefaultComboBoxModel<String> dayModel = new DefaultComboBoxModel<>(); // Create a new combo box model
        IntStream.rangeClosed(1, 31).forEach(i -> dayModel.addElement(String.valueOf(i))); // Add days 1-31 to the model
        day.setModel(dayModel); // Set the model for the days combo box
    }
    
    // Create a method to populate the months combo box
    private void populateMonths() {
        String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"}; // Create an array of month names
        DefaultComboBoxModel<String> monthModel = new DefaultComboBoxModel<>(months); // Create a new combo box model with months
        month.setModel(monthModel); // Set the model for the months combo box
    }
    
    // Create a method to populate the years combo box
    private void populateYears() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR); // Get the current year
        DefaultComboBoxModel<String> yearModel = new DefaultComboBoxModel<>(); // Create a new combo box model
        IntStream.rangeClosed(1900, currentYear).forEach(i -> yearModel.addElement(String.valueOf(i))); // Add years from 1900 to the current year
        year.setModel(yearModel); // Set the model for the years combo box
    }
    
    // Method to update the days combo box based on the selected month and year
    private void updateDays() {
        int selectedMonth = month.getSelectedIndex(); // Get the selected month index
        int selectedYear = Integer.parseInt((String) year.getSelectedItem()); // Get the selected year

        // Create a calendar instance and set it to the selected month and year
        Calendar calendar = Calendar.getInstance();
        calendar.set(selectedYear, selectedMonth, 1);
        
        // Get the number of days in the selected month/year
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Populate the days combo box with the correct number of days
        DefaultComboBoxModel<String> dayModel = new DefaultComboBoxModel<>();
        IntStream.rangeClosed(1, daysInMonth).forEach(i -> dayModel.addElement(String.valueOf(i)));
        day.setModel(dayModel);
    }
    
          
    // Main method to launch the application
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
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContainerPnl;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextArea addressTxt;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel displayLbl;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JRadioButton femaleRd;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRd;
    private javax.swing.JLabel mobileLbl;
    private javax.swing.JTextField mobiletxt;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JCheckBox termsCbox;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
