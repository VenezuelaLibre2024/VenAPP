package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ba implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ va f10006a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f10007b;

    public ba(aa aaVar, va vaVar, Runnable runnable) {
        this.f10006a = vaVar;
        this.f10007b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10006a.j0();
        this.f10006a.t(this.f10007b);
        this.f10006a.o0();
    }
}
