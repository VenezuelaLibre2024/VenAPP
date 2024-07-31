package j3;

import d4.a;
import j3.h;
import j3.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class l<R> implements h.b<R>, a.f {
    private static final c K = new c();
    private boolean A;
    private v<?> B;
    h3.a C;
    private boolean D;
    q E;
    private boolean F;
    p<?> G;
    private h<R> H;
    private volatile boolean I;
    private boolean J;

    /* renamed from: a, reason: collision with root package name */
    final e f19651a;

    /* renamed from: b, reason: collision with root package name */
    private final d4.c f19652b;

    /* renamed from: c, reason: collision with root package name */
    private final p.a f19653c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.util.e<l<?>> f19654d;

    /* renamed from: e, reason: collision with root package name */
    private final c f19655e;

    /* renamed from: f, reason: collision with root package name */
    private final m f19656f;

    /* renamed from: r, reason: collision with root package name */
    private final m3.a f19657r;

    /* renamed from: s, reason: collision with root package name */
    private final m3.a f19658s;

    /* renamed from: t, reason: collision with root package name */
    private final m3.a f19659t;

    /* renamed from: u, reason: collision with root package name */
    private final m3.a f19660u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicInteger f19661v;

    /* renamed from: w, reason: collision with root package name */
    private h3.f f19662w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f19663x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f19664y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f19665z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final y3.j f19666a;

        a(y3.j jVar) {
            this.f19666a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f19666a.f()) {
                synchronized (l.this) {
                    if (l.this.f19651a.d(this.f19666a)) {
                        l.this.e(this.f19666a);
                    }
                    l.this.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final y3.j f19668a;

        b(y3.j jVar) {
            this.f19668a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f19668a.f()) {
                synchronized (l.this) {
                    if (l.this.f19651a.d(this.f19668a)) {
                        l.this.G.a();
                        l.this.f(this.f19668a);
                        l.this.r(this.f19668a);
                    }
                    l.this.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        public <R> p<R> a(v<R> vVar, boolean z10, h3.f fVar, p.a aVar) {
            return new p<>(vVar, z10, true, fVar, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final y3.j f19670a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f19671b;

        d(y3.j jVar, Executor executor) {
            this.f19670a = jVar;
            this.f19671b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f19670a.equals(((d) obj).f19670a);
            }
            return false;
        }

        public int hashCode() {
            return this.f19670a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: a, reason: collision with root package name */
        private final List<d> f19672a;

        e() {
            this(new ArrayList(2));
        }

        e(List<d> list) {
            this.f19672a = list;
        }

        private static d h(y3.j jVar) {
            return new d(jVar, c4.e.a());
        }

        void c(y3.j jVar, Executor executor) {
            this.f19672a.add(new d(jVar, executor));
        }

        void clear() {
            this.f19672a.clear();
        }

        boolean d(y3.j jVar) {
            return this.f19672a.contains(h(jVar));
        }

        e f() {
            return new e(new ArrayList(this.f19672a));
        }

        boolean isEmpty() {
            return this.f19672a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f19672a.iterator();
        }

        void k(y3.j jVar) {
            this.f19672a.remove(h(jVar));
        }

        int size() {
            return this.f19672a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(m3.a aVar, m3.a aVar2, m3.a aVar3, m3.a aVar4, m mVar, p.a aVar5, androidx.core.util.e<l<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, K);
    }

    l(m3.a aVar, m3.a aVar2, m3.a aVar3, m3.a aVar4, m mVar, p.a aVar5, androidx.core.util.e<l<?>> eVar, c cVar) {
        this.f19651a = new e();
        this.f19652b = d4.c.a();
        this.f19661v = new AtomicInteger();
        this.f19657r = aVar;
        this.f19658s = aVar2;
        this.f19659t = aVar3;
        this.f19660u = aVar4;
        this.f19656f = mVar;
        this.f19653c = aVar5;
        this.f19654d = eVar;
        this.f19655e = cVar;
    }

    private m3.a j() {
        return this.f19664y ? this.f19659t : this.f19665z ? this.f19660u : this.f19658s;
    }

    private boolean m() {
        return this.F || this.D || this.I;
    }

    private synchronized void q() {
        if (this.f19662w == null) {
            throw new IllegalArgumentException();
        }
        this.f19651a.clear();
        this.f19662w = null;
        this.G = null;
        this.B = null;
        this.F = false;
        this.I = false;
        this.D = false;
        this.J = false;
        this.H.E(false);
        this.H = null;
        this.E = null;
        this.C = null;
        this.f19654d.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(y3.j jVar, Executor executor) {
        Runnable aVar;
        this.f19652b.c();
        this.f19651a.c(jVar, executor);
        boolean z10 = true;
        if (this.D) {
            k(1);
            aVar = new b(jVar);
        } else if (this.F) {
            k(1);
            aVar = new a(jVar);
        } else {
            if (this.I) {
                z10 = false;
            }
            c4.k.a(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j3.h.b
    public void b(v<R> vVar, h3.a aVar, boolean z10) {
        synchronized (this) {
            this.B = vVar;
            this.C = aVar;
            this.J = z10;
        }
        o();
    }

    @Override // j3.h.b
    public void c(q qVar) {
        synchronized (this) {
            this.E = qVar;
        }
        n();
    }

    @Override // j3.h.b
    public void d(h<?> hVar) {
        j().execute(hVar);
    }

    void e(y3.j jVar) {
        try {
            jVar.c(this.E);
        } catch (Throwable th2) {
            throw new j3.b(th2);
        }
    }

    void f(y3.j jVar) {
        try {
            jVar.b(this.G, this.C, this.J);
        } catch (Throwable th2) {
            throw new j3.b(th2);
        }
    }

    void g() {
        if (m()) {
            return;
        }
        this.I = true;
        this.H.m();
        this.f19656f.b(this, this.f19662w);
    }

    @Override // d4.a.f
    public d4.c h() {
        return this.f19652b;
    }

    void i() {
        p<?> pVar;
        synchronized (this) {
            this.f19652b.c();
            c4.k.a(m(), "Not yet complete!");
            int decrementAndGet = this.f19661v.decrementAndGet();
            c4.k.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.G;
                q();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.d();
        }
    }

    synchronized void k(int i10) {
        p<?> pVar;
        c4.k.a(m(), "Not yet complete!");
        if (this.f19661v.getAndAdd(i10) == 0 && (pVar = this.G) != null) {
            pVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized l<R> l(h3.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f19662w = fVar;
        this.f19663x = z10;
        this.f19664y = z11;
        this.f19665z = z12;
        this.A = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            this.f19652b.c();
            if (this.I) {
                q();
                return;
            }
            if (this.f19651a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.F) {
                throw new IllegalStateException("Already failed once");
            }
            this.F = true;
            h3.f fVar = this.f19662w;
            e f10 = this.f19651a.f();
            k(f10.size() + 1);
            this.f19656f.c(this, fVar, null);
            Iterator<d> it = f10.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f19671b.execute(new a(next.f19670a));
            }
            i();
        }
    }

    void o() {
        synchronized (this) {
            this.f19652b.c();
            if (this.I) {
                this.B.q();
                q();
                return;
            }
            if (this.f19651a.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.D) {
                throw new IllegalStateException("Already have resource");
            }
            this.G = this.f19655e.a(this.B, this.f19663x, this.f19662w, this.f19653c);
            this.D = true;
            e f10 = this.f19651a.f();
            k(f10.size() + 1);
            this.f19656f.c(this, this.f19662w, this.G);
            Iterator<d> it = f10.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f19671b.execute(new b(next.f19670a));
            }
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void r(y3.j jVar) {
        boolean z10;
        this.f19652b.c();
        this.f19651a.k(jVar);
        if (this.f19651a.isEmpty()) {
            g();
            if (!this.D && !this.F) {
                z10 = false;
                if (z10 && this.f19661v.get() == 0) {
                    q();
                }
            }
            z10 = true;
            if (z10) {
                q();
            }
        }
    }

    public synchronized void s(h<R> hVar) {
        this.H = hVar;
        (hVar.L() ? this.f19657r : j()).execute(hVar);
    }
}
