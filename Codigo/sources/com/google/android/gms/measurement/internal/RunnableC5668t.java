package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t */
/* loaded from: classes2.dex */
public final class RunnableC5668t implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ InterfaceC5713w6 f11836a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC5681u f11837b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5668t(AbstractC5681u abstractC5681u, InterfaceC5713w6 interfaceC5713w6) {
        this.f11837b = abstractC5681u;
        this.f11836a = interfaceC5713w6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11836a.zzd();
        if (C5473e.m13775a()) {
            this.f11836a.zzl().m14248y(this);
            return;
        }
        boolean m14352e = this.f11837b.m14352e();
        this.f11837b.f11863c = 0L;
        if (m14352e) {
            this.f11837b.mo13920d();
        }
    }
}
