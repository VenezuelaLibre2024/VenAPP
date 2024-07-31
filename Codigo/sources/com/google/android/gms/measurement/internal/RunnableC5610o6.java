package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o6 */
/* loaded from: classes2.dex */
final class RunnableC5610o6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5461d0 f11647a;

    /* renamed from: b */
    private final /* synthetic */ C5576lb f11648b;

    /* renamed from: c */
    private final /* synthetic */ BinderC5428a6 f11649c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5610o6(BinderC5428a6 binderC5428a6, C5461d0 c5461d0, C5576lb c5576lb) {
        this.f11649c = binderC5428a6;
        this.f11647a = c5461d0;
        this.f11648b = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11649c.m13620l2(this.f11649c.m13618j2(this.f11647a, this.f11648b), this.f11648b);
    }
}
