package rose.capturethedroid;


/**
 * Holds info ssent to the server.
 * @author millerlj.
 *         Created Apr 12, 2014.
 */
public class JsonHolder {
	int team;
	String name;
	Coordinate location;
	
	public JsonHolder(int team, String name, Coordinate location) {
		this.location=location;
		this.name=name;
		this.team=team;
	}
	 

}
