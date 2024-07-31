package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w0 */
/* loaded from: classes2.dex */
public final class RunnableC5707w0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f11961a;

    /* renamed from: b */
    private final /* synthetic */ C5718x f11962b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5707w0(C5718x c5718x, long j10) {
        this.f11962b = c5718x;
        this.f11961a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11962b.m14533w(this.f11961a);
    }
}
