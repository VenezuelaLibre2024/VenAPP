package io.grpc.internal;

import java.util.Set;
import vi.g1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    final int f19134a;

    /* renamed from: b, reason: collision with root package name */
    final long f19135b;

    /* renamed from: c, reason: collision with root package name */
    final Set<g1.b> f19136c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(int i10, long j10, Set<g1.b> set) {
        this.f19134a = i10;
        this.f19135b = j10;
        this.f19136c = com.google.common.collect.a0.r(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f19134a == s0Var.f19134a && this.f19135b == s0Var.f19135b && eb.k.a(this.f19136c, s0Var.f19136c);
    }

    public int hashCode() {
        return eb.k.b(Integer.valueOf(this.f19134a), Long.valueOf(this.f19135b), this.f19136c);
    }

    public String toString() {
        return eb.i.c(this).b("maxAttempts", this.f19134a).c("hedgingDelayNanos", this.f19135b).d("nonFatalStatusCodes", this.f19136c).toString();
    }
}
