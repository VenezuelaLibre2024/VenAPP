package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10601a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f10602b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r7(b7 b7Var, AtomicReference atomicReference) {
        this.f10602b = b7Var;
        this.f10601a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10601a) {
            try {
                this.f10601a.set(this.f10602b.a().C(this.f10602b.k().A()));
            } finally {
                this.f10601a.notify();
            }
        }
    }
}
