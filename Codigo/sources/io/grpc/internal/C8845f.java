package io.grpc.internal;

import io.grpc.internal.C8849g;
import io.grpc.internal.C8867k1;
import io.grpc.internal.InterfaceC8864j2;
import java.io.Closeable;
import java.io.InputStream;
import p082eb.C7159o;
import vi.InterfaceC11948u;

/* renamed from: io.grpc.internal.f */
/* loaded from: classes3.dex */
public class C8845f implements InterfaceC8913y {

    /* renamed from: a */
    private final C8867k1.b f20398a;

    /* renamed from: b */
    private final C8849g f20399b;

    /* renamed from: c */
    private final C8867k1 f20400c;

    /* renamed from: io.grpc.internal.f$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f20401a;

        a(int i10) {
            this.f20401a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C8845f.this.f20400c.isClosed()) {
                return;
            }
            try {
                C8845f.this.f20400c.mo25436b(this.f20401a);
            } catch (Throwable th2) {
                C8845f.this.f20399b.mo25572d(th2);
                C8845f.this.f20400c.close();
            }
        }
    }

    /* renamed from: io.grpc.internal.f$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8903u1 f20403a;

        b(InterfaceC8903u1 interfaceC8903u1) {
            this.f20403a = interfaceC8903u1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C8845f.this.f20400c.mo25438f(this.f20403a);
            } catch (Throwable th2) {
                C8845f.this.f20399b.mo25572d(th2);
                C8845f.this.f20400c.close();
            }
        }
    }

    /* renamed from: io.grpc.internal.f$c */
    /* loaded from: classes3.dex */
    class c implements Closeable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC8903u1 f20405a;

        c(InterfaceC8903u1 interfaceC8903u1) {
            this.f20405a = interfaceC8903u1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f20405a.close();
        }
    }

    /* renamed from: io.grpc.internal.f$d */
    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8845f.this.f20400c.mo25440i();
        }
    }

    /* renamed from: io.grpc.internal.f$e */
    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8845f.this.f20400c.close();
        }
    }

    /* renamed from: io.grpc.internal.f$f */
    /* loaded from: classes3.dex */
    private class f extends g implements Closeable {

        /* renamed from: d */
        private final Closeable f20409d;

        public f(Runnable runnable, Closeable closeable) {
            super(C8845f.this, runnable, null);
            this.f20409d = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f20409d.close();
        }
    }

    /* renamed from: io.grpc.internal.f$g */
    /* loaded from: classes3.dex */
    private class g implements InterfaceC8864j2.a {

        /* renamed from: a */
        private final Runnable f20411a;

        /* renamed from: b */
        private boolean f20412b;

        private g(Runnable runnable) {
            this.f20412b = false;
            this.f20411a = runnable;
        }

        /* synthetic */ g(C8845f c8845f, Runnable runnable, a aVar) {
            this(runnable);
        }

        /* renamed from: a */
        private void m25441a() {
            if (this.f20412b) {
                return;
            }
            this.f20411a.run();
            this.f20412b = true;
        }

        @Override // io.grpc.internal.InterfaceC8864j2.a
        public InputStream next() {
            m25441a();
            return C8845f.this.f20399b.m25573f();
        }
    }

    /* renamed from: io.grpc.internal.f$h */
    /* loaded from: classes3.dex */
    interface h extends C8849g.d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8845f(C8867k1.b bVar, h hVar, C8867k1 c8867k1) {
        C8852g2 c8852g2 = new C8852g2((C8867k1.b) C7159o.m21313p(bVar, "listener"));
        this.f20398a = c8852g2;
        C8849g c8849g = new C8849g(c8852g2, hVar);
        this.f20399b = c8849g;
        c8867k1.m25635E(c8849g);
        this.f20400c = c8867k1;
    }

    @Override // io.grpc.internal.InterfaceC8913y
    /* renamed from: b */
    public void mo25436b(int i10) {
        this.f20398a.mo25374a(new g(this, new a(i10), null));
    }

    @Override // io.grpc.internal.InterfaceC8913y
    public void close() {
        this.f20400c.m25636H();
        this.f20398a.mo25374a(new g(this, new e(), null));
    }

    @Override // io.grpc.internal.InterfaceC8913y
    /* renamed from: e */
    public void mo25437e(int i10) {
        this.f20400c.mo25437e(i10);
    }

    @Override // io.grpc.internal.InterfaceC8913y
    /* renamed from: f */
    public void mo25438f(InterfaceC8903u1 interfaceC8903u1) {
        this.f20398a.mo25374a(new f(new b(interfaceC8903u1), new c(interfaceC8903u1)));
    }

    @Override // io.grpc.internal.InterfaceC8913y
    /* renamed from: g */
    public void mo25439g(InterfaceC11948u interfaceC11948u) {
        this.f20400c.mo25439g(interfaceC11948u);
    }

    @Override // io.grpc.internal.InterfaceC8913y
    /* renamed from: i */
    public void mo25440i() {
        this.f20398a.mo25374a(new g(this, new d(), null));
    }
}
