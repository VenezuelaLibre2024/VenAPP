package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import ua.b;
import ua.m;

/* loaded from: classes3.dex */
class MarkerController implements MarkerOptionsSink {
    private boolean consumeTapEvents;
    private final String googleMapsMarkerId;
    private final m marker;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MarkerController(m mVar, boolean z10) {
        this.marker = mVar;
        this.consumeTapEvents = z10;
        this.googleMapsMarkerId = mVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getGoogleMapsMarkerId() {
        return this.googleMapsMarkerId;
    }

    public void hideInfoWindow() {
        this.marker.c();
    }

    public boolean isInfoWindowShown() {
        return this.marker.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void remove() {
        this.marker.e();
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setAlpha(float f10) {
        this.marker.f(f10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setAnchor(float f10, float f11) {
        this.marker.g(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setDraggable(boolean z10) {
        this.marker.h(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setFlat(boolean z10) {
        this.marker.i(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setIcon(b bVar) {
        this.marker.j(bVar);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setInfoWindowAnchor(float f10, float f11) {
        this.marker.k(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setInfoWindowText(String str, String str2) {
        this.marker.o(str);
        this.marker.n(str2);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setPosition(LatLng latLng) {
        this.marker.l(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setRotation(float f10) {
        this.marker.m(f10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setVisible(boolean z10) {
        this.marker.p(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setZIndex(float f10) {
        this.marker.q(f10);
    }

    public void showInfoWindow() {
        this.marker.r();
    }
}
