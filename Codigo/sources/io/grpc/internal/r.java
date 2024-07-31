package io.grpc.internal;

/* loaded from: classes3.dex */
public interface r extends j2 {

    /* loaded from: classes3.dex */
    public enum a {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    void b(vi.w0 w0Var);

    void d(vi.g1 g1Var, a aVar, vi.w0 w0Var);
}
