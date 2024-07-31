package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
/* loaded from: classes2.dex */
final class RunnableC5623p6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5524hb f11684a;

    /* renamed from: b */
    private final /* synthetic */ C5576lb f11685b;

    /* renamed from: c */
    private final /* synthetic */ BinderC5428a6 f11686c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5623p6(BinderC5428a6 binderC5428a6, C5524hb c5524hb, C5576lb c5576lb) {
        this.f11686c = binderC5428a6;
        this.f11684a = c5524hb;
        this.f11685b = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5705va c5705va;
        C5705va c5705va2;
        C5705va c5705va3;
        c5705va = this.f11686c.f11073a;
        c5705va.m14464j0();
        if (this.f11684a.m13921u1() == null) {
            c5705va3 = this.f11686c.f11073a;
            c5705va3.m14482z(this.f11684a.f11409b, this.f11685b);
        } else {
            c5705va2 = this.f11686c.f11073a;
            c5705va2.m14475s(this.f11684a, this.f11685b);
        }
    }
}
