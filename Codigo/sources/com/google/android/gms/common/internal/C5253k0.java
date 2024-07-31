package com.google.android.gms.common.internal;

import ca.C1894b;
import com.google.android.gms.common.api.internal.InterfaceC5161n;
import com.google.android.gms.common.internal.AbstractC5228c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.k0 */
/* loaded from: classes.dex */
public final class C5253k0 implements AbstractC5228c.b {

    /* renamed from: a */
    final /* synthetic */ InterfaceC5161n f10711a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5253k0(InterfaceC5161n interfaceC5161n) {
        this.f10711a = interfaceC5161n;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c.b
    public final void onConnectionFailed(C1894b c1894b) {
        this.f10711a.onConnectionFailed(c1894b);
    }
}
