package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import ua.e;
import ua.o;

/* loaded from: classes3.dex */
interface PolylineOptionsSink {
    void setColor(int i10);

    void setConsumeTapEvents(boolean z10);

    void setEndCap(e eVar);

    void setGeodesic(boolean z10);

    void setJointType(int i10);

    void setPattern(List<o> list);

    void setPoints(List<LatLng> list);

    void setStartCap(e eVar);

    void setVisible(boolean z10);

    void setWidth(float f10);

    void setZIndex(float f10);
}
