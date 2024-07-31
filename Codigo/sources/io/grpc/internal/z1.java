package io.grpc.internal;

import java.util.Set;
import vi.g1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    final int f19412a;

    /* renamed from: b, reason: collision with root package name */
    final long f19413b;

    /* renamed from: c, reason: collision with root package name */
    final long f19414c;

    /* renamed from: d, reason: collision with root package name */
    final double f19415d;

    /* renamed from: e, reason: collision with root package name */
    final Long f19416e;

    /* renamed from: f, reason: collision with root package name */
    final Set<g1.b> f19417f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(int i10, long j10, long j11, double d10, Long l10, Set<g1.b> set) {
        this.f19412a = i10;
        this.f19413b = j10;
        this.f19414c = j11;
        this.f19415d = d10;
        this.f19416e = l10;
        this.f19417f = com.google.common.collect.a0.r(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f19412a == z1Var.f19412a && this.f19413b == z1Var.f19413b && this.f19414c == z1Var.f19414c && Double.compare(this.f19415d, z1Var.f19415d) == 0 && eb.k.a(this.f19416e, z1Var.f19416e) && eb.k.a(this.f19417f, z1Var.f19417f);
    }

    public int hashCode() {
        return eb.k.b(Integer.valueOf(this.f19412a), Long.valueOf(this.f19413b), Long.valueOf(this.f19414c), Double.valueOf(this.f19415d), this.f19416e, this.f19417f);
    }

    public String toString() {
        return eb.i.c(this).b("maxAttempts", this.f19412a).c("initialBackoffNanos", this.f19413b).c("maxBackoffNanos", this.f19414c).a("backoffMultiplier", this.f19415d).d("perAttemptRecvTimeoutNanos", this.f19416e).d("retryableStatusCodes", this.f19417f).toString();
    }
}
