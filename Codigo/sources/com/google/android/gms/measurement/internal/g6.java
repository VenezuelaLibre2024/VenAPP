package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class g6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f10195a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f10196b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g6(a6 a6Var, d dVar) {
        this.f10196b = a6Var;
        this.f10195a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        va vaVar3;
        vaVar = this.f10196b.f9953a;
        vaVar.j0();
        if (this.f10195a.f10045c.u1() == null) {
            vaVar3 = this.f10196b.f9953a;
            vaVar3.m(this.f10195a);
        } else {
            vaVar2 = this.f10196b.f9953a;
            vaVar2.N(this.f10195a);
        }
    }
}
