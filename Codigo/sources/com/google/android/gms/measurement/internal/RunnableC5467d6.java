package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* loaded from: classes2.dex */
final class RunnableC5467d6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5460d f11187a;

    /* renamed from: b */
    private final /* synthetic */ C5576lb f11188b;

    /* renamed from: c */
    private final /* synthetic */ BinderC5428a6 f11189c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5467d6(BinderC5428a6 binderC5428a6, C5460d c5460d, C5576lb c5576lb) {
        this.f11189c = binderC5428a6;
        this.f11187a = c5460d;
        this.f11188b = c5576lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5705va c5705va;
        C5705va c5705va2;
        C5705va c5705va3;
        c5705va = this.f11189c.f11073a;
        c5705va.m14464j0();
        if (this.f11187a.f11165c.m13921u1() == null) {
            c5705va3 = this.f11189c.f11073a;
            c5705va3.m14469n(this.f11187a, this.f11188b);
        } else {
            c5705va2 = this.f11189c.f11073a;
            c5705va2.m14447O(this.f11187a, this.f11188b);
        }
    }
}
