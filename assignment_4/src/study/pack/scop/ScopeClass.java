package study.pack.scop;

import study.pack.scop1.Subclass2;

public class ScopeClass {

	public int x;
	private int y;
	protected int z;
	Subclass2 sb =new Subclass2();
	@SuppressWarnings("unused")
	private void runk() {
		sb.doJob();

	}
	
}
class SubClass extends ScopeClass {//default class cannot be access in other class
	public void pnt() {
		x=12;
//		y=13;	cannot acess private member 
		z=14;//procted member can be access in subclass
		
	}
}
