package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j6 */
/* loaded from: classes2.dex */
final class RunnableC5545j6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11480a;

    /* renamed from: b */
    private final /* synthetic */ BinderC5428a6 f11481b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5545j6(BinderC5428a6 binderC5428a6, C5576lb c5576lb) {
        this.f11481b = binderC5428a6;
        this.f11480a = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11481b.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11481b.f11073a;
        c5705va2.m14450W(this.f11480a);
    }
}