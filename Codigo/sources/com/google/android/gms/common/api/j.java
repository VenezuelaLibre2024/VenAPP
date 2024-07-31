package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class j {
    public static <R extends n> i<R> a(R r10, f fVar) {
        com.google.android.gms.common.internal.s.k(r10, "Result must not be null");
        com.google.android.gms.common.internal.s.b(!r10.getStatus().y1(), "Status code must not be SUCCESS");
        w wVar = new w(fVar, r10);
        wVar.setResult(r10);
        return wVar;
    }

    public static <R extends n> h<R> b(R r10, f fVar) {
        com.google.android.gms.common.internal.s.k(r10, "Result must not be null");
        x xVar = new x(fVar);
        xVar.setResult(r10);
        return new com.google.android.gms.common.api.internal.o(xVar);
    }

    public static i<Status> c(Status status, f fVar) {
        com.google.android.gms.common.internal.s.k(status, "Result must not be null");
        com.google.android.gms.common.api.internal.v vVar = new com.google.android.gms.common.api.internal.v(fVar);
        vVar.setResult(status);
        return vVar;
    }
}
