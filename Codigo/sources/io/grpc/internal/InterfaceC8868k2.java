package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.k2 */
/* loaded from: classes3.dex */
public interface InterfaceC8868k2 {

    /* renamed from: a */
    public static final InterfaceC8868k2 f20692a = new a();

    /* renamed from: io.grpc.internal.k2$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC8868k2 {
        a() {
        }

        @Override // io.grpc.internal.InterfaceC8868k2
        /* renamed from: a */
        public long mo25639a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    long mo25639a();
}
