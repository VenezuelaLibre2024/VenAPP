package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class o6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d0 f10460a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f10461b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f10462c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o6(a6 a6Var, d0 d0Var, lb lbVar) {
        this.f10462c = a6Var;
        this.f10460a = d0Var;
        this.f10461b = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10462c.l2(this.f10462c.j2(this.f10460a, this.f10461b), this.f10461b);
    }
}
