package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzpm;

/* loaded from: classes2.dex */
public final class ha implements Runnable {

    /* renamed from: a */
    long f10233a;

    /* renamed from: b */
    long f10234b;

    /* renamed from: c */
    final /* synthetic */ ia f10235c;

    public ha(ia iaVar, long j10, long j11) {
        this.f10235c = iaVar;
        this.f10233a = j10;
        this.f10234b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10235c.f10293b.zzl().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.ka
            public /* synthetic */ ka() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ha haVar = ha.this;
                ia iaVar = haVar.f10235c;
                long j10 = haVar.f10233a;
                long j11 = haVar.f10234b;
                iaVar.f10293b.i();
                iaVar.f10293b.zzj().A().a("Application going to the background");
                iaVar.f10293b.e().f10853s.a(true);
                iaVar.f10293b.y(true);
                if (!iaVar.f10293b.a().L()) {
                    iaVar.f10293b.f10084f.e(j11);
                    iaVar.f10293b.z(false, false, j11);
                }
                if (zzpm.zza() && iaVar.f10293b.a().n(e0.K0)) {
                    iaVar.f10293b.zzj().E().b("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
                } else {
                    iaVar.f10293b.m().N("auto", "_ab", j10, new Bundle());
                }
            }
        });
    }
}
