package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zznp;

/* loaded from: classes2.dex */
final class m6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10402a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f10403b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m6(a6 a6Var, lb lbVar) {
        this.f10403b = a6Var;
        this.f10402a = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10403b.f9953a;
        vaVar.j0();
        vaVar2 = this.f10403b.f9953a;
        lb lbVar = this.f10402a;
        vaVar2.zzl().i();
        vaVar2.k0();
        com.google.android.gms.common.internal.s.f(lbVar.f10366a);
        y6 f10 = y6.f(lbVar.G, (zznp.zza() && vaVar2.X().n(e0.T0)) ? lbVar.L : 100);
        y6 L = vaVar2.L(lbVar.f10366a);
        vaVar2.zzj().F().c("Setting consent, package, consent", lbVar.f10366a, f10);
        vaVar2.x(lbVar.f10366a, f10);
        if (f10.t(L)) {
            vaVar2.W(lbVar);
        }
        if (zznp.zza() && vaVar2.X().n(e0.T0)) {
            v c10 = v.c(lbVar.M);
            if (v.f10684f.equals(c10)) {
                return;
            }
            vaVar2.zzj().F().c("Setting DMA consent. package, consent", lbVar.f10366a, c10);
            vaVar2.w(lbVar.f10366a, c10);
        }
    }
}
