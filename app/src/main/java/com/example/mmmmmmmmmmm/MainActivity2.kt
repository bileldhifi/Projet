package com.example.mmmmmmmmmmm

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.SearchView
import androidx.annotation.DrawableRes
import androidx.appcompat.content.res.AppCompatResources
import com.example.mmmmmmmmmmm.Connect.RetrofitInstance
import com.example.mmmmmmmmmmm.Model.Location
import com.example.mmmmmmmmmmm.Repository.ApiService
import com.example.mmmmmmmmmmm.ViewModel.Retrofit
import com.example.mmmmmmmmmmm.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.mapbox.maps.MapView
import com.mapbox.maps.Style
import com.mapbox.maps.plugin.annotation.annotations
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions
import com.mapbox.maps.plugin.annotation.generated.createPointAnnotationManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

var mapView: MapView? = null
class MainActivity2 : AppCompatActivity() {
    private val apiService = RetrofitInstance.retrofit.create(ApiService::class.java)
    private lateinit var searchView: SearchView
    lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mapView = findViewById(R.id.mapView)
        mapView?.getMapboxMap()?.loadStyleUri(Style.MAPBOX_STREETS, object : Style.OnStyleLoaded {
            override fun onStyleLoaded(style: Style) {
            }
        })
        val call: Call<List<Location>> = apiService.getPost()
        call.enqueue(object : Callback<List<Location>> {
            override fun onResponse(call: Call<List<Location>>, response: Response<List<Location>>) {
                Log.d("bilel","zzzzz")
                if (response.isSuccessful) {
                    response.body()?.let {location->
                        // Update the UI on the main thread
                        runOnUiThread {
                            //addAnnotationToMap(location[0].lat, location[0].long) // add annotation when the style map is loaded
                            for (loc in location) {
                                addAnnotationToMap(
                                    loc.lat, loc.long)
                            }
                        }
                    }
                } else {
                    runOnUiThread {
                    }
                }
            }
            override fun onFailure(call: Call<List<Location>>, t: Throwable) {
                // Handle network failures
                // For example, you can show an error message in the TextView
                runOnUiThread {
                    Log.d("bilel", "Error: ${t.message}")
                }
            }
        })
    }
    private fun addAnnotationToMap(latitude: Double, longitude: Double) {
        lateinit var retrofit: Retrofit
        bitmapFromDrawableRes(
            this@MainActivity2,
            R.drawable.ic_banner_foreground
        )?.let {
            val annotationApi = mapView?.annotations
            val pointAnnotationManager = annotationApi?.createPointAnnotationManager(mapView!!)

            addCustomAnnotation(pointAnnotationManager, R.drawable.leau, latitude,longitude )

        }    }

    private fun addCustomAnnotation(
        pointAnnotationManager: PointAnnotationManager?,
        @DrawableRes imageRes: Int,
        longitude: Double,
        latitude: Double
    ) {
        bitmapFromDrawableRes(this@MainActivity2, imageRes)?.let {
            val pointAnnotationOptions: PointAnnotationOptions = PointAnnotationOptions()
                .withPoint(com.mapbox.geojson.Point.fromLngLat(longitude, latitude))
                .withIconImage(it)

            pointAnnotationManager?.create(pointAnnotationOptions)
        }
    }
    private fun bitmapFromDrawableRes(context: Context, @DrawableRes resourceId: Int) =
        convertDrawableToBitmap(AppCompatResources.getDrawable(context, resourceId))
}

private fun convertDrawableToBitmap(sourceDrawable: Drawable?): Bitmap? {
    if (sourceDrawable == null) {
        return null
    }
    return if (sourceDrawable is BitmapDrawable) {
        sourceDrawable.bitmap
    } else {
// copying drawable object to not manipulate on the same reference
        val constantState = sourceDrawable.constantState ?: return null
        val drawable = constantState.newDrawable().mutate()
        val bitmap: Bitmap = Bitmap.createBitmap(
            drawable.intrinsicWidth, drawable.intrinsicHeight,
            Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        drawable.setBounds(0, 0, canvas.width, canvas.height)
        drawable.draw(canvas)
        bitmap
    }
}