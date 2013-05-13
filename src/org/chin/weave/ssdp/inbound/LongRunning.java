package org.chin.weave.ssdp.inbound;

public abstract class LongRunning implements Runnable{
	
	public boolean isRunning;
	
	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public abstract void init();
	
	public void run(){
		
	}
	
	public abstract void task();
	
}
