package io.grpc.internal;

import java.util.Map;
import vi.y0;

/* loaded from: classes3.dex */
public final class a2 extends y0.h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18558a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18559b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18560c;

    /* renamed from: d, reason: collision with root package name */
    private final j f18561d;

    public a2(boolean z10, int i10, int i11, j jVar) {
        this.f18558a = z10;
        this.f18559b = i10;
        this.f18560c = i11;
        this.f18561d = (j) eb.o.p(jVar, "autoLoadBalancerFactory");
    }

    @Override // vi.y0.h
    public y0.c a(Map<String, ?> map) {
        Object c10;
        try {
            y0.c f10 = this.f18561d.f(map);
            if (f10 == null) {
                c10 = null;
            } else {
                if (f10.d() != null) {
                    return y0.c.b(f10.d());
                }
                c10 = f10.c();
            }
            return y0.c.a(i1.b(map, this.f18558a, this.f18559b, this.f18560c, c10));
        } catch (RuntimeException e10) {
            return y0.c.b(vi.g1.f29102h.r("failed to parse service config").q(e10));
        }
    }
}
