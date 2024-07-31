package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f10879a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ w4 f10880b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z4(w4 w4Var, boolean z10) {
        this.f10880b = w4Var;
        this.f10879a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        vaVar = this.f10880b.f10760a;
        vaVar.C(this.f10879a);
    }
}
