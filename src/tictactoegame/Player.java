/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoegame;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Mayyar
 */
public class Player {
    
    private int score;
    private String name;
    private boolean PlayerTurn;
    private char playerIcon;
    private Color colorIcon;
    
    public Player() {
        
    }
    
    public Player(int score, String name, boolean PlayerTurn, char playerIcon) {
        this.setScore(score);
        this.setName(name);
        this.setPlayerTurn(PlayerTurn);
        this.setPlayerIcon(playerIcon);
    }
    
    public boolean isPlayerTurn() {
        return PlayerTurn;
    }
    
    public void setPlayerTurn(boolean PlayerTurn) {
        this.PlayerTurn = PlayerTurn;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getScore() {
        return score;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public char getPlayerIcon() {
        return playerIcon;
    }
    
    public void setPlayerIcon(char playerIcon) {
        this.playerIcon = playerIcon;
        
        if (playerIcon == 'X') {
            setColorIcon(Color.BLUE);
        } else if (playerIcon == 'O') {
            setColorIcon(Color.RED);
        }
    }
    
    public void setColorIcon(Color colorIcon) {
        this.colorIcon = colorIcon;
    }

    public Color getColorIcon() {
        return colorIcon;
    }
    
}
