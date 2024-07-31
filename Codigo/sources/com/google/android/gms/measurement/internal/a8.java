package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f9966a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f9967b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a8(b7 b7Var, AtomicReference atomicReference) {
        this.f9967b = b7Var;
        this.f9966a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9966a) {
            try {
                this.f9966a.set(Long.valueOf(this.f9967b.a().s(this.f9967b.k().A(), e0.O)));
            } finally {
                this.f9966a.notify();
            }
        }
    }
}
