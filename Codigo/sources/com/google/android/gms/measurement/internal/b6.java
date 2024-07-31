package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class b6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f9983a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f9984b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b6(a6 a6Var, lb lbVar) {
        this.f9984b = a6Var;
        this.f9983a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        vaVar = this.f9984b.f9953a;
        vaVar.j0();
        vaVar2 = this.f9984b.f9953a;
        vaVar2.U(this.f9983a);
    }
}
