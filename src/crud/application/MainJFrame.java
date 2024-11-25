package crud.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NametField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PhoneField = new javax.swing.JTextField();
        CreateButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        SrcField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        ClearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 362));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("CRUD Application");

        NametField.setPreferredSize(new java.awt.Dimension(64, 27));
        NametField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NametFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name : ");

        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Phone : ");

        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Email", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DataTable);

        ClearButton.setText("Clear Form");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NametField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ClearButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SrcField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(SearchButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CreateButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(UpdateButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DeleteButton))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NametField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreateButton)
                            .addComponent(UpdateButton)
                            .addComponent(DeleteButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SrcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton))
                        .addGap(18, 18, 18)
                        .addComponent(ClearButton)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void NametFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NametFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NametFieldActionPerformed
    
    Connection con;
    Statement st;

    public void connect()
    {
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/userdb", "root","root");
            System.out.println("DB Connected Successfully !!!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void loadTable(){
      try {
            st = con.createStatement();

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name", "Email", "Phone"}, 0);

            DataTable.setModel(model);
            String sql = "SELECT * FROM user";

            ResultSet rs = st.executeQuery(sql);
            String i, f, l,e;
            while(rs.next()){
              i = rs.getString("id");
              f = rs.getString("name");
              l = rs.getString("email");
              e = rs.getString("phone");
              model.addRow(new Object[]{i, f, l, e});
            }
        }catch(Exception e){
            System.out.println("Error : "+ e.getMessage());
        }
    }
    
    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        String name, email, phone, query;        

        try {
            st = con.createStatement();
            
            if("".equals(NametField.getText())){
             
                JOptionPane.showMessageDialog(new JFrame(), "First Name is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else if("".equals(EmailField.getText())){
             
                JOptionPane.showMessageDialog(new JFrame(), "Email is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else if("".equals(PhoneField.getText())){
             
                JOptionPane.showMessageDialog(new JFrame(), "Phone is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
                name = NametField.getText();
                email = EmailField.getText();
                phone = PhoneField.getText();
                query = "INSERT INTO user (name, email, phone) "
                        + "VALUES ('"+name+"','"+email+"','"+phone+"')";
               
               st.executeUpdate(query);
               NametField.setText("");
               EmailField.setText("");
               PhoneField.setText("");
               loadTable();
               showMessageDialog(null, "Successfully registered.");
            }   
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        String ID;
        int notFound = 0;
        String name, email, phone;
        try {
            st = con.createStatement();
            
            ID = SrcField.getText();
            if("".equals(ID)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql = "SELECT * FROM user WHERE id="+ID;
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                 notFound = 1;
                 name = NametField.getText();
                 email = EmailField.getText();
                 phone = PhoneField.getText();
                 String sql2 = "UPDATE user SET name='"+name+"', email='"+email+"', phone='"+phone+"'  WHERE id="+ID;
                 st.executeUpdate(sql2); 
                 loadTable();
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "Invalid ID", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        String ID;
        int notFound = 0;
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/userdb", "root","root");
            Statement st = con.createStatement();
            
            ID = SrcField.getText();
            if("".equals(ID)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql = "SELECT * FROM user WHERE id="+ID;
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                 notFound = 1;
                 String sql2 = "DELETE FROM user WHERE id="+ID;
                 st.executeUpdate(sql2);
                 NametField.setText("");
                 EmailField.setText("");
                 PhoneField.setText("");
                 loadTable();
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "Invalid ID !!!", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());   
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String ID;
        int notFound = 0;
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/userdb", "root","root");
            Statement st = con.createStatement();
            
            ID = SrcField.getText();
            if("".equals(ID)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql = "SELECT * FROM user WHERE id="+ID;
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                   NametField.setText(rs.getString("name"));
                   EmailField.setText(rs.getString("email"));
                   PhoneField.setText(rs.getString("phone"));
                   notFound = 1;
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "Invalid ID !!!", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());   
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        NametField.setText("");
        EmailField.setText("");
        PhoneField.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame x = new MainJFrame();
                x.connect();
                x.loadTable();
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton CreateButton;
    private javax.swing.JTable DataTable;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField NametField;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SrcField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
