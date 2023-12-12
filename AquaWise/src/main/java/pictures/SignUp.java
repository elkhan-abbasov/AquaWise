
package pictures;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.QuerySnapshot;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.swing.JOptionPane;
import pictures.personProvider;

/**
 *
 * @author MSI
 */
public class SignUp extends javax.swing.JFrame {

    
    /**
     * Creates new form SignUp
     */
    public SignUp() {
        ConnectionTrue.ConnectFirebase();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        signupButton = new javax.swing.JButton();
        alreadyButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AquaWise");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        surnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameFieldActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        signupButton.setBackground(new java.awt.Color(0, 0, 0));
        signupButton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("SIGN UP");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        alreadyButton.setBackground(new java.awt.Color(0, 51, 204));
        alreadyButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        alreadyButton.setForeground(new java.awt.Color(255, 255, 255));
        alreadyButton.setText("ALREADY HAVE AN ACCOUNT ");
        alreadyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alreadyButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Surname");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alreadyButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(304, 304, 304)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(225, 225, 225)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(surnameField)
                                        .addComponent(emailField)
                                        .addComponent(passwordField)))))))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alreadyButton)
                .addContainerGap(136, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void surnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void alreadyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alreadyButtonActionPerformed
        close();
        LoginSignUp login = new LoginSignUp();
        login.setVisible(true);
        
        
    }//GEN-LAST:event_alreadyButtonActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        /////////////////////////////////////////////////////////////
        //DO NOT CHANGE ANYTHING WITHOUT TELLING ME ps. -ELkhan//////
        /////////////////////////////////////////////////////////////
        save();        
        close();
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        
    }//GEN-LAST:event_signupButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alreadyButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField surnameField;
    // End of variables declaration//GEN-END:variables

    //used for reopening the window frames
    //do not forget to chenge the frame to dispose type
    private void close() {
//        WindowEvent closeWindow = new WindowEvent (this, WindowEvent.WINDOW_CLOSING);
//        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        this.dispose();
    }
    
    private boolean isPersonAlreadySignedUp(String email) {
    try {
        CollectionReference personCollection = ConnectionTrue.db.collection("Person");
        ApiFuture<QuerySnapshot> querySnapshot = personCollection.whereEqualTo("Email", email).get();
        return !querySnapshot.get().isEmpty(); // If the query result is not empty, person is already signed up
    } catch (Exception e) {
        System.err.println("Error checking if person is already signed up: " + e.getMessage());
        return true; // Assume an error occurred and prevent saving to be safe
    }
}


    private void save() {
    try {
        // Check if the person is already signed up (using email as a unique identifier)
        String email = emailField.getText().toString();
        if (isPersonAlreadySignedUp(email)) {
            JOptionPane.showMessageDialog(null, "Person with this email is already signed up.");
            return; // Exit the method without saving
        }

        // Generate a unique ID using UUID
        String id = UUID.randomUUID().toString();

        // Prepare data to be saved
        Map<String, Object> datas = new HashMap<>();
        datas.put("Name", nameField.getText().toString());
        datas.put("Surname", surnameField.getText().toString());
        datas.put("Email", email);
        datas.put("Password", passwordField.getText().toString());
        
        MainFrame mf = new MainFrame();
        DatabaseHandler db = new DatabaseHandler();
        String name = db.getUserName(email);
        mf.setLoggedName(name);

        // Save the person information
        ConnectionTrue.savePerson("Person", id, datas);

        JOptionPane.showMessageDialog(null, "Saved successfully");
        clearForm();
    } catch (HeadlessException e) {
        System.err.println("Error: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Couldn't save successfully");
        }
    }
    
    private void update() {
    try {
        // Check if the person with the given email exists
        String email = emailField.getText().toString();
        if (!isPersonAlreadySignedUp(email)) {
            JOptionPane.showMessageDialog(null, "Person with this email is not registered.");
            return; // Exit the method without updating
        }

        // Prepare data to be updated
        Map<String, Object> datas = new HashMap<>();
        datas.put("Name", nameField.getText().toString());
        datas.put("Surname", surnameField.getText().toString());
        datas.put("Password", passwordField.getText().toString());

        // Update the person information
        ConnectionTrue.updatePerson("Person", email, datas);

        JOptionPane.showMessageDialog(null, "Updated successfully");
        clearForm();
    } catch (HeadlessException e) {
        System.err.println("Error: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Couldn't update successfully");
    }
}

    
    void clearForm() {
        nameField.setText("");
        surnameField.setText("");
        emailField.setText("");
        passwordField.setText("");
    }
}
