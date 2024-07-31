package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ja */
/* loaded from: classes2.dex */
public final class C5549ja {

    /* renamed from: a */
    private long f11486a;

    /* renamed from: b */
    protected long f11487b;

    /* renamed from: c */
    private final AbstractC5681u f11488c;

    /* renamed from: d */
    final /* synthetic */ C5471da f11489d;

    public C5549ja(C5471da c5471da) {
        this.f11489d = c5471da;
        this.f11488c = new C5588ma(this, c5471da.f11899a);
        long mo28131b = c5471da.zzb().mo28131b();
        this.f11486a = mo28131b;
        this.f11487b = mo28131b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m14057c(C5549ja c5549ja) {
        c5549ja.f11489d.mo13687i();
        c5549ja.m14060d(false, false, c5549ja.f11489d.zzb().mo28131b());
        c5549ja.f11489d.mo13689j().m14535q(c5549ja.f11489d.zzb().mo28131b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m14058a(long j10) {
        long j11 = j10 - this.f11487b;
        this.f11487b = j10;
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m14059b() {
        this.f11488c.m14350a();
        this.f11486a = 0L;
        this.f11487b = 0L;
    }

    /* renamed from: d */
    public final boolean m14060d(boolean z10, boolean z11, long j10) {
        this.f11489d.mo13687i();
        this.f11489d.m14545q();
        if (!zzoh.zza() || !this.f11489d.mo13672a().m13900n(C5474e0.f11294q0) || this.f11489d.f11899a.m14512k()) {
            this.f11489d.mo13679e().f12065p.m13721b(this.f11489d.zzb().mo28130a());
        }
        long j11 = j10 - this.f11486a;
        if (!z10 && j11 < 1000) {
            this.f11489d.zzj().m14186F().m14219b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = m14058a(j10);
        }
        this.f11489d.zzj().m14186F().m14219b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        C5537ib.m13982R(this.f11489d.mo13697n().m14213x(!this.f11489d.mo13672a().m13892L()), bundle, true);
        if (!z11) {
            this.f11489d.mo13695m().m13703u0("auto", "_e", bundle);
        }
        this.f11486a = j10;
        this.f11488c.m14350a();
        this.f11488c.m14351b(3600000L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m14061e(long j10) {
        this.f11488c.m14350a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m14062f(long j10) {
        this.f11489d.mo13687i();
        this.f11488c.m14350a();
        this.f11486a = j10;
        this.f11487b = j10;
    }
}
