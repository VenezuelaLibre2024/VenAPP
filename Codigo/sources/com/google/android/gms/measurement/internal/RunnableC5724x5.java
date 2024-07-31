package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* loaded from: classes2.dex */
public final class RunnableC5724x5 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5429a7 f12028a;

    /* renamed from: b */
    private final /* synthetic */ C5712w5 f12029b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5724x5(C5712w5 c5712w5, C5429a7 c5429a7) {
        this.f12029b = c5712w5;
        this.f12028a = c5429a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5712w5.m14490d(this.f12029b, this.f12028a);
        this.f12029b.m14507b(this.f12028a.f11082g);
    }
}
