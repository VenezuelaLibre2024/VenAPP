package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab.l f9394a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m1 f9395b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(m1 m1Var, ab.l lVar) {
        this.f9395b = m1Var;
        this.f9394a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m1.g2(this.f9395b, this.f9394a);
    }
}
