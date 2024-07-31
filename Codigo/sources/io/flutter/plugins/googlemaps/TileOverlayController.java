package io.flutter.plugins.googlemaps;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.HashMap;
import java.util.Map;
import ua.b0;
import ua.d0;

/* loaded from: classes3.dex */
class TileOverlayController implements TileOverlaySink {
    private final b0 tileOverlay;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TileOverlayController(b0 b0Var) {
        this.tileOverlay = b0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearTileCache() {
        this.tileOverlay.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> getTileOverlayInfo() {
        HashMap hashMap = new HashMap();
        hashMap.put("fadeIn", Boolean.valueOf(this.tileOverlay.b()));
        hashMap.put("transparency", Float.valueOf(this.tileOverlay.d()));
        hashMap.put(FacebookMediationAdapter.KEY_ID, this.tileOverlay.c());
        hashMap.put("zIndex", Float.valueOf(this.tileOverlay.e()));
        hashMap.put("visible", Boolean.valueOf(this.tileOverlay.f()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void remove() {
        this.tileOverlay.g();
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setFadeIn(boolean z10) {
        this.tileOverlay.h(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTileProvider(d0 d0Var) {
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTransparency(float f10) {
        this.tileOverlay.i(f10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setVisible(boolean z10) {
        this.tileOverlay.j(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setZIndex(float f10) {
        this.tileOverlay.k(f10);
    }
}
