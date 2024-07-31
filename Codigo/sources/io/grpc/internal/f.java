package io.grpc.internal;

import io.grpc.internal.g;
import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class f implements y {

    /* renamed from: a, reason: collision with root package name */
    private final k1.b f18702a;

    /* renamed from: b, reason: collision with root package name */
    private final io.grpc.internal.g f18703b;

    /* renamed from: c, reason: collision with root package name */
    private final k1 f18704c;

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18705a;

        a(int i10) {
            this.f18705a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f18704c.isClosed()) {
                return;
            }
            try {
                f.this.f18704c.b(this.f18705a);
            } catch (Throwable th2) {
                f.this.f18703b.d(th2);
                f.this.f18704c.close();
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u1 f18707a;

        b(u1 u1Var) {
            this.f18707a = u1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.this.f18704c.f(this.f18707a);
            } catch (Throwable th2) {
                f.this.f18703b.d(th2);
                f.this.f18704c.close();
            }
        }
    }

    /* loaded from: classes3.dex */
    class c implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u1 f18709a;

        c(u1 u1Var) {
            this.f18709a = u1Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f18709a.close();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f18704c.i();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f18704c.close();
        }
    }

    /* renamed from: io.grpc.internal.f$f, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private class C0298f extends g implements Closeable {

        /* renamed from: d, reason: collision with root package name */
        private final Closeable f18713d;

        public C0298f(Runnable runnable, Closeable closeable) {
            super(f.this, runnable, null);
            this.f18713d = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f18713d.close();
        }
    }

    /* loaded from: classes3.dex */
    private class g implements j2.a {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f18715a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f18716b;

        private g(Runnable runnable) {
            this.f18716b = false;
            this.f18715a = runnable;
        }

        /* synthetic */ g(f fVar, Runnable runnable, a aVar) {
            this(runnable);
        }

        private void a() {
            if (this.f18716b) {
                return;
            }
            this.f18715a.run();
            this.f18716b = true;
        }

        @Override // io.grpc.internal.j2.a
        public InputStream next() {
            a();
            return f.this.f18703b.f();
        }
    }

    /* loaded from: classes3.dex */
    interface h extends g.d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(k1.b bVar, h hVar, k1 k1Var) {
        g2 g2Var = new g2((k1.b) eb.o.p(bVar, "listener"));
        this.f18702a = g2Var;
        io.grpc.internal.g gVar = new io.grpc.internal.g(g2Var, hVar);
        this.f18703b = gVar;
        k1Var.E(gVar);
        this.f18704c = k1Var;
    }

    @Override // io.grpc.internal.y
    public void b(int i10) {
        this.f18702a.a(new g(this, new a(i10), null));
    }

    @Override // io.grpc.internal.y
    public void close() {
        this.f18704c.H();
        this.f18702a.a(new g(this, new e(), null));
    }

    @Override // io.grpc.internal.y
    public void e(int i10) {
        this.f18704c.e(i10);
    }

    @Override // io.grpc.internal.y
    public void f(u1 u1Var) {
        this.f18702a.a(new C0298f(new b(u1Var), new c(u1Var)));
    }

    @Override // io.grpc.internal.y
    public void g(vi.u uVar) {
        this.f18704c.g(uVar);
    }

    @Override // io.grpc.internal.y
    public void i() {
        this.f18702a.a(new g(this, new d(), null));
    }
}
