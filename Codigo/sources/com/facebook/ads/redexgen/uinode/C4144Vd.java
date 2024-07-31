package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Vd */
/* loaded from: assets/audience_network.dex */
public final class C4144Vd implements InterfaceC3284Hd {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3284Hd
    public final C4143Vc A4c(Looper looper, Handler.Callback callback) {
        return new C4143Vc(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3284Hd
    public final long A5T() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3284Hd
    public final long AGs() {
        return SystemClock.uptimeMillis();
    }
}
