package io.grpc.internal;

import io.grpc.internal.j1;
import io.grpc.internal.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import vi.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a0 implements j1 {

    /* renamed from: c, reason: collision with root package name */
    private final Executor f18535c;

    /* renamed from: d, reason: collision with root package name */
    private final vi.k1 f18536d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f18537e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f18538f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f18539g;

    /* renamed from: h, reason: collision with root package name */
    private j1.a f18540h;

    /* renamed from: j, reason: collision with root package name */
    private vi.g1 f18542j;

    /* renamed from: k, reason: collision with root package name */
    private p0.i f18543k;

    /* renamed from: l, reason: collision with root package name */
    private long f18544l;

    /* renamed from: a, reason: collision with root package name */
    private final vi.i0 f18533a = vi.i0.a(a0.class, null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f18534b = new Object();

    /* renamed from: i, reason: collision with root package name */
    private Collection<e> f18541i = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j1.a f18545a;

        a(j1.a aVar) {
            this.f18545a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18545a.b(true);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j1.a f18547a;

        b(j1.a aVar) {
            this.f18547a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18547a.b(false);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j1.a f18549a;

        c(j1.a aVar) {
            this.f18549a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18549a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vi.g1 f18551a;

        d(vi.g1 g1Var) {
            this.f18551a = g1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.f18540h.d(this.f18551a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e extends b0 {

        /* renamed from: j, reason: collision with root package name */
        private final p0.f f18553j;

        /* renamed from: k, reason: collision with root package name */
        private final vi.r f18554k;

        /* renamed from: l, reason: collision with root package name */
        private final vi.k[] f18555l;

        private e(p0.f fVar, vi.k[] kVarArr) {
            this.f18554k = vi.r.e();
            this.f18553j = fVar;
            this.f18555l = kVarArr;
        }

        /* synthetic */ e(a0 a0Var, p0.f fVar, vi.k[] kVarArr, a aVar) {
            this(fVar, kVarArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable A(s sVar) {
            vi.r b10 = this.f18554k.b();
            try {
                q c10 = sVar.c(this.f18553j.c(), this.f18553j.b(), this.f18553j.a(), this.f18555l);
                this.f18554k.f(b10);
                return w(c10);
            } catch (Throwable th2) {
                this.f18554k.f(b10);
                throw th2;
            }
        }

        @Override // io.grpc.internal.b0, io.grpc.internal.q
        public void c(vi.g1 g1Var) {
            super.c(g1Var);
            synchronized (a0.this.f18534b) {
                if (a0.this.f18539g != null) {
                    boolean remove = a0.this.f18541i.remove(this);
                    if (!a0.this.q() && remove) {
                        a0.this.f18536d.b(a0.this.f18538f);
                        if (a0.this.f18542j != null) {
                            a0.this.f18536d.b(a0.this.f18539g);
                            a0.this.f18539g = null;
                        }
                    }
                }
            }
            a0.this.f18536d.a();
        }

        @Override // io.grpc.internal.b0, io.grpc.internal.q
        public void m(w0 w0Var) {
            if (this.f18553j.a().j()) {
                w0Var.a("wait_for_ready");
            }
            super.m(w0Var);
        }

        @Override // io.grpc.internal.b0
        protected void u(vi.g1 g1Var) {
            for (vi.k kVar : this.f18555l) {
                kVar.i(g1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Executor executor, vi.k1 k1Var) {
        this.f18535c = executor;
        this.f18536d = k1Var;
    }

    private e o(p0.f fVar, vi.k[] kVarArr) {
        e eVar = new e(this, fVar, kVarArr, null);
        this.f18541i.add(eVar);
        if (p() == 1) {
            this.f18536d.b(this.f18537e);
        }
        return eVar;
    }

    @Override // io.grpc.internal.j1
    public final void b(vi.g1 g1Var) {
        Collection<e> collection;
        Runnable runnable;
        d(g1Var);
        synchronized (this.f18534b) {
            collection = this.f18541i;
            runnable = this.f18539g;
            this.f18539g = null;
            if (!collection.isEmpty()) {
                this.f18541i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable w10 = eVar.w(new f0(g1Var, r.a.REFUSED, eVar.f18555l));
                if (w10 != null) {
                    w10.run();
                }
            }
            this.f18536d.execute(runnable);
        }
    }

    @Override // io.grpc.internal.s
    public final q c(vi.x0<?, ?> x0Var, vi.w0 w0Var, vi.c cVar, vi.k[] kVarArr) {
        q f0Var;
        try {
            s1 s1Var = new s1(x0Var, w0Var, cVar);
            p0.i iVar = null;
            long j10 = -1;
            while (true) {
                synchronized (this.f18534b) {
                    if (this.f18542j == null) {
                        p0.i iVar2 = this.f18543k;
                        if (iVar2 != null) {
                            if (iVar != null && j10 == this.f18544l) {
                                f0Var = o(s1Var, kVarArr);
                                break;
                            }
                            j10 = this.f18544l;
                            s j11 = q0.j(iVar2.a(s1Var), cVar.j());
                            if (j11 != null) {
                                f0Var = j11.c(s1Var.c(), s1Var.b(), s1Var.a(), kVarArr);
                                break;
                            }
                            iVar = iVar2;
                        } else {
                            f0Var = o(s1Var, kVarArr);
                            break;
                        }
                    } else {
                        f0Var = new f0(this.f18542j, kVarArr);
                        break;
                    }
                }
            }
            return f0Var;
        } finally {
            this.f18536d.a();
        }
    }

    @Override // io.grpc.internal.j1
    public final void d(vi.g1 g1Var) {
        Runnable runnable;
        synchronized (this.f18534b) {
            if (this.f18542j != null) {
                return;
            }
            this.f18542j = g1Var;
            this.f18536d.b(new d(g1Var));
            if (!q() && (runnable = this.f18539g) != null) {
                this.f18536d.b(runnable);
                this.f18539g = null;
            }
            this.f18536d.a();
        }
    }

    @Override // vi.n0
    public vi.i0 e() {
        return this.f18533a;
    }

    @Override // io.grpc.internal.j1
    public final Runnable g(j1.a aVar) {
        this.f18540h = aVar;
        this.f18537e = new a(aVar);
        this.f18538f = new b(aVar);
        this.f18539g = new c(aVar);
        return null;
    }

    final int p() {
        int size;
        synchronized (this.f18534b) {
            size = this.f18541i.size();
        }
        return size;
    }

    public final boolean q() {
        boolean z10;
        synchronized (this.f18534b) {
            z10 = !this.f18541i.isEmpty();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(p0.i iVar) {
        Runnable runnable;
        synchronized (this.f18534b) {
            this.f18543k = iVar;
            this.f18544l++;
            if (iVar != null && q()) {
                ArrayList arrayList = new ArrayList(this.f18541i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    p0.e a10 = iVar.a(eVar.f18553j);
                    vi.c a11 = eVar.f18553j.a();
                    s j10 = q0.j(a10, a11.j());
                    if (j10 != null) {
                        Executor executor = this.f18535c;
                        if (a11.e() != null) {
                            executor = a11.e();
                        }
                        Runnable A = eVar.A(j10);
                        if (A != null) {
                            executor.execute(A);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.f18534b) {
                    if (q()) {
                        this.f18541i.removeAll(arrayList2);
                        if (this.f18541i.isEmpty()) {
                            this.f18541i = new LinkedHashSet();
                        }
                        if (!q()) {
                            this.f18536d.b(this.f18538f);
                            if (this.f18542j != null && (runnable = this.f18539g) != null) {
                                this.f18536d.b(runnable);
                                this.f18539g = null;
                            }
                        }
                        this.f18536d.a();
                    }
                }
            }
        }
    }
}
