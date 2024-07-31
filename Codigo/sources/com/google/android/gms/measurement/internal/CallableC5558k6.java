package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.k6 */
/* loaded from: classes2.dex */
final class CallableC5558k6 implements Callable<List<C5460d>> {

    /* renamed from: a */
    private final /* synthetic */ String f11503a;

    /* renamed from: b */
    private final /* synthetic */ String f11504b;

    /* renamed from: c */
    private final /* synthetic */ String f11505c;

    /* renamed from: d */
    private final /* synthetic */ BinderC5428a6 f11506d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC5558k6(BinderC5428a6 binderC5428a6, String str, String str2, String str3) {
        this.f11506d = binderC5428a6;
        this.f11503a = str;
        this.f11504b = str2;
        this.f11505c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C5460d> call() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11506d.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11506d.f11073a;
        return c5705va2.m14452Z().m14127M(this.f11503a, this.f11504b, this.f11505c);
    }
}
