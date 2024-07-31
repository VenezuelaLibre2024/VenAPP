package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m7 */
/* loaded from: classes2.dex */
final class RunnableC5585m7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f11591a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11592b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5585m7(C5442b7 c5442b7, long j10) {
        this.f11592b = c5442b7;
        this.f11591a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11592b.mo13679e().f12060k.m13721b(this.f11591a);
        this.f11592b.zzj().m14181A().m14219b("Session timeout duration set", Long.valueOf(this.f11591a));
    }
}
