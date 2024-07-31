package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class s7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f10625a;

    /* renamed from: b */
    private final /* synthetic */ b7 f10626b;

    public s7(b7 b7Var, long j10) {
        this.f10626b = b7Var;
        this.f10625a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10626b.z(this.f10625a, true);
        this.f10626b.o().J(new AtomicReference<>());
    }
}
