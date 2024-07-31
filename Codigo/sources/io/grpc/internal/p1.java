package io.grpc.internal;

import io.grpc.internal.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class p1 extends vi.s0 implements vi.h0<Object> {

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f19073h = Logger.getLogger(p1.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private x0 f19074a;

    /* renamed from: b, reason: collision with root package name */
    private final vi.i0 f19075b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19076c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f19077d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f19078e;

    /* renamed from: f, reason: collision with root package name */
    private final m f19079f;

    /* renamed from: g, reason: collision with root package name */
    private final p.e f19080g;

    @Override // vi.d
    public String a() {
        return this.f19076c;
    }

    @Override // vi.n0
    public vi.i0 e() {
        return this.f19075b;
    }

    @Override // vi.d
    public <RequestT, ResponseT> vi.g<RequestT, ResponseT> h(vi.x0<RequestT, ResponseT> x0Var, vi.c cVar) {
        return new p(x0Var, cVar.e() == null ? this.f19077d : cVar.e(), cVar, this.f19080g, this.f19078e, this.f19079f, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0 i() {
        return this.f19074a;
    }

    public String toString() {
        return eb.i.c(this).c("logId", this.f19075b.d()).d("authority", this.f19076c).toString();
    }
}
