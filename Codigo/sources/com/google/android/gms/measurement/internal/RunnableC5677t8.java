package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t8 */
/* loaded from: classes2.dex */
public final class RunnableC5677t8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5625p8 f11851a;

    /* renamed from: b */
    private final /* synthetic */ long f11852b;

    /* renamed from: c */
    private final /* synthetic */ C5612o8 f11853c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5677t8(C5612o8 c5612o8, C5625p8 c5625p8, long j10) {
        this.f11853c = c5612o8;
        this.f11851a = c5625p8;
        this.f11852b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11853c.m14202J(this.f11851a, false, this.f11852b);
        C5612o8 c5612o8 = this.f11853c;
        c5612o8.f11657e = null;
        c5612o8.mo13698o().m14391E(null);
    }
}
