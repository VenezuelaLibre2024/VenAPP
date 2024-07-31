package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
/* loaded from: classes2.dex */
final class RunnableC5506g6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5460d f11367a;

    /* renamed from: b */
    private final /* synthetic */ BinderC5428a6 f11368b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5506g6(BinderC5428a6 binderC5428a6, C5460d c5460d) {
        this.f11368b = binderC5428a6;
        this.f11367a = c5460d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5705va c5705va;
        C5705va c5705va2;
        C5705va c5705va3;
        c5705va = this.f11368b.f11073a;
        c5705va.m14464j0();
        if (this.f11367a.f11165c.m13921u1() == null) {
            c5705va3 = this.f11368b.f11073a;
            c5705va3.m14467m(this.f11367a);
        } else {
            c5705va2 = this.f11368b.f11073a;
            c5705va2.m14446N(this.f11367a);
        }
    }
}
