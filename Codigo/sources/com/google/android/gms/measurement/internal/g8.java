package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ y6 f10199a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f10200b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f10201c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ y6 f10202d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ b7 f10203e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g8(b7 b7Var, y6 y6Var, long j10, boolean z10, y6 y6Var2) {
        this.f10203e = b7Var;
        this.f10199a = y6Var;
        this.f10200b = j10;
        this.f10201c = z10;
        this.f10202d = y6Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10203e.E(this.f10199a);
        b7.G(this.f10203e, this.f10199a, this.f10200b, false, this.f10201c);
        if (zzps.zza() && this.f10203e.a().n(e0.f10136x0)) {
            b7.H(this.f10203e, this.f10199a, this.f10202d);
        }
    }
}
