package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import ua.b;

/* loaded from: classes3.dex */
interface MarkerOptionsSink {
    void setAlpha(float f10);

    void setAnchor(float f10, float f11);

    void setConsumeTapEvents(boolean z10);

    void setDraggable(boolean z10);

    void setFlat(boolean z10);

    void setIcon(b bVar);

    void setInfoWindowAnchor(float f10, float f11);

    void setInfoWindowText(String str, String str2);

    void setPosition(LatLng latLng);

    void setRotation(float f10);

    void setVisible(boolean z10);

    void setZIndex(float f10);
}
