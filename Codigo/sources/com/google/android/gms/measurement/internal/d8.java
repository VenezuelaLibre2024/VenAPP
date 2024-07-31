package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ y6 f10072a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f10073b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f10074c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f10075d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y6 f10076e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ b7 f10077f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d8(b7 b7Var, y6 y6Var, long j10, long j11, boolean z10, y6 y6Var2) {
        this.f10077f = b7Var;
        this.f10072a = y6Var;
        this.f10073b = j10;
        this.f10074c = j11;
        this.f10075d = z10;
        this.f10076e = y6Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10077f.E(this.f10072a);
        this.f10077f.z(this.f10073b, false);
        b7.G(this.f10077f, this.f10072a, this.f10074c, true, this.f10075d);
        if (zzps.zza() && this.f10077f.a().n(e0.f10136x0)) {
            b7.H(this.f10077f, this.f10072a, this.f10076e);
        }
    }
}
