import com.sportsinventory.DTO.ItemDTO;
import com.sportsinventory.DAO.ItemDAO;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author strix
 */
public class AddItem extends javax.swing.JFrame {

    /**
     * Creates new form AddItem
     */
    public AddItem()
    {
        initComponents();
    }
    public AddItem(int ID) {
        
        initComponents();
        String IDString = String.valueOf(ID);
        itemID.setText(IDString);
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
        jPanel2 = new javax.swing.JPanel();
        itemIDText = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        itemNameText = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        quantityText = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        conditionText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        itemCondition = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        itemName = new javax.swing.JTextField();
        itemID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(150, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(150, 300));

        jPanel2.setBackground(new java.awt.Color(23, 35, 51));
        jPanel2.setFocusable(false);
        jPanel2.setMaximumSize(new java.awt.Dimension(150, 50));
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel2.setVerifyInputWhenFocusTarget(false);

        itemIDText.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        itemIDText.setForeground(new java.awt.Color(255, 255, 255));
        itemIDText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemIDText.setText("Item ID");
        itemIDText.setMaximumSize(new java.awt.Dimension(110, 40));
        itemIDText.setMinimumSize(new java.awt.Dimension(110, 40));
        itemIDText.setName(""); // NOI18N
        itemIDText.setPreferredSize(new java.awt.Dimension(110, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(itemIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemIDText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(23, 35, 51));
        jPanel7.setMaximumSize(new java.awt.Dimension(150, 50));
        jPanel7.setMinimumSize(new java.awt.Dimension(150, 50));
        jPanel7.setPreferredSize(new java.awt.Dimension(150, 50));

        itemNameText.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        itemNameText.setForeground(new java.awt.Color(255, 255, 255));
        itemNameText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemNameText.setText("Item Name");
        itemNameText.setMaximumSize(new java.awt.Dimension(110, 40));
        itemNameText.setMinimumSize(new java.awt.Dimension(110, 40));
        itemNameText.setName(""); // NOI18N
        itemNameText.setPreferredSize(new java.awt.Dimension(110, 40));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(23, 35, 51));
        jPanel8.setMaximumSize(new java.awt.Dimension(150, 50));
        jPanel8.setMinimumSize(new java.awt.Dimension(150, 50));
        jPanel8.setPreferredSize(new java.awt.Dimension(150, 50));

        quantityText.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        quantityText.setForeground(new java.awt.Color(255, 255, 255));
        quantityText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityText.setText("Quantity");
        quantityText.setMaximumSize(new java.awt.Dimension(110, 40));
        quantityText.setMinimumSize(new java.awt.Dimension(110, 40));
        quantityText.setName(""); // NOI18N
        quantityText.setPreferredSize(new java.awt.Dimension(110, 40));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quantityText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(23, 35, 51));
        jPanel9.setMaximumSize(new java.awt.Dimension(150, 50));
        jPanel9.setMinimumSize(new java.awt.Dimension(150, 50));
        jPanel9.setPreferredSize(new java.awt.Dimension(150, 50));

        conditionText.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        conditionText.setForeground(new java.awt.Color(255, 255, 255));
        conditionText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conditionText.setText("Condition");
        conditionText.setMaximumSize(new java.awt.Dimension(110, 40));
        conditionText.setMinimumSize(new java.awt.Dimension(110, 40));
        conditionText.setName(""); // NOI18N
        conditionText.setPreferredSize(new java.awt.Dimension(110, 40));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(conditionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conditionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 300));

        jPanel3.setBackground(new java.awt.Color(51, 204, 0));
        jPanel3.setMaximumSize(new java.awt.Dimension(250, 300));
        jPanel3.setMinimumSize(new java.awt.Dimension(250, 300));

        confirmButton.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.setMaximumSize(new java.awt.Dimension(100, 30));
        confirmButton.setMinimumSize(new java.awt.Dimension(100, 30));
        confirmButton.setPreferredSize(new java.awt.Dimension(100, 30));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        itemCondition.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        itemCondition.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itemCondition.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemConditionFocusLost(evt);
            }
        });
        itemCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConditionActionPerformed(evt);
            }
        });
        itemCondition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemConditionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemConditionKeyTyped(evt);
            }
        });

        quantity.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantity.setText("00");
        quantity.setMaximumSize(new java.awt.Dimension(50, 36));
        quantity.setMinimumSize(new java.awt.Dimension(50, 36));
        quantity.setPreferredSize(new java.awt.Dimension(50, 36));
        quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityFocusLost(evt);
            }
        });
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });

        itemName.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        itemName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itemName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemNameFocusLost(evt);
            }
        });
        itemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameActionPerformed(evt);
            }
        });
        itemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemNameKeyTyped(evt);
            }
        });

        itemID.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        itemID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemID.setText("itemID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(itemID, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(itemID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(itemCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 250, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        //
        
        String IDString = itemID.getText();
        int itemIDString = Integer.parseInt(IDString);
        String itemNameString = itemName.getText();
        String QuantityString = quantity.getText();
        int itemQuantityString = Integer.parseInt(QuantityString);
        String itemConditionString = itemCondition.getText();
        
        ItemDTO item = new ItemDTO();
        item.setItemID(itemIDString);
        item.setItemName(itemNameString);
        item.setQuantity(itemQuantityString);
        item.setCondition(itemConditionString);
        
        new ItemDAO().addFunction(item);
        
        super.dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void quantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusLost
        String text = quantity.getText();
        quantity.setText(text.replaceAll("//D", ""));
    }//GEN-LAST:event_quantityFocusLost

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityKeyReleased

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityKeyTyped

    private void itemNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameFocusLost

    private void itemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameActionPerformed

    private void itemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameKeyReleased

    private void itemNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameKeyTyped

    private void itemConditionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemConditionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConditionFocusLost

    private void itemConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConditionActionPerformed

    private void itemConditionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemConditionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConditionKeyReleased

    private void itemConditionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemConditionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConditionKeyTyped

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
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conditionText;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField itemCondition;
    private javax.swing.JLabel itemID;
    private javax.swing.JLabel itemIDText;
    private javax.swing.JTextField itemName;
    private javax.swing.JLabel itemNameText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel quantityText;
    // End of variables declaration//GEN-END:variables
}
