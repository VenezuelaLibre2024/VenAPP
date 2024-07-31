package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x1 */
/* loaded from: classes2.dex */
public final class RunnableC5720x1 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f12017a;

    /* renamed from: b */
    private final /* synthetic */ long f12018b;

    /* renamed from: c */
    private final /* synthetic */ C5718x f12019c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5720x1(C5718x c5718x, String str, long j10) {
        this.f12019c = c5718x;
        this.f12017a = str;
        this.f12018b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5718x.m14534x(this.f12019c, this.f12017a, this.f12018b);
    }
}
