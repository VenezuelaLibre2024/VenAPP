package com.google.android.gms.ads.internal.client;

/* loaded from: classes.dex */
public final class q4 extends j0 {

    /* renamed from: a, reason: collision with root package name */
    private final x8.f f8730a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8731b;

    public q4(x8.f fVar, Object obj) {
        this.f8730a = fVar;
        this.f8731b = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.k0
    public final void zzb(c3 c3Var) {
        x8.f fVar = this.f8730a;
        if (fVar != null) {
            fVar.onAdFailedToLoad(c3Var.v1());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.k0
    public final void zzc() {
        Object obj;
        x8.f fVar = this.f8730a;
        if (fVar == null || (obj = this.f8731b) == null) {
            return;
        }
        fVar.onAdLoaded(obj);
    }
}
