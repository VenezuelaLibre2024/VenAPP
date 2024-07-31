package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
interface GoogleMapOptionsSink {
    void setBuildingsEnabled(boolean z10);

    void setCameraTargetBounds(LatLngBounds latLngBounds);

    void setCompassEnabled(boolean z10);

    void setIndoorEnabled(boolean z10);

    void setInitialCircles(Object obj);

    void setInitialMarkers(Object obj);

    void setInitialPolygons(Object obj);

    void setInitialPolylines(Object obj);

    void setInitialTileOverlays(List<Map<String, ?>> list);

    void setLiteModeEnabled(boolean z10);

    void setMapToolbarEnabled(boolean z10);

    void setMapType(int i10);

    void setMinMaxZoomPreference(Float f10, Float f11);

    void setMyLocationButtonEnabled(boolean z10);

    void setMyLocationEnabled(boolean z10);

    void setPadding(float f10, float f11, float f12, float f13);

    void setRotateGesturesEnabled(boolean z10);

    void setScrollGesturesEnabled(boolean z10);

    void setTiltGesturesEnabled(boolean z10);

    void setTrackCameraPosition(boolean z10);

    void setTrafficEnabled(boolean z10);

    void setZoomControlsEnabled(boolean z10);

    void setZoomGesturesEnabled(boolean z10);
}
