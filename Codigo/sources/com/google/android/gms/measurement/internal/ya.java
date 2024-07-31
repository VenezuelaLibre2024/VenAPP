package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ya implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ fb f10873a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ va f10874b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ya(va vaVar, fb fbVar) {
        this.f10874b = vaVar;
        this.f10873a = fbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va.r(this.f10874b, this.f10873a);
        this.f10874b.n0();
    }
}
