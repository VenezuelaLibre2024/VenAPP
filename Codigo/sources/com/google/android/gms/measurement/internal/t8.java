package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p8 f10653a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f10654b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ o8 f10655c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t8(o8 o8Var, p8 p8Var, long j10) {
        this.f10655c = o8Var;
        this.f10653a = p8Var;
        this.f10654b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10655c.J(this.f10653a, false, this.f10654b);
        o8 o8Var = this.f10655c;
        o8Var.f10470e = null;
        o8Var.o().E(null);
    }
}
