package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import ua.g;

/* loaded from: classes3.dex */
class CircleBuilder implements CircleOptionsSink {
    private final g circleOptions = new g();
    private boolean consumeTapEvents;
    private final float density;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CircleBuilder(float f10) {
        this.density = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g build() {
        return this.circleOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setCenter(LatLng latLng) {
        this.circleOptions.u1(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.circleOptions.v1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setFillColor(int i10) {
        this.circleOptions.w1(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setRadius(double d10) {
        this.circleOptions.G1(d10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeColor(int i10) {
        this.circleOptions.H1(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeWidth(float f10) {
        this.circleOptions.I1(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setVisible(boolean z10) {
        this.circleOptions.J1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setZIndex(float f10) {
        this.circleOptions.K1(f10);
    }
}
