package tictactoegame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.ImageIcon;
/**
 *
 * @author PC
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    SettingsPage settingsPage;
    SinglePlayerPage singlePlayerPage;
    MultiPlayerPage multiPlayerPage;
    GamePage gamePage;
    StartPage startPage;
    CardLayout cardLayout;
    Container container;
    Player xPlayer;
    Player oPlayer;
    boolean isTwoPlayerGame;

    public Main() {
        initComponents();
        creatContainer();
        creatAndShowStartPage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setIconImage(new ImageIcon(getClass().getResource("/tictactoegame/images/icons/ticTacToeGame.png")).getImage());
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }//GEN-END:initComponents
    /**
     * @param args the command line arguments
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    private void creatContainer() {
        startPage = new StartPage();
        singlePlayerPage = new SinglePlayerPage();
        multiPlayerPage = new MultiPlayerPage();
        settingsPage = new SettingsPage();
        cardLayout = new CardLayout();
        container = this.getContentPane();

        container.setLayout(cardLayout);
        container.getLayout().addLayoutComponent("startPage", startPage);
        container.add(startPage);

        container.getLayout().addLayoutComponent("singlePlayerPage", singlePlayerPage);
        container.add(singlePlayerPage);

        container.getLayout().addLayoutComponent("multiPlayerPage", multiPlayerPage);
        container.add(multiPlayerPage);

        container.getLayout().addLayoutComponent("settingsPage", settingsPage);
        container.add(settingsPage);

    }

    private void creatAndShowStartPage() {
        startPage.setFontSize(settingsPage.fontSize);
        startPage.SinglePlayerBtn.addActionListener(singlePlayerBtnListener);
        startPage.multiPlayerBtn.addActionListener(multiPlayerBtnListener);
        startPage.settingsBtn.addActionListener(settingsBtnListener);

        cardLayout.show(container, "startPage");
    }

    private void creatAndShowSinglePlayerPage() {
        singlePlayerPage.setFontSize(settingsPage.fontSize);
        singlePlayerPage.singlePlayerStartBtn.addActionListener(singlePlayerStartBtnListener);
        singlePlayerPage.singlePlayerBackBtn.addActionListener(singlePlayerBackBtnListener);

        cardLayout.show(container, "singlePlayerPage");
    }

    private void creatAndShowMultiPlayerPage() {
        multiPlayerPage.setFontSize(settingsPage.fontSize);
        multiPlayerPage.multiPlayerBackBtn.addActionListener(multiPlayerBackBtnListener);
        multiPlayerPage.multiPlayerStartBtn.addActionListener(multiPlayerStartBtnListener);

        cardLayout.show(container, "multiPlayerPage");
    }

    private void creatAndShowSettingsPage() {
        settingsPage.settingsBackBtn.addActionListener(settingsBackBtnListener);
        cardLayout.show(container, "settingsPage");
    }

    private void creatAndShowGamePage() {
        gamePage = new GamePage();
        gamePage.xPlayerScore.setText("" + xPlayer.getScore());
        gamePage.oPlayerScore.setText("" + oPlayer.getScore());
        gamePage.boardBackgroundLabel.setIcon(settingsPage.boardBackgroundLabel);

        gamePage.gamePageBackBtn.addActionListener(gamePageBackBtnListener);
        gamePage.restartGameBtn.addActionListener(restartgameBtnListener);
        gamePage.addBoardLabels();
        gamePage.setFontSize(settingsPage.fontSize);

        setBoardLabelsListener();
        gamePage.xPlayerNameLabel.setText(xPlayer.getName());
        if (isTwoPlayerGame) {
            gamePage.oPlayerNameLabel.setText(oPlayer.getName());
        }

        container.getLayout().addLayoutComponent("gamePage", gamePage);
        container.add(gamePage);
        cardLayout.show(container, "gamePage");
    }

    private void setBoardLabelsListener() {
        gamePage.boardLabels[0].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[1].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[2].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[3].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[4].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[5].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[6].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[7].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[8].addMouseListener(boardLabelsListener);
    }

    private void removeBoardLabelsListener() {
        gamePage.boardLabels[0].removeMouseListener(boardLabelsListener);
        gamePage.boardLabels[1].removeMouseListener(boardLabelsListener);
        gamePage.boardLabels[2].removeMouseListener(boardLabelsListener);
        gamePage.boardLabels[3].removeMouseListener(boardLabelsListener);
        gamePage.boardLabels[4].removeMouseListener(boardLabelsListener);
        gamePage.boardLabels[5].removeMouseListener(boardLabelsListener);
        gamePage.boardLabels[6].removeMouseListener(boardLabelsListener);
        gamePage.boardLabels[7].removeMouseListener(boardLabelsListener);
        gamePage.boardLabels[8].removeMouseListener(boardLabelsListener);
    }
//start page listener
    ActionListener singlePlayerBtnListener = (evt) -> {
        creatAndShowSinglePlayerPage();
    };

    ActionListener multiPlayerBtnListener = (evt) -> {
        creatAndShowMultiPlayerPage();
    };

    ActionListener settingsBtnListener = (evt) -> {
        creatAndShowSettingsPage();
    };
    //single page listener
    ActionListener singlePlayerStartBtnListener = (evt) -> {
        xPlayer = new Player(0, singlePlayerPage.playerNameField.getText(), true, 'X');
        //computer object
        oPlayer = new Player(0, singlePlayerPage.playerNameField.getText(), false, 'O');
        isTwoPlayerGame = false;
        creatAndShowGamePage();
    };

    ActionListener singlePlayerBackBtnListener = (evt) -> {
        cardLayout.show(container, "startPage");
    };

    //multi page listener
    ActionListener multiPlayerStartBtnListener = (evt) -> {
        xPlayer = new Player(0, multiPlayerPage.playerXField.getText(), true, 'X');
        oPlayer = new Player(0, multiPlayerPage.playerOField.getText(), false, 'O');
        isTwoPlayerGame = true;
        creatAndShowGamePage();
    };

    ActionListener multiPlayerBackBtnListener = (evt) -> {
        cardLayout.show(container, "startPage");
    };

    ActionListener settingsBackBtnListener = (evt) -> {
        startPage.setFontSize(settingsPage.fontSize);
        cardLayout.show(container, "startPage");
    };
    //game page listener
    ActionListener gamePageBackBtnListener = (evt) -> {
        //remove game page
        gamePage = null;
        if (isTwoPlayerGame) {
            cardLayout.show(container, "multiPlayerPage");
        } else {
            cardLayout.show(container, "singlePlayerPage");
        }
    };

    ActionListener restartgameBtnListener = (evt) -> {
        gamePage.addBoardLabels();
        setBoardLabelsListener();
        if (isTwoPlayerGame) {
            xPlayer.setPlayerTurn(true);

            oPlayer.setPlayerTurn(false);
        } else {
            xPlayer.setPlayerTurn(true);
        }
        creatAndShowGamePage();
    };

    MouseListener boardLabelsListener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (((JLabel) e.getSource()).getText().equals("") && gamePage.getNumberOfClick() < 9) {
                if (xPlayer.isPlayerTurn()) {
                    ((JLabel) e.getSource()).setForeground(xPlayer.getColorIcon());
                    ((JLabel) e.getSource()).setText("" + xPlayer.getPlayerIcon());
                    xPlayer.setPlayerTurn(false);
                    gamePage.increaseNumberOfClick();
                    gamePage.checkIfThereIsAWinner();
                    if (!gamePage.isGameEnd()) {
                        gamePage.xPlayerNameLabel.setForeground(Color.BLACK);
                        gamePage.oPlayerNameLabel.setForeground(Color.red);
                    } else {
                        changeScore(gamePage.getWinnerIconPlayer());
                        removeBoardLabelsListener();
                    }
                } else if (isTwoPlayerGame && gamePage.getNumberOfClick() < 9) {
                    ((JLabel) e.getSource()).setText("" + oPlayer.getPlayerIcon());
                    ((JLabel) e.getSource()).setForeground(oPlayer.getColorIcon());
                    xPlayer.setPlayerTurn(true);
                    gamePage.increaseNumberOfClick();
                    gamePage.checkIfThereIsAWinner();
                    if (!gamePage.isGameEnd()) {
                        gamePage.oPlayerNameLabel.setForeground(Color.BLACK);
                        gamePage.xPlayerNameLabel.setForeground(Color.blue);
                    } else {
                        changeScore(gamePage.getWinnerIconPlayer());
                        removeBoardLabelsListener();
                    }
                }
                if (!isTwoPlayerGame && !xPlayer.isPlayerTurn() && gamePage.getNumberOfClick() < 9 && !gamePage.isGameEnd()) {
                    int randomBoardLabel = new Random().nextInt(9);
                    int index = doComputerClick();
                    if (index == -1) {
                        while (true) {
                            if (gamePage.boardLabels[randomBoardLabel].getText().equals("")) {
                                gamePage.boardLabels[randomBoardLabel].setText("O");
                                gamePage.boardLabels[randomBoardLabel].setForeground(Color.red);
                                break;
                            } else {
                                randomBoardLabel = new Random().nextInt(9);
                            }
                        }
                    } else if (index != -1) {
                        gamePage.boardLabels[index].setText("O");
                        gamePage.boardLabels[index].setForeground(Color.red);
                    }
                    gamePage.increaseNumberOfClick();
                    gamePage.checkIfThereIsAWinner();
                    if (!gamePage.isGameEnd()) {
                        gamePage.oPlayerNameLabel.setForeground(Color.BLACK);
                        gamePage.xPlayerNameLabel.setForeground(Color.blue);
                        xPlayer.setPlayerTurn(true);
                    } else {
                        changeScore(gamePage.getWinnerIconPlayer());
                        removeBoardLabelsListener();
                    }
                }
            }
            gamePage.noCilck++;
//            System.out.println(gamePage.noCilck);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    };

    private void changeScore(char winnerIconPlayer) {
        if (winnerIconPlayer == 'X') {
            xPlayer.setScore(xPlayer.getScore() + 1);
            gamePage.xPlayerScore.setText("" + xPlayer.getScore());
        } else {
            oPlayer.setScore(oPlayer.getScore() + 1);
            gamePage.oPlayerScore.setText("" + oPlayer.getScore());

        }
    }

    private int doComputerClick() {
        if (gamePage.noCilck == 0 && gamePage.boardLabels[4].getText().equals("")) {
            return 4;
        } else if (gamePage.noCilck == 0) {
            return -1;
        } else {
            if (gamePage.boardLabels[0].getText().equals(gamePage.boardLabels[1].getText()) && gamePage.boardLabels[0].getText().equals("X") && gamePage.boardLabels[2].getText().equals("")) {
                return 2;
            } else if (gamePage.boardLabels[0].getText().equals(gamePage.boardLabels[2].getText()) && gamePage.boardLabels[0].getText().equals("X") && gamePage.boardLabels[1].getText().equals("")) {
                return 1;
            } else if (gamePage.boardLabels[3].getText().equals(gamePage.boardLabels[4].getText()) && gamePage.boardLabels[3].getText().equals("X") && gamePage.boardLabels[5].getText().equals("")) {
                return 5;
            } else if (gamePage.boardLabels[3].getText().equals(gamePage.boardLabels[5].getText()) && gamePage.boardLabels[3].getText().equals("X") && gamePage.boardLabels[4].getText().equals("")) {
                return 4;
            } else if (gamePage.boardLabels[6].getText().equals(gamePage.boardLabels[7].getText()) && gamePage.boardLabels[6].getText().equals("X") && gamePage.boardLabels[8].getText().equals("")) {
                return 8;
            } else if (gamePage.boardLabels[6].getText().equals(gamePage.boardLabels[8].getText()) && gamePage.boardLabels[6].getText().equals("X") && gamePage.boardLabels[7].getText().equals("")) {
                return 7;
            } else if (gamePage.boardLabels[0].getText().equals(gamePage.boardLabels[3].getText()) && gamePage.boardLabels[0].getText().equals("X") && gamePage.boardLabels[6].getText().equals("")) {
                return 6;
            } else if (gamePage.boardLabels[0].getText().equals(gamePage.boardLabels[6].getText()) && gamePage.boardLabels[0].getText().equals("X") && gamePage.boardLabels[3].getText().equals("")) {
                return 3;
            } else if (gamePage.boardLabels[1].getText().equals(gamePage.boardLabels[4].getText()) && gamePage.boardLabels[1].getText().equals("X") && gamePage.boardLabels[7].getText().equals("")) {
                return 7;
            } else if (gamePage.boardLabels[1].getText().equals(gamePage.boardLabels[7].getText()) && gamePage.boardLabels[1].getText().equals("X") && gamePage.boardLabels[4].getText().equals("")) {
                return 4;
            } else if (gamePage.boardLabels[2].getText().equals(gamePage.boardLabels[5].getText()) && gamePage.boardLabels[2].getText().equals("X") && gamePage.boardLabels[8].getText().equals("")) {
                return 8;
            } else if (gamePage.boardLabels[2].getText().equals(gamePage.boardLabels[8].getText()) && gamePage.boardLabels[2].getText().equals("X") && gamePage.boardLabels[5].getText().equals("")) {
                return 5;
            } else if (gamePage.boardLabels[0].getText().equals(gamePage.boardLabels[4].getText()) && gamePage.boardLabels[0].getText().equals("X") && gamePage.boardLabels[8].getText().equals("")) {
                return 8;
            } else if (gamePage.boardLabels[0].getText().equals(gamePage.boardLabels[8].getText()) && gamePage.boardLabels[0].getText().equals("X") && gamePage.boardLabels[4].getText().equals("")) {
                return 4;
            } else if (gamePage.boardLabels[2].getText().equals(gamePage.boardLabels[4].getText()) && gamePage.boardLabels[2].getText().equals("X") && gamePage.boardLabels[6].getText().equals("")) {
                return 6;
            } else if (gamePage.boardLabels[2].getText().equals(gamePage.boardLabels[6].getText()) && gamePage.boardLabels[2].getText().equals("X") && gamePage.boardLabels[4].getText().equals("")) {
                return 4;
            } //            first 
            else if (gamePage.boardLabels[1].getText().equals(gamePage.boardLabels[2].getText()) && gamePage.boardLabels[1].getText().equals("X") && gamePage.boardLabels[0].getText().equals("")) {
                return 0;
            } else if (gamePage.boardLabels[4].getText().equals(gamePage.boardLabels[5].getText()) && gamePage.boardLabels[4].getText().equals("X") && gamePage.boardLabels[3].getText().equals("")) {
                return 3;
            } else if (gamePage.boardLabels[7].getText().equals(gamePage.boardLabels[8].getText()) && gamePage.boardLabels[7].getText().equals("X") && gamePage.boardLabels[6].getText().equals("")) {
                return 6;
            } else if (gamePage.boardLabels[3].getText().equals(gamePage.boardLabels[6].getText()) && gamePage.boardLabels[3].getText().equals("X") && gamePage.boardLabels[0].getText().equals("")) {
                return 0;
            } else if (gamePage.boardLabels[4].getText().equals(gamePage.boardLabels[7].getText()) && gamePage.boardLabels[4].getText().equals("X") && gamePage.boardLabels[1].getText().equals("")) {
                return 1;
            } else if (gamePage.boardLabels[5].getText().equals(gamePage.boardLabels[8].getText()) && gamePage.boardLabels[5].getText().equals("X") && gamePage.boardLabels[2].getText().equals("")) {
                return 2;
            } else if (gamePage.boardLabels[4].getText().equals(gamePage.boardLabels[6].getText()) && gamePage.boardLabels[4].getText().equals("X") && gamePage.boardLabels[2].getText().equals("")) {
                return 2;
            }
            return -1;

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
