package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: k */
    public static final Size f2561k = new Size(0, 0);

    /* renamed from: l */
    private static final boolean f2562l = w.o0.f("DeferrableSurface");

    /* renamed from: m */
    private static final AtomicInteger f2563m = new AtomicInteger(0);

    /* renamed from: n */
    private static final AtomicInteger f2564n = new AtomicInteger(0);

    /* renamed from: a */
    private final Object f2565a;

    /* renamed from: b */
    private int f2566b;

    /* renamed from: c */
    private boolean f2567c;

    /* renamed from: d */
    private c.a<Void> f2568d;

    /* renamed from: e */
    private final com.google.common.util.concurrent.f<Void> f2569e;

    /* renamed from: f */
    private c.a<Void> f2570f;

    /* renamed from: g */
    private final com.google.common.util.concurrent.f<Void> f2571g;

    /* renamed from: h */
    private final Size f2572h;

    /* renamed from: i */
    private final int f2573i;

    /* renamed from: j */
    Class<?> f2574j;

    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: a */
        r0 f2575a;

        public a(String str, r0 r0Var) {
            super(str);
            this.f2575a = r0Var;
        }

        public r0 a() {
            return this.f2575a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public r0() {
        this(f2561k, 0);
    }

    public r0(Size size, int i10) {
        this.f2565a = new Object();
        this.f2566b = 0;
        this.f2567c = false;
        this.f2572h = size;
        this.f2573i = i10;
        com.google.common.util.concurrent.f<Void> a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.core.impl.o0
            public /* synthetic */ o0() {
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object n10;
                n10 = r0.this.n(aVar);
                return n10;
            }
        });
        this.f2569e = a10;
        this.f2571g = androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.core.impl.p0
            public /* synthetic */ p0() {
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object o10;
                o10 = r0.this.o(aVar);
                return o10;
            }
        });
        if (w.o0.f("DeferrableSurface")) {
            q("Surface created", f2564n.incrementAndGet(), f2563m.get());
            a10.addListener(new Runnable() { // from class: androidx.camera.core.impl.q0

                /* renamed from: b */
                public final /* synthetic */ String f2560b;

                public /* synthetic */ q0(String str) {
                    r2 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    r0.this.p(r2);
                }
            }, z.a.a());
        }
    }

    public /* synthetic */ Object n(c.a aVar) {
        synchronized (this.f2565a) {
            this.f2568d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    public /* synthetic */ Object o(c.a aVar) {
        synchronized (this.f2565a) {
            this.f2570f = aVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    public /* synthetic */ void p(String str) {
        try {
            this.f2569e.get();
            q("Surface terminated", f2564n.decrementAndGet(), f2563m.get());
        } catch (Exception e10) {
            w.o0.c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f2565a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f2567c), Integer.valueOf(this.f2566b)), e10);
            }
        }
    }

    private void q(String str, int i10, int i11) {
        if (!f2562l && w.o0.f("DeferrableSurface")) {
            w.o0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        w.o0.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public void d() {
        c.a<Void> aVar;
        synchronized (this.f2565a) {
            if (this.f2567c) {
                aVar = null;
            } else {
                this.f2567c = true;
                this.f2570f.c(null);
                if (this.f2566b == 0) {
                    aVar = this.f2568d;
                    this.f2568d = null;
                } else {
                    aVar = null;
                }
                if (w.o0.f("DeferrableSurface")) {
                    w.o0.a("DeferrableSurface", "surface closed,  useCount=" + this.f2566b + " closed=true " + this);
                }
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        c.a<Void> aVar;
        synchronized (this.f2565a) {
            int i10 = this.f2566b;
            if (i10 == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i11 = i10 - 1;
            this.f2566b = i11;
            if (i11 == 0 && this.f2567c) {
                aVar = this.f2568d;
                this.f2568d = null;
            } else {
                aVar = null;
            }
            if (w.o0.f("DeferrableSurface")) {
                w.o0.a("DeferrableSurface", "use count-1,  useCount=" + this.f2566b + " closed=" + this.f2567c + " " + this);
                if (this.f2566b == 0) {
                    q("Surface no longer in use", f2564n.get(), f2563m.decrementAndGet());
                }
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public com.google.common.util.concurrent.f<Void> f() {
        return a0.f.j(this.f2571g);
    }

    public Class<?> g() {
        return this.f2574j;
    }

    public Size h() {
        return this.f2572h;
    }

    public int i() {
        return this.f2573i;
    }

    public final com.google.common.util.concurrent.f<Surface> j() {
        synchronized (this.f2565a) {
            if (this.f2567c) {
                return a0.f.f(new a("DeferrableSurface already closed.", this));
            }
            return r();
        }
    }

    public com.google.common.util.concurrent.f<Void> k() {
        return a0.f.j(this.f2569e);
    }

    public void l() {
        synchronized (this.f2565a) {
            int i10 = this.f2566b;
            if (i10 == 0 && this.f2567c) {
                throw new a("Cannot begin use on a closed surface.", this);
            }
            this.f2566b = i10 + 1;
            if (w.o0.f("DeferrableSurface")) {
                if (this.f2566b == 1) {
                    q("New surface in use", f2564n.get(), f2563m.incrementAndGet());
                }
                w.o0.a("DeferrableSurface", "use count+1, useCount=" + this.f2566b + " " + this);
            }
        }
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f2565a) {
            z10 = this.f2567c;
        }
        return z10;
    }

    protected abstract com.google.common.util.concurrent.f<Surface> r();

    public void s(Class<?> cls) {
        this.f2574j = cls;
    }
}
