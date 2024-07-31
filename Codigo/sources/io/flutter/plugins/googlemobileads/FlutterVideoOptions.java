package io.flutter.plugins.googlemobileads;

import x8.c0;

/* loaded from: classes3.dex */
class FlutterVideoOptions {
    final Boolean clickToExpandRequested;
    final Boolean customControlsRequested;
    final Boolean startMuted;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterVideoOptions(Boolean bool, Boolean bool2, Boolean bool3) {
        this.clickToExpandRequested = bool;
        this.customControlsRequested = bool2;
        this.startMuted = bool3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0 asVideoOptions() {
        c0.a aVar = new c0.a();
        Boolean bool = this.clickToExpandRequested;
        if (bool != null) {
            aVar.b(bool.booleanValue());
        }
        Boolean bool2 = this.customControlsRequested;
        if (bool2 != null) {
            aVar.c(bool2.booleanValue());
        }
        Boolean bool3 = this.startMuted;
        if (bool3 != null) {
            aVar.d(bool3.booleanValue());
        }
        return aVar.a();
    }
}
