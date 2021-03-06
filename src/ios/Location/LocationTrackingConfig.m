//
//  LocationTrackingConfig.m
//  CFC_Tracker
//
//  Created by Kalyanaraman Shankari on 11/6/15.
//  Copyright © 2015 Kalyanaraman Shankari. All rights reserved.
//

#import "LocationTrackingConfig.h"
#import <CoreLocation/CoreLocation.h>

#define kFiveMeters 5 // in meters
#define kFifty_Meters 50 // in meters
#define kHundred_Meters 100 // in meters
#define kTripEndStationaryMins 10 // in minutes

/*
 * TODO: Read these from the usercache instead
 */

@implementation LocationTrackingConfig

static LocationTrackingConfig *_instance;

+ (instancetype) instance {
    if (_instance == NULL) {
        _instance = [LocationTrackingConfig new];
    }
    return _instance;
}

- (BOOL)isDutyCycling {
    return true;
}

- (double)accuracy {
    return kCLLocationAccuracyBest;
}

- (int)filterDistance {
    return kFifty_Meters;
}

- (int)geofenceRadius {
    return kHundred_Meters;
}

- (int)tripEndStationaryMins {
    return kTripEndStationaryMins;
}


@end
