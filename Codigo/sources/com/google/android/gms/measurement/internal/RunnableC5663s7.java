package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.s7 */
/* loaded from: classes2.dex */
final class RunnableC5663s7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f11823a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11824b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5663s7(C5442b7 c5442b7, long j10) {
        this.f11824b = c5442b7;
        this.f11823a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11824b.m13707z(this.f11823a, true);
        this.f11824b.mo13698o().m14393J(new AtomicReference<>());
    }
}
