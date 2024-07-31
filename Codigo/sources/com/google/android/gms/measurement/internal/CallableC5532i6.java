package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.i6 */
/* loaded from: classes2.dex */
final class CallableC5532i6 implements Callable<List<C5550jb>> {

    /* renamed from: a */
    private final /* synthetic */ String f11447a;

    /* renamed from: b */
    private final /* synthetic */ String f11448b;

    /* renamed from: c */
    private final /* synthetic */ String f11449c;

    /* renamed from: d */
    private final /* synthetic */ BinderC5428a6 f11450d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC5532i6(BinderC5428a6 binderC5428a6, String str, String str2, String str3) {
        this.f11450d = binderC5428a6;
        this.f11447a = str;
        this.f11448b = str2;
        this.f11449c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C5550jb> call() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11450d.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11450d.f11073a;
        return c5705va2.m14452Z().m14151t0(this.f11447a, this.f11448b, this.f11449c);
    }
}
