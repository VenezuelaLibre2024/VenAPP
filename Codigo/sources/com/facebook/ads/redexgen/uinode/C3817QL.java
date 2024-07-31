package com.facebook.ads.redexgen.uinode;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.QL */
/* loaded from: assets/audience_network.dex */
public final class C3817QL extends ContentObserver {
    public final C3824QS A00;

    public C3817QL(Handler handler, C3824QS c3824qs) {
        super(handler);
        this.A00 = c3824qs;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0a();
    }
}
