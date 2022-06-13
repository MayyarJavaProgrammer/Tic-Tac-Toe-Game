/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package tictactoegame;

/**
 *
 * @author Mayyar
 */
public enum FontSizes {

    SMALL(14), MEDUIM(16), LARGE(18);

    private final int fontSize;

    FontSizes(final int fontSize) {
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }

}
