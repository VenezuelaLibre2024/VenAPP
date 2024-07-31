package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.C5276s;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.mlkit.common.sdkinternal.k0 */
/* loaded from: classes2.dex */
final class C6529k0 implements Closeable {

    /* renamed from: a */
    final /* synthetic */ C6533o f14313a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C6529k0(C6533o c6533o, C6527j0 c6527j0) {
        AtomicReference atomicReference;
        this.f14313a = c6533o;
        atomicReference = c6533o.f14343d;
        C5276s.m13328n(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f14313a.f14343d;
        atomicReference.set(null);
        this.f14313a.m18341d();
    }
}
