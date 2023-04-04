package com.sap.mathisneunzig.tree;

public class Content {
	
	private String[] a;
	
	public Content(String... a) {
		
		this.a = a;
		
	}
	
	public boolean contains(String r) {
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		boolean c = false;
		
		for(String s : a) {
			if(s.toLowerCase().contains(r.toLowerCase()))
				c = true;
		}
		
		return c;
		
	}

}
