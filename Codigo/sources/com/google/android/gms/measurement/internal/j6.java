package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class j6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10308a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f10309b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j6(a6 a6Var, lb lbVar) {
        this.f10309b = a6Var;
        this.f10308a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10309b.f9953a;
        vaVar.j0();
        vaVar2 = this.f10309b.f9953a;
        vaVar2.W(this.f10308a);
    }
}
