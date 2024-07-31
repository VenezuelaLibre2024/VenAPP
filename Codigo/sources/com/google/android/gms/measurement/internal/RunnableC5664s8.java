package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s8 */
/* loaded from: classes2.dex */
public final class RunnableC5664s8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5625p8 f11825a;

    /* renamed from: b */
    private final /* synthetic */ C5625p8 f11826b;

    /* renamed from: c */
    private final /* synthetic */ long f11827c;

    /* renamed from: d */
    private final /* synthetic */ boolean f11828d;

    /* renamed from: e */
    private final /* synthetic */ C5612o8 f11829e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5664s8(C5612o8 c5612o8, C5625p8 c5625p8, C5625p8 c5625p82, long j10, boolean z10) {
        this.f11829e = c5612o8;
        this.f11825a = c5625p8;
        this.f11826b = c5625p82;
        this.f11827c = j10;
        this.f11828d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11829e.m14201I(this.f11825a, this.f11826b, this.f11827c, this.f11828d, null);
    }
}
