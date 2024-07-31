package com.google.android.gms.ads.internal.client;

import p438x8.C12357d;
import p438x8.InterfaceC12381s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.j3 */
/* loaded from: classes.dex */
public final class BinderC4850j3 extends AbstractBinderC4786a2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ BinderC4850j3(C4843i3 c4843i3) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4800c2
    public final void zze(C4801c3 c4801c3) {
        InterfaceC12381s interfaceC12381s;
        interfaceC12381s = C4868m3.m12412h().f9781g;
        if (interfaceC12381s != null) {
            interfaceC12381s.onAdInspectorClosed(c4801c3 == null ? null : new C12357d(c4801c3.f9703a, c4801c3.f9704b, c4801c3.f9705c));
        }
    }
}
