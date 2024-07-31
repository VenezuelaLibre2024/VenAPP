package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d8 */
/* loaded from: classes2.dex */
public final class RunnableC5469d8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5737y6 f11192a;

    /* renamed from: b */
    private final /* synthetic */ long f11193b;

    /* renamed from: c */
    private final /* synthetic */ long f11194c;

    /* renamed from: d */
    private final /* synthetic */ boolean f11195d;

    /* renamed from: e */
    private final /* synthetic */ C5737y6 f11196e;

    /* renamed from: f */
    private final /* synthetic */ C5442b7 f11197f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5469d8(C5442b7 c5442b7, C5737y6 c5737y6, long j10, long j11, boolean z10, C5737y6 c5737y62) {
        this.f11197f = c5442b7;
        this.f11192a = c5737y6;
        this.f11193b = j10;
        this.f11194c = j11;
        this.f11195d = z10;
        this.f11196e = c5737y62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11197f.m13656E(this.f11192a);
        this.f11197f.m13707z(this.f11193b, false);
        C5442b7.m13641G(this.f11197f, this.f11192a, this.f11194c, true, this.f11195d);
        if (zzps.zza() && this.f11197f.mo13672a().m13900n(C5474e0.f11308x0)) {
            C5442b7.m13642H(this.f11197f, this.f11192a, this.f11196e);
        }
    }
}
