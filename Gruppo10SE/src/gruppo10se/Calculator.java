/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gruppo10se;

import java.util.*;

/**
 *
 * @author giaco
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Calculator() {
        initComponents();
        String[] operazioni = {"Basic operation", "+", "-", "*", "/","+-"};

        outputTextField.setEditable(false);
        stackTextArea.setEditable(false);

        basicOperationComboBox.setEditable(false);

        for (String operazione : operazioni) {
            basicOperationComboBox.addItem(operazione);
        }

        inputTextField.requestFocusInWindow();
        inputTextField.setText("");
        outputTextField.setText("Insert a number like this 5+10j");

        inputButton.setText("Insert");

    }

    StackDataStructure stack = new StackDataStructure();

    //"+", "-", "*", "/", "sqrt", "+-"
    private int doSum() {
        if (stack.size() >= 2) {
            CartesianComplex a, b;
            a = stack.pop();
            b = stack.pop();
            stack.push(a.sum(b));
            return 0;
        } else {
            return 1;
        }
    }

    private int doSubtraction() {
        if (stack.size() >= 2) {
            CartesianComplex a, b;
            a = stack.pop();
            b = stack.pop();
            stack.push(b.subtract(a));
            return 0;
        } else {
            return 1;
        }
    }

    private int doMultiplication() {
        if (stack.size() >= 2) {
            CartesianComplex a, b;
            a = stack.pop();
            b = stack.pop();
            stack.push(a.multiply(b));
            return 0;
        } else {
            return 1;
        }
    }

    private int doDivision() {
        if (stack.size() >= 2) {

            CartesianComplex a, b;
            a = stack.pop();
            b = stack.pop();

            if (a.getRealPart() == 0 && a.getImagPart() == 0) {
                return -1;
            } 
            else {
                stack.push(b.divides(a));
                return 0;
            }
        } else {
            return 1;
        }
    }

    private int doInvertSign() {
        //***DA DEFINIRE IN CARTESIAN COMPLEX***
        if (stack.size() >= 1) {
            CartesianComplex a;
            a = stack.pop();
            stack.push(a.invertSign());
            return 0;
        } else {
            return 1;
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        inputTextField = new javax.swing.JTextField();
        outputTextField = new javax.swing.JTextField();
        basicOperationComboBox = new javax.swing.JComboBox<>();
        inputButton = new javax.swing.JButton();
        complexOperationLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        inputLabel = new javax.swing.JLabel();
        tabTabbedPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        stackTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputTextField.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        inputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextFieldActionPerformed(evt);
            }
        });

        outputTextField.setBackground(new java.awt.Color(238, 234, 234));
        outputTextField.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        outputTextField.setForeground(new java.awt.Color(255, 0, 0));
        outputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputTextFieldActionPerformed(evt);
            }
        });

        basicOperationComboBox.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        basicOperationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicOperationComboBoxActionPerformed(evt);
            }
        });

        inputButton.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        inputButton.setText("Insert");
        inputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputButtonActionPerformed(evt);
            }
        });

        complexOperationLabel.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        complexOperationLabel.setText("Select an operation");

        infoLabel.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        infoLabel.setText("Info");

        inputLabel.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        inputLabel.setText("Input");

        tabTabbedPane.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        stackTextArea.setBackground(new java.awt.Color(238, 234, 234));
        stackTextArea.setColumns(20);
        stackTextArea.setRows(5);
        jScrollPane2.setViewportView(stackTextArea);

        tabTabbedPane.addTab("Memory", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputLabel)
                    .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tabTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(basicOperationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(complexOperationLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(inputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabel)
                    .addComponent(inputButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(tabTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(complexOperationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(basicOperationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void outputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputTextFieldActionPerformed

    }//GEN-LAST:event_outputTextFieldActionPerformed

    private void inputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextFieldActionPerformed

    private void basicOperationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicOperationComboBoxActionPerformed

        if (((String) basicOperationComboBox.getSelectedItem()).compareTo("+") == 0) {
            inputTextField.requestFocusInWindow();
            if (doSum() == 0) {
                outputTextField.setText("Sum executed");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("Insufficient number of operands!");
            }
        } else if (((String) basicOperationComboBox.getSelectedItem()).compareTo("-") == 0) {
            inputTextField.requestFocusInWindow();
            if (doSubtraction() == 0) {
                outputTextField.setText("Subtraction executed");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("Insufficient number of operands!");
            }
        } else if (((String) basicOperationComboBox.getSelectedItem()).compareTo("*") == 0) {
            inputTextField.requestFocusInWindow();
            if (doMultiplication() == 0) {
                outputTextField.setText("Multiplication executed");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("Insufficient number of operands!");
            }
        } else if (((String) basicOperationComboBox.getSelectedItem()).compareTo("/") == 0) {
            inputTextField.requestFocusInWindow();
            
            switch (doDivision()) {
                case 0:
                    outputTextField.setText("Division executed");
                    stackTextArea.setText(stack.toString());
                    inputTextField.setText("");
                    break;
                case 1:
                    outputTextField.setText("Insufficient number of operands!");
                    break;
                case -1:
                    outputTextField.setText("Math ERROR: you are dividing by 0");
                    break;
            }
        } else if (((String) basicOperationComboBox.getSelectedItem()).compareTo("+-") == 0) {
            inputTextField.requestFocusInWindow();
            if (doInvertSign() == 0) {
                outputTextField.setText("Invert Sign executed ");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("Insufficient number of operands!");
            }
        }
    }//GEN-LAST:event_basicOperationComboBoxActionPerformed

    private void inputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputButtonActionPerformed
        // TODO add your handling code here:

        //"+", "-", "*", "/", "sqrt", "+-"
        if (inputTextField.getText().compareTo("") == 0) {

            outputTextField.setText("No operands inserted");
            inputTextField.requestFocusInWindow();
        } else {

            if (inputTextField.getText().contains("j")) {

                outputTextField.setText("");

                stack.push(new CartesianComplex(inputTextField.getText()));
                inputTextField.setText("");
                if (!stack.isEmpty()) {
                    stackTextArea.setText(stack.toString());
                }
                inputTextField.requestFocusInWindow();
                
            } else {
                outputTextField.setText("Insert a Number!");
                inputTextField.setText("");
                
            }
        }


    }//GEN-LAST:event_inputButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> basicOperationComboBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel complexOperationLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton inputButton;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField outputTextField;
    private javax.swing.JTextArea stackTextArea;
    private javax.swing.JTabbedPane tabTabbedPane;
    // End of variables declaration//GEN-END:variables
}
