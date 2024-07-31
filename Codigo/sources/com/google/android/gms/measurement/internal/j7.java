package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10310a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f10311b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j7(b7 b7Var, AtomicReference atomicReference) {
        this.f10311b = b7Var;
        this.f10310a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10310a) {
            try {
                this.f10310a.set(Boolean.valueOf(this.f10311b.a().E(this.f10311b.k().A())));
            } finally {
                this.f10310a.notify();
            }
        }
    }
}
