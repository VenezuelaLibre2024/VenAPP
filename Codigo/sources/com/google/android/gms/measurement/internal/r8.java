package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ o8 f10603a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r8(o8 o8Var) {
        this.f10603a = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p8 p8Var;
        o8 o8Var = this.f10603a;
        p8Var = o8Var.f10475j;
        o8Var.f10470e = p8Var;
    }
}
