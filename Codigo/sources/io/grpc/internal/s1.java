package io.grpc.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import vi.p0;

/* loaded from: classes3.dex */
public final class s1 extends p0.f {

    /* renamed from: a, reason: collision with root package name */
    private final vi.c f19137a;

    /* renamed from: b, reason: collision with root package name */
    private final vi.w0 f19138b;

    /* renamed from: c, reason: collision with root package name */
    private final vi.x0<?, ?> f19139c;

    public s1(vi.x0<?, ?> x0Var, vi.w0 w0Var, vi.c cVar) {
        this.f19139c = (vi.x0) eb.o.p(x0Var, Constants.METHOD);
        this.f19138b = (vi.w0) eb.o.p(w0Var, "headers");
        this.f19137a = (vi.c) eb.o.p(cVar, "callOptions");
    }

    @Override // vi.p0.f
    public vi.c a() {
        return this.f19137a;
    }

    @Override // vi.p0.f
    public vi.w0 b() {
        return this.f19138b;
    }

    @Override // vi.p0.f
    public vi.x0<?, ?> c() {
        return this.f19139c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return eb.k.a(this.f19137a, s1Var.f19137a) && eb.k.a(this.f19138b, s1Var.f19138b) && eb.k.a(this.f19139c, s1Var.f19139c);
    }

    public int hashCode() {
        return eb.k.b(this.f19137a, this.f19138b, this.f19139c);
    }

    public final String toString() {
        return "[method=" + this.f19139c + " headers=" + this.f19138b + " callOptions=" + this.f19137a + "]";
    }
}
