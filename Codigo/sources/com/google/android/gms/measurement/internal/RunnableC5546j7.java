package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j7 */
/* loaded from: classes2.dex */
public final class RunnableC5546j7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11482a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11483b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5546j7(C5442b7 c5442b7, AtomicReference atomicReference) {
        this.f11483b = c5442b7;
        this.f11482a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11482a) {
            try {
                this.f11482a.set(Boolean.valueOf(this.f11483b.mo13672a().m13886E(this.f11483b.mo13691k().m13923A())));
            } finally {
                this.f11482a.notify();
            }
        }
    }
}
