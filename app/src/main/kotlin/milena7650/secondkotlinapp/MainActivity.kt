package milena7650.secondkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.view.*
import milena7650.secondkotlinapp.R.id.mapview
import org.osmdroid.api.IMapController
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  var mapview = findViewById(R.id.mapview)

/*     mapview.setTileSource(TileSourceFactory.MAPNIK)
/    mapview.setBuiltInZoomControls(true)
    mapview.setMultiTouchControls(true)*/

    var mapController : IMapController = mapview.getController()
    mapController.setZoom(9)
    val startPoint : GeoPoint = GeoPoint(48.8583, 2.2944)
    mapController.setCenter(startPoint)
}
}
