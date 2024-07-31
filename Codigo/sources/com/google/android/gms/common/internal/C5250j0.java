package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.InterfaceC5131f;
import com.google.android.gms.common.internal.AbstractC5228c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.j0 */
/* loaded from: classes.dex */
public final class C5250j0 implements AbstractC5228c.a {

    /* renamed from: a */
    final /* synthetic */ InterfaceC5131f f10708a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5250j0(InterfaceC5131f interfaceC5131f) {
        this.f10708a = interfaceC5131f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c.a
    public final void onConnected(Bundle bundle) {
        this.f10708a.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c.a
    public final void onConnectionSuspended(int i10) {
        this.f10708a.onConnectionSuspended(i10);
    }
}
