package iaws.NBMR.coUps.domaine;

public class Coordonnees {
	int lonX,lonY,lonZ;
	int latX,latY,latZ;
	
	public Coordonnees(int lonA, int lonB, int lonC, int latA, int latB, int latC){
		lonX=lonA;
		lonY=lonB;
		lonZ=lonC;
		latX=latA;
		latY=latB;
		latA=latC;
	}
	public int getLatX() {
		return latX;
	}
	public int getLatY() {
		return latY;
	}
	public int getLatZ() {
		return latZ;
	}
	public int getLonX() {
		return lonX;
	}
	public int getLonY() {
		return lonY;
	}
	public int getLonZ() {
		return lonZ;
	}
	public void setLatX(int latX) {
		this.latX = latX;
	}
	public void setLatY(int latY) {
		this.latY = latY;
	}
	public void setLatZ(int latZ) {
		this.latZ = latZ;
	}
	public void setLonX(int lonX) {
		this.lonX = lonX;
	}
	public void setLonY(int lonY) {
		this.lonY = lonY;
	}
	public void setLonZ(int lonZ) {
		this.lonZ = lonZ;
	}

}
