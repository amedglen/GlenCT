package Battle;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jury
 */
public abstract class BattleEvent {
	
	private BattleEventPlayer player;
	
	public void begin(BattleEventPlayer player) {
		this.player = player;
	}
	
	public abstract void update(float delta);
	
	public abstract boolean finished();
	
	protected BattleEventPlayer getPlayer() {
		return player;
	}
}