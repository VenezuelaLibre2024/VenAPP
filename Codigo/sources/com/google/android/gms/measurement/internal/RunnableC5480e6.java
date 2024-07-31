package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e6 */
/* loaded from: classes2.dex */
final class RunnableC5480e6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11322a;

    /* renamed from: b */
    private final /* synthetic */ String f11323b;

    /* renamed from: c */
    private final /* synthetic */ String f11324c;

    /* renamed from: d */
    private final /* synthetic */ long f11325d;

    /* renamed from: e */
    private final /* synthetic */ BinderC5428a6 f11326e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5480e6(BinderC5428a6 binderC5428a6, String str, String str2, String str3, long j10) {
        this.f11326e = binderC5428a6;
        this.f11322a = str;
        this.f11323b = str2;
        this.f11324c = str3;
        this.f11325d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5705va c5705va;
        C5705va c5705va2;
        String str = this.f11322a;
        if (str == null) {
            c5705va2 = this.f11326e.f11073a;
            c5705va2.m14481y(this.f11323b, null);
        } else {
            C5625p8 c5625p8 = new C5625p8(this.f11324c, str, this.f11325d);
            c5705va = this.f11326e.f11073a;
            c5705va.m14481y(this.f11323b, c5625p8);
        }
    }
}
