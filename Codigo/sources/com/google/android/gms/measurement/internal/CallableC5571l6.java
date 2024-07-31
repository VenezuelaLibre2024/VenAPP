package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import p418wa.C12097c;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
/* loaded from: classes2.dex */
final class CallableC5571l6 implements Callable<C12097c> {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11522a;

    /* renamed from: b */
    private final /* synthetic */ BinderC5428a6 f11523b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC5571l6(BinderC5428a6 binderC5428a6, C5576lb c5576lb) {
        this.f11523b = binderC5428a6;
        this.f11522a = c5576lb;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C12097c call() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11523b.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11523b.f11073a;
        return new C12097c(c5705va2.m14454b(this.f11522a.f11553a));
    }
}
