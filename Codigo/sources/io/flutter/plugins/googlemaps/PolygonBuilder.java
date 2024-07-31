package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;
import java.util.List;
import ua.r;

/* loaded from: classes3.dex */
class PolygonBuilder implements PolygonOptionsSink {
    private boolean consumeTapEvents;
    private final float density;
    private final r polygonOptions = new r();

    /* JADX INFO: Access modifiers changed from: package-private */
    public PolygonBuilder(float f10) {
        this.density = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r build() {
        return this.polygonOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.polygonOptions.w1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setFillColor(int i10) {
        this.polygonOptions.x1(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setGeodesic(boolean z10) {
        this.polygonOptions.y1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setHoles(List<List<LatLng>> list) {
        Iterator<List<LatLng>> it = list.iterator();
        while (it.hasNext()) {
            this.polygonOptions.v1(it.next());
        }
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setPoints(List<LatLng> list) {
        this.polygonOptions.u1(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setStrokeColor(int i10) {
        this.polygonOptions.J1(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setStrokeWidth(float f10) {
        this.polygonOptions.K1(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setVisible(boolean z10) {
        this.polygonOptions.L1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setZIndex(float f10) {
        this.polygonOptions.M1(f10);
    }
}
