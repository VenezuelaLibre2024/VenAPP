package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e8 */
/* loaded from: classes2.dex */
public final class RunnableC5482e8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5694v f11329a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11330b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5482e8(C5442b7 c5442b7, C5694v c5694v) {
        this.f11330b = c5442b7;
        this.f11329a = c5694v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11330b.mo13679e().m14566u(this.f11329a)) {
            this.f11330b.mo13698o().m14399P(false);
        } else {
            this.f11330b.zzj().m14185E().m14219b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f11329a.m14368a()));
        }
    }
}
