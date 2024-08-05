package com.aeon.flsservicesystem_test.tracking

import android.location.Location
import kotlinx.coroutines.flow.Flow

interface TrackingLocationClient {
    fun getLocationUpdates(interval: Long): Flow<Location>
    class LocationException(message: String) : Exception()
}