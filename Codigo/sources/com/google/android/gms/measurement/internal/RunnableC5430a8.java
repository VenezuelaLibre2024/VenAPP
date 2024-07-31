package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a8 */
/* loaded from: classes2.dex */
public final class RunnableC5430a8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11086a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11087b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5430a8(C5442b7 c5442b7, AtomicReference atomicReference) {
        this.f11087b = c5442b7;
        this.f11086a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11086a) {
            try {
                this.f11086a.set(Long.valueOf(this.f11087b.mo13672a().m13905s(this.f11087b.mo13691k().m13923A(), C5474e0.f11235O)));
            } finally {
                this.f11086a.notify();
            }
        }
    }
}
