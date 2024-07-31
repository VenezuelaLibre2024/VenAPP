package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u8 */
/* loaded from: classes2.dex */
public final class RunnableC5690u8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f11875a;

    /* renamed from: b */
    private final /* synthetic */ C5612o8 f11876b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5690u8(C5612o8 c5612o8, long j10) {
        this.f11876b = c5612o8;
        this.f11875a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11876b.mo13689j().m14535q(this.f11875a);
        this.f11876b.f11657e = null;
    }
}
