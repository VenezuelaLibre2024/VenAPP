package com.google.android.gms.ads.internal.client;

import p252n9.InterfaceC9683a;

/* renamed from: com.google.android.gms.ads.internal.client.g4 */
/* loaded from: classes.dex */
public final class BinderC4830g4 extends AbstractBinderC4814e2 {

    /* renamed from: a */
    private final InterfaceC9683a f9745a;

    public BinderC4830g4(InterfaceC9683a interfaceC9683a) {
        this.f9745a = interfaceC9683a;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4821f2
    public final void zze() {
        InterfaceC9683a interfaceC9683a = this.f9745a;
        if (interfaceC9683a != null) {
            interfaceC9683a.onAdMetadataChanged();
        }
    }
}
