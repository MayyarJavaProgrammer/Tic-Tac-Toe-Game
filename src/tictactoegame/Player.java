/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoegame;

/**
 *
 * @author Mayyar
 */
public class Player {

    int score;
    String name;
    boolean isPlayerTurn;

    public Player() {
        
    }

    public Player(int score, String name, boolean isPlayerTurn) {
        this.score = score;
        this.name = name;
        this.isPlayerTurn = isPlayerTurn;
    }

    public boolean isIsPlayerTurn() {
        return isPlayerTurn;
    }

    public void setIsPlayerTurn(boolean isPlayerTurn) {
        this.isPlayerTurn = isPlayerTurn;
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
}
