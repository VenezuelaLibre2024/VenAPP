package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
/* loaded from: classes2.dex */
final class RunnableC5747z4 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f12094a;

    /* renamed from: b */
    private final /* synthetic */ C5711w4 f12095b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5747z4(C5711w4 c5711w4, boolean z10) {
        this.f12095b = c5711w4;
        this.f12094a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5705va c5705va;
        c5705va = this.f12095b.f11966a;
        c5705va.m14442C(this.f12094a);
    }
}
