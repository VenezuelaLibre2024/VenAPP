package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g8 */
/* loaded from: classes2.dex */
public final class RunnableC5508g8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5737y6 f11371a;

    /* renamed from: b */
    private final /* synthetic */ long f11372b;

    /* renamed from: c */
    private final /* synthetic */ boolean f11373c;

    /* renamed from: d */
    private final /* synthetic */ C5737y6 f11374d;

    /* renamed from: e */
    private final /* synthetic */ C5442b7 f11375e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5508g8(C5442b7 c5442b7, C5737y6 c5737y6, long j10, boolean z10, C5737y6 c5737y62) {
        this.f11375e = c5442b7;
        this.f11371a = c5737y6;
        this.f11372b = j10;
        this.f11373c = z10;
        this.f11374d = c5737y62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11375e.m13656E(this.f11371a);
        C5442b7.m13641G(this.f11375e, this.f11371a, this.f11372b, false, this.f11373c);
        if (zzps.zza() && this.f11375e.mo13672a().m13900n(C5474e0.f11308x0)) {
            C5442b7.m13642H(this.f11375e, this.f11371a, this.f11374d);
        }
    }
}
