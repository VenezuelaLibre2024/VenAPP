package io.grpc.internal;

import io.grpc.internal.C8885p;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import p082eb.C7153i;
import vi.AbstractC11913g;
import vi.AbstractC11945s0;
import vi.C11901c;
import vi.C11920i0;
import vi.C11955x0;
import vi.InterfaceC11917h0;

/* renamed from: io.grpc.internal.p1 */
/* loaded from: classes3.dex */
final class C8887p1 extends AbstractC11945s0 implements InterfaceC11917h0<Object> {

    /* renamed from: h */
    private static final Logger f20820h = Logger.getLogger(C8887p1.class.getName());

    /* renamed from: a */
    private C8911x0 f20821a;

    /* renamed from: b */
    private final C11920i0 f20822b;

    /* renamed from: c */
    private final String f20823c;

    /* renamed from: d */
    private final Executor f20824d;

    /* renamed from: e */
    private final ScheduledExecutorService f20825e;

    /* renamed from: f */
    private final C8873m f20826f;

    /* renamed from: g */
    private final C8885p.e f20827g;

    @Override // vi.AbstractC11904d
    /* renamed from: a */
    public String mo25517a() {
        return this.f20823c;
    }

    @Override // vi.InterfaceC11935n0
    /* renamed from: e */
    public C11920i0 mo25247e() {
        return this.f20822b;
    }

    @Override // vi.AbstractC11904d
    /* renamed from: h */
    public <RequestT, ResponseT> AbstractC11913g<RequestT, ResponseT> mo25518h(C11955x0<RequestT, ResponseT> c11955x0, C11901c c11901c) {
        return new C8885p(c11955x0, c11901c.m38082e() == null ? this.f20824d : c11901c.m38082e(), c11901c, this.f20827g, this.f20825e, this.f20826f, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C8911x0 m25742i() {
        return this.f20821a;
    }

    public String toString() {
        return C7153i.m21274c(this).m21283c("logId", this.f20822b.m38165d()).m21284d("authority", this.f20823c).toString();
    }
}
