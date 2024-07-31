package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z7 */
/* loaded from: classes2.dex */
public final class RunnableC5750z7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f12100a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f12101b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5750z7(C5442b7 c5442b7, AtomicReference atomicReference) {
        this.f12101b = c5442b7;
        this.f12100a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f12100a) {
            try {
                this.f12100a.set(Integer.valueOf(this.f12101b.mo13672a().m13902p(this.f12101b.mo13691k().m13923A(), C5474e0.f11237P)));
            } finally {
                this.f12100a.notify();
            }
        }
    }
}
