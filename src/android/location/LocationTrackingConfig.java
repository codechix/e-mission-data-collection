package edu.berkeley.eecs.emission.cordova.tracker.location;

import android.content.Context;
import android.location.Location;

import com.google.android.gms.location.LocationRequest;

import edu.berkeley.eecs.emission.cordova.tracker.Constants;

/**
 * Created by shankari on 10/20/15.
 *
 * TODO: Change this to read the value from the usercache instead of the hardcoded value.
 */

public class LocationTrackingConfig {
    private Context cachedContext;

    protected LocationTrackingConfig(Context ctxt) {
        this.cachedContext = ctxt;
    }
    public static LocationTrackingConfig getConfig(Context context) {
        return new LocationTrackingConfig(context);
    }

    public boolean isDutyCycling() {
        return true;
    }

    public int getDetectionInterval() {
        return Constants.THIRTY_SECONDS;
    }

    public int getAccuracy() {
        return LocationRequest.PRIORITY_HIGH_ACCURACY;
    }

    public int getRadius() {
        return Constants.TRIP_EDGE_THRESHOLD;
    }

    public int getAccuracyThreshold() { return 200; }

    public int getResponsiveness() {
        return 5 * Constants.MILLISECONDS;
    }
}
