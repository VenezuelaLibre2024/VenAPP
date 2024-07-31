package com.google.android.gms.ads.internal.client;

import p438x8.C12369j;
import p438x8.InterfaceC12382t;

/* renamed from: com.google.android.gms.ads.internal.client.h4 */
/* loaded from: classes.dex */
public final class BinderC4837h4 extends AbstractBinderC4835h2 {

    /* renamed from: a */
    private final InterfaceC12382t f9748a;

    public BinderC4837h4(InterfaceC12382t interfaceC12382t) {
        this.f9748a = interfaceC12382t;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4842i2
    /* renamed from: x1 */
    public final void mo12402x1(C4796b5 c4796b5) {
        InterfaceC12382t interfaceC12382t = this.f9748a;
        if (interfaceC12382t != null) {
            interfaceC12382t.onPaidEvent(C12369j.m40014d(c4796b5.f9699b, c4796b5.f9700c, c4796b5.f9701d));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4842i2
    public final boolean zzf() {
        return this.f9748a == null;
    }
}
