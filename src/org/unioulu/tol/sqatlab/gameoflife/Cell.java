package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	
	public boolean status;
	public int neighbours;
		
	public void update(int neighbours) {
		if (neighbours < 2) {
			setStatus(false);
		}
		else if (neighbours == 2 || neighbours == 3) {
			setStatus(true);
			
		}
			
		
	}
	
	public boolean cellIsDead() {
		status = false;
		return status;
	} 
	
	public boolean cellIsAlive() {
		status = true;
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setNeighbours(int neighbours) {
		this.neighbours = neighbours;
		
	}

	public boolean isStatus() {
		return status;
	}

	
	}
		

