package org.squirrel.objects;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import org.squirrel.core.EwokInput;
import org.squirrel.enginecomponent.components.WASD;

public class Player {
	
	private int xPos, yPos;
	
	public Player(int x, int y){
		this.xPos = x;
		this.yPos = y;
		
	}
	
	public void draw(Graphics2D g2d){
		Rectangle bunds = new Rectangle(xPos,yPos, 64, 64);
		g2d.draw(bunds);
	}
	
	public void update(){
		if(EwokInput.isKey(KeyEvent.VK_W)){
			this.yPos -= 2; 
		}else if(EwokInput.isKey(KeyEvent.VK_S)){
			this.yPos += 2;
		}else if(EwokInput.isKey(KeyEvent.VK_D)){
			this.xPos += 2;
		}else if(EwokInput.isKey(KeyEvent.VK_A)){
			this.xPos -= 2;
		}
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
}
