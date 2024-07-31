package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import ua.f;

/* loaded from: classes3.dex */
class CircleController implements CircleOptionsSink {
    private final f circle;
    private boolean consumeTapEvents;
    private final float density;
    private final String googleMapsCircleId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CircleController(f fVar, boolean z10, float f10) {
        this.circle = fVar;
        this.consumeTapEvents = z10;
        this.density = f10;
        this.googleMapsCircleId = fVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getGoogleMapsCircleId() {
        return this.googleMapsCircleId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void remove() {
        this.circle.b();
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setCenter(LatLng latLng) {
        this.circle.c(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.circle.d(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setFillColor(int i10) {
        this.circle.e(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setRadius(double d10) {
        this.circle.f(d10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeColor(int i10) {
        this.circle.g(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeWidth(float f10) {
        this.circle.h(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setVisible(boolean z10) {
        this.circle.i(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setZIndex(float f10) {
        this.circle.j(f10);
    }
}
