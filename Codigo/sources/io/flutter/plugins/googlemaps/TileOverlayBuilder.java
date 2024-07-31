package io.flutter.plugins.googlemaps;

import ua.c0;
import ua.d0;

/* loaded from: classes3.dex */
class TileOverlayBuilder implements TileOverlaySink {
    private final c0 tileOverlayOptions = new c0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0 build() {
        return this.tileOverlayOptions;
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setFadeIn(boolean z10) {
        this.tileOverlayOptions.u1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTileProvider(d0 d0Var) {
        this.tileOverlayOptions.z1(d0Var);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTransparency(float f10) {
        this.tileOverlayOptions.A1(f10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setVisible(boolean z10) {
        this.tileOverlayOptions.B1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setZIndex(float f10) {
        this.tileOverlayOptions.C1(f10);
    }
}
