/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jury
 */

    public class Player {
    private String name;
    // You can add more attributes as needed
    
    // Constructor
    public Player(String name) {
        this.name = name;
    }
    
    // Method to handle player's turn
    public void takeTurn(GameState gameState) {
        // Implement logic for player's turn
        // For example, you can prompt the player to choose an action, move their character, etc.
    }
    
    // Getter and setter methods
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

