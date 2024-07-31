package com.google.android.gms.ads.internal.client;

/* loaded from: classes.dex */
public final class h4 extends h2 {

    /* renamed from: a, reason: collision with root package name */
    private final x8.t f8671a;

    public h4(x8.t tVar) {
        this.f8671a = tVar;
    }

    @Override // com.google.android.gms.ads.internal.client.i2
    public final void x1(b5 b5Var) {
        x8.t tVar = this.f8671a;
        if (tVar != null) {
            tVar.onPaidEvent(x8.j.d(b5Var.f8622b, b5Var.f8623c, b5Var.f8624d));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.i2
    public final boolean zzf() {
        return this.f8671a == null;
    }
}
