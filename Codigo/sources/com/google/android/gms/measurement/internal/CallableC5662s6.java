package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.s6 */
/* loaded from: classes2.dex */
final class CallableC5662s6 implements Callable<List<C5550jb>> {

    /* renamed from: a */
    private final /* synthetic */ String f11821a;

    /* renamed from: b */
    private final /* synthetic */ BinderC5428a6 f11822b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC5662s6(BinderC5428a6 binderC5428a6, String str) {
        this.f11822b = binderC5428a6;
        this.f11821a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C5550jb> call() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11822b.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11822b.f11073a;
        return c5705va2.m14452Z().m14120H0(this.f11821a);
    }
}
