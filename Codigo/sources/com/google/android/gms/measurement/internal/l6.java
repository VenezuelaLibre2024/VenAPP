package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class l6 implements Callable<wa.c> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10350a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a6 f10351b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l6(a6 a6Var, lb lbVar) {
        this.f10351b = a6Var;
        this.f10350a = lbVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ wa.c call() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10351b.f9953a;
        vaVar.j0();
        vaVar2 = this.f10351b.f9953a;
        return new wa.c(vaVar2.b(this.f10350a.f10366a));
    }
}
