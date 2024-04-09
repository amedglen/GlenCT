/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jury
 */
public class GameState {
    private boolean gameOver;
    private Player winner;
    // Other attributes as needed
    
    // Constructor
    public GameState() {
        // Initialize game state
        gameOver = false;
        winner = null;
        // Initialize other attributes
    }
    
    // Method to check if the game is over
    public boolean isGameOver() {
        return gameOver;
    }
    
    // Method to set the game over status
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
    
    // Method to get the winner of the game
    public Player getWinner() {
        return winner;
    }
    
    // Method to set the winner of the game
    public void setWinner(Player winner) {
        this.winner = winner;
    }

    boolean checkWinCondition(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void displayBoard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    
    // Method to display the current game state (e.g., 

