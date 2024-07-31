package io.flutter.plugins.googlemaps;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class GoogleMapBuilder implements GoogleMapOptionsSink {
    private Object initialCircles;
    private Object initialMarkers;
    private Object initialPolygons;
    private Object initialPolylines;
    private List<Map<String, ?>> initialTileOverlays;
    private final GoogleMapOptions options = new GoogleMapOptions();
    private boolean trackCameraPosition = false;
    private boolean myLocationEnabled = false;
    private boolean myLocationButtonEnabled = false;
    private boolean indoorEnabled = true;
    private boolean trafficEnabled = false;
    private boolean buildingsEnabled = true;
    private Rect padding = new Rect(0, 0, 0, 0);

    public GoogleMapController build(int i10, Context context, BinaryMessenger binaryMessenger, LifecycleProvider lifecycleProvider) {
        GoogleMapController googleMapController = new GoogleMapController(i10, context, binaryMessenger, lifecycleProvider, this.options);
        googleMapController.init();
        googleMapController.setMyLocationEnabled(this.myLocationEnabled);
        googleMapController.setMyLocationButtonEnabled(this.myLocationButtonEnabled);
        googleMapController.setIndoorEnabled(this.indoorEnabled);
        googleMapController.setTrafficEnabled(this.trafficEnabled);
        googleMapController.setBuildingsEnabled(this.buildingsEnabled);
        googleMapController.setTrackCameraPosition(this.trackCameraPosition);
        googleMapController.setInitialMarkers(this.initialMarkers);
        googleMapController.setInitialPolygons(this.initialPolygons);
        googleMapController.setInitialPolylines(this.initialPolylines);
        googleMapController.setInitialCircles(this.initialCircles);
        Rect rect = this.padding;
        googleMapController.setPadding(rect.top, rect.left, rect.bottom, rect.right);
        googleMapController.setInitialTileOverlays(this.initialTileOverlays);
        return googleMapController;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setBuildingsEnabled(boolean z10) {
        this.buildingsEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setCameraTargetBounds(LatLngBounds latLngBounds) {
        this.options.E1(latLngBounds);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setCompassEnabled(boolean z10) {
        this.options.v1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setIndoorEnabled(boolean z10) {
        this.indoorEnabled = z10;
    }

    public void setInitialCameraPosition(CameraPosition cameraPosition) {
        this.options.u1(cameraPosition);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialCircles(Object obj) {
        this.initialCircles = obj;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialMarkers(Object obj) {
        this.initialMarkers = obj;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialPolygons(Object obj) {
        this.initialPolygons = obj;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialPolylines(Object obj) {
        this.initialPolylines = obj;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialTileOverlays(List<Map<String, ?>> list) {
        this.initialTileOverlays = list;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setLiteModeEnabled(boolean z10) {
        this.options.F1(z10);
    }

    public void setMapId(String str) {
        this.options.G1(str);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapToolbarEnabled(boolean z10) {
        this.options.H1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapType(int i10) {
        this.options.I1(i10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMinMaxZoomPreference(Float f10, Float f11) {
        if (f10 != null) {
            this.options.K1(f10.floatValue());
        }
        if (f11 != null) {
            this.options.J1(f11.floatValue());
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMyLocationButtonEnabled(boolean z10) {
        this.myLocationButtonEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMyLocationEnabled(boolean z10) {
        this.myLocationEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setPadding(float f10, float f11, float f12, float f13) {
        this.padding = new Rect((int) f11, (int) f10, (int) f13, (int) f12);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setRotateGesturesEnabled(boolean z10) {
        this.options.L1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setScrollGesturesEnabled(boolean z10) {
        this.options.M1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTiltGesturesEnabled(boolean z10) {
        this.options.N1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTrackCameraPosition(boolean z10) {
        this.trackCameraPosition = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTrafficEnabled(boolean z10) {
        this.trafficEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setZoomControlsEnabled(boolean z10) {
        this.options.O1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setZoomGesturesEnabled(boolean z10) {
        this.options.P1(z10);
    }
}
