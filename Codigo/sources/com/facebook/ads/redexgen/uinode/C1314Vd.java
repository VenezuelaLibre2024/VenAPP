package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1314Vd implements InterfaceC0958Hd {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0958Hd
    public final C1313Vc A4c(Looper looper, Handler.Callback callback) {
        return new C1313Vc(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0958Hd
    public final long A5T() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0958Hd
    public final long AGs() {
        return SystemClock.uptimeMillis();
    }
}
