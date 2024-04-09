/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jury
 */
public class Loop implements Runnable {
    private final Player player1;
    private final Player player2;
    private final GameState gameState;

    public Loop(Player player1, Player player2, GameState gameState) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameState = gameState;
    }

    @Override
    public void run() {
        // Inside main game loop
        while (!gameState.isGameOver()) {
            // Player 1's turn
            playerTurn(player1, gameState);

            if (gameState.isGameOver()) {
                break; // Exit loop if game over
            }

            // Player 2's turn
            playerTurn(player2, gameState);
        }
    }

    // Method to handle player's turn
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
}
