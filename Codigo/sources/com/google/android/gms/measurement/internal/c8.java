package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10033a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f10034b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c8(b7 b7Var, AtomicReference atomicReference) {
        this.f10034b = b7Var;
        this.f10033a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10033a) {
            try {
                this.f10033a.set(Double.valueOf(this.f10034b.a().j(this.f10034b.k().A(), e0.Q)));
            } finally {
                this.f10033a.notify();
            }
        }
    }
}
