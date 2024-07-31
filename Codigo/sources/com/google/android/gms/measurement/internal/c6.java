package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class c6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10029a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f10030b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c6(a6 a6Var, lb lbVar) {
        this.f10030b = a6Var;
        this.f10029a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10030b.f9953a;
        vaVar.j0();
        vaVar2 = this.f10030b.f9953a;
        lb lbVar = this.f10029a;
        vaVar2.zzl().i();
        vaVar2.k0();
        com.google.android.gms.common.internal.s.f(lbVar.f10366a);
        vaVar2.d(lbVar);
    }
}
