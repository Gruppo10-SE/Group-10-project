/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gruppo10se;

import java.util.regex.Pattern;


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
        
        // JFrame 
        this.setResizable(false);
        this.setTitle("Calculator");
        
        // Text field and area are not editable
        outputTextField.setEditable(false);
        stackTextArea.setEditable(false);
        variablesTextArea.setEditable(false);
        
        // Focus on the input text field
        inputTextField.requestFocusInWindow();
        
        // Text of the component
        inputTextField.setText("");
        outputTextField.setText("Insert a number like this 5+10j");
        inputButton.setText("Insert");
        
        // Combo box
        String[] operazioni = {"Basic operation", "+", "-", "*", "/", "sqrt", "+-"};
        String[] operazioniStack = {"Memory operation", "clear", "drop", "dup", "swap", "over"};
        
        basicOperationComboBox.setEditable(false);
        memoryComboBox.setEditable(false);

        for (String operazione : operazioni)
            basicOperationComboBox.addItem(operazione);
        for (String operazioneMem : operazioniStack)
            memoryComboBox.addItem(operazioneMem);

    }

    CalculatorController controller = new CalculatorController();
    StackDataStructure stack = new StackDataStructure();

    //"+", "-", "*", "/", "sqrt", "+-"

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
        jScrollPane1 = new javax.swing.JScrollPane();
        variablesTextArea = new javax.swing.JTextArea();
        memoryComboBox = new javax.swing.JComboBox<>();

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
        inputButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputButtonKeyPressed(evt);
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

        variablesTextArea.setBackground(new java.awt.Color(238, 234, 234));
        variablesTextArea.setColumns(20);
        variablesTextArea.setRows(5);
        jScrollPane1.setViewportView(variablesTextArea);

        tabTabbedPane.addTab("Variables", jScrollPane1);

        memoryComboBox.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        memoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputLabel)
                            .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(tabTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(basicOperationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(466, 466, 466)
                        .addComponent(complexOperationLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(inputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(67, 67, 67)
                        .addComponent(complexOperationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(basicOperationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(memoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(tabTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addContainerGap())))
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
            if (controller.doSum(stack) == 0) {
                outputTextField.setText("Sum executed");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("Insufficient number of operands!");
            }
        } else if (((String) basicOperationComboBox.getSelectedItem()).compareTo("-") == 0) {
            inputTextField.requestFocusInWindow();
            if (controller.doSubtraction(stack) == 0) {
                outputTextField.setText("Subtraction executed");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("Insufficient number of operands!");
            }
        } else if (((String) basicOperationComboBox.getSelectedItem()).compareTo("*") == 0) {
            inputTextField.requestFocusInWindow();
            if (controller.doMultiplication(stack) == 0) {
                outputTextField.setText("Multiplication executed");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("Insufficient number of operands!");
            }
        } else if (((String) basicOperationComboBox.getSelectedItem()).compareTo("/") == 0) {
            inputTextField.requestFocusInWindow();
            
            switch (controller.doDivision(stack)) {
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
            if (controller.doInvertSign(stack) == 0) {
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

            outputTextField.setText("Insert a number like this 5+10j");
            inputTextField.requestFocusInWindow();
        } else {
            
            //***                              ***
            //***MIGLIORARE QUESTO CONTROLLO!!!***
            //***                              ***
           // if (inputTextField.getText().contains("j") && (inputTextField.getText().contains("+") || inputTextField.getText().contains("-") || (Pattern.matches("[a-zA-Z]+", inputTextField.getText()) == false)) ); {

            if(Pattern.matches("[a-zA-Z]+", inputTextField.getText()) == false){
            outputTextField.setText("");

            controller.insertNumber(stack, inputTextField.getText());
            
            inputTextField.setText("");
            if (!controller.checkIfEmpty(stack)) {
                stackTextArea.setText(stack.toString());
            }
            inputTextField.requestFocusInWindow();
            }
            else {
                outputTextField.setText("Insert a number like this 5+10j");
                inputTextField.setText("");
            }
            
        }


    }//GEN-LAST:event_inputButtonActionPerformed

    private void inputButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputButtonKeyPressed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_inputButtonKeyPressed

    private void memoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryComboBoxActionPerformed
        // TODO add your handling code here:
        // clear , drop , dup , swap , over
        
        // clear
        if (((String) memoryComboBox.getSelectedItem()).compareTo("clear") == 0) {
            inputTextField.requestFocusInWindow();
            if (controller.doClear() == 0) {
                outputTextField.setText("The memory has been cleared");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("The memory is already empty!");
            }
            
            // drop
        } else if(((String) memoryComboBox.getSelectedItem()).compareTo("drop") == 0){
            inputTextField.requestFocusInWindow();
            if (controller.doDrop() == 0) {
                outputTextField.setText("Last element of the memory deleted");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("The memory is empty!");
        }
            // dup
        } else if(((String) memoryComboBox.getSelectedItem()).compareTo("dup") == 0){
            inputTextField.requestFocusInWindow();
            if (controller.doDup() == 0) {
                outputTextField.setText("Inserted a copy of the last number");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("The memory is empty!");
        }
            
            // swap
        } else if(((String) memoryComboBox.getSelectedItem()).compareTo("swap") == 0){
            inputTextField.requestFocusInWindow();
            if (controller.doSwap() == 0) {
                outputTextField.setText("Last two numbers exchanged");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("Insufficient numbers in memory!");
        }
            
            // over
        }   else if(((String) memoryComboBox.getSelectedItem()).compareTo("over") == 0){
            inputTextField.requestFocusInWindow();
            if (controller.doOver() == 0) {
                outputTextField.setText("Inserted a copy of the second last number");
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else {
                outputTextField.setText("Insufficient numbers in memory!");
        } 
        }  
    }//GEN-LAST:event_memoryComboBoxActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> memoryComboBox;
    private javax.swing.JTextField outputTextField;
    private javax.swing.JTextArea stackTextArea;
    private javax.swing.JTabbedPane tabTabbedPane;
    private javax.swing.JTextArea variablesTextArea;
    // End of variables declaration//GEN-END:variables
}
