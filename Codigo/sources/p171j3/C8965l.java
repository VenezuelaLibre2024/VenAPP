package p171j3;

import androidx.core.util.InterfaceC0981e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p036c4.C1864e;
import p036c4.C1870k;
import p055d4.AbstractC6844c;
import p055d4.C6842a;
import p129h3.EnumC7617a;
import p129h3.InterfaceC7622f;
import p171j3.C8969p;
import p171j3.RunnableC8961h;
import p231m3.ExecutorServiceC9538a;
import p456y3.InterfaceC12595j;

/* renamed from: j3.l */
/* loaded from: classes.dex */
class C8965l<R> implements RunnableC8961h.b<R>, C6842a.f {

    /* renamed from: K */
    private static final c f21419K = new c();

    /* renamed from: A */
    private boolean f21420A;

    /* renamed from: B */
    private InterfaceC8975v<?> f21421B;

    /* renamed from: C */
    EnumC7617a f21422C;

    /* renamed from: D */
    private boolean f21423D;

    /* renamed from: E */
    C8970q f21424E;

    /* renamed from: F */
    private boolean f21425F;

    /* renamed from: G */
    C8969p<?> f21426G;

    /* renamed from: H */
    private RunnableC8961h<R> f21427H;

    /* renamed from: I */
    private volatile boolean f21428I;

    /* renamed from: J */
    private boolean f21429J;

    /* renamed from: a */
    final e f21430a;

    /* renamed from: b */
    private final AbstractC6844c f21431b;

    /* renamed from: c */
    private final C8969p.a f21432c;

    /* renamed from: d */
    private final InterfaceC0981e<C8965l<?>> f21433d;

    /* renamed from: e */
    private final c f21434e;

    /* renamed from: f */
    private final InterfaceC8966m f21435f;

    /* renamed from: r */
    private final ExecutorServiceC9538a f21436r;

    /* renamed from: s */
    private final ExecutorServiceC9538a f21437s;

    /* renamed from: t */
    private final ExecutorServiceC9538a f21438t;

    /* renamed from: u */
    private final ExecutorServiceC9538a f21439u;

    /* renamed from: v */
    private final AtomicInteger f21440v;

    /* renamed from: w */
    private InterfaceC7622f f21441w;

    /* renamed from: x */
    private boolean f21442x;

    /* renamed from: y */
    private boolean f21443y;

    /* renamed from: z */
    private boolean f21444z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3.l$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        private final InterfaceC12595j f21445a;

        a(InterfaceC12595j interfaceC12595j) {
            this.f21445a = interfaceC12595j;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f21445a.mo41407f()) {
                synchronized (C8965l.this) {
                    if (C8965l.this.f21430a.m26301d(this.f21445a)) {
                        C8965l.this.m26287e(this.f21445a);
                    }
                    C8965l.this.m26290i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3.l$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        private final InterfaceC12595j f21447a;

        b(InterfaceC12595j interfaceC12595j) {
            this.f21447a = interfaceC12595j;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f21447a.mo41407f()) {
                synchronized (C8965l.this) {
                    if (C8965l.this.f21430a.m26301d(this.f21447a)) {
                        C8965l.this.f21426G.m26305a();
                        C8965l.this.m26288f(this.f21447a);
                        C8965l.this.m26296r(this.f21447a);
                    }
                    C8965l.this.m26290i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.l$c */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        /* renamed from: a */
        public <R> C8969p<R> m26298a(InterfaceC8975v<R> interfaceC8975v, boolean z10, InterfaceC7622f interfaceC7622f, C8969p.a aVar) {
            return new C8969p<>(interfaceC8975v, z10, true, interfaceC7622f, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.l$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        final InterfaceC12595j f21449a;

        /* renamed from: b */
        final Executor f21450b;

        d(InterfaceC12595j interfaceC12595j, Executor executor) {
            this.f21449a = interfaceC12595j;
            this.f21450b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f21449a.equals(((d) obj).f21449a);
            }
            return false;
        }

        public int hashCode() {
            return this.f21449a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.l$e */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: a */
        private final List<d> f21451a;

        e() {
            this(new ArrayList(2));
        }

        e(List<d> list) {
            this.f21451a = list;
        }

        /* renamed from: h */
        private static d m26299h(InterfaceC12595j interfaceC12595j) {
            return new d(interfaceC12595j, C1864e.m9930a());
        }

        /* renamed from: c */
        void m26300c(InterfaceC12595j interfaceC12595j, Executor executor) {
            this.f21451a.add(new d(interfaceC12595j, executor));
        }

        void clear() {
            this.f21451a.clear();
        }

        /* renamed from: d */
        boolean m26301d(InterfaceC12595j interfaceC12595j) {
            return this.f21451a.contains(m26299h(interfaceC12595j));
        }

        /* renamed from: f */
        e m26302f() {
            return new e(new ArrayList(this.f21451a));
        }

        boolean isEmpty() {
            return this.f21451a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f21451a.iterator();
        }

        /* renamed from: k */
        void m26303k(InterfaceC12595j interfaceC12595j) {
            this.f21451a.remove(m26299h(interfaceC12595j));
        }

        int size() {
            return this.f21451a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8965l(ExecutorServiceC9538a executorServiceC9538a, ExecutorServiceC9538a executorServiceC9538a2, ExecutorServiceC9538a executorServiceC9538a3, ExecutorServiceC9538a executorServiceC9538a4, InterfaceC8966m interfaceC8966m, C8969p.a aVar, InterfaceC0981e<C8965l<?>> interfaceC0981e) {
        this(executorServiceC9538a, executorServiceC9538a2, executorServiceC9538a3, executorServiceC9538a4, interfaceC8966m, aVar, interfaceC0981e, f21419K);
    }

    C8965l(ExecutorServiceC9538a executorServiceC9538a, ExecutorServiceC9538a executorServiceC9538a2, ExecutorServiceC9538a executorServiceC9538a3, ExecutorServiceC9538a executorServiceC9538a4, InterfaceC8966m interfaceC8966m, C8969p.a aVar, InterfaceC0981e<C8965l<?>> interfaceC0981e, c cVar) {
        this.f21430a = new e();
        this.f21431b = AbstractC6844c.m19780a();
        this.f21440v = new AtomicInteger();
        this.f21436r = executorServiceC9538a;
        this.f21437s = executorServiceC9538a2;
        this.f21438t = executorServiceC9538a3;
        this.f21439u = executorServiceC9538a4;
        this.f21435f = interfaceC8966m;
        this.f21432c = aVar;
        this.f21433d = interfaceC0981e;
        this.f21434e = cVar;
    }

    /* renamed from: j */
    private ExecutorServiceC9538a m26283j() {
        return this.f21443y ? this.f21438t : this.f21444z ? this.f21439u : this.f21437s;
    }

    /* renamed from: m */
    private boolean m26284m() {
        return this.f21425F || this.f21423D || this.f21428I;
    }

    /* renamed from: q */
    private synchronized void m26285q() {
        if (this.f21441w == null) {
            throw new IllegalArgumentException();
        }
        this.f21430a.clear();
        this.f21441w = null;
        this.f21426G = null;
        this.f21421B = null;
        this.f21425F = false;
        this.f21428I = false;
        this.f21423D = false;
        this.f21429J = false;
        this.f21427H.m26239E(false);
        this.f21427H = null;
        this.f21424E = null;
        this.f21422C = null;
        this.f21433d.mo4820a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m26286a(InterfaceC12595j interfaceC12595j, Executor executor) {
        Runnable aVar;
        this.f21431b.mo19782c();
        this.f21430a.m26300c(interfaceC12595j, executor);
        boolean z10 = true;
        if (this.f21423D) {
            m26291k(1);
            aVar = new b(interfaceC12595j);
        } else if (this.f21425F) {
            m26291k(1);
            aVar = new a(interfaceC12595j);
        } else {
            if (this.f21428I) {
                z10 = false;
            }
            C1870k.m9947a(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p171j3.RunnableC8961h.b
    /* renamed from: b */
    public void mo26244b(InterfaceC8975v<R> interfaceC8975v, EnumC7617a enumC7617a, boolean z10) {
        synchronized (this) {
            this.f21421B = interfaceC8975v;
            this.f21422C = enumC7617a;
            this.f21429J = z10;
        }
        m26294o();
    }

    @Override // p171j3.RunnableC8961h.b
    /* renamed from: c */
    public void mo26245c(C8970q c8970q) {
        synchronized (this) {
            this.f21424E = c8970q;
        }
        m26293n();
    }

    @Override // p171j3.RunnableC8961h.b
    /* renamed from: d */
    public void mo26246d(RunnableC8961h<?> runnableC8961h) {
        m26283j().execute(runnableC8961h);
    }

    /* renamed from: e */
    void m26287e(InterfaceC12595j interfaceC12595j) {
        try {
            interfaceC12595j.mo41406c(this.f21424E);
        } catch (Throwable th2) {
            throw new C8955b(th2);
        }
    }

    /* renamed from: f */
    void m26288f(InterfaceC12595j interfaceC12595j) {
        try {
            interfaceC12595j.mo41405b(this.f21426G, this.f21422C, this.f21429J);
        } catch (Throwable th2) {
            throw new C8955b(th2);
        }
    }

    /* renamed from: g */
    void m26289g() {
        if (m26284m()) {
            return;
        }
        this.f21428I = true;
        this.f21427H.m26241m();
        this.f21435f.mo26272b(this, this.f21441w);
    }

    @Override // p055d4.C6842a.f
    /* renamed from: h */
    public AbstractC6844c mo19773h() {
        return this.f21431b;
    }

    /* renamed from: i */
    void m26290i() {
        C8969p<?> c8969p;
        synchronized (this) {
            this.f21431b.mo19782c();
            C1870k.m9947a(m26284m(), "Not yet complete!");
            int decrementAndGet = this.f21440v.decrementAndGet();
            C1870k.m9947a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                c8969p = this.f21426G;
                m26285q();
            } else {
                c8969p = null;
            }
        }
        if (c8969p != null) {
            c8969p.m26308d();
        }
    }

    /* renamed from: k */
    synchronized void m26291k(int i10) {
        C8969p<?> c8969p;
        C1870k.m9947a(m26284m(), "Not yet complete!");
        if (this.f21440v.getAndAdd(i10) == 0 && (c8969p = this.f21426G) != null) {
            c8969p.m26305a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized C8965l<R> m26292l(InterfaceC7622f interfaceC7622f, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21441w = interfaceC7622f;
        this.f21442x = z10;
        this.f21443y = z11;
        this.f21444z = z12;
        this.f21420A = z13;
        return this;
    }

    /* renamed from: n */
    void m26293n() {
        synchronized (this) {
            this.f21431b.mo19782c();
            if (this.f21428I) {
                m26285q();
                return;
            }
            if (this.f21430a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.f21425F) {
                throw new IllegalStateException("Already failed once");
            }
            this.f21425F = true;
            InterfaceC7622f interfaceC7622f = this.f21441w;
            e m26302f = this.f21430a.m26302f();
            m26291k(m26302f.size() + 1);
            this.f21435f.mo26273c(this, interfaceC7622f, null);
            Iterator<d> it = m26302f.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f21450b.execute(new a(next.f21449a));
            }
            m26290i();
        }
    }

    /* renamed from: o */
    void m26294o() {
        synchronized (this) {
            this.f21431b.mo19782c();
            if (this.f21428I) {
                this.f21421B.mo26310q();
                m26285q();
                return;
            }
            if (this.f21430a.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f21423D) {
                throw new IllegalStateException("Already have resource");
            }
            this.f21426G = this.f21434e.m26298a(this.f21421B, this.f21442x, this.f21441w, this.f21432c);
            this.f21423D = true;
            e m26302f = this.f21430a.m26302f();
            m26291k(m26302f.size() + 1);
            this.f21435f.mo26273c(this, this.f21441w, this.f21426G);
            Iterator<d> it = m26302f.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f21450b.execute(new b(next.f21449a));
            }
            m26290i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m26295p() {
        return this.f21420A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void m26296r(InterfaceC12595j interfaceC12595j) {
        boolean z10;
        this.f21431b.mo19782c();
        this.f21430a.m26303k(interfaceC12595j);
        if (this.f21430a.isEmpty()) {
            m26289g();
            if (!this.f21423D && !this.f21425F) {
                z10 = false;
                if (z10 && this.f21440v.get() == 0) {
                    m26285q();
                }
            }
            z10 = true;
            if (z10) {
                m26285q();
            }
        }
    }

    /* renamed from: s */
    public synchronized void m26297s(RunnableC8961h<R> runnableC8961h) {
        this.f21427H = runnableC8961h;
        (runnableC8961h.m26240L() ? this.f21436r : m26283j()).execute(runnableC8961h);
    }
}
