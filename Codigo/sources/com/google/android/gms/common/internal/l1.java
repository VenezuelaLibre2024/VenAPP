package com.google.android.gms.common.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class l1 extends w0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f9601g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, null);
        this.f9601g = cVar;
    }

    @Override // com.google.android.gms.common.internal.w0
    protected final void f(ca.b bVar) {
        if (this.f9601g.enableLocalFallback() && c.zzo(this.f9601g)) {
            c.zzk(this.f9601g, 16);
        } else {
            this.f9601g.zzc.c(bVar);
            this.f9601g.onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.w0
    protected final boolean g() {
        this.f9601g.zzc.c(ca.b.f6941e);
        return true;
    }
}
