package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzpm;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ha */
/* loaded from: classes2.dex */
public final class RunnableC5523ha implements Runnable {

    /* renamed from: a */
    long f11405a;

    /* renamed from: b */
    long f11406b;

    /* renamed from: c */
    final /* synthetic */ C5536ia f11407c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5523ha(C5536ia c5536ia, long j10, long j11) {
        this.f11407c = c5536ia;
        this.f11405a = j10;
        this.f11406b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11407c.f11465b.zzl().m14248y(new Runnable() { // from class: com.google.android.gms.measurement.internal.ka
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC5523ha runnableC5523ha = RunnableC5523ha.this;
                C5536ia c5536ia = runnableC5523ha.f11407c;
                long j10 = runnableC5523ha.f11405a;
                long j11 = runnableC5523ha.f11406b;
                c5536ia.f11465b.mo13687i();
                c5536ia.f11465b.zzj().m14181A().m14218a("Application going to the background");
                c5536ia.f11465b.mo13679e().f12068s.m13639a(true);
                c5536ia.f11465b.m13728y(true);
                if (!c5536ia.f11465b.mo13672a().m13892L()) {
                    c5536ia.f11465b.f11204f.m14061e(j11);
                    c5536ia.f11465b.m13729z(false, false, j11);
                }
                if (zzpm.zza() && c5536ia.f11465b.mo13672a().m13900n(C5474e0.f11228K0)) {
                    c5536ia.f11465b.zzj().m14185E().m14219b("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
                } else {
                    c5536ia.f11465b.mo13695m().m13660N("auto", "_ab", j10, new Bundle());
                }
            }
        });
    }
}
