package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a7 f10813a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ w5 f10814b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x5(w5 w5Var, a7 a7Var) {
        this.f10814b = w5Var;
        this.f10813a = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w5.d(this.f10814b, this.f10813a);
        this.f10814b.b(this.f10813a.f9962g);
    }
}
