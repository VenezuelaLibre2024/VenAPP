package com.google.android.gms.ads.internal.client;

import p080e9.InterfaceC7135a;

/* renamed from: com.google.android.gms.ads.internal.client.h3 */
/* loaded from: classes.dex */
final class C4836h3 implements InterfaceC7135a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4836h3(C4868m3 c4868m3) {
    }

    @Override // p080e9.InterfaceC7135a
    public final String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    @Override // p080e9.InterfaceC7135a
    public final InterfaceC7135a.a getInitializationState() {
        return InterfaceC7135a.a.READY;
    }

    @Override // p080e9.InterfaceC7135a
    public final int getLatency() {
        return 0;
    }
}
