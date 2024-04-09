/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jury
 */
public class Main {
    public static void main(String[] args) {
        // Initialize game objects
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        GameState gameState = new GameState();
        
        // Main game loop
        while (!gameState.isGameOver()) {
            // Player 1's turn
            playerTurn(player1, gameState);
            
            // Check for game over condition after each turn
            if (gameState.isGameOver()) {
                break;
            }
            
            // Player 2's turn
            playerTurn(player2, gameState);
        }
        
        // Game over, display results
        displayGameResults(gameState);
    }
    
    // Method to handle player turn
    public static void playerTurn(Player player, GameState gameState) {
        // Display game state
        gameState.displayBoard();
        
        // Prompt player for action and handle it
        player.takeTurn(gameState);
        
        // Check for win condition
        if (gameState.checkWinCondition(player)) {
            gameState.setWinner(player);
            gameState.setGameOver(true);
        }
    }
    
    // Method to display game results
    public static void displayGameResults(GameState gameState) {
        System.out.println("Game Over");
        System.out.println("Winner: " + gameState.getWinner().getName());
        // Add more game result display logic as needed
    }
}
