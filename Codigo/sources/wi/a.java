package wi;

import dm.v;
import dm.y;
import io.grpc.internal.c2;
import java.io.IOException;
import java.net.Socket;
import wi.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a implements v {

    /* renamed from: c, reason: collision with root package name */
    private final c2 f30012c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a f30013d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30014e;

    /* renamed from: t, reason: collision with root package name */
    private v f30018t;

    /* renamed from: u, reason: collision with root package name */
    private Socket f30019u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f30020v;

    /* renamed from: w, reason: collision with root package name */
    private int f30021w;

    /* renamed from: x, reason: collision with root package name */
    private int f30022x;

    /* renamed from: a, reason: collision with root package name */
    private final Object f30010a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final dm.b f30011b = new dm.b();

    /* renamed from: f, reason: collision with root package name */
    private boolean f30015f = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f30016r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f30017s = false;

    /* renamed from: wi.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0486a extends e {

        /* renamed from: b, reason: collision with root package name */
        final cj.b f30023b;

        C0486a() {
            super(a.this, null);
            this.f30023b = cj.c.e();
        }

        @Override // wi.a.e
        public void a() {
            int i10;
            cj.c.f("WriteRunnable.runWrite");
            cj.c.d(this.f30023b);
            dm.b bVar = new dm.b();
            try {
                synchronized (a.this.f30010a) {
                    bVar.K0(a.this.f30011b, a.this.f30011b.g());
                    a.this.f30015f = false;
                    i10 = a.this.f30022x;
                }
                a.this.f30018t.K0(bVar, bVar.size());
                synchronized (a.this.f30010a) {
                    a.g(a.this, i10);
                }
            } finally {
                cj.c.h("WriteRunnable.runWrite");
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends e {

        /* renamed from: b, reason: collision with root package name */
        final cj.b f30025b;

        b() {
            super(a.this, null);
            this.f30025b = cj.c.e();
        }

        @Override // wi.a.e
        public void a() {
            cj.c.f("WriteRunnable.runFlush");
            cj.c.d(this.f30025b);
            dm.b bVar = new dm.b();
            try {
                synchronized (a.this.f30010a) {
                    bVar.K0(a.this.f30011b, a.this.f30011b.size());
                    a.this.f30016r = false;
                }
                a.this.f30018t.K0(bVar, bVar.size());
                a.this.f30018t.flush();
            } finally {
                cj.c.h("WriteRunnable.runFlush");
            }
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f30018t != null && a.this.f30011b.size() > 0) {
                    a.this.f30018t.K0(a.this.f30011b, a.this.f30011b.size());
                }
            } catch (IOException e10) {
                a.this.f30013d.h(e10);
            }
            a.this.f30011b.close();
            try {
                if (a.this.f30018t != null) {
                    a.this.f30018t.close();
                }
            } catch (IOException e11) {
                a.this.f30013d.h(e11);
            }
            try {
                if (a.this.f30019u != null) {
                    a.this.f30019u.close();
                }
            } catch (IOException e12) {
                a.this.f30013d.h(e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class d extends wi.c {
        public d(xi.c cVar) {
            super(cVar);
        }

        @Override // wi.c, xi.c
        public void h(boolean z10, int i10, int i11) {
            if (z10) {
                a.o(a.this);
            }
            super.h(z10, i10, i11);
        }

        @Override // wi.c, xi.c
        public void o1(xi.i iVar) {
            a.o(a.this);
            super.o1(iVar);
        }

        @Override // wi.c, xi.c
        public void s(int i10, xi.a aVar) {
            a.o(a.this);
            super.s(i10, aVar);
        }
    }

    /* loaded from: classes3.dex */
    private abstract class e implements Runnable {
        private e() {
        }

        /* synthetic */ e(a aVar, C0486a c0486a) {
            this();
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (a.this.f30018t == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                a();
            } catch (Exception e10) {
                a.this.f30013d.h(e10);
            }
        }
    }

    private a(c2 c2Var, b.a aVar, int i10) {
        this.f30012c = (c2) eb.o.p(c2Var, "executor");
        this.f30013d = (b.a) eb.o.p(aVar, "exceptionHandler");
        this.f30014e = i10;
    }

    static /* synthetic */ int g(a aVar, int i10) {
        int i11 = aVar.f30022x - i10;
        aVar.f30022x = i11;
        return i11;
    }

    static /* synthetic */ int o(a aVar) {
        int i10 = aVar.f30021w;
        aVar.f30021w = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a y(c2 c2Var, b.a aVar, int i10) {
        return new a(c2Var, aVar, i10);
    }

    @Override // dm.v
    public void K0(dm.b bVar, long j10) {
        eb.o.p(bVar, "source");
        if (this.f30017s) {
            throw new IOException("closed");
        }
        cj.c.f("AsyncSink.write");
        try {
            synchronized (this.f30010a) {
                this.f30011b.K0(bVar, j10);
                int i10 = this.f30022x + this.f30021w;
                this.f30022x = i10;
                boolean z10 = false;
                this.f30021w = 0;
                if (this.f30020v || i10 <= this.f30014e) {
                    if (!this.f30015f && !this.f30016r && this.f30011b.g() > 0) {
                        this.f30015f = true;
                    }
                }
                this.f30020v = true;
                z10 = true;
                if (!z10) {
                    this.f30012c.execute(new C0486a());
                    return;
                }
                try {
                    this.f30019u.close();
                } catch (IOException e10) {
                    this.f30013d.h(e10);
                }
            }
        } finally {
            cj.c.h("AsyncSink.write");
        }
    }

    @Override // dm.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f30017s) {
            return;
        }
        this.f30017s = true;
        this.f30012c.execute(new c());
    }

    @Override // dm.v, java.io.Flushable
    public void flush() {
        if (this.f30017s) {
            throw new IOException("closed");
        }
        cj.c.f("AsyncSink.flush");
        try {
            synchronized (this.f30010a) {
                if (this.f30016r) {
                    return;
                }
                this.f30016r = true;
                this.f30012c.execute(new b());
            }
        } finally {
            cj.c.h("AsyncSink.flush");
        }
    }

    @Override // dm.v
    public y m() {
        return y.f14339e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(v vVar, Socket socket) {
        eb.o.v(this.f30018t == null, "AsyncSink's becomeConnected should only be called once.");
        this.f30018t = (v) eb.o.p(vVar, "sink");
        this.f30019u = (Socket) eb.o.p(socket, "socket");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public xi.c r(xi.c cVar) {
        return new d(cVar);
    }
}
