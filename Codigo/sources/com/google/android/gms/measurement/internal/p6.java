package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class p6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ hb f10497a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f10498b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f10499c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p6(a6 a6Var, hb hbVar, lb lbVar) {
        this.f10499c = a6Var;
        this.f10497a = hbVar;
        this.f10498b = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        va vaVar3;
        vaVar = this.f10499c.f9953a;
        vaVar.j0();
        if (this.f10497a.u1() == null) {
            vaVar3 = this.f10499c.f9953a;
            vaVar3.z(this.f10497a.f10237b, this.f10498b);
        } else {
            vaVar2 = this.f10499c.f9953a;
            vaVar2.s(this.f10497a, this.f10498b);
        }
    }
}
