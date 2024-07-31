package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class d6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f10067a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f10068b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f10069c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d6(a6 a6Var, d dVar, lb lbVar) {
        this.f10069c = a6Var;
        this.f10067a = dVar;
        this.f10068b = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        va vaVar3;
        vaVar = this.f10069c.f9953a;
        vaVar.j0();
        if (this.f10067a.f10045c.u1() == null) {
            vaVar3 = this.f10069c.f9953a;
            vaVar3.n(this.f10067a, this.f10068b);
        } else {
            vaVar2 = this.f10069c.f9953a;
            vaVar2.O(this.f10067a, this.f10068b);
        }
    }
}
