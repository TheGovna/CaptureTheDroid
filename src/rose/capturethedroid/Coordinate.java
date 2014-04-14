package rose.capturethedroid;

public class Coordinate {
	public double latitude;
	public double longitude;
	private final double closeval=0.00010;
	
	public Coordinate(double lat,double longi){
		this.latitude=lat;
		this.longitude=longi;
	}
	
	public boolean equals(Coordinate position){
		if (Math.sqrt(Math.pow((position.latitude-this.latitude),2)+Math.pow((position.longitude-this.longitude),2))<=closeval){
//			System.out.println("Close enough for an interaction!:");
			return true;
		}
		return false;
	}
	
}
