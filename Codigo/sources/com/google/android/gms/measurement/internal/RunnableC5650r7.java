package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r7 */
/* loaded from: classes2.dex */
public final class RunnableC5650r7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11799a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11800b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5650r7(C5442b7 c5442b7, AtomicReference atomicReference) {
        this.f11800b = c5442b7;
        this.f11799a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11799a) {
            try {
                this.f11799a.set(this.f11800b.mo13672a().m13884C(this.f11800b.mo13691k().m13923A()));
            } finally {
                this.f11799a.notify();
            }
        }
    }
}
