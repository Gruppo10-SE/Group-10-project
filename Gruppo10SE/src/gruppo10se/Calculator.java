/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gruppo10se;

import controller.state.basic.BasicOperationContext;
import controller.state.memory.MemoryOperationContext;
import java.util.regex.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import com.formdev.flatlaf.*;
import java.awt.GridLayout;

/**
 *
 * @author giaco
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        // JFrame 
        this.setResizable(false);
        this.setTitle("Calculator");
        this.setIconImage(new ImageIcon(getClass().getResource("calculator.png")).getImage());
        
        //this.getContentPane().setBackground( Color.getHSBColor((float)0.0,(float)0.0,(float)0.94));
        operationTable.setShowGrid(true);

        // Text field and area are not editable
        variablesTextField.setEditable(false);
        outputTextField.setEditable(false);
        stackTextArea.setEditable(false);

        // Show variables on the jlist
        controller.showVariables(variabili, variablesList);

        // Focus on the input text field
        inputTextField.requestFocusInWindow();

        // Text of the component
        inputTextField.setText("");
        outputTextField.setText("Insert a number like this 5+10j");
        inputButton.setText("Insert");

        // Combo box
        String[] operazioni = {"Basic operation", "+", "-", "*", "/", "sqrt", "+-"};
        String[] operazioniStack = {"Memory operation", "clear", "drop", "dup", "swap", "over"};
        String[] operazioniVariabili = {"Variables operation", ">x", "<x", "+x", "-x"};

        basicOperationComboBox.setEditable(false);
        memoryComboBox.setEditable(false);
        variablesComboBox.setEditable(false);

        for (String operazione : operazioni) {
            basicOperationComboBox.addItem(operazione);
        }
        for (String operazioneMem : operazioniStack) {
            memoryComboBox.addItem(operazioneMem);
        }
        for (String operazioneVar : operazioniVariabili) {
            variablesComboBox.addItem(operazioneVar);
        }

    }

    BasicOperationContext basicContext = new BasicOperationContext();
    MemoryOperationContext memoryContext = new MemoryOperationContext();

    // Pattern for the input Text Field
    Pattern patternNumeroComplesso = Pattern.compile("[+]?[-]?[0-9]*[.]?[0-9]*[+]?[-]?[0-9]*[.]?[0-9]*[j]?");
    CalculatorController controller = new CalculatorController();
    StackDataStructure stack = new StackDataStructure();
    Variables variabili = new Variables();
    int next_down_press = 0;
    char variable_char;

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
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        outputTextField = new javax.swing.JTextField();
        basicOperationComboBox = new javax.swing.JComboBox<>();
        inputButton = new javax.swing.JButton();
        tabTabbedPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        stackTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        variablesList = new javax.swing.JList<>();
        memoryComboBox = new javax.swing.JComboBox<>();
        inputTextField = new javax.swing.JTextField();
        variablesComboBox = new javax.swing.JComboBox<>();
        operationDefineButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        operationTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        variablesTextField = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outputTextField.setBackground(new java.awt.Color(53, 55, 56));
        outputTextField.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        outputTextField.setForeground(new java.awt.Color(255, 153, 0));
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

        inputButton.setBackground(new java.awt.Color(61, 122, 166));
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

        tabTabbedPane.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        stackTextArea.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        stackTextArea.setColumns(20);
        stackTextArea.setRows(5);
        jScrollPane2.setViewportView(stackTextArea);

        tabTabbedPane.addTab("Memory", jScrollPane2);

        variablesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        variablesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                variablesListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(variablesList);

        tabTabbedPane.addTab("Variables", jScrollPane3);

        memoryComboBox.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        memoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryComboBoxActionPerformed(evt);
            }
        });

        inputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextFieldActionPerformed(evt);
            }
        });
        inputTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputTextFieldKeyPressed(evt);
            }
        });

        variablesComboBox.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        variablesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variablesComboBoxActionPerformed(evt);
            }
        });

        operationDefineButton.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        operationDefineButton.setText("Define a new operation");
        operationDefineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationDefineButtonActionPerformed(evt);
            }
        });

        operationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Operations", "Functions"
            }
        ));
        operationTable.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(operationTable);

        jPanel1.setBackground(new java.awt.Color(61, 122, 166));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        variablesTextField.setBackground(new java.awt.Color(53, 55, 56));
        variablesTextField.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        variablesTextField.setForeground(new java.awt.Color(255, 153, 0));
        variablesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variablesTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tabTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(basicOperationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(memoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(variablesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(operationDefineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(variablesTextField)
                        .addGap(18, 18, 18)
                        .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputTextField)
                        .addGap(18, 18, 18)
                        .addComponent(inputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(variablesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basicOperationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(variablesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operationDefineButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tabTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void outputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputTextFieldActionPerformed

    }//GEN-LAST:event_outputTextFieldActionPerformed

    private void checkBasicComboBox(String toCompare) {
        if (((String) basicOperationComboBox.getSelectedItem()).equals(toCompare)) {
            basicContext.changeState(toCompare);
            inputTextField.requestFocusInWindow();
            if (basicContext.doBasicOperation(stack) == 0) {
                outputTextField.setText(basicContext.getMessage());
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else if (basicContext.doBasicOperation(stack) == 1) {
                outputTextField.setText("Insufficient number of operands!");
            } else {
                outputTextField.setText("Math ERROR: you are dividing by 0");
            }
        }
    }

    private void checkMemoryComboBox(String toCompare) {
        if (((String) memoryComboBox.getSelectedItem()).equals(toCompare)) {
            memoryContext.changeState(toCompare);
            inputTextField.requestFocusInWindow();
            if (memoryContext.doMemoryOperation(stack) == 0) {
                outputTextField.setText(memoryContext.getMessage());
                stackTextArea.setText(stack.toString());
                inputTextField.setText("");
            } else if (memoryContext.doMemoryOperation(stack) == 1) {
                outputTextField.setText("The memory is empty!");
            } else {
                outputTextField.setText("Insufficient numbers in memory!");
            }
        }
    }

    private void basicOperationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicOperationComboBoxActionPerformed
        String[] operations = {"+", "-", "*", "/", "sqrt", "+-"};
        for (String operation : operations) {
            checkBasicComboBox(operation);
        }
    }//GEN-LAST:event_basicOperationComboBoxActionPerformed

    private void inputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputButtonActionPerformed
        // TODO add your handling code here:

        if (inputTextField.getText().compareTo("") == 0) {

            outputTextField.setText("Insert a number like this 5+10j");
            inputTextField.requestFocusInWindow();
        } else {

            Matcher m = patternNumeroComplesso.matcher(inputTextField.getText());
            if (m.matches()) {

                outputTextField.setText("");

                controller.insertNumber(stack, inputTextField.getText());
                outputTextField.setText("Insert a number like this 5+10j");

                inputTextField.setText("");
                if (!controller.checkIfEmpty(stack)) {
                    stackTextArea.setText(stack.toString());
                }
                inputTextField.requestFocusInWindow();
            } else {
                outputTextField.setText("Insert a number like this 5+10j");
                inputTextField.setText("");
            }

        }


    }//GEN-LAST:event_inputButtonActionPerformed

    private void inputButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputButtonKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_inputButtonKeyPressed

    private void memoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryComboBoxActionPerformed
        String[] memOperations = {"clear", "drop", "dup", "swap", "over"};
        for (String operation : memOperations) {
            checkMemoryComboBox(operation);
        }
    }//GEN-LAST:event_memoryComboBoxActionPerformed

    private void inputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextFieldActionPerformed

    private void inputTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (inputTextField.getText().compareTo("") == 0) {

                outputTextField.setText("Insert a number like this 5+10j");
                inputTextField.requestFocusInWindow();
            } else {

                Matcher m = patternNumeroComplesso.matcher(inputTextField.getText());
                if (m.matches()) {

                    controller.insertNumber(stack, inputTextField.getText());
                    outputTextField.setText("Insert a number like this 5+10j");

                    inputTextField.setText("");
                    if (!controller.checkIfEmpty(stack)) {
                        stackTextArea.setText(stack.toString());
                    }
                    inputTextField.requestFocusInWindow();
                } else {
                    outputTextField.setText("Insert a number like this 5+10j");
                    inputTextField.setText("");
                }

            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {

            variablesList.setSelectedIndex(next_down_press);

            next_down_press++;
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {

            if (next_down_press != 0) {
                next_down_press--;
                variablesList.setSelectedIndex(next_down_press);
            }

        }
        if (evt.getKeyCode() == KeyEvent.VK_CONTROL) {

            variablesList.setSelectedIndex(variabili.size() - 1);
            next_down_press = variabili.size() - 1;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ALT) {

            variablesList.setSelectedIndex(0);
            next_down_press = 0;
        }
    }//GEN-LAST:event_inputTextFieldKeyPressed

    private void variablesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_variablesListValueChanged
        // TODO add your handling code here:

        if (evt.getValueIsAdjusting() == false) {

            if (variablesList.getSelectedIndex() == -1) {
                //No selection, disable combo box.
                variablesComboBox.setEnabled(false);
            } else {
                //Selection, enable combo box
                variablesComboBox.setEnabled(true);
                variablesTextField.setText(variablesList.getSelectedValue());
            }
        }
    }//GEN-LAST:event_variablesListValueChanged

    private void variablesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variablesComboBoxActionPerformed
        // +++
        // scrollare il tab alla finestra sulle variabili 
        // +++
        //variablesList.requestFocusInWindow();

        if (((String) variablesComboBox.getSelectedItem()).compareTo(">x") == 0 && variablesList.getSelectedIndex() != -1) {

            if (controller.fromStackToVariable(stack, variabili, variablesList.getSelectedValue().charAt(0)) == 0) {

                variable_char = variablesList.getSelectedValue().charAt(0);

                outputTextField.setText("The variable '" + variablesList.getSelectedValue().charAt(0) + "' has been changed");

                stackTextArea.setText(stack.toString());
                inputTextField.setText("");

                controller.showVariables(variabili, variablesList);

                variablesTextField.setText(controller.getVariable(variabili, variable_char));
                variablesList.setSelectedValue(controller.getVariable(variabili, variable_char), false);

                inputTextField.requestFocus();

            } else {
                outputTextField.setText("Empty memory!");
            }

        } else if (((String) variablesComboBox.getSelectedItem()).compareTo("<x") == 0 && variablesList.getSelectedIndex() != -1) {

            if (controller.fromVariableToStack(stack, variabili, variablesList.getSelectedValue().charAt(0)) == 0) {

                outputTextField.setText("Value of '" + variablesList.getSelectedValue().charAt(0) + "' inserted in memory");

                stackTextArea.setText(stack.toString());
                inputTextField.setText("");

                variablesTextField.setText(variablesList.getSelectedValue());

                variablesList.setSelectedValue(variablesList.getSelectedValue(), false);

                inputTextField.requestFocus();

            } else {
                outputTextField.setText("Error with <x operation!");
            }

        } else if (((String) variablesComboBox.getSelectedItem()).compareTo("+x") == 0 && variablesList.getSelectedIndex() != -1) {

            if (controller.plusVariable(stack, variabili, variablesList.getSelectedValue().charAt(0)) == 0) {

                variable_char = variablesList.getSelectedValue().charAt(0);

                outputTextField.setText("Last element inserted in memory added to variable '" + variablesList.getSelectedValue().charAt(0) + "'");

                stackTextArea.setText(stack.toString());
                inputTextField.setText("");

                controller.showVariables(variabili, variablesList);

                variablesTextField.setText(controller.getVariable(variabili, variable_char));

                variablesList.setSelectedValue(controller.getVariable(variabili, variable_char), false);

                inputTextField.requestFocus();

            } else {
                outputTextField.setText("Empty memory!");
            }

        } else if (((String) variablesComboBox.getSelectedItem()).compareTo("-x") == 0 && variablesList.getSelectedIndex() != -1) {

            if (controller.minusVariable(stack, variabili, variablesList.getSelectedValue().charAt(0)) == 0) {

                variable_char = variablesList.getSelectedValue().charAt(0);

                outputTextField.setText("Last element inserted in memory subtracted from variable '" + variablesList.getSelectedValue().charAt(0) + "'");

                stackTextArea.setText(stack.toString());
                inputTextField.setText("");

                controller.showVariables(variabili, variablesList);

                variablesTextField.setText(controller.getVariable(variabili, variable_char));

                variablesList.setSelectedValue(controller.getVariable(variabili, variable_char), false);

                inputTextField.requestFocus();

            } else {
                outputTextField.setText("Empty memory!");
            }

        }
    }//GEN-LAST:event_variablesComboBoxActionPerformed

    private void operationDefineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationDefineButtonActionPerformed
        JPanel p = new JPanel(new GridLayout(0, 1, 2, 2));
        JTextField opName = new JTextField(25);
        JTextField opFunc = new JTextField(25);

        p.add(new JLabel("Nome operazione: "));
        p.add(opName);
        p.add(new JLabel("Funzione: "));
        p.add(opFunc);

        JOptionPane.showConfirmDialog(null, p, "NUOVA OPERAZIONE", JOptionPane.OK_CANCEL_OPTION);
    }//GEN-LAST:event_operationDefineButtonActionPerformed

    private void variablesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variablesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_variablesTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
        Flat Light (class com.formdev.flatlaf.FlatLightLaf)
        Flat Dark (class com.formdev.flatlaf.FlatDarkLaf)
        Flat IntelliJ (class com.formdev.flatlaf.FlatIntelliJLaf)
        Flat Darcula(class com.formdev.flatlaf.FlatDarculaLaf)
         */
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

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
    private javax.swing.JButton inputButton;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> memoryComboBox;
    private javax.swing.JButton operationDefineButton;
    private javax.swing.JTable operationTable;
    private javax.swing.JTextField outputTextField;
    private javax.swing.JTextArea stackTextArea;
    private javax.swing.JTabbedPane tabTabbedPane;
    private javax.swing.JComboBox<String> variablesComboBox;
    private javax.swing.JList<String> variablesList;
    private javax.swing.JTextField variablesTextField;
    // End of variables declaration//GEN-END:variables
}
