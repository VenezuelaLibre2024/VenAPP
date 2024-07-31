package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ w6 f10638a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ u f10639b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(u uVar, w6 w6Var) {
        this.f10639b = uVar;
        this.f10638a = w6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10638a.zzd();
        if (e.a()) {
            this.f10638a.zzl().y(this);
            return;
        }
        boolean e10 = this.f10639b.e();
        this.f10639b.f10665c = 0L;
        if (e10) {
            this.f10639b.d();
        }
    }
}
