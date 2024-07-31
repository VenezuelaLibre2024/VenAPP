package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ba */
/* loaded from: classes2.dex */
final class RunnableC5445ba implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5705va f11126a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f11127b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5445ba(C5432aa c5432aa, C5705va c5705va, Runnable runnable) {
        this.f11126a = c5705va;
        this.f11127b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11126a.m14464j0();
        this.f11126a.m14476t(this.f11127b);
        this.f11126a.m14472o0();
    }
}
