package com.google.android.gms.ads.internal.client;

import e9.a;

/* loaded from: classes.dex */
final class h3 implements e9.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h3(m3 m3Var) {
    }

    @Override // e9.a
    public final String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    @Override // e9.a
    public final a.EnumC0222a getInitializationState() {
        return a.EnumC0222a.READY;
    }

    @Override // e9.a
    public final int getLatency() {
        return 0;
    }
}
