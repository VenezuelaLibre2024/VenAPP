package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.grpc.internal.i */
/* loaded from: classes3.dex */
final class C8857i implements InterfaceC8839d1 {

    /* renamed from: a */
    private final AtomicLong f20644a = new AtomicLong();

    @Override // io.grpc.internal.InterfaceC8839d1
    public void add(long j10) {
        this.f20644a.getAndAdd(j10);
    }
}
