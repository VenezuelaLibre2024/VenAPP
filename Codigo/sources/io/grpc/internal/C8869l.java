package io.grpc.internal;

import com.google.android.gms.common.api.C5101a;
import io.grpc.internal.C8875m1;
import io.grpc.internal.InterfaceC8898t;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p082eb.C7159o;
import vi.AbstractC11898b;
import vi.AbstractC11910f;
import vi.AbstractC11925k;
import vi.C11901c;
import vi.C11915g1;
import vi.C11931m;
import vi.C11953w0;
import vi.C11955x0;
import vi.InterfaceC11923j0;

/* renamed from: io.grpc.internal.l */
/* loaded from: classes3.dex */
final class C8869l implements InterfaceC8898t {

    /* renamed from: a */
    private final InterfaceC8898t f20693a;

    /* renamed from: b */
    private final AbstractC11898b f20694b;

    /* renamed from: c */
    private final Executor f20695c;

    /* renamed from: io.grpc.internal.l$a */
    /* loaded from: classes3.dex */
    private class a extends AbstractC8862j0 {

        /* renamed from: a */
        private final InterfaceC8904v f20696a;

        /* renamed from: b */
        private final String f20697b;

        /* renamed from: d */
        private volatile C11915g1 f20699d;

        /* renamed from: e */
        private C11915g1 f20700e;

        /* renamed from: f */
        private C11915g1 f20701f;

        /* renamed from: c */
        private final AtomicInteger f20698c = new AtomicInteger(-2147483647);

        /* renamed from: g */
        private final C8875m1.a f20702g = new C13215a();

        /* renamed from: io.grpc.internal.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C13215a implements C8875m1.a {
            C13215a() {
            }

            @Override // io.grpc.internal.C8875m1.a
            /* renamed from: a */
            public void mo25647a() {
                if (a.this.f20698c.decrementAndGet() == 0) {
                    a.this.m25646j();
                }
            }
        }

        /* renamed from: io.grpc.internal.l$a$b */
        /* loaded from: classes3.dex */
        class b extends AbstractC11898b.b {

            /* renamed from: a */
            final /* synthetic */ C11955x0 f20705a;

            /* renamed from: b */
            final /* synthetic */ C11901c f20706b;

            b(C11955x0 c11955x0, C11901c c11901c) {
                this.f20705a = c11955x0;
                this.f20706b = c11901c;
            }
        }

        a(InterfaceC8904v interfaceC8904v, String str) {
            this.f20696a = (InterfaceC8904v) C7159o.m21313p(interfaceC8904v, "delegate");
            this.f20697b = (String) C7159o.m21313p(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m25646j() {
            synchronized (this) {
                if (this.f20698c.get() != 0) {
                    return;
                }
                C11915g1 c11915g1 = this.f20700e;
                C11915g1 c11915g12 = this.f20701f;
                this.f20700e = null;
                this.f20701f = null;
                if (c11915g1 != null) {
                    super.mo25246d(c11915g1);
                }
                if (c11915g12 != null) {
                    super.mo25244b(c11915g12);
                }
            }
        }

        @Override // io.grpc.internal.AbstractC8862j0
        /* renamed from: a */
        protected InterfaceC8904v mo25624a() {
            return this.f20696a;
        }

        @Override // io.grpc.internal.AbstractC8862j0, io.grpc.internal.InterfaceC8863j1
        /* renamed from: b */
        public void mo25244b(C11915g1 c11915g1) {
            C7159o.m21313p(c11915g1, "status");
            synchronized (this) {
                if (this.f20698c.get() < 0) {
                    this.f20699d = c11915g1;
                    this.f20698c.addAndGet(C5101a.e.API_PRIORITY_OTHER);
                } else if (this.f20701f != null) {
                    return;
                }
                if (this.f20698c.get() != 0) {
                    this.f20701f = c11915g1;
                } else {
                    super.mo25244b(c11915g1);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [vi.b] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // io.grpc.internal.AbstractC8862j0, io.grpc.internal.InterfaceC8895s
        /* renamed from: c */
        public InterfaceC8889q mo25245c(C11955x0<?, ?> c11955x0, C11953w0 c11953w0, C11901c c11901c, AbstractC11925k[] abstractC11925kArr) {
            InterfaceC11923j0 c11931m;
            AbstractC11898b m38080c = c11901c.m38080c();
            if (m38080c == null) {
                c11931m = C8869l.this.f20694b;
            } else {
                c11931m = m38080c;
                if (C8869l.this.f20694b != null) {
                    c11931m = new C11931m(C8869l.this.f20694b, m38080c);
                }
            }
            if (c11931m == 0) {
                return this.f20698c.get() >= 0 ? new C8846f0(this.f20699d, abstractC11925kArr) : this.f20696a.mo25245c(c11955x0, c11953w0, c11901c, abstractC11925kArr);
            }
            C8875m1 c8875m1 = new C8875m1(this.f20696a, c11955x0, c11953w0, c11901c, this.f20702g, abstractC11925kArr);
            if (this.f20698c.incrementAndGet() > 0) {
                this.f20702g.mo25647a();
                return new C8846f0(this.f20699d, abstractC11925kArr);
            }
            try {
                c11931m.mo38066a(new b(c11955x0, c11901c), ((c11931m instanceof InterfaceC11923j0) && c11931m.m38171a() && c11901c.m38082e() != null) ? c11901c.m38082e() : C8869l.this.f20695c, c8875m1);
            } catch (Throwable th2) {
                c8875m1.m25673a(C11915g1.f31542n.m38147r("Credentials should use fail() instead of throwing exceptions").m38146q(th2));
            }
            return c8875m1.m25674c();
        }

        @Override // io.grpc.internal.AbstractC8862j0, io.grpc.internal.InterfaceC8863j1
        /* renamed from: d */
        public void mo25246d(C11915g1 c11915g1) {
            C7159o.m21313p(c11915g1, "status");
            synchronized (this) {
                if (this.f20698c.get() < 0) {
                    this.f20699d = c11915g1;
                    this.f20698c.addAndGet(C5101a.e.API_PRIORITY_OTHER);
                    if (this.f20698c.get() != 0) {
                        this.f20700e = c11915g1;
                    } else {
                        super.mo25246d(c11915g1);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8869l(InterfaceC8898t interfaceC8898t, AbstractC11898b abstractC11898b, Executor executor) {
        this.f20693a = (InterfaceC8898t) C7159o.m21313p(interfaceC8898t, "delegate");
        this.f20694b = abstractC11898b;
        this.f20695c = (Executor) C7159o.m21313p(executor, "appExecutor");
    }

    @Override // io.grpc.internal.InterfaceC8898t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20693a.close();
    }

    @Override // io.grpc.internal.InterfaceC8898t
    /* renamed from: h1 */
    public InterfaceC8904v mo25642h1(SocketAddress socketAddress, InterfaceC8898t.a aVar, AbstractC11910f abstractC11910f) {
        return new a(this.f20693a.mo25642h1(socketAddress, aVar, abstractC11910f), aVar.m25820a());
    }

    @Override // io.grpc.internal.InterfaceC8898t
    /* renamed from: l0 */
    public ScheduledExecutorService mo25643l0() {
        return this.f20693a.mo25643l0();
    }
}
