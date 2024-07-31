package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.measurement.internal.c6 */
/* loaded from: classes2.dex */
final class RunnableC5454c6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11149a;

    /* renamed from: b */
    private final /* synthetic */ BinderC5428a6 f11150b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5454c6(BinderC5428a6 binderC5428a6, C5576lb c5576lb) {
        this.f11150b = binderC5428a6;
        this.f11149a = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11150b.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11150b.f11073a;
        C5576lb c5576lb = this.f11149a;
        c5705va2.zzl().mo13687i();
        c5705va2.m14465k0();
        C5276s.m13320f(c5576lb.f11553a);
        c5705va2.m14457d(c5576lb);
    }
}
