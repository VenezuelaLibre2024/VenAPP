package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c8 */
/* loaded from: classes2.dex */
public final class RunnableC5456c8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11153a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11154b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5456c8(C5442b7 c5442b7, AtomicReference atomicReference) {
        this.f11154b = c5442b7;
        this.f11153a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11153a) {
            try {
                this.f11153a.set(Double.valueOf(this.f11154b.mo13672a().m13896j(this.f11154b.mo13691k().m13923A(), C5474e0.f11239Q)));
            } finally {
                this.f11153a.notify();
            }
        }
    }
}
