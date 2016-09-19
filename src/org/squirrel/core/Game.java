package org.squirrel.core;

import java.awt.Graphics;
import java.awt.Graphics2D;

import org.squirrel.objects.Player;
import org.squirrel.utils.Debugger;

public class Game extends EwokGame{
	
	Player ply;
	
	public Game(){
		setFocusable(true);
		ply = new Player(300, 300);
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawString("Test", 300, 300);
		ply.draw(g2d);
	}

	@Override
	public void update(Ewok arg0, float arg1) {
		ply.update();
	}
	
	public static void main(String[] args){
		Ewok ew = new Ewok(new Game());
		
		ew.setTitle("Multiplayer Fun!");
		ew.setWidth(1400);
		ew.setHeight(800);
		Debugger.enableDebugger();
		ew.start();
		
	}

}
