package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;

/* loaded from: classes2.dex */
public final class j<V> extends a.j<V> {
    private j() {
    }

    public static <V> j<V> C() {
        return new j<>();
    }

    @Override // com.google.common.util.concurrent.a
    public boolean A(V v10) {
        return super.A(v10);
    }

    @Override // com.google.common.util.concurrent.a
    public boolean B(Throwable th2) {
        return super.B(th2);
    }

    @Override // com.google.common.util.concurrent.a.j, com.google.common.util.concurrent.a, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ boolean isCancelled() {
        return super.isCancelled();
    }
}
