package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
/* loaded from: classes2.dex */
final class RunnableC5559k7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f11507a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11508b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5559k7(C5442b7 c5442b7, boolean z10) {
        this.f11508b = c5442b7;
        this.f11507a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m14512k = this.f11508b.f11899a.m14512k();
        boolean m14511j = this.f11508b.f11899a.m14511j();
        this.f11508b.f11899a.m14509h(this.f11507a);
        if (m14511j == this.f11507a) {
            this.f11508b.f11899a.zzj().m14186F().m14219b("Default data collection state already set to", Boolean.valueOf(this.f11507a));
        }
        if (this.f11508b.f11899a.m14512k() == m14512k || this.f11508b.f11899a.m14512k() != this.f11508b.f11899a.m14511j()) {
            this.f11508b.f11899a.zzj().m14188H().m14220c("Default data collection is different than actual status", Boolean.valueOf(this.f11507a), Boolean.valueOf(m14512k));
        }
        this.f11508b.m13648o0();
    }
}
