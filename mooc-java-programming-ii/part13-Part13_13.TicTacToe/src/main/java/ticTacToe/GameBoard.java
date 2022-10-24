/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.Arrays;

/**
 *
 * @author brandonwebdev
 */
public class GameBoard {
    private String[][] board;
    private final int GRID_SIZE;
    
    public GameBoard(int gridSize) {
        this.GRID_SIZE = gridSize;
        this.board = new String[GRID_SIZE][GRID_SIZE];
    }
    
    public void placeSymbol(String symbol, int row, int col) {
        this.board[row][col] = symbol;
    }
    
    public String getSymbolAt(int row, int col) {
        return this.board[row][col];
    }
    
    public boolean isEmptyCell(int row, int col) {
        return this.board[row][col] == null;
    }
    
    private void initializeGrid() {
        this.board = new String[GRID_SIZE][GRID_SIZE];
    }
    
    private boolean checkRowForMatch(String symbol, int row) {
        for (int i = 0; i < board[row].length; i++) {
            String cellValue = board[row][i];
            if (cellValue == null || !board[row][i].equalsIgnoreCase(symbol)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean checkRowsForWin(String symbol) {
        for (int row = 0; row < board.length; row++) {
            if (checkRowForMatch(symbol, row)) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean checkColumnForWin(String symbol, int col) {
        for (int row = 0; row < board.length; row++) {
            
            String cellValue = board[row][col];
            if (cellValue == null || !cellValue.equalsIgnoreCase(symbol)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean checkColumnsForWin(String symbol) {
        for (int i = 0; i < board.length; i++) {
            if (checkColumnForWin(symbol, i)) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean checkDiagonalsForWin(String symbol) {
        for (int i = 0; i < this.board.length; i++) {
            String topLeftBottomRightValue = this.board[i][i];
            if (topLeftBottomRightValue == null || !topLeftBottomRightValue.equalsIgnoreCase(symbol)) {
                return false;
            }
            
        }
        return true;
    }
    
    public boolean checkForWin(String symbol) {
        return checkColumnsForWin(symbol) || checkRowsForWin(symbol) || checkDiagonalsForWin(symbol);
    }
    
}
