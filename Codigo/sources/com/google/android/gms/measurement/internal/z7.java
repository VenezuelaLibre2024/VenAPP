package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10885a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f10886b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z7(b7 b7Var, AtomicReference atomicReference) {
        this.f10886b = b7Var;
        this.f10885a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10885a) {
            try {
                this.f10885a.set(Integer.valueOf(this.f10886b.a().p(this.f10886b.k().A(), e0.P)));
            } finally {
                this.f10885a.notify();
            }
        }
    }
}
