import android.content.Context
import android.location.Location
import com.mapbox.android.core.location.LocationEngine
import com.mapbox.android.core.location.LocationEngineCallback
import com.mapbox.android.core.location.LocationEngineProvider
import com.mapbox.android.core.location.LocationEngineRequest
import com.mapbox.android.core.location.LocationEngineResult
import java.lang.ref.WeakReference

class LocationManager(context: Context, private val onLocationUpdated: (Location) -> Unit) {
private var locationEngine: LocationEngine = LocationEngineProvider.getBestLocationEngine(context)
private val locationCallback = LocationCallback(this)

        init {
        val request = LocationEngineRequest.Builder(1000L)
        .setPriority(LocationEngineRequest.PRIORITY_HIGH_ACCURACY)
        .setMaxWaitTime(5000L).build()

        locationEngine.requestLocationUpdates(request, locationCallback, context.mainLooper)
        locationEngine.getLastLocation(locationCallback)
        }

private class LocationCallback(manager: LocationManager) : LocationEngineCallback<LocationEngineResult> {
private val managerWeakReference: WeakReference<LocationManager> = WeakReference(manager)

        override fun onSuccess(result: LocationEngineResult?) {
        val location: Location? = result?.lastLocation
        if (location != null) {
        managerWeakReference.get()?.onLocationUpdated(location)
        }
        }

        override fun onFailure(exception: Exception) {
        // Handle exception
        }
        }

        fun onLocationUpdated(location: Location) {
        onLocationUpdated.invoke(location)
        }
        }
