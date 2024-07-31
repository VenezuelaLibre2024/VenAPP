package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
final class i implements d1 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f18901a = new AtomicLong();

    @Override // io.grpc.internal.d1
    public void add(long j10) {
        this.f18901a.getAndAdd(j10);
    }
}
