package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zznp;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
/* loaded from: classes2.dex */
final class RunnableC5584m6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11589a;

    /* renamed from: b */
    private final /* synthetic */ BinderC5428a6 f11590b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5584m6(BinderC5428a6 binderC5428a6, C5576lb c5576lb) {
        this.f11590b = binderC5428a6;
        this.f11589a = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11590b.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11590b.f11073a;
        C5576lb c5576lb = this.f11589a;
        c5705va2.zzl().mo13687i();
        c5705va2.m14465k0();
        C5276s.m13320f(c5576lb.f11553a);
        C5737y6 m14575f = C5737y6.m14575f(c5576lb.f11544G, (zznp.zza() && c5705va2.m14451X().m13900n(C5474e0.f11246T0)) ? c5576lb.f11549L : 100);
        C5737y6 m14444L = c5705va2.m14444L(c5576lb.f11553a);
        c5705va2.zzj().m14186F().m14220c("Setting consent, package, consent", c5576lb.f11553a, m14575f);
        c5705va2.m14480x(c5576lb.f11553a, m14575f);
        if (m14575f.m14591t(m14444L)) {
            c5705va2.m14450W(c5576lb);
        }
        if (zznp.zza() && c5705va2.m14451X().m13900n(C5474e0.f11246T0)) {
            C5694v m14365c = C5694v.m14365c(c5576lb.f11550M);
            if (C5694v.f11882f.equals(m14365c)) {
                return;
            }
            c5705va2.zzj().m14186F().m14220c("Setting DMA consent. package, consent", c5576lb.f11553a, m14365c);
            c5705va2.m14479w(c5576lb.f11553a, m14365c);
        }
    }
}
