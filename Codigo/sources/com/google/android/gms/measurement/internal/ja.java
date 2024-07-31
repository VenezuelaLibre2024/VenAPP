package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoh;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ja {

    /* renamed from: a, reason: collision with root package name */
    private long f10314a;

    /* renamed from: b, reason: collision with root package name */
    protected long f10315b;

    /* renamed from: c, reason: collision with root package name */
    private final u f10316c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ da f10317d;

    public ja(da daVar) {
        this.f10317d = daVar;
        this.f10316c = new ma(this, daVar.f10701a);
        long b10 = daVar.zzb().b();
        this.f10314a = b10;
        this.f10315b = b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(ja jaVar) {
        jaVar.f10317d.i();
        jaVar.d(false, false, jaVar.f10317d.zzb().b());
        jaVar.f10317d.j().q(jaVar.f10317d.zzb().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j10) {
        long j11 = j10 - this.f10315b;
        this.f10315b = j10;
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f10316c.a();
        this.f10314a = 0L;
        this.f10315b = 0L;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f10317d.i();
        this.f10317d.q();
        if (!zzoh.zza() || !this.f10317d.a().n(e0.f10122q0) || this.f10317d.f10701a.k()) {
            this.f10317d.e().f10850p.b(this.f10317d.zzb().a());
        }
        long j11 = j10 - this.f10314a;
        if (!z10 && j11 < 1000) {
            this.f10317d.zzj().F().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = a(j10);
        }
        this.f10317d.zzj().F().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        ib.R(this.f10317d.n().x(!this.f10317d.a().L()), bundle, true);
        if (!z11) {
            this.f10317d.m().u0("auto", "_e", bundle);
        }
        this.f10314a = j10;
        this.f10316c.a();
        this.f10316c.b(3600000L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(long j10) {
        this.f10316c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(long j10) {
        this.f10317d.i();
        this.f10316c.a();
        this.f10314a = j10;
        this.f10315b = j10;
    }
}
