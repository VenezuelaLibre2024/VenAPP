package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public interface k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final k2 f18945a = new a();

    /* loaded from: classes3.dex */
    class a implements k2 {
        a() {
        }

        @Override // io.grpc.internal.k2
        public long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}
