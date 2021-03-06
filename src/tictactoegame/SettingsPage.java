/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tictactoegame;

import java.awt.Font;
import javax.swing.ImageIcon;

/**
 *
 * @author Mayyar
 */
public class SettingsPage extends javax.swing.JPanel implements ResetFont{

    /**
     * Creates new form SettingsPage
     */
    FontSizes fontSize = FontSizes.MEDUIM;
    ImageIcon boardBackgroundLabel = new ImageIcon(this.getClass().getResource("/tictactoegame/images/board1.png"));;
    public SettingsPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        gameBoardLabel = new javax.swing.JLabel();
        gameBoardComboBox = new javax.swing.JComboBox<>();
        fontSizeLabel = new javax.swing.JLabel();
        fontSizeComboBox = new javax.swing.JComboBox<>();
        resetSettingsBtn = new javax.swing.JButton();
        settingsBackBtn = new javax.swing.JButton();

        gameBoardLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        gameBoardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameBoardLabel.setText("Game board");

        gameBoardComboBox.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        gameBoardComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Board 1", "Board 2", "Board 3", "Board 4" }));
        gameBoardComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gameBoardComboBoxItemStateChanged(evt);
            }
        });

        fontSizeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fontSizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fontSizeLabel.setText("Font size");

        fontSizeComboBox.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        fontSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Meduim", "Large" }));
        fontSizeComboBox.setSelectedItem(fontSizeComboBox.getItemAt(1));
        fontSizeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fontSizeComboBoxItemStateChanged(evt);
            }
        });

        resetSettingsBtn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        resetSettingsBtn.setText("Reset To Default Settings");
        resetSettingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetSettingsBtnActionPerformed(evt);
            }
        });

        settingsBackBtn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        settingsBackBtn.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetSettingsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsBackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fontSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gameBoardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameBoardComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fontSizeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameBoardLabel)
                    .addComponent(gameBoardComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontSizeLabel)
                    .addComponent(fontSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(resetSettingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(settingsBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }//GEN-END:initComponents

    private void fontSizeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fontSizeComboBoxItemStateChanged
        if (evt.getItem().equals(this.fontSizeComboBox.getItemAt(0))) {
            fontSize = FontSizes.SMALL;
        } else if (evt.getItem().equals(this.fontSizeComboBox.getItemAt(1))) {
            fontSize = FontSizes.MEDUIM;
        } else {
            fontSize = FontSizes.LARGE;
        }        
        this.setFontSize(fontSize);
    }//GEN-LAST:event_fontSizeComboBoxItemStateChanged

    private void gameBoardComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gameBoardComboBoxItemStateChanged
         if (evt.getItem().equals(this.gameBoardComboBox.getItemAt(0))) {
            boardBackgroundLabel = new ImageIcon(this.getClass().getResource("/tictactoegame/images/board1.png"));
        } else if (evt.getItem().equals(this.gameBoardComboBox.getItemAt(1))) {
            boardBackgroundLabel = new ImageIcon(this.getClass().getResource("/tictactoegame/images/board2.png"));
        } else if (evt.getItem().equals(this.gameBoardComboBox.getItemAt(2))) {
            boardBackgroundLabel = new ImageIcon(this.getClass().getResource("/tictactoegame/images/board3.png"));
        } else {
            boardBackgroundLabel = new ImageIcon(this.getClass().getResource("/tictactoegame/images/board4.png"));
        }
    }//GEN-LAST:event_gameBoardComboBoxItemStateChanged

    private void resetSettingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetSettingsBtnActionPerformed
        gameBoardComboBox.setSelectedIndex(0);
        fontSizeComboBox.setSelectedIndex(1);
        boardBackgroundLabel = new ImageIcon(this.getClass().getResource("/tictactoegame/images/board1.png"));
        fontSize = FontSizes.MEDUIM;
    }//GEN-LAST:event_resetSettingsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> fontSizeComboBox;
    private javax.swing.JLabel fontSizeLabel;
    public javax.swing.JComboBox<String> gameBoardComboBox;
    private javax.swing.JLabel gameBoardLabel;
    private javax.swing.JButton resetSettingsBtn;
    public javax.swing.JButton settingsBackBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setFontSize(FontSizes fontSize) {
        fontSizeComboBox.setFont(new Font("Arail", Font.PLAIN, fontSize.getFontSize()));
        gameBoardComboBox.setFont(new Font("Arail", Font.PLAIN, fontSize.getFontSize()));
        resetSettingsBtn.setFont(new Font("Arail", Font.PLAIN, fontSize.getFontSize()));
        settingsBackBtn.setFont(new Font("Arail", Font.PLAIN, fontSize.getFontSize()));
        gameBoardLabel.setFont(new Font("Arail", Font.BOLD, (fontSize.getFontSize() + 2)));
        fontSizeLabel.setFont(new Font("Arail", Font.BOLD, (fontSize.getFontSize() + 2)));
    }
}
