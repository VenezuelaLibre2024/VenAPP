package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.q6 */
/* loaded from: classes2.dex */
final class CallableC5636q6 implements Callable<byte[]> {

    /* renamed from: a */
    private final /* synthetic */ C5461d0 f11737a;

    /* renamed from: b */
    private final /* synthetic */ String f11738b;

    /* renamed from: c */
    private final /* synthetic */ BinderC5428a6 f11739c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC5636q6(BinderC5428a6 binderC5428a6, C5461d0 c5461d0, String str) {
        this.f11739c = binderC5428a6;
        this.f11737a = c5461d0;
        this.f11738b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11739c.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11739c.f11073a;
        return c5705va2.m14459e0().m14195t(this.f11737a, this.f11738b);
    }
}
