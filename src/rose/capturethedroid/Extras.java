package rose.capturethedroid;

import android.app.Application;

/**
 * TODO Put here a description of what this class does. Ooohh
 *
 * @author thaimp.
 *         Created Apr 12, 2014.
 */
public class Extras extends Application {
	Coordinate[] flagpos;
	boolean flagCarrier;
	int gameCondition;
	Coordinate playerCoords;
	
	public Coordinate[] getFlagpos() {
		return flagpos;
	}
	
	public boolean getFlagCarrier() {
		return flagCarrier;
	}
	
	public int getGameCondition() {
		return gameCondition;
	}
	public Coordinate getPlayerCoords() {
		GPSTracker gps = new GPSTracker(Extras.this);

		// check if GPS enabled
		if (gps.canGetLocation()) {
			double latitude = gps.getLatitude();
			double longitude = gps.getLongitude();
			playerCoords.latitude = latitude;
			playerCoords.longitude = longitude;
			return new Coordinate(latitude, longitude);
			// Toast.makeText(
			// getApplicationContext(),
			// "Your location is - \nLat: " + latitude + "\nLong: "
			// + longitude, Toast.LENGTH_SHORT).show();
		} else {
			// can't get location
			// GPS or Network isn't enabled
			// ask user to enable GPS/network in settings
			gps.showSettingsAlert();
		}
		return playerCoords;
	}
	
}
