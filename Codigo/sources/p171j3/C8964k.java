package p171j3;

import android.util.Log;
import androidx.core.util.InterfaceC0981e;
import com.bumptech.glide.C2118d;
import com.bumptech.glide.EnumC2121g;
import java.util.Map;
import java.util.concurrent.Executor;
import p036c4.C1866g;
import p036c4.C1870k;
import p055d4.C6842a;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p129h3.InterfaceC7622f;
import p129h3.InterfaceC7628l;
import p171j3.C8969p;
import p171j3.RunnableC8961h;
import p212l3.C9376b;
import p212l3.InterfaceC9375a;
import p212l3.InterfaceC9382h;
import p231m3.ExecutorServiceC9538a;
import p456y3.InterfaceC12595j;

/* renamed from: j3.k */
/* loaded from: classes.dex */
public class C8964k implements InterfaceC8966m, InterfaceC9382h.a, C8969p.a {

    /* renamed from: i */
    private static final boolean f21393i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C8972s f21394a;

    /* renamed from: b */
    private final C8968o f21395b;

    /* renamed from: c */
    private final InterfaceC9382h f21396c;

    /* renamed from: d */
    private final b f21397d;

    /* renamed from: e */
    private final C8978y f21398e;

    /* renamed from: f */
    private final c f21399f;

    /* renamed from: g */
    private final a f21400g;

    /* renamed from: h */
    private final C8954a f21401h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final RunnableC8961h.e f21402a;

        /* renamed from: b */
        final InterfaceC0981e<RunnableC8961h<?>> f21403b = C6842a.m19766d(150, new C13219a());

        /* renamed from: c */
        private int f21404c;

        /* renamed from: j3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C13219a implements C6842a.d<RunnableC8961h<?>> {
            C13219a() {
            }

            @Override // p055d4.C6842a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public RunnableC8961h<?> mo19770a() {
                a aVar = a.this;
                return new RunnableC8961h<>(aVar.f21402a, aVar.f21403b);
            }
        }

        a(RunnableC8961h.e eVar) {
            this.f21402a = eVar;
        }

        /* renamed from: a */
        <R> RunnableC8961h<R> m26278a(C2118d c2118d, Object obj, C8967n c8967n, InterfaceC7622f interfaceC7622f, int i10, int i11, Class<?> cls, Class<R> cls2, EnumC2121g enumC2121g, AbstractC8963j abstractC8963j, Map<Class<?>, InterfaceC7628l<?>> map, boolean z10, boolean z11, boolean z12, C7624h c7624h, RunnableC8961h.b<R> bVar) {
            RunnableC8961h runnableC8961h = (RunnableC8961h) C1870k.m9950d(this.f21403b.mo4821b());
            int i12 = this.f21404c;
            this.f21404c = i12 + 1;
            return runnableC8961h.m26243v(c2118d, obj, c8967n, interfaceC7622f, i10, i11, cls, cls2, enumC2121g, abstractC8963j, map, z10, z11, z12, c7624h, bVar, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.k$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final ExecutorServiceC9538a f21406a;

        /* renamed from: b */
        final ExecutorServiceC9538a f21407b;

        /* renamed from: c */
        final ExecutorServiceC9538a f21408c;

        /* renamed from: d */
        final ExecutorServiceC9538a f21409d;

        /* renamed from: e */
        final InterfaceC8966m f21410e;

        /* renamed from: f */
        final C8969p.a f21411f;

        /* renamed from: g */
        final InterfaceC0981e<C8965l<?>> f21412g = C6842a.m19766d(150, new a());

        /* renamed from: j3.k$b$a */
        /* loaded from: classes.dex */
        class a implements C6842a.d<C8965l<?>> {
            a() {
            }

            @Override // p055d4.C6842a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8965l<?> mo19770a() {
                b bVar = b.this;
                return new C8965l<>(bVar.f21406a, bVar.f21407b, bVar.f21408c, bVar.f21409d, bVar.f21410e, bVar.f21411f, bVar.f21412g);
            }
        }

        b(ExecutorServiceC9538a executorServiceC9538a, ExecutorServiceC9538a executorServiceC9538a2, ExecutorServiceC9538a executorServiceC9538a3, ExecutorServiceC9538a executorServiceC9538a4, InterfaceC8966m interfaceC8966m, C8969p.a aVar) {
            this.f21406a = executorServiceC9538a;
            this.f21407b = executorServiceC9538a2;
            this.f21408c = executorServiceC9538a3;
            this.f21409d = executorServiceC9538a4;
            this.f21410e = interfaceC8966m;
            this.f21411f = aVar;
        }

        /* renamed from: a */
        <R> C8965l<R> m26280a(InterfaceC7622f interfaceC7622f, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((C8965l) C1870k.m9950d(this.f21412g.mo4821b())).m26292l(interfaceC7622f, z10, z11, z12, z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3.k$c */
    /* loaded from: classes.dex */
    public static class c implements RunnableC8961h.e {

        /* renamed from: a */
        private final InterfaceC9375a.a f21414a;

        /* renamed from: b */
        private volatile InterfaceC9375a f21415b;

        c(InterfaceC9375a.a aVar) {
            this.f21414a = aVar;
        }

        @Override // p171j3.RunnableC8961h.e
        /* renamed from: a */
        public InterfaceC9375a mo26252a() {
            if (this.f21415b == null) {
                synchronized (this) {
                    if (this.f21415b == null) {
                        this.f21415b = this.f21414a.build();
                    }
                    if (this.f21415b == null) {
                        this.f21415b = new C9376b();
                    }
                }
            }
            return this.f21415b;
        }
    }

    /* renamed from: j3.k$d */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a */
        private final C8965l<?> f21416a;

        /* renamed from: b */
        private final InterfaceC12595j f21417b;

        d(InterfaceC12595j interfaceC12595j, C8965l<?> c8965l) {
            this.f21417b = interfaceC12595j;
            this.f21416a = c8965l;
        }

        /* renamed from: a */
        public void m26282a() {
            synchronized (C8964k.this) {
                this.f21416a.m26296r(this.f21417b);
            }
        }
    }

    C8964k(InterfaceC9382h interfaceC9382h, InterfaceC9375a.a aVar, ExecutorServiceC9538a executorServiceC9538a, ExecutorServiceC9538a executorServiceC9538a2, ExecutorServiceC9538a executorServiceC9538a3, ExecutorServiceC9538a executorServiceC9538a4, C8972s c8972s, C8968o c8968o, C8954a c8954a, b bVar, a aVar2, C8978y c8978y, boolean z10) {
        this.f21396c = interfaceC9382h;
        c cVar = new c(aVar);
        this.f21399f = cVar;
        C8954a c8954a2 = c8954a == null ? new C8954a(z10) : c8954a;
        this.f21401h = c8954a2;
        c8954a2.m26185f(this);
        this.f21395b = c8968o == null ? new C8968o() : c8968o;
        this.f21394a = c8972s == null ? new C8972s() : c8972s;
        this.f21397d = bVar == null ? new b(executorServiceC9538a, executorServiceC9538a2, executorServiceC9538a3, executorServiceC9538a4, this, this) : bVar;
        this.f21400g = aVar2 == null ? new a(cVar) : aVar2;
        this.f21398e = c8978y == null ? new C8978y() : c8978y;
        interfaceC9382h.mo27904d(this);
    }

    public C8964k(InterfaceC9382h interfaceC9382h, InterfaceC9375a.a aVar, ExecutorServiceC9538a executorServiceC9538a, ExecutorServiceC9538a executorServiceC9538a2, ExecutorServiceC9538a executorServiceC9538a3, ExecutorServiceC9538a executorServiceC9538a4, boolean z10) {
        this(interfaceC9382h, aVar, executorServiceC9538a, executorServiceC9538a2, executorServiceC9538a3, executorServiceC9538a4, null, null, null, null, null, null, z10);
    }

    /* renamed from: f */
    private C8969p<?> m26265f(InterfaceC7622f interfaceC7622f) {
        InterfaceC8975v<?> mo27905e = this.f21396c.mo27905e(interfaceC7622f);
        if (mo27905e == null) {
            return null;
        }
        return mo27905e instanceof C8969p ? (C8969p) mo27905e : new C8969p<>(mo27905e, true, true, interfaceC7622f, this);
    }

    /* renamed from: h */
    private C8969p<?> m26266h(InterfaceC7622f interfaceC7622f) {
        C8969p<?> m26184e = this.f21401h.m26184e(interfaceC7622f);
        if (m26184e != null) {
            m26184e.m26305a();
        }
        return m26184e;
    }

    /* renamed from: i */
    private C8969p<?> m26267i(InterfaceC7622f interfaceC7622f) {
        C8969p<?> m26265f = m26265f(interfaceC7622f);
        if (m26265f != null) {
            m26265f.m26305a();
            this.f21401h.m26180a(interfaceC7622f, m26265f);
        }
        return m26265f;
    }

    /* renamed from: j */
    private C8969p<?> m26268j(C8967n c8967n, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        C8969p<?> m26266h = m26266h(c8967n);
        if (m26266h != null) {
            if (f21393i) {
                m26269k("Loaded resource from active resources", j10, c8967n);
            }
            return m26266h;
        }
        C8969p<?> m26267i = m26267i(c8967n);
        if (m26267i == null) {
            return null;
        }
        if (f21393i) {
            m26269k("Loaded resource from cache", j10, c8967n);
        }
        return m26267i;
    }

    /* renamed from: k */
    private static void m26269k(String str, long j10, InterfaceC7622f interfaceC7622f) {
        Log.v("Engine", str + " in " + C1866g.m9933a(j10) + "ms, key: " + interfaceC7622f);
    }

    /* renamed from: m */
    private <R> d m26270m(C2118d c2118d, Object obj, InterfaceC7622f interfaceC7622f, int i10, int i11, Class<?> cls, Class<R> cls2, EnumC2121g enumC2121g, AbstractC8963j abstractC8963j, Map<Class<?>, InterfaceC7628l<?>> map, boolean z10, boolean z11, C7624h c7624h, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC12595j interfaceC12595j, Executor executor, C8967n c8967n, long j10) {
        C8965l<?> m26325a = this.f21394a.m26325a(c8967n, z15);
        if (m26325a != null) {
            m26325a.m26286a(interfaceC12595j, executor);
            if (f21393i) {
                m26269k("Added to existing load", j10, c8967n);
            }
            return new d(interfaceC12595j, m26325a);
        }
        C8965l<R> m26280a = this.f21397d.m26280a(c8967n, z12, z13, z14, z15);
        RunnableC8961h<R> m26278a = this.f21400g.m26278a(c2118d, obj, c8967n, interfaceC7622f, i10, i11, cls, cls2, enumC2121g, abstractC8963j, map, z10, z11, z15, c7624h, m26280a);
        this.f21394a.m26326c(c8967n, m26280a);
        m26280a.m26286a(interfaceC12595j, executor);
        m26280a.m26297s(m26278a);
        if (f21393i) {
            m26269k("Started new load", j10, c8967n);
        }
        return new d(interfaceC12595j, m26280a);
    }

    @Override // p212l3.InterfaceC9382h.a
    /* renamed from: a */
    public void mo26271a(InterfaceC8975v<?> interfaceC8975v) {
        this.f21398e.m26337a(interfaceC8975v, true);
    }

    @Override // p171j3.InterfaceC8966m
    /* renamed from: b */
    public synchronized void mo26272b(C8965l<?> c8965l, InterfaceC7622f interfaceC7622f) {
        this.f21394a.m26327d(interfaceC7622f, c8965l);
    }

    @Override // p171j3.InterfaceC8966m
    /* renamed from: c */
    public synchronized void mo26273c(C8965l<?> c8965l, InterfaceC7622f interfaceC7622f, C8969p<?> c8969p) {
        if (c8969p != null) {
            if (c8969p.m26307c()) {
                this.f21401h.m26180a(interfaceC7622f, c8969p);
            }
        }
        this.f21394a.m26327d(interfaceC7622f, c8965l);
    }

    @Override // p171j3.C8969p.a
    /* renamed from: d */
    public void mo26274d(InterfaceC7622f interfaceC7622f, C8969p<?> c8969p) {
        this.f21401h.m26183d(interfaceC7622f);
        if (c8969p.m26307c()) {
            this.f21396c.mo27903c(interfaceC7622f, c8969p);
        } else {
            this.f21398e.m26337a(c8969p, false);
        }
    }

    /* renamed from: e */
    public void m26275e() {
        this.f21399f.mo26252a().clear();
    }

    /* renamed from: g */
    public <R> d m26276g(C2118d c2118d, Object obj, InterfaceC7622f interfaceC7622f, int i10, int i11, Class<?> cls, Class<R> cls2, EnumC2121g enumC2121g, AbstractC8963j abstractC8963j, Map<Class<?>, InterfaceC7628l<?>> map, boolean z10, boolean z11, C7624h c7624h, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC12595j interfaceC12595j, Executor executor) {
        long m9934b = f21393i ? C1866g.m9934b() : 0L;
        C8967n m26304a = this.f21395b.m26304a(obj, interfaceC7622f, i10, i11, map, cls, cls2, c7624h);
        synchronized (this) {
            C8969p<?> m26268j = m26268j(m26304a, z12, m9934b);
            if (m26268j == null) {
                return m26270m(c2118d, obj, interfaceC7622f, i10, i11, cls, cls2, enumC2121g, abstractC8963j, map, z10, z11, c7624h, z12, z13, z14, z15, interfaceC12595j, executor, m26304a, m9934b);
            }
            interfaceC12595j.mo41405b(m26268j, EnumC7617a.MEMORY_CACHE, false);
            return null;
        }
    }

    /* renamed from: l */
    public void m26277l(InterfaceC8975v<?> interfaceC8975v) {
        if (!(interfaceC8975v instanceof C8969p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C8969p) interfaceC8975v).m26308d();
    }
}
