package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n6 */
/* loaded from: classes2.dex */
final class RunnableC5597n6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5461d0 f11624a;

    /* renamed from: b */
    private final /* synthetic */ String f11625b;

    /* renamed from: c */
    private final /* synthetic */ BinderC5428a6 f11626c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5597n6(BinderC5428a6 binderC5428a6, C5461d0 c5461d0, String str) {
        this.f11626c = binderC5428a6;
        this.f11624a = c5461d0;
        this.f11625b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11626c.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11626c.f11073a;
        c5705va2.m14473p(this.f11624a, this.f11625b);
    }
}
