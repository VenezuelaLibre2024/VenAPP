package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.h6 */
/* loaded from: classes2.dex */
final class CallableC5519h6 implements Callable<List<C5460d>> {

    /* renamed from: a */
    private final /* synthetic */ String f11395a;

    /* renamed from: b */
    private final /* synthetic */ String f11396b;

    /* renamed from: c */
    private final /* synthetic */ String f11397c;

    /* renamed from: d */
    private final /* synthetic */ BinderC5428a6 f11398d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC5519h6(BinderC5428a6 binderC5428a6, String str, String str2, String str3) {
        this.f11398d = binderC5428a6;
        this.f11395a = str;
        this.f11396b = str2;
        this.f11397c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C5460d> call() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11398d.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11398d.f11073a;
        return c5705va2.m14452Z().m14127M(this.f11395a, this.f11396b, this.f11397c);
    }
}
