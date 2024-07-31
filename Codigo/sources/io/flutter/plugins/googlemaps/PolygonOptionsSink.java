package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes3.dex */
interface PolygonOptionsSink {
    void setConsumeTapEvents(boolean z10);

    void setFillColor(int i10);

    void setGeodesic(boolean z10);

    void setHoles(List<List<LatLng>> list);

    void setPoints(List<LatLng> list);

    void setStrokeColor(int i10);

    void setStrokeWidth(float f10);

    void setVisible(boolean z10);

    void setZIndex(float f10);
}
