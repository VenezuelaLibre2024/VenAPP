package com.google.mlkit.common.sdkinternal;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class k0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f13039a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ k0(o oVar, j0 j0Var) {
        AtomicReference atomicReference;
        this.f13039a = oVar;
        atomicReference = oVar.f13069d;
        com.google.android.gms.common.internal.s.n(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f13039a.f13069d;
        atomicReference.set(null);
        this.f13039a.d();
    }
}
