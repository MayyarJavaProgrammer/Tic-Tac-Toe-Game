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
public class GamePage extends javax.swing.JPanel implements ResetFont {

    /**
     * Creates new form GamePage
     */
    public GamePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xPlayerNameLabel = new javax.swing.JLabel();
        xPlayerScore = new javax.swing.JLabel();
        oPlayerNameLabel = new javax.swing.JLabel();
        oPlayerScore = new javax.swing.JLabel();
        vsSymbolLabel = new javax.swing.JLabel();
        boardBackgroundLabel = new javax.swing.JLabel();
        boardLabelsPanel = new javax.swing.JPanel();
        boardLabel1 = new javax.swing.JLabel();
        boardLabel2 = new javax.swing.JLabel();
        boardLabel3 = new javax.swing.JLabel();
        boardLabel4 = new javax.swing.JLabel();
        boardLabel5 = new javax.swing.JLabel();
        boardLabel6 = new javax.swing.JLabel();
        boardLabel7 = new javax.swing.JLabel();
        boardLabel8 = new javax.swing.JLabel();
        boardLabel9 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 550));
        setMinimumSize(new java.awt.Dimension(400, 550));
        setPreferredSize(new java.awt.Dimension(400, 550));
        setLayout(null);

        xPlayerNameLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        xPlayerNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xPlayerNameLabel.setText("X - player");
        add(xPlayerNameLabel);
        xPlayerNameLabel.setBounds(35, 25, 71, 19);

        xPlayerScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xPlayerScore.setText("0");
        add(xPlayerScore);
        xPlayerScore.setBounds(35, 71, 71, 16);

        oPlayerNameLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        oPlayerNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oPlayerNameLabel.setText("O - player");
        add(oPlayerNameLabel);
        oPlayerNameLabel.setBounds(286, 25, 79, 19);

        oPlayerScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oPlayerScore.setText("0");
        add(oPlayerScore);
        oPlayerScore.setBounds(296, 71, 69, 16);

        vsSymbolLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vsSymbolLabel.setText("X");
        add(vsSymbolLabel);
        vsSymbolLabel.setBounds(178, 49, 54, 16);

        boardBackgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boardBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoegame/images/board1.png"))); // NOI18N
        add(boardBackgroundLabel);
        boardBackgroundLabel.setBounds(35, 141, 330, 300);

        boardLabelsPanel.setMinimumSize(new java.awt.Dimension(300, 300));
        boardLabelsPanel.setLayout(new java.awt.GridLayout(3, 3, 5, 5));
        boardLabelsPanel.add(boardLabel1);
        boardLabelsPanel.add(boardLabel2);
        boardLabelsPanel.add(boardLabel3);
        boardLabelsPanel.add(boardLabel4);
        boardLabelsPanel.add(boardLabel5);
        boardLabelsPanel.add(boardLabel6);
        boardLabelsPanel.add(boardLabel7);
        boardLabelsPanel.add(boardLabel8);
        boardLabelsPanel.add(boardLabel9);

        add(boardLabelsPanel);
        boardLabelsPanel.setBounds(35, 141, 330, 300);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boardBackgroundLabel;
    private javax.swing.JLabel boardLabel1;
    private javax.swing.JLabel boardLabel2;
    private javax.swing.JLabel boardLabel3;
    private javax.swing.JLabel boardLabel4;
    private javax.swing.JLabel boardLabel5;
    private javax.swing.JLabel boardLabel6;
    private javax.swing.JLabel boardLabel7;
    private javax.swing.JLabel boardLabel8;
    private javax.swing.JLabel boardLabel9;
    private javax.swing.JPanel boardLabelsPanel;
    private javax.swing.JLabel oPlayerNameLabel;
    private javax.swing.JLabel oPlayerScore;
    private javax.swing.JLabel vsSymbolLabel;
    private javax.swing.JLabel xPlayerNameLabel;
    private javax.swing.JLabel xPlayerScore;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setFontSize(FontSizes fontSize) {
        oPlayerScore.setFont(new Font("Arail", Font.PLAIN, (fontSize.getFontSize() - 2)));
        xPlayerScore.setFont(new Font("Arail", Font.PLAIN, (fontSize.getFontSize() - 2)));
        vsSymbolLabel.setFont(new Font("Arail", Font.PLAIN, (fontSize.getFontSize() - 2)));
        xPlayerNameLabel.setFont(new Font("Arail", Font.BOLD, (fontSize.getFontSize() + 2)));
        oPlayerNameLabel.setFont(new Font("Arail", Font.BOLD, (fontSize.getFontSize() + 2)));
    }
}
