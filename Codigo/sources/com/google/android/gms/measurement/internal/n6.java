package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class n6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d0 f10437a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10438b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f10439c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n6(a6 a6Var, d0 d0Var, String str) {
        this.f10439c = a6Var;
        this.f10437a = d0Var;
        this.f10438b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10439c.f9953a;
        vaVar.j0();
        vaVar2 = this.f10439c.f9953a;
        vaVar2.p(this.f10437a, this.f10438b);
    }
}
