package trabalho.trackline;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class localize extends FragmentActivity implements OnMapReadyCallback, Runnable{

    private LatLng latlng, Mark;
    private Marker marker;
    private Location location;
    public static GoogleMap mMap;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localize);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        final ItemLocation itemLocation = new ItemLocation();

        try {
            itemLocation.pickLoc(1);

            handler.post(new Runnable() {
                @Override
                public void run() {

                    Mark = new LatLng(ItemLocation.mLat, ItemLocation.mLng);
                    marker = mMap.addMarker(new MarkerOptions().position(Mark).title(String.valueOf(ItemLocation.mLat) + "," + String.valueOf(ItemLocation.mLng)));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Mark));
                    mMap.moveCamera(CameraUpdateFactory.zoomTo(17));

                }
            });

        } catch (XmlPullParserException e) {
            Log.e("LOG ERROR: ", String.valueOf(e));
        } catch (IOException e) {
            Log.e("LOG ERROR: ", String.valueOf(e));
        }
    }

}
