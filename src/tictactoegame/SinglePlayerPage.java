/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tictactoegame;

import java.awt.Font;

/**
 *
 * @author Mayyar
 */
public class SinglePlayerPage extends javax.swing.JPanel implements ResetFont {

    /**
     * Creates new form SinglePlayerPage
     */
    public SinglePlayerPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        playerNameField = new javax.swing.JTextField();
        playerNameLabel = new javax.swing.JLabel();
        singlePlayerStartBtn = new javax.swing.JButton();
        singlePlayerBackBtn = new javax.swing.JButton();

        playerNameField.setColumns(8);
        playerNameField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        playerNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        playerNameField.setText("X - Player");

        playerNameLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        playerNameLabel.setText("Player name");

        singlePlayerStartBtn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        singlePlayerStartBtn.setText("Start");

        singlePlayerBackBtn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        singlePlayerBackBtn.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(singlePlayerStartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerNameLabel)
                        .addGap(27, 27, 27)
                        .addComponent(playerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(singlePlayerBackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(singlePlayerStartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(singlePlayerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField playerNameField;
    private javax.swing.JLabel playerNameLabel;
    public javax.swing.JButton singlePlayerBackBtn;
    public javax.swing.JButton singlePlayerStartBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setFontSize(FontSizes fontSize) {
        singlePlayerStartBtn.setFont(new Font("Arail", Font.PLAIN, fontSize.getFontSize()));
        singlePlayerBackBtn.setFont(new Font("Arail", Font.PLAIN, fontSize.getFontSize()));
        playerNameLabel.setFont(new Font("Arail", Font.BOLD, (fontSize.getFontSize() + 2)));
    }
}
