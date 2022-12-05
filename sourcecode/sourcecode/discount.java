package sourcecode;

import java.util.ArrayList;

abstract public class discount extends services {
	private float rate;
	public ArrayList<String> dis = new  ArrayList<String>();
	abstract public double cost(int n,int i) ;
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
}
