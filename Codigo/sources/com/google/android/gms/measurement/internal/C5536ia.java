package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ia */
/* loaded from: classes2.dex */
public final class C5536ia {

    /* renamed from: a */
    private RunnableC5523ha f11464a;

    /* renamed from: b */
    final /* synthetic */ C5471da f11465b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5536ia(C5471da c5471da) {
        this.f11465b = c5471da;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m13968a() {
        Handler handler;
        this.f11465b.mo13687i();
        if (this.f11464a != null) {
            handler = this.f11465b.f11201c;
            handler.removeCallbacks(this.f11464a);
        }
        this.f11465b.mo13679e().f12068s.m13639a(false);
        this.f11465b.m13728y(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m13969b(long j10) {
        Handler handler;
        this.f11464a = new RunnableC5523ha(this, this.f11465b.zzb().mo28130a(), j10);
        handler = this.f11465b.f11201c;
        handler.postDelayed(this.f11464a, 2000L);
    }
}
