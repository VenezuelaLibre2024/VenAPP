package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import ua.e;
import ua.o;
import ua.t;

/* loaded from: classes3.dex */
class PolylineBuilder implements PolylineOptionsSink {
    private boolean consumeTapEvents;
    private final float density;
    private final t polylineOptions = new t();

    /* JADX INFO: Access modifiers changed from: package-private */
    public PolylineBuilder(float f10) {
        this.density = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t build() {
        return this.polylineOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setColor(int i10) {
        this.polylineOptions.w1(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.polylineOptions.v1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setEndCap(e eVar) {
        this.polylineOptions.x1(eVar);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setGeodesic(boolean z10) {
        this.polylineOptions.y1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setJointType(int i10) {
        this.polylineOptions.K1(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setPattern(List<o> list) {
        this.polylineOptions.L1(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setPoints(List<LatLng> list) {
        this.polylineOptions.u1(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setStartCap(e eVar) {
        this.polylineOptions.M1(eVar);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setVisible(boolean z10) {
        this.polylineOptions.N1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setWidth(float f10) {
        this.polylineOptions.O1(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setZIndex(float f10) {
        this.polylineOptions.P1(f10);
    }
}
